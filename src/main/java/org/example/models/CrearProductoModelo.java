package org.example.models;

public class CrearProductoModelo {
    public Integer orden_de_entrada;
    public Integer subcategoria;
    public Integer marca;
    public Integer modelo;
    public String serial;
    public Integer periodo_de_garantia;

    public Integer getOrdenDeEntrada(){
        return orden_de_entrada;
    }

    public Integer getSubcategoria() {
        return subcategoria;
    }

    public Integer getMarca() {
        return marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public String getSerial() {
        return serial;
    }

    public Integer getPeriodoDeGarantia() {
        return periodo_de_garantia;
    }
}
