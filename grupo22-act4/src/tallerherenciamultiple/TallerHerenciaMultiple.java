package tallerherenciamultiple;

public class TallerHerenciaMultiple {

    public static void main(String[] args) {
        
        // Punto 1
        Auto auto = new Auto("123LATA", "Renault 12");
        Auto auto2 = new Auto("999POWR", "Ford Focus");
        Celular celular = new Celular("Movista", "2664584862", 100.00);
        
        // Punto 2
        Padre padre = new Padre(auto);
        
        // Punto 3
        System.out.println("Papa me dejo en esta zona " + padre.getCasa().getZona() + " Piso " + padre.getCasa().getPisos());
        
        // Punto 4
        Hijo hijo = new Hijo("Juan Carlos", auto, celular);
        
        // Punto 5
        System.out.println("Papa me dejo este auto, modelo: " + hijo.getAuto().getModelo());
        
        // Punto 6
        hijo.conducirAuto(auto2);
        
        // Punto 7
        hijo.jugarFutbol();
        
        // Punto 8
        hijo.bailar();
        
        // Punto 9
        System.out.println("SALIO EL NUMERO DE LA SUERTE " + hijo.jugarLoteria());
        
        // Punto 10
        hijo.cantar();
        
        // Punto 11
        hijo.heredarDinero(2000);
        
        // Punto 12
        System.out.println("Jugando al futbol, hoy has hecho " + hijo.hacerGoles() + " goles");
    }
    
}
