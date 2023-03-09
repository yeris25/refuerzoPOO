package org.example;

public class Restaurante {
    public static void main(String[] args) {

        //voy con mi esposa a cenar a un restaurante.
        //Cada uno pide una cena:

        Comida comidaUno= new Comida();
        Entrada entrada = new Entrada("Sopa de esparragos",28000);
        comidaUno.setEntrada(entrada);
        PlatoFuerte platoFuerte =  new PlatoFuerte("beef chorizo",55000);
        comidaUno.setPlatofuerte(platoFuerte);
        Bebida bedida = new Bebida("Vino tinto", 45000);
        comidaUno.setBebida(bedida);
        Postre postre = new Postre("tiramizu escarchado",34500);
        comidaUno.setPostre(postre);
        Integer costoComida1=comidaUno.calcularCostoComida();




        Comida comidaDos = new Comida();
        comidaDos.setEntrada(new Entrada("muelas de cangrejo",30000));
        comidaDos.setPlatofuerte(new PlatoFuerte("pato a la naranja",58000));
        comidaDos.setBebida(new Bebida("Soda de miel y tamarindo",18500));
        comidaDos.setPostre(new Postre("volcan de ciruelas",22000));
        Integer costoComida2=comidaDos.calcularCostoComida();


        System.out.println("El costo total de la cena para dos fue de: ");
        System.out.println(costoComida1+costoComida2);
    }

}