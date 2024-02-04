package com.example.monglo.modelo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "pago")
public class pago {
    @Id
    private String id;

    @Positive(message = "El monto debe ser un valor positivo.")
    @NotBlank(message = "El método de pago no puede estar en blanco.")
    private double monto;
    private int id_apartamento;
    private int id_usuario;
    @NotBlank(message = "El método de pago no puede estar en blanco.")
    private String metodoPago;
    @NotNull(message = "La fecha de pago no puede ser nula.")
    private Date fechaPago;

    @DBRef
    private compra compra;


}
