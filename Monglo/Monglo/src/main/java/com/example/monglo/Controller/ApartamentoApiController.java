package com.example.monglo.Controller;

import com.example.monglo.modelo.Apartamento;
import com.example.monglo.RestApi.Rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/apartamentos")
public class ApartamentoApiController {

 private final Rest restClient;

 @Autowired
 public ApartamentoApiController(Rest restClient) {
  this.restClient = restClient;
 }

 @GetMapping("/obtener")
 public List<Apartamento> obtenerApartamentosDesdeApi() {
  return restClient.consumeApiAndMapToModel();
 }

 @GetMapping("/{id_apartamento}")
 public Apartamento obtenerApartamentoPorId(@PathVariable String id_apartamento) {
  return restClient.getApartamentoById(id_apartamento);
 }
}


