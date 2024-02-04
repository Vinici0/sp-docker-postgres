package com.example.monglo.servicio;

 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.monglo.modelo.pago;
import com.example.monglo.repositorio.pagoR;

import java.util.List;
import java.util.Optional;

@Service
public class pagoS {
    @Autowired
    pagoR pagoR;

  public pago save(pago pago){
      return pagoR.save(pago);
  }

    public List<pago> find() {
        return pagoR.findAll();
    }

    public Optional<pago> findById(String pagoId) {
        return pagoR.findById(pagoId);
    }

    public pago updateP(pago nuevoPago) {
        return pagoR.save(nuevoPago);
    }

    public boolean deleteById(String pagoId) {
        if (pagoR.existsById(pagoId)) {
            pagoR.deleteById(pagoId);
            return true;
        } else {
            return false;
        }
    }


}
