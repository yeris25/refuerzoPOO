package org.example;

public class Restaurante {
    public static void main(String[] args) {

        //voy con mi esposa a cenar a un restaurante.
        //Cada uno pide una cena:

        Comida comidaUno= new Comida()
        comidaUno.entrada= new Entrada("Sopa de esparragos",28000);
        comidaUno.platofuerte= new PlatoFuerte("beef chorizo",55000);
        comidaUno.bebida=new Bebida("Vino tinto" 45000);
        comidaUno.postre= new Postre("tiramizu escarchado",34500);
        Integer costoComida1=comidaUno.calcularCostoComida();




        Comida comidaDos = new Comida();
        comidaDos.entrada= new Entrada("muelas de cangrejo",30000);
        comidaDos.platofuerte= new PlatoFuerte("pato a la naranja" 58000);
        comidaDos.bebida=new Bebida("Soda de miel y tamarindo",18500);
        comidaDos.postre= new Postre("volcan de ciruelas",22000);
        Integer costoComida2=comidaDos.calcularCostoComida();


        System.out.println("El costo total de la cena para dos fue de: ");
        //PONGA ACA LA LINEA QUE PERMITA ENCONTRAR EL REUSLTADO

    }
}