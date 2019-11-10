package eventos;

public class matrimonios extends Eventos{
    
    private String encargado;
    private int invitados;
    private boolean horario;

    public matrimonios(String encargado, int invitados, boolean horario) {
        this.encargado = encargado;
        this.invitados = invitados;
        this.horario = horario;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public int getInvitados() {
        return invitados;
    }

    public void setInvitados(int invitados) {
        this.invitados = invitados;
    }

    public boolean isHorario() {
        return horario;
    }

    public void setHorario(boolean horario) {
        this.horario = horario;
    }
    
    
    
}
