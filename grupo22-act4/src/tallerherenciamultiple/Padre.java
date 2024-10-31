package tallerherenciamultiple;

public class Padre {
    private String nombre;
    private String apellido;
    private Casa casa;
    private Auto auto;

    public Padre(Auto auto) {
        this.nombre = "Papa";
        this.apellido = "Lopez";
        construirCasa();
        comprarAuto(auto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    
    public void construirCasa() {
        this.casa = new Casa("Centro", 2); 
    }

    public void comprarAuto(Auto auto) {
        this.auto = auto; 
    }

    public void cantar() {
        System.out.print("Asi canta tu padre, Don " + apellido);
    }
}
