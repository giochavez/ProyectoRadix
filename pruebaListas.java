import java.util.List;
import java.util.LinkedList;

public class pruebaListas {
    public static void main(String[] args){
        List<Integer> numeros = new LinkedList<>();
        numeros.add(132);
        numeros.add(156);
        numeros.add(741);
        numeros.add(146);
        numeros.add(416);
        numeros.add(97);
        numeros.add(789);
        numeros.add(489);
        numeros.add(4);
        List<List<Integer>> listaListas = new LinkedList<>();
        List<Integer> lista0 = new LinkedList<>();
        List<Integer> lista1 = new LinkedList<>();
        List<Integer> lista2 = new LinkedList<>();
        List<Integer> lista3 = new LinkedList<>();
        List<Integer> lista4 = new LinkedList<>();
        List<Integer> lista5 = new LinkedList<>();
        List<Integer> lista6 = new LinkedList<>();
        List<Integer> lista7 = new LinkedList<>();
        List<Integer> lista8 = new LinkedList<>();
        List<Integer> lista9 = new LinkedList<>();
        int divisor = 1, i, indice;
        listaListas.add(lista0);
        listaListas.add(lista1);
        listaListas.add(lista2);
        listaListas.add(lista3);
        listaListas.add(lista4);
        listaListas.add(lista5);
        listaListas.add(lista6);
        listaListas.add(lista7);
        listaListas.add(lista8);
        listaListas.add(lista9);


        //while(continuar){
            //continuar = false;
            for(i=0; i<numeros.size(); i++){
                indice = numeros.get(i)/divisor %10;
                if(indice>0){
                    //continuar = true;
                    switch(indice){
                        case 0:
                            lista0.add(numeros.get(i));
                            break;
                        case 1:
                            lista1.add(numeros.get(i));
                            break;
                        case 2:
                            lista2.add(numeros.get(i));
                            break;
                        case 3:
                            lista3.add(numeros.get(i));
                            break;
                        case 4:
                            lista4.add(numeros.get(i));
                            break;
                        case 5:
                            lista5.add(numeros.get(i));
                            break;
                        case 6:
                            lista6.add(numeros.get(i));
                            break;
                        case 7:
                            lista7.add(numeros.get(i));
                            break;
                        case 8:
                            lista8.add(numeros.get(i));
                            break;
                        case 9:
                            lista9.add(numeros.get(i));
                            break;
                        default:
                            System.out.println("Wtf no debería suceder");
                            break; 
                    }
                }
            }
        //}
        imprimirListas(listaListas);
        numeros.clear();
        agregarListas(numeros, lista0);
        agregarListas(numeros, lista1);
        agregarListas(numeros, lista2);
        agregarListas(numeros, lista3);
        agregarListas(numeros, lista4);
        agregarListas(numeros, lista5);
        agregarListas(numeros, lista6);
        agregarListas(numeros, lista7);
        agregarListas(numeros, lista8);
        agregarListas(numeros, lista9);
        lista0.clear();
        lista1.clear();
        lista2.clear();
        lista3.clear();
        lista4.clear();
        lista5.clear();
        lista6.clear();
        lista7.clear();
        lista8.clear();
        lista9.clear();
        System.out.println("UNIDADES\nLista: " + numeros);

        //Decenas
        for(i=0; i<numeros.size(); i++){
            indice = numeros.get(i)/(divisor*10) %10;
            if(indice>=0){
                //continuar = true;
                switch(indice){
                    case 0:
                        lista0.add(numeros.get(i));
                        break;
                    case 1:
                        lista1.add(numeros.get(i));
                        break;
                    case 2:
                        lista2.add(numeros.get(i));
                        break;
                    case 3:
                        lista3.add(numeros.get(i));
                        break;
                    case 4:
                        lista4.add(numeros.get(i));
                        break;
                    case 5:
                        lista5.add(numeros.get(i));
                        break;
                    case 6:
                        lista6.add(numeros.get(i));
                        break;
                    case 7:
                        lista7.add(numeros.get(i));
                        break;
                    case 8:
                        lista8.add(numeros.get(i));
                        break;
                    case 9:
                        lista9.add(numeros.get(i));
                        break;
                    default:
                        System.out.println("Wtf no debería suceder");
                        break; 
                }
            }
        }
    //}
        imprimirListas(listaListas);
        numeros.clear();
        agregarListas(numeros, lista0);
        agregarListas(numeros, lista1);
        agregarListas(numeros, lista2);
        agregarListas(numeros, lista3);
        agregarListas(numeros, lista4);
        agregarListas(numeros, lista5);
        agregarListas(numeros, lista6);
        agregarListas(numeros, lista7);
        agregarListas(numeros, lista8);
        agregarListas(numeros, lista9);
        lista0.clear();
        lista1.clear();
        lista2.clear();
        lista3.clear();
        lista4.clear();
        lista5.clear();
        lista6.clear();
        lista7.clear();
        lista8.clear();
        lista9.clear();
        System.out.println("DECENAS\nLista: " + numeros);

        //CENTENAS
        for(i=0; i<numeros.size(); i++){
            indice = numeros.get(i)/(divisor*100) %10;
            if(indice>=0){
                //continuar = true;
                switch(indice){
                    case 0:
                        lista0.add(numeros.get(i));
                        break;
                    case 1:
                        lista1.add(numeros.get(i));
                        break;
                    case 2:
                        lista2.add(numeros.get(i));
                        break;
                    case 3:
                        lista3.add(numeros.get(i));
                        break;
                    case 4:
                        lista4.add(numeros.get(i));
                        break;
                    case 5:
                        lista5.add(numeros.get(i));
                        break;
                    case 6:
                        lista6.add(numeros.get(i));
                        break;
                    case 7:
                        lista7.add(numeros.get(i));
                        break;
                    case 8:
                        lista8.add(numeros.get(i));
                        break;
                    case 9:
                        lista9.add(numeros.get(i));
                        break;
                    default:
                        System.out.println("Wtf no debería suceder");
                        break; 
                }
            }
        }
    //}
        imprimirListas(listaListas);
        numeros.clear();
        agregarListas(numeros, lista0);
        agregarListas(numeros, lista1);
        agregarListas(numeros, lista2);
        agregarListas(numeros, lista3);
        agregarListas(numeros, lista4);
        agregarListas(numeros, lista5);
        agregarListas(numeros, lista6);
        agregarListas(numeros, lista7);
        agregarListas(numeros, lista8);
        agregarListas(numeros, lista9);
        lista0.clear();
        lista1.clear();
        lista2.clear();
        lista3.clear();
        lista4.clear();
        lista5.clear();
        lista6.clear();
        lista7.clear();
        lista8.clear();
        lista9.clear();
        System.out.println("MILLARES\nLista: " + numeros);


    }
    public static void imprimirListas(List<List<Integer>> listaPrint){
        int i;
        for(i = 0; i<(listaPrint.size());i++){
            System.out.println("Lista " + i + ":" + listaPrint.get(i));
        }
        if(listaPrint.isEmpty()){
            System.out.println("[Lista vacia]");
        }
    }
    public static void agregarListas(List<Integer> listaNum, List<Integer> listaIndex){
        for(int i=0; i<listaIndex.size(); i++){
            listaNum.add(listaIndex.get(i));
        }
    }
}
