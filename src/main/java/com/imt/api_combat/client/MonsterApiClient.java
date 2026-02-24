package com.imt.api_combat.client;

import com.imt.api_combat.client.dto.output.GetMonsterHttpResponse;
import com.imt.api_combat.utils.Properties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

public class MonsterApiClient {
    private final RestTemplate restTemplate;
    private final String baseUrl;

    public MonsterApiClient(Properties properties) {
        if (properties.getBaseurl() == null || properties.getBaseurl().isBlank()) {
            throw new IllegalArgumentException("Missing base url, configure in application.yml / .env files");
        }
        if (properties.getMonsters_port() == null) {
            throw new IllegalArgumentException("Missing monsters port, configure in application.yml / .env files");
        }

        this.baseUrl = properties.getBaseurl() + ":" + properties.getMonsters_port() + "/api/monsters";
    }

    public GetMonsterHttpResponse getMonster(String id) {
        ResponseEntity<GetMonsterHttpResponse> response = restTemplate.getForEntity(baseUrl + "/" + id, GetMonsterHttpResponse.class);
        return response.getBody();
    }
}
