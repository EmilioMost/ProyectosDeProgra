package usuario;

import java.util.ArrayList;

import negocio.*;

public class InterfazUsuario{
    private static String negrita = "\u001B[1m";
	private static String normal = "\033[0m";
	private static String rojo = "\u001B[31m";
	private static String blanco = "\u001B[37m";
    public static void ejecutar(String[] instruccion){

        ListaHoteles lista = new ListaHoteles();
        if (instruccion[0].equalsIgnoreCase("mostrar") && instruccion.length == 1){
        mostrarlista(lista);
        }else
        if (instruccion[0].equalsIgnoreCase("añadir") && instruccion.length == 5){
            Hotel hotel = new Hotel(instruccion[1], instruccion[2], instruccion[3], instruccion[4]);
            ListaHoteles.annadir(hotel);
        }else
        if (instruccion[0].equalsIgnoreCase("ayuda") && instruccion.length == 1){
        ayuda();
        }else{
            System.out.println(rojo + "El formato empleado en la entrada es erroneo" + blanco);

        ayuda();
        }

    }

    private static void mostrarlista(ListaHoteles listaHoteles){


        ArrayList<Hotel> listillaHoteles = listaHoteles.getListaHoteles();
        for (Hotel hotel : listillaHoteles){
            System.out.println(hotel);
        }
    }




    private static void ayuda(){
        System.out.println("\n" + negrita + "DESCRIPCIÓN" + blanco +"\n\n"+
        "Esta aplicación permite las siguientes opciones: \n\n"+
        "- Permite añadir un nuevo hotel a la lista de hoteles\n"+
        "- Permite mostrar los elementos de la lista de hoteles\n\n"+
        "Para añadir un nuevo hotel a la lista debe escribir:\n"+
        "\t" + negrita + "java -cp bin puntoentrada.Principal añadir <nombre> <ubicacion> <estrellas> <habitaciones>" + normal + "\n"+
        "\t EJEMPLO \n"+
        "java -cp bin puntoentrada.Principal añadir Palace Madrid 4 450"+
        "Para mostrar la lista de hoteles: \n \n"+
        "\t" + negrita + "java -cp bin puntoentrada.Principal mostrar" + normal + "\n"+
        "\t EJEMPLO \n"+
        "java -cp bin puntoentrada.Principal mostrar \n \n"+
        "Para mostrar de nuevo esta ayuda: \n"+
        "\t" + negrita + "java -cp bin puntoentrada.Principal ayuda" + normal + "\n"+
        "\t EJEMPLO \n"+
        "java -cp bin puntoentrada.Principal ayuda \n"
        );
    }
}
