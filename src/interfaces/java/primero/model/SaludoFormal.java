package interfaces.java.primero.model;

public class SaludoFormal implements Saludador{

    private String nombre;

    public SaludoFormal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String saludar() {
        StringBuilder sb = new StringBuilder().append("Interface Formal")
                .append("\n").append(this.nombre).append(" esta saludando formalmente.\n");
        return sb.toString();
    }
}
