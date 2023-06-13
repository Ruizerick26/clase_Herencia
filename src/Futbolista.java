public class Futbolista extends Persona {
    private String equipo;
    private String posicion;
    private int n_camiseta;
    private String representante;
    private int horas;

    public Futbolista(String nombre, String apellido, int cedula, String direccion, String telefono,String signo,int edad,String equipo,String posicion,int n_camiseta,String representante,int horas) {
        super(nombre, apellido, cedula, direccion, telefono,signo,edad);
        this.equipo = equipo;
        this.posicion = posicion;
        this.n_camiseta = n_camiseta;
        this.representante = representante;
        this.horas = horas;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getN_camiseta() {
        return n_camiseta;
    }

    public void setN_camiseta(int n_camiseta) {
        this.n_camiseta = n_camiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void correr(){
        System.out.println("Este es el metodo correr");
    }
}
