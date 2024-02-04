package com.example.monglo.Controller;

 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.monglo.modelo.compra;
import com.example.monglo.servicio.compraS;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/compra")
public class compraC {

    @Autowired
    compraS compraS;


    @PostMapping("/guardar")
    public compra guardarPago(@RequestBody compra nuevaCompra) {
        return compraS.save(nuevaCompra);
    }

    @GetMapping
    public List<compra> obtenerTodosLosPagos() {
        return compraS.find();
    }

    @GetMapping("/{compraId}")
    public Optional<compra> obtenerPagoPorId(@PathVariable String compraId) {
        return compraS.findById(compraId);
    }

    @PutMapping("/{compraId}")
    public Optional<compra> modificarPago(@PathVariable String compraId, @RequestBody compra nuevaCompra) {
        return compraS.update(compraId, nuevaCompra);
    }


    @DeleteMapping("/{compraId}")
    public String eliminarPago(@PathVariable String compraId) {
        boolean eliminado = compraS.deleteById(compraId);
        if (eliminado) {
            return "Pago eliminado con éxito.";
        } else {
            return "No se encontró el pago con el ID proporcionado.";
        }
    }
}
