import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        Guild guild = new Guild();
        int option;

        do {
            System.out.println("\n=================================");
            System.out.println("======== Agenda del Gremio ========");
            System.out.println("===================================");
            System.out.println("======  1. Agregar miembro   ======");
            System.out.println("======  2. Listar miembro    ======");
            System.out.println("======  3. Buscar miembro    ======");
            System.out.println("======  4. Salir             ======");
            System.out.println("===================================\n");

            System.err.println("Seleccione una opción");
            option = sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1:
                    System.out.print("\n== Agregar nuevo miembro: ");
                    String name = sc.nextLine();

                    System.out.print("== Ingrese el Rango del Miembro: ");
                    Integer rank = sc.nextInt();

                    guild.addMember(name,rank);
                    System.out.println("Miembro agrado");
                    break;

                case 2:
                    System.out.println("====== Lista de miembros ======");
                    guild.listMember();      
                    break;
                    
                case 3:
                    System.out.println("\n== Ingrese el miembro o nombre a buscar: ");
                    String search = sc.nextLine();
                    guild.findMember(search);
                    break;

                case 4:
                    System.out.println(" Saliendo del Sistema........");
                
                    default:
                        System.out.println("Error, vuelva a introducir una de las opciones del menú");
            }          
        } while (option !=4);
    sc.close();
    }
} 
