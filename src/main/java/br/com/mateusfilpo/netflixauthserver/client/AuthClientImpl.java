package br.com.mateusfilpo.netflixauthserver.client;

import br.com.mateusfilpo.netflixauthserver.dto.AuthRequestDTO;
import br.com.mateusfilpo.netflixauthserver.dto.AuthResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class AuthClientImpl implements AuthClient {

    private final WebClient webClient;

    public AuthClientImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8080").build(); // Base URL do Backend Netflix
    }

    @Override
    public Mono<AuthResponseDTO> authenticateUser(AuthRequestDTO authRequestDTO) {
        return webClient.post()
                .uri("/validate-credentials")  // Endpoint de login do AuthServer
                .bodyValue(authRequestDTO)  // Corpo da requisição com username e password
                .retrieve()  // Recupera a resposta
                .bodyToMono(AuthResponseDTO.class);  // Mapeia para AuthResponseDTO
    }
}
