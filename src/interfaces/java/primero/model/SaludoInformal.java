package interfaces.java.primero.model;

public class SimpleInterface implements Saludador{

    private String nombre;

    public SimpleInterface(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String saludar() {
        StringBuilder sb = new StringBuilder().append("Interface Informal\n")
                .append(this.nombre).append(" saluda informalmente.\n");
        return sb.toString();
    }
}
