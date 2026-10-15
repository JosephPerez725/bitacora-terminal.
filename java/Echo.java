import java.util.Scanner;

// Adaptado del ejemplo de Clase05-Guia.md con asistencia; ver ASISTENCIA.md.
public class Echo {
    public static void main(String[] args) {
        int lines = 0;
        int matching = 0;
        try (Scanner input = new Scanner(System.in)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                lines++;
                System.out.println(lines + ": " + line);
                if (line.contains("stress-ng")) {
                    matching++;
                }
            }
        }
        System.out.println("lines containing stress-ng: " + matching);
    }
}
