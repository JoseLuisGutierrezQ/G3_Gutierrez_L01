import java.util.Scanner;

public class Main5 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        // coordenadas del primer rectángulo
        System.out.println("Ingrese las coordenadas del primer rectángulo:");
        System.out.print("Esquina 1 (x y): ");
        double x1A = scanner.nextDouble(); 
        double y1A = scanner.nextDouble(); 
        System.out.print("Esquina 2 (x y): ");
        double x2A = scanner.nextDouble(); 
        double y2A = scanner.nextDouble(); 

        // coordenadas del segundo rectángulo
        System.out.println("Ingrese las coordenadas del segundo rectángulo:");
        System.out.print("Esquina 1 (x y): ");
        double x1B = scanner.nextDouble(); 
        double y1B = scanner.nextDouble(); 
        System.out.print("Esquina 2 (x y): ");
        double x2B = scanner.nextDouble(); 
        double y2B = scanner.nextDouble(); 

        // Crea los objetos Rectangulo usando las coordenadas ingresadas
        Rectangulo rectA = new Rectangulo(new Coordenada(x1A, y1A), new Coordenada(x2A, y2A));
        Rectangulo rectB = new Rectangulo(new Coordenada(x1B, y1B), new Coordenada(x2B, y2B));

        // Determina la relación entre los dos rectángulos
        int caso = Verificador.determinarCaso(rectA, rectB); // se Llama a la función que evalúa la relación

        switch (caso) {
            case 1:
                System.out.println("Caso 1: Los rectángulos A y B se sobreponen.");
                break;
            case 2:
                System.out.println("Caso 2: Los rectángulos A y B están juntos.");
                break;
            case 3:
                System.out.println("Caso 3: Los rectángulos A y B son disjuntos.");
                break;
            default:
                System.out.println("Error al determinar la relación entre los rectángulos."); 
        }

        scanner.close(); 
    }
}
