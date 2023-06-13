public class Empleado_Publico extends Persona{
    private String puesto;
    private String cargo;
    private String Titulo;

    public Empleado_Publico(String nombre, String apellido, int cedula, String direccion,String signo,int edad, String telefono,String puesto,String cargo,String Titulo) {
        super(nombre, apellido, cedula, direccion, telefono,signo,edad);
        this.puesto = puesto;
        this.cargo = cargo;
        this.Titulo= Titulo;
    }
    public void tramitar(){
        System.out.println("Este es el metodo tramitar");
    }
}
