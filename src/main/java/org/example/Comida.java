package org.example;

public class Comida {

    Entrada entrada;
    PlatoFuerte platofuerte;
    Bebida bebida;
    Postre postre;

    public Comida(Entrada entrada) {
        this.entrada = entrada;
    }

    public Integer calcularCostoComida(){

        Integer costo=this.entrada.costo+this.platofuerte.costo+this.bebida.costo+this.postre.costo;
        return costo;
    }


}
