package com.example.monglo.RestApi;

import com.example.monglo.modelo.Apartamento;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Component
public class Rest {

    private final String API_URL = "http://localhost:9091/apiA";

    private final RestTemplate restTemplate;

    @Autowired
    public Rest(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Apartamento> consumeApiAndMapToModel() {
        try {
            System.out.println("Antes de la llamada a la API");
            String response = restTemplate.getForObject(API_URL, String.class);
            System.out.println("Después de la llamada a la API");
            System.out.println("Respuesta de la API: " + response);

            System.out.println("Antes del mapeo");
            ObjectMapper objectMapper = new ObjectMapper();
            Apartamento[] apartamentosArray = objectMapper.readValue(response, Apartamento[].class);
            List<Apartamento> apartamentos = Arrays.asList(apartamentosArray);
            System.out.println("Después del mapeo");
            System.out.println("Apartamentos mapeados: " + apartamentos);

            return apartamentos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Apartamento getApartamentoById(String id) {
        try {
            System.out.println("Antes de la llamada a la API por ID");
            String apiUrlById = API_URL + "/" + id;
            String response = restTemplate.getForObject(apiUrlById, String.class);
            System.out.println("Después de la llamada a la API por ID");
            System.out.println("Respuesta de la API por ID: " + response);

            System.out.println("Antes del mapeo por ID");
            ObjectMapper objectMapper = new ObjectMapper();
            Apartamento apartamento = objectMapper.readValue(response, Apartamento.class);
            System.out.println("Después del mapeo por ID");
            System.out.println("Apartamento mapeado por ID: " + apartamento);

            return apartamento;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
