public class Main4{
    public static void main (String [] args){
        Estudiante[] grupo = new Estudiante[3];

        grupo[0] = new Estudiante("Ana",20);
        grupo[1] = new Estudiante("pedro", 22);
        grupo[2] = new Estudiante("Luis",19);

        for (Estudiante e : grupo){
            e.mostrar();
        }
    } 
}