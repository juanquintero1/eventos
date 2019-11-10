package eventos;


public class cumpleaños extends Eventos{
    
    private String encargado;
    private int encargados;
    private boolean horario;

    public cumpleaños(String encargado, int encargados, boolean horario) {
        this.encargado = encargado;
        this.encargados = encargados;
        this.horario = horario;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public int getEncargados() {
        return encargados;
    }

    public void setEncargados(int encargados) {
        this.encargados = encargados;
    }

    public boolean isHorario() {
        return horario;
    }

    public void setHorario(boolean horario) {
        this.horario = horario;
    }
    
    
    
}
