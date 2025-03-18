class Vehiculo {
    void arrancar() {
        System.out.println("El vehículo está en marcha");
    }
}

class Coche extends Vehiculo {
    void arrancar() {
        System.out.println("El coche está en marcha");
    }
}

class Moto extends Vehiculo {
    void arrancar() {
        System.out.println("La moto está en marcha");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Vehiculo v1 = new Coche();
        Vehiculo v2 = new Moto();
        
        v1.arrancar();
        v2.arrancar();
    }
}
