package com.example.monglo.modelo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

@Data
@Document(collection = "compra")
public class compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @NotBlank(message = "El condominio no puede estar en blanco.")
    private int condominio;
    @NotBlank(message = "El apartamento no puede estar en blanco.")
    private int apartamento;
    @NotBlank(message = "El bloque no puede estar en blanco.")
    private int bloque;
    @NotBlank(message = "El precio total no puede estar en blanco.")
    @Positive(message = "El precio total debe ser un valor positivo.")
    @Pattern(regexp = "^\\d+(\\.\\d{1,2})?$", message = "El precio total debe ser un número con hasta dos decimales.")
    private double precioTotal;
    private int id_usuario;
    private String imagen;
    @NotNull(message = "La fecha de emisión no puede ser nula.")
    private Date fechaEmision;
}
