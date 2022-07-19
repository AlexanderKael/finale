public abstract class Trabajador
{
  String nombre;
  String apellido;
  int dni;
  String tipo;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public String getTipo() {
        return tipo;
    }

    public Trabajador(String nombre, String apellido, int dni, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tipo=tipo;
    }

    public void mostrar(){

    }
}