package TreballProgramacio.PPT;
import java.util.Scanner;

public class ppt {
    public static void main(String[] args) {

            System.out.println(
            """
                Este es el juego de piedra, papel y tijeras.
                    Elija una de estas tres opciones:
                    1."Piedra"
                    2."Papel"
                    3."Tijera"
                    """);
        System.out.println("Elige una opción");

                Scanner opcion = new Scanner(System.in);
                //El usuario escoge una de las tres opciones
                String opcionUser = opcion.nextLine();

                //La máquina de forma aleatoria, escoge una opción
                
                int opcionRandom = (int)(Math.random() * 3 + 1);
                String [] opciones = {"", "Piedra" , "Papel" ,"Tijeras"};   
                String opcionOrde = opciones[opcionRandom];

                //Se muestran por pantalla
                System.out.println("Has escogido " + opcionUser);
                System.out.println("La máquina ha escogido " + opcionOrde);

                //El menú switch con todas las opciones posibles
                    switch (opcionUser) {
                        case "Piedra":
                             if(opcionOrde == "Tijera"){
                                 System.out.println("Piedra vs Tijera");
                                 System.out.println("Has ganado");
                             }else if(opcionOrde == "Papel"){
                                 System.out.println("Piedra vs Papel");
                                 System.out.println("Has perdido");
                             }else{
                                 System.out.println("Piedra vs Piedra");
                                 System.out.println("Empate");
                             };
                             break;
                        case "Papel":
                             if(opcionOrde == "Piedra"){
                                 System.out.println("Papel vs Piedra");
                                 System.out.println("Has ganado");
                             }else if(opcionOrde == "Tijera"){
                                 System.out.println("Papel vs Tijera");
                                 System.out.println("Has perdido");
                             }else{
                                 System.out.println("Papel vs Papel");
                                 System.out.println("Empate");
                             };
                             break;
                        case "Tijera":
                             if(opcionOrde == "Papel"){
                                 System.out.println("Tijera vs Papel");
                                 System.out.println("Has ganado");
                             }else if(opcionOrde == "Piedra"){
                                 System.out.println("Tijera vs Piedra");
                                 System.out.println("Has perdido");
                             }else{
                                 System.out.println("Tijera vs Tijera");
                                 System.out.println("Empate");
                             };
                             break;
                        default:
                             System.out.println("Fin del juego");
                             break;
                     }

                opcion.close();
        
    }
}
