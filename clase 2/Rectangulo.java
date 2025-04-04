public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2){
        setEsquina1(c1);
        setEsquina2(c2); 
    }

    // Método para establecer las esquinas de los rectangulos
    public void setEsquina1(Coordenada coo){

        // Asigna el valor recibido al atributo de las esquina
        this.esquina1 = coo;
    }

    
    public void setEsquina2(Coordenada coo){
        this.esquina2 = coo; 
    }

    // Método para obtener la esquina de los rectángulos
    public Coordenada getEsquina1() {
        // Devuelve la coordenada de las esquinas
        return this.esquina1; 
    }

    
    public Coordenada getEsquina2() {
        return this.esquina2; 
    }

    // Método toString para representar el rectángulo como una cadena de texto
    public String toString(){
        return "[(" + this.esquina1 + ";" + this.esquina2 + ")]"; 
        // Retorna una representación del rectángulo con sus esquinas
    }
}
