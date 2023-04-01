public class herencia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.setNombre("Maria");
        cliente.setEdad(20);
        cliente.setTelefono("3302561525");
        cliente.setCredito(1000);
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());
        System.out.println("");
        trabajador.setSalario(2000);
        trabajador.setNombre("Trump");
        System.out.println("Trabajador: " + trabajador.getNombre());
        System.out.println("Salario: " + trabajador.getSalario());

    }
}

class Personas {
    String nombre;
    int edad;
    String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

class Cliente extends Personas {
    float credito;

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

}

class Trabajador extends Personas {
    float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}