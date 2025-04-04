class Verificador {
    
    // Método estático que determina la relación entre dos rectángulos
    public static int determinarCaso(Rectangulo a, Rectangulo b) {
        // Obtener las esquinas de cada rectángulo
        Coordenada a1 = a.getEsquina1(); 
        Coordenada a2 = a.getEsquina2(); 
        Coordenada b1 = b.getEsquina1(); 
        Coordenada b2 = b.getEsquina2(); 

        // Caso 1: Los rectángulos se sobreponen
        if (a1.getX() < b2.getX() && a2.getX() > b1.getX() &&
            a1.getY() < b2.getY() && a2.getY() > b1.getY()) {
            return 1; 
        }

        // Los rectángulos están juntos (comparten borde)
        // Comparación en el eje X y y
        if (a2.getX() == b1.getX() || a1.getX() == b2.getX() || 
            a2.getY() == b1.getY() || a1.getY() == b2.getY()) { 
            return 2; 
        }

        //  rectángulos son disjuntos (no se tocan ni se sobreponen)
        return 3; 
    }
}
