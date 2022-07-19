public class Planilla extends Trabajador
{
    protected Trabajador trabajador[];

    protected int contador;

    public Planilla(String nombre, String apellido, int dni, String tipo) {
        super(nombre, apellido, dni, tipo);
    }

    public void listar()
    {
        for (int i = 0; i < this.contador; i++) {
            System.out.println(this.trabajador[i].getNombre());

            this.trabajador[i].mostrar();
        }

    }


}

