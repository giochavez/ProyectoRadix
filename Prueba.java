import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;


public class Prueba{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<Integer> numeros = new LinkedList<>();

    int op;
    numeros = Archivos.Leer();
    if(numeros.isEmpty()){
      System.out.println("El archivo no existe, ingresa un nuevo archivo");
        numeros = Archivos.Leer();
    }

    do{
      System.out.println("Elige una opcion:");
      System.out.println("1) Polifase. \n2) Mezcla equilibrada. \n3) RadixSort.\n4) Ingresar un nuevo archivo.\n5) Salir");
      System.out.print("Opcion: ");
      op = sc.nextInt();
      System.out.println();

      switch(op){
        case 1:
          polifase.sort(numeros);
          //Ahorita creamos la clase polifase que recibe el archivo que estamos leyendo
          System.out.println();
          break;
        case 2:
          //mezclaE.sort(fr);
          System.out.println();
          break;
        case 3:
          radixSort.radixMenu(numeros);
          System.out.println();
          break;
        case 4:
          numeros = Archivos.Leer();
          if(numeros.isEmpty()){
            System.out.println("El archivo esta vacio.");
            numeros = Archivos.Leer();
          }
          break;
        case 5:
          System.out.println("Gracias por usar el proyecto.\n Hasta Luego");
          break;
        default:
          System.out.println("Opcion invalida.\n");
          break;
      }
    }while(op!=5);
    sc.close();
  }
  public static void imprimirLista(List<Integer> listaPrint){
    for(Integer a : listaPrint){
        System.out.println(a);
    }
    if(listaPrint.isEmpty()){
        System.out.println("[Lista vacia]");
    }
}
}

