package tallerherenciamultiple;

public class Hijo extends Padre implements Madre, Tio, Hermano {
    private String nombre;
    private double billetera;
    private Celular celular;
    private Auto auto;

    public Hijo(String nombre, Auto auto, Celular celular) {
        super(auto);  
        this.nombre = nombre;
        this.auto = auto;
        this.celular = celular;
        this.billetera = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBilletera() {
        return billetera;
    }

    public void setBilletera(double billetera) {
        this.billetera = billetera;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    @Override
    public void cantar() {
        super.cantar();
        System.out.println(" y asi canta Juan Carlos");
    }

    public void conducirAuto(Auto auto) {
        System.out.println("Conduciendo un " + auto.getModelo() + " de un amigo!");
    }

    @Override
    public void bailar() {
        System.out.println("Se bailar como mi madre ♪ ♫ ♪");
    }

    @Override
    public int jugarLoteria() {
        billetera += FORTUNA;
        System.out.println("Heredaste la Fortuna de " + FORTUNA + " de tu madre la ROSA!! ahora tienes "+ billetera +"U$D !!!" );
        return NROSUERTE;
    }

    @Override
    public void heredarDinero(double money) {
        billetera += money;
        System.out.println("Mensaje de tio Lucas: disfruta la herencia Addams, sumas " + billetera + " dolaritos");
    }

    @Override
    public void jugarFutbol() {
        System.out.println("Se jugar futbol gracias a mi hermano");
    }

    @Override
    public int hacerGoles() {
        return (int) (Math.random() * 10); 
    }

    public void mostrarBilletera() {
        System.out.println("Billetera actual: " + billetera);
    }
}

