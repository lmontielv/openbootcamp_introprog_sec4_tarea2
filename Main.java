import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main{


    public static void main(String[] args) throws IOException
    {

        //Tarea Tema 4 Condicionales 
        /*
        1era parte: usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        */

        BufferedReader brNum = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca el valor de numeroIf ?");

        String numero = brNum.readLine();

        int numeroIf = Integer.parseInt(numero);
      
        if (numeroIf < 0){
            System.out.println("El número leído es negativo");
        }
            else if (numeroIf > 0){
                System.out.println("El número leído es positivo");
            }
            else {
                System.out.println("El número leído es 0");
            }
        
    /*
    2da parte: Crea un bucle While, este bucle tendrá que tener como condición que la variable 
    numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá: Incrementar el valor
    de la variable en uno cada vez que se ejecute. Mostrarlo por pantalla cada vez que se ejecute.
    */
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("El númeroWhile en la iteración while "+numeroWhile+" vale : "+numeroWhile);
            numeroWhile++;
        }

    /*
    3era parte:Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
    */
    numeroWhile = 2;
    do {
        System.out.println("El númeroWhile en la iteración dowhile "+numeroWhile+" vale : "+numeroWhile);
        numeroWhile++;
        } while (numeroWhile < 3);


     /*
    4ta parte:Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 
    y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 
    su valor cada vez que se ejecute y deberá mostrarse por pantalla.
    */

    for (int numeroFor = 0; numeroFor < 3; numeroFor++){
        System.out.println("El númeroFor en la iteración "+numeroFor+" vale : "+numeroFor);
    }


    /*
    5ta parte: para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
    Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. 
    También habrá que poner un default para cuando el valor de la variable no sea una estación.
    */

    BufferedReader brEst = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca el nombre de la estación del año ?");

        String estacion = brEst.readLine();
   
    switch (estacion){
        case "Verano":
            System.out.print("La estación del año es: "+estacion);
            break;

        case "Primavera":
            System.out.print("La estación del año es: "+estacion);
            break;

        case "Invierno":
            System.out.print("La estación del año es: "+estacion);
            break;
        
        case "Otoño":
            System.out.print("La estación del año es: "+estacion);
            break;
        
        default:
            System.out.println("La palabra introducida no es una estacion");
        }

    }
}