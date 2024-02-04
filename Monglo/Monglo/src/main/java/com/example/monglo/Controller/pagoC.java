package com.example.monglo.Controller;


 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.monglo.modelo.pago;
import com.example.monglo.servicio.pagoS;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pagos")
public class pagoC {

    @Autowired
    pagoS pagoS;


    @PostMapping
    public pago guardarPago(@RequestBody pago nuevoPago) {
        return pagoS.save(nuevoPago);
    }

    @GetMapping
    public List<pago> obtenerTodosLosPagos() {
        return pagoS.find();
    }

    @GetMapping("/{pagoId}")
    public Optional<pago> obtenerPagoPorId(@PathVariable String pagoId) {
        return pagoS.findById(pagoId);
    }

    @PutMapping
    public pago actualizarPago(@RequestBody pago nuevoPago) {
        return pagoS.updateP(nuevoPago);
    }

    @DeleteMapping("/{pagoId}")
    public String eliminarPago(@PathVariable String pagoId) {
        boolean eliminado = pagoS.deleteById(pagoId);
        if (eliminado) {
            return "Pago eliminado con éxito.";
        } else {
            return "No se encontró el pago con el ID proporcionado.";
        }
    }
}

