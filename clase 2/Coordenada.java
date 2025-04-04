public class Coordenada { 
    private double x; 
    private double y; 

    public Coordenada() {
        this.x = 0; 
        this.y = 0; 
    }

    public Coordenada(double x, double y) {
        this.x = x; 
        this.y = y; 
    }

    public Coordenada(Coordenada c) {  
        this.x = c.getX(); 
        this.y = c.getY(); 
    }   

    // Métodos "setter" para modificar los valores 
    void setX(double x) {
        this.x = x; 
    }

    void setY(double y) {
        this.y = y; 
    }

    // Métodos "getter" para obtener los valores 
    double getX() {
        return x; 
    }

    double getY() {
        return y; 
    }

    // Método para calcular la distancia entre este punto y otro dado
    double distancia(Coordenada c) {
        // Fórmula de distancia euclidiana
        return Math.sqrt(Math.pow(this.x - c.getX(), 2) + Math.pow(this.y - c.getY(), 2));
    }

    // Método estático para calcular la distancia entre dos objetos Coordenada
    static double distancia(Coordenada c1, Coordenada c2) {
        
        return Math.sqrt(Math.pow(c1.x - c2.getX(), 2) + Math.pow(c2.y - c1.getY(), 2));
    }

    // Método que devuelve una representación en texto del objeto Coordenada
    public String toString() {
        return "(" + x + ", " + y + ")"; 
    }
}
