public class Doctor extends Persona {
    private int codigo;
    private String especialidad;
    private String horario;
    private String hospital;


    public Doctor(String nombre, String apellido, int cedula, String direccion, String telefono,String signo,int edad,int codigo,String especialidad,String horario,String hospital) {
        super(nombre, apellido, cedula, direccion, telefono, signo,edad);
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.horario = horario;
        this.horario = hospital;
    }
    public void examinar(){
        System.out.println("Este es el metodo examinar");
    }
}
