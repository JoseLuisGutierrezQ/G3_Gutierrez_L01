class Personaa {
    String nombre;
    int edad;
    
    Personaa(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Personaa p1 = new Personaa("Juan", 25);
        p1.mostrarInfo();
    }
}

