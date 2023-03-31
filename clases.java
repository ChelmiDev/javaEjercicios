public class clases {
    public static void main(String[] args) {

        Personas personas = new Personas();

        personas.setNombre("Leonardo");
        personas.setEdad(30);
        personas.setTelefono("3152651825");

        System.out.println("nombre:"+ personas.getNombre() + " Edad:"+ personas.getEdad() + " Telefono:"+ personas.getTelefono());
    }
}

class Personas {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}