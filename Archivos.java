import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
/*En esta clase meramente hacemos la lectura del archivo, en caso de no existir el archivo, no continua en la
  ejecucion del programa, una vez leído el archivo de texto, ingresamos los números obtenidos en una lista
  dicha lista será la que ocuparemos en los métodos de ordenamiento
*/
public class Archivos{
    private Archivos(){
    }
    static List<Integer> Leer() { //Clase que retornará una lista de enteros
        FileReader fr;
        BufferedReader br;
        List<Integer> numeros = new LinkedList<>();
        String continuar = "";

        do{
            try {
                Scanner stdIn = new Scanner(System.in);
                System.out.print("Introduzca el nombre del archivo (con extension): ");
                fr = new FileReader(stdIn.nextLine());
                br = new BufferedReader(fr);

                String linea;
                System.out.println();
                while((linea = br.readLine()) != null){
                    String [] datos = linea.split(","); //Leemos los datos que ya sabemos, estan separados por comas y los agregamos a un arreglo
                    for(String dato: datos)
                        numeros.add(Integer.parseInt(dato)); //Agregamos los datos obtenidos a una lista convirtiendolos en enteros
                }
                continuar = "";
            }catch (FileNotFoundException e){
                System.out.println("Error: " + e.getMessage());
                System.out.println();
                continuar = "s";
            } catch (Exception e) {
                //TODO: handle exception
                continuar = "s";
            }
        }while(continuar.equals("s") || continuar.equals("S")); //Continua meramente si es que el archivo si fue revisado, sino, detiene la ejecución

        return numeros;
    }
}