package br.com.mateusfilpo.netflixauthserver.client;

import br.com.mateusfilpo.netflixauthserver.dto.AuthRequestDTO;
import br.com.mateusfilpo.netflixauthserver.dto.AuthResponseDTO;
import reactor.core.publisher.Mono;

public interface AuthClient {

    Mono<AuthResponseDTO> authenticateUser(AuthRequestDTO requestDTO);
}
