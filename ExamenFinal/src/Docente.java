public class Docente extends Trabajador implements Crud {
   protected int horasEmp;

    public Docente(String nombre, String apellido, int dni, String tipo, int horasEmp) {
        super(nombre, apellido, dni, tipo);
        this.horasEmp = horasEmp;
    }

    public int getHorasEmp() {
        return horasEmp;
    }

    @Override
    public void mostrar() {
        System.out.println("\tnombre: " + getNombre());
        System.out.println("\tApellidos: " + getApellido());
        System.out.println("\tDni: " + getDni());
        System.out.println("\tTipo de trabajador: " + getTipo());
        System.out.println("\thorasEmp: " + getHorasEmp());

    }

    @Override
    public int obtenerSueldo() {
        int obtenersueldo;
        obtenersueldo = getHorasEmp() * 2;
        return obtenersueldo;
    }

    @Override
    public void obtenerBono() {
    }
}

