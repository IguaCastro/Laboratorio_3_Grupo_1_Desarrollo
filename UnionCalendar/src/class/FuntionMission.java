import java.util.Scanner;

public class FuntionMission {

    public void listMissions(Mission[] missions) {
        System.out.println("\n=== MISSION LIST ===");
        for (Mission m : missions) {
            if (m != null) {
                m.showInfo();
            }
        }
    }

    public void completeMission(Mission[] missions, int id, String dificultad) {
        boolean found = false;

        for (Mission m : missions) {
            if (m != null && m.getId() == id) {
                m.completeMission();
                System.out.println("¡Misión " + id + " completada!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Misión no encontrada.");
        }
    }

    public Mission createMission(int id, String name, String difficulty, String status) {
        return new Mission(id, name, difficulty, status);
    }

    public Mission[] createMissionList() {
        Mission[] missions = new Mission[3];

        missions[0] = new Mission(1, "Rescatar amigo",  "Fácil",   "pendiente"); // ✅ índice 0
        missions[1] = new Mission(2, "Salvar una vida", "Media",   "pendiente"); // ✅ índice 1
        missions[2] = new Mission(3, "Salvar mascota",  "Difícil", "pendiente"); // ✅ índice 2

        return missions;
    }
}