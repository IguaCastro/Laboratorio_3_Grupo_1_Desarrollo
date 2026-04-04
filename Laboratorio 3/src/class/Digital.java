import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Digital {

    // ── Colores ANSI ──────────────────────────────────────────────
    public static final String RESET  = "\u001B[0m";
    public static final String RED    = "\u001B[31m";
    public static final String GREEN  = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN   = "\u001B[36m";
    public static final String BOLD   = "\u001B[1m";

    // ── Atributos ─────────────────────────────────────────────────
    private String username;
    private String password;

    public Digital(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // ── Métodos visuales ──────────────────────────────────────────

    public static void printBanner() {
        System.out.println(CYAN + BOLD);
        System.out.println("  ╔════════════════════════════════╗");
        System.out.println("  ║       C.R.M  Digital           ║");
        System.out.println("  ║     Sistema de Acceso          ║");
        System.out.println("  ╚════════════════════════════════╝");
        System.out.println(RESET);
    }

    public static void printAttempts(int attempts) {
        System.out.print(YELLOW + "  Intentos restantes: [");
        for (int i = 0; i < attempts; i++) System.out.print("█");
        for (int i = attempts; i < 5; i++) System.out.print("░");
        System.out.println("] " + attempts + "/5" + RESET);
    }

    public static void loading(String message) throws InterruptedException {
        System.out.print(CYAN + message);
        for (int i = 0; i < 3; i++) {
            Thread.sleep(400);
            System.out.print(".");
        }
        System.out.println(RESET);
    }

    public static void printWelcome(String username) {
        String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(GREEN + BOLD);
        System.out.println("  ╔════════════════════════════════╗");
        System.out.printf ("  ║  Bienvenido, %-17s║%n", username + "!");
        System.out.printf ("  ║  Hora de acceso: %-13s║%n", hora);
        System.out.println("  ╚════════════════════════════════╝");
        System.out.println(RESET);
    }

    public static void printBlocked() {
        System.out.println(RED + BOLD);
        System.out.println("  ╔════════════════════════════════╗");
        System.out.println("  ║      ACCESO BLOQUEADO          ║");
        System.out.println("  ║   Contacte al administrador    ║");
        System.out.println("  ╚════════════════════════════════╝");
        System.out.println(RESET);
    }
}