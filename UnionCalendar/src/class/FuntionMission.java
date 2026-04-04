public class FuntionMission {

   
    public Mission[] createMissionList() {

        Mission[] missions = new Mission[3];

       missions[0] = new Mission(1, "Encontrar la Llave", "Fácil", "Pendiente");
        missions[1] = new Mission(2, "Rescatar al Perro", "Media", "Pendiente");
        missions[2] = new Mission(3, "Derrotar al Jefe", "Difícil", "Pendiente");


        return missions;
    }
     public void listMissions(Mission[] missions) {
        System.out.println("\n=== LISTA DE MISIONES ===");
        for (Mission m : missions) {
            System.out.println("ID: " + m.getId()
                    + " | Nombre: " + m.getName()
                    + " | Dificultad: " + m.getDifficulty()
                    + " | Estado: " + m.getStatus());
        }
    }

  public void completeMission(Mission[] missions, int id, String dificultadUsuario) {

        for (Mission m : missions) {

            if (m.getId() == id) {

                // Cambiar estado
                m.setStatus("Completada");

                System.out.println("\n========= RESULTADO FINAL =========");
                System.out.println("ID elegido: " + m.getId());
                System.out.println("Nombre de la misión: " + m.getName());
                System.out.println("Dificultad seleccionada: " + dificultadUsuario);
                System.out.println("Estado de la misión: " + m.getStatus());
                System.out.println("====================================");
                return;
            }
        }

        System.out.println("\n❌ No existe una misión con ese ID.");
    }
}