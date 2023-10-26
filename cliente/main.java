package cliente;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.util.List;

public class main {
    public static void main(String[] args) {
              
    	System.out.println("METODOS DE UNA LISTA" + "\n---------------------------------");
    	
    	//Creamos una lista de tipo String usando la clase ArrayList
    	List<String> animales_lista = new ArrayList<>();
    	
    	// Metodo añadir
    	animales_lista.add("Caballo");   
    	animales_lista.add("Vaca");     
    	animales_lista.add("Tigre");    
    	System.out.println("La lista de animales es : " + animales_lista);
    	
    	// subList(int fromIndex, int toIndex)
    	   List<String> sublista = animales_lista.subList(0, 2);
           System.out.println("Sublista: " + sublista);
    	
    	//boolean contains(Object o);
           String animalBuscado = "Caballo";
           if (animales_lista.contains(animalBuscado)) {
               System.out.println(animalBuscado + " está en la lista.");
           } else {
               System.out.println(animalBuscado + " no está en la lista.");
           }           
           
    	// metodo añadir - add(int index, E element):
    		animales_lista.add(2,"Caballo");
    		System.out.println("La lista despues de añadir Caballo en el indice 2: " + animales_lista);
    	
    	// Metodo para saber el tamaño de la lista
    	System.out.println("Tamaño de la lista: " + animales_lista.size());
    	
    	//Metodo remover -  remove(int index):
    	animales_lista.remove(0);
    	System.out.println("La nueva lista de animales es: " + animales_lista);
    	System.out.println("Tamaño de la lista: " + animales_lista.size());
    	
    	//Metodo get(int index):
    	System.out.println(animales_lista.get(0) );
    	
    	//Metodo set // remplaza (int index, E element)
    	animales_lista.set(0,"Caballo");
    	System.out.println(animales_lista); // se remplaza
    
    	//Metodo indice -  indexOf(Object o)
    	int indiceCaballo = animales_lista.indexOf("Caballo");
    	System.out.println("El indice del caballo es: " + indiceCaballo ); // nos muestra el indice o posición del elemento Caballo.
    	
    	// lastindice lastIndexOf(Object o):
    	
    	int ultimoCaballo = animales_lista.lastIndexOf("Caballo");
    	System.out.println("El ultimo indice del caballo es: " + ultimoCaballo);	
    	  
 

    	//ArrayList de tipo cadena
    	
    	ArrayList<String[]> arrayCadenas = new ArrayList<String[]>();

      
        String[] arreglo1 = {"Naranja", "Manzana", "Mandarina"};
        String[] arreglo2 = {"Perro", "Gato"};
        String[] arreglo3 = {"Rojo", "Azul", "Amarillo"};

        arrayCadenas.add(arreglo1);
        arrayCadenas.add(arreglo2);
        arrayCadenas.add(arreglo3);
        
        //mostrar un conjunto de cadenas por índice:
        String[] conjunto = arrayCadenas.get(0);
        System.out.println("El conjunto en el índice " + 0 + " es: " + Arrays.toString(conjunto));
        
        // Iterar a través de todos los conjuntos de cadenas: 
        for (String elemento : arreglo2) {
            System.out.println(elemento);
        }
       
        //Buscar un conjunto específico dentro del ArrayList:
        String[] conjuntoBuscado = {"Naranja", "Manzana", "Mandarina"};
        int indiceEncontrado = 0;
        for (int i = 0; i < arrayCadenas.size(); i++) {
            if (Arrays.equals(arrayCadenas.get(i), conjuntoBuscado)) {
                indiceEncontrado = i;
                break;	
            }
        }
        System.out.println("Conjunto encontrado en el índice: " + indiceEncontrado);
    	
    	
    	//Verificamos si esta vacio o no
        if(arrayCadenas.isEmpty()) {
        System.out.println("Está vacío");
        }else {
        System.out.println("No esta vacio");
        }
        
        arrayCadenas.removeAll(arrayCadenas); // Removemos toda la lista
        
        if(arrayCadenas.isEmpty()) {
            System.out.println("Está vacío");
            }else {
            System.out.println("No esta vacio");
            }		  	
    }
}
