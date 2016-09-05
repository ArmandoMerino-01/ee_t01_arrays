
package ee_t01_arrays;
/**
 *
 * @author Armando1
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Ee_t01_arrays {
   public static void main(String[] args) {
        try {
            FileReader leer = new FileReader("C:/Users/Armando1/Documents/NetBeansProjects/ee_t01_arrays/src/ee_t01_arrays/archivito.txt");
            BufferedReader contenido = new BufferedReader(leer);
            String texto = contenido.readLine();
            ArrayList<String> lista = new ArrayList<>();
            while (texto != null) {//leer caracteres del archivo linea por linea
                lista.add(texto);//agrega contenidos del texto a la lista
                texto = contenido.readLine(); //texto almacena linea por linea
            }

            int tam = Integer.valueOf(lista.get(0));    //String t = lista.get(0);      int tam= Integer.valueOf(t);
            int[] arreglo = new int[tam];
            //////////////////////////////////
            if (Integer.valueOf(lista.get(0)) < lista.size()) {
                for (int i = 0; i < arreglo.length; i++) {//agregamos los elementos de la lista al arregl0
                    arreglo[i] = Integer.valueOf(lista.get(i));
                }

                System.out.println("ARREGLO ORIGINAL");
                for (int x = 0; x < arreglo.length; x++) {
                    System.out.println(arreglo[x]);
                }

                System.out.println("ARREGLO ORDENADO");
               // Arrays.sort(arreglo);
                 ordSelDesc(arreglo);
                for (int x = 0; x < arreglo.length; x++) {
                    System.out.println(arreglo[x]);
                }
            } else {
                System.out.println("la cantidad de numeros en la lista es menor al primer numero que se pretende usar de tamano");
            }
        } catch (IOException e) {
        }
    }

     static void ordSelDesc(int[] arreglo) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int max = i;
 
            //buscamos el mayor número
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;    //encontramos el mayor número
                }
            }
 
            if (i != max) {
                //permutamos los valores
                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
            }
        }
    } 
}
