public class Empleado extends Trabajador implements Crud {
    protected String cargo;
    protected String bono;


    public Empleado(String nombre, String apellido, int dni, String tipo, String cargo, String bono) {
        super(nombre, apellido, dni, tipo);
        this.cargo = cargo;
        this.bono = bono;
    }

    public String getCargo() {
        return cargo;
    }

    public String getBono() {
        return bono;
    }

    @Override
    public void mostrar() {
        System.out.println("\tnombre : " + getNombre());
        System.out.println("\tApellidos del Docente: " + getApellido());
        System.out.println("\tDni: " + getDni());
        System.out.println("\tTipo de trabajador: " + getTipo());
        System.out.println("\tCargo: " + getCargo());
        System.out.println("\tBono: " + getBono());


    }


    @Override
    public int obtenerSueldo() {
        return 0;
    }

    @Override
    public void obtenerBono(){
        System.out.println(getBono());
    }
}