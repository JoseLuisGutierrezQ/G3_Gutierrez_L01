class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico del gato");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Miauu Miauu");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        miPerro.hacerSonido();
    }
}
