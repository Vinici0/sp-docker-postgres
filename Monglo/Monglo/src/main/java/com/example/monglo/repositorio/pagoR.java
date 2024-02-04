package com.example.monglo.repositorio;


 import com.example.monglo.modelo.pago;
 import org.springframework.data.mongodb.repository.MongoRepository;

public interface pagoR extends MongoRepository<pago, String> {
}
