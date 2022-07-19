public class Main {
    public static void main(String[] args)

    {
        Docente docente = new Docente("jesse","pinkman",485621,"Docente",250);
        docente.mostrar();
        System.out.println("Su sueldo es: "+docente.obtenerSueldo());

        Empleado empleado =  new Empleado("Waler","White",125648,"Empleado","Secretario","80");
        empleado.obtenerBono();
        System.out.println("El bono es: "+empleado.getBono());

    }
}