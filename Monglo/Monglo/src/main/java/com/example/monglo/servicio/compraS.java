package com.example.monglo.servicio;

 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.monglo.modelo.compra;
import com.example.monglo.repositorio.compraR;
import java.util.List;
import java.util.Optional;

@Service
public class compraS {

    @Autowired
    compraR compraR;

    public compra save(compra compra){
        return compraR.save(compra);
    }

    public List<compra> find() {
        return compraR.findAll();
    }

    public Optional<compra> findById(String compraId) {
        return compraR.findById(compraId);
    }

    public Optional<compra> update(String compraId, compra nuevaCompra) {
        Optional<compra> compraExistente = compraR.findById(compraId);

        if (compraExistente.isPresent()) {
            compra existente = compraExistente.get();

            // Actualizar los campos necesarios de la compra existente
            existente.setCondominio(nuevaCompra.getCondominio());
            existente.setApartamento(nuevaCompra.getApartamento());
            existente.setBloque(nuevaCompra.getBloque());
            existente.setPrecioTotal(nuevaCompra.getPrecioTotal());
            existente.setFechaEmision(nuevaCompra.getFechaEmision());

            // Guardar la compra actualizada en la base de datos
            compraR.save(existente);

            return Optional.of(existente);
        } else {
            // Manejar el caso en que la compra no exista
            return Optional.empty();
        }
    }
    public boolean deleteById(String compraId) {
        if (compraR.existsById(compraId)) {
            compraR.deleteById(compraId);
            return true;
        } else {
            return false;
        }
    }

}
