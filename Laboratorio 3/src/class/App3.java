import java.util.ArrayList;
import java.util.Scanner;

public class App3 {

    private ArrayList<Digital> users;

    public App3() {
        users = new ArrayList<>();
        users.add(new Digital("RomelJ", "romel.j"));
        users.add(new Digital("romelP", "JJ29"));
        users.add(new Digital("Eromel", "PP95"));
    }

    private boolean validateUser(String username, String password) {
        for (Digital user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void startLogin() throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        int attempts = 5;

        Digital.printBanner();

        while (attempts > 0) {
            Digital.printAttempts(attempts);
            try {
                System.out.print(Digital.BOLD + "  Usuario:    " + Digital.RESET);
                String username = scanner.nextLine().trim();

                if (username.isEmpty()) {
                    throw new IllegalArgumentException("El usuario no puede estar vacío");
                }

                System.out.print(Digital.BOLD + "  Contraseña: " + Digital.RESET);
                String password = scanner.nextLine().trim();

                if (password.isEmpty()) {
                    throw new IllegalArgumentException("La contraseña no puede estar vacía");
                }

                if (validateUser(username, password)) {
                    Digital.loading("\n  Verificando credenciales");
                    Digital.printWelcome(username);
                    break;
                } 
                else {
                    attempts--;
                    System.out.println(Digital.RED + "\n  ✘ Credenciales incorrectos." + Digital.RESET + "\n");
                }

            } catch (IllegalArgumentException e) {
                System.out.println(Digital.RED + "  ⚠ Error: " + e.getMessage() + Digital.RESET + "\n");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        if (attempts == 0) {
            Digital.printBlocked();
        }

        scanner.close();
    }
}