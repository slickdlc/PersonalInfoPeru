package com.slickdlc.piwsc.apirest;

import com.slickdlc.piwsc.api_model.api.SunatApi;
import com.slickdlc.piwsc.api_model.model.EmpresaSunat;
import com.slickdlc.piwsc.api_model.model.PersonaSunat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@RestController
public class SunatController implements SunatApi {
    @Override
    public Mono<ResponseEntity<EmpresaSunat>> _findEmpresaByRuc(String ruc, ServerWebExchange exchange) {
        return Mono.just(ResponseEntity.ok(new EmpresaSunat()));
    }

    @Override
    public Mono<ResponseEntity<PersonaSunat>> _findPersonaByDni(String dni, ServerWebExchange exchange) {
        return Mono.just(ResponseEntity.ok(new PersonaSunat()));
    }
}
