import java.util.Scanner;

public class App4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FuntionMission manager = new FuntionMission();
        Mission [] missions = manager.createMissionList();

        int option;

        do {
            System.out.println("\n==== MENÚ DEL GESTOR DE MISIONES ====");
            System.out.println("  1. Listar todas las misiones");
            System.out.println("  2. Completar una misión");
            System.out.println("  3. Salir");
            System.out.print("Seleccione una opción: ");

            option = input.nextInt();

            switch (option) {
                case 1:
                    manager.listMissions(missions);
                    break; 
                case 2:
                    System.out.print("Ingresa el ID de la misión a completar: ");
                    int id = input.nextInt();

                    // El usuario elige la dificultad
                    System.out.println("Selecciona la dificultad:");
                    System.out.println("  1. Fácil");
                    System.out.println("  2. Media");
                    System.out.println("  3. Difícil");
                    System.out.print("Tu opción: ");
                    int difOpcion = input.nextInt();

                    String dificultad;
                    switch (difOpcion) {
                        case 1: dificultad = "Fácil"; break;
                        case 2: dificultad = "Media"; break;
                        case 3: dificultad = "Difícil"; break;
                        default: dificultad = "Desconocida";
                    }

                    manager.completeMission(missions, id, dificultad);
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
            }

        } while (option != 3);

        input.close();
    }
}