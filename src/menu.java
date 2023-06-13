public class menu {
    public static void main(String[] args) {
        Persona mipersona = new Persona("Juan","Pérez",1715482678,"Conocoto","0986487","Aquario",25);
        Persona Pedro= new Persona();
        System.out.println(mipersona.getCedula());
        System.out.println(Pedro.getCedula());

        Estudiante Erick = new Estudiante("Erick","Ruiz",1755135207,"Mena 2","0963113677","Cancer",24,124587,"erick.ruiz@pen.edu.ed","3ero","TSDS");
        Erick.caminar();
        System.out.println("----------------------------------------------");

        Doctor persona1 = new Doctor("Ana","Pacheco",1784685234,"Villaflora","097684351","Leo",33,135468,"Neurocirujana","9h00 - 22h00","San pancho");
        System.out.println(persona1.getNombre()+ " es doctora");
        System.out.println("Tiene "+persona1.getEdad()+" años");
        System.out.println("Es de signo "+persona1.getSigno());
        persona1.examinar();

        Empleado_Publico persona2 = new Empleado_Publico("Pablo","Neruda",178468532,"Guamani","Aries",40,"123456","contadr","Gerente","Administracion");
        System.out.println(persona2.getNombre()+" es Empleado Publico");
        System.out.println("Su telefono es "+persona2.getTelefono());
        persona2.tramitar();

        Futbolista persona3 = new Futbolista("Maritza","Lopez",1798654325,"Acapucho","098645732","Capricornio",28,"Liga","Delantero",15,"Xavier",5);
        System.out.println(persona3.getNombre()+" es Futbolista");
        System.out.println("Entrena "+persona3.getHoras()+" horas diarias");
        persona3.correr();

        Estudiante persona4 = new Estudiante("Melani","Sandobla",178946532,"Cotocollao","0976846351","Geminis",20,89684,"melani@gmail.com","3ero","TDST");
        System.out.println(persona4.getNombre()+" es Estudiante");
        System.out.println("Está en "+persona4.getSemestre());
        persona4.leer();

    }
}
