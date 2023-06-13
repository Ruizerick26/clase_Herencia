public class Estudiante extends Persona{
    private int codigo;
    private String correo;
    private String semestre;
    private String carrera;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Estudiante(){
        super();
    }
    public Estudiante(String nombre, String apellido, int cedula, String direccion, String telefono,String signo,int edad,int codigo,String correo,String semestre,String carrera) {
        super(nombre, apellido, cedula, direccion, telefono,signo,edad);
        this.codigo=codigo;
        this.correo = correo;
        this.semestre = semestre;
        this.carrera = carrera;
    }
    public void leer(){
        System.out.println("Este es el metodo leer");
    }
}
