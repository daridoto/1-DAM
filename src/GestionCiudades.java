import java.util.Scanner;
import java.util.HashSet;

public class GestionCiudades {
    public static void main(String[] args) {
        
         //Inicializamos el escaner y el HashSet
        Scanner sc = new Scanner(System.in);
        HashSet<String> ciudades = new HashSet<>();

        int menu = 0;

        //Creo un bucle para que siempre salga la interfaz al usuario
        while(menu != 5){

        System.out.println("------Gestion de Ciudades------");
        System.out.println("1. Agregar una ciudad");
        System.out.println("2. Mostrar ciudad");
        System.out.println("3. Buscar ciudad");
        System.out.println("4. Eliminar ciudad");
        System.out.println("5. Salir del programa");
        System.out.println("Por favor, introduzca un numero");

        int opcion = sc.nextInt();
        menu = opcion;
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Por favor, introduzca el nombre de una ciudad");
                String ciudad = sc.nextLine();
                ciudades.add(ciudad);
                System.out.println(ciudades);
                break;
            
            case 2:
                if(ciudades.isEmpty()){
                    System.out.println("La coleccion esta vacia");
                }
                System.out.println(ciudades);
                break;
            
            case 3: 
                System.out.println("Por favor usuario, introduzca una ciudad que desee buscar");
                String buscador = sc.nextLine();
                if(ciudades.contains(buscador)){
                    System.out.println("La ciudad esta dentro de la lista");
                } else {
                    System.out.println("La ciudad no esta dentro de la lista");
                }
                break;

            case 4: 
                System.out.println("Introduzca el nombre de la ciudad que desea eliminar");
                String eliminar = sc.nextLine();
                if(ciudades.contains(eliminar)){
                    ciudades.remove(eliminar);
                }
                break;

            case 5: 
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Por favor, elija una opcion valida (1-5)");

            }
        

        }
        sc.close();
    }
}
