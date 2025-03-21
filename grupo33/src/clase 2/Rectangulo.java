public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    // Constructor 
    public Rectangulo(Coordenada c1, Coordenada c2){
        setEsquina1(c1);
        setEsquina2(c2);
    }

    public void setEsquina1 (Coordenada coo){
        // fill in the code here}
        this.esquina1 = coo;
    }

    public void setEsquina2 (Coordenada coo){
        // fill in the code here
        this.esquina2 = coo;
    }

    public Coordenada getEsquina1() {
        // fill in the code here
        return this.esquina1;
    }

    public Coordenada getEsquina2 () {
        // fill in the code here
        return this.esquina2;
    }

    public String toString(){
        return ""
        // fill in the code here 
       
    }
}