package eventos;

public class Eventos {
    
    private int numeroDeAsistentes;
    private boolean todoTipoDeEventos;
    private int numeroDeCompañias;
    private int numeroDeSillas;
    private int clientes;
    private int numeroDeSedes;
    
    public void nuevosAsistentes(){
        numeroDeAsistentes = 2;
    }
    
    public void tipoDeEventos(){
        todoTipoDeEventos = true;
    }
    
    public void nuevasCompañias(){
        numeroDeCompañias = 3;
    }
    
    public void nuevasSillas(){
        numeroDeSillas = 400;
    }
    
    public void nuevosClientes(){
        clientes = 20;
       
    }
    
    public void nuevasSedes(){
        numeroDeSedes = 5;
    }

    public int getNumeroDeAsistentes() {
        return numeroDeAsistentes;
    }

    public void setNumeroDeAsistentes(int numeroDeAsistentes) {
        this.numeroDeAsistentes = numeroDeAsistentes;
    }

    public boolean isTodoTipoDeEventos() {
        return todoTipoDeEventos;
    }

    public void setTodoTipoDeEventos(boolean todoTipoDeEventos) {
        this.todoTipoDeEventos = todoTipoDeEventos;
    }

    public int getNumeroDeCompañias() {
        return numeroDeCompañias;
    }

    public void setNumeroDeCompañias(int numeroDeCompañias) {
        this.numeroDeCompañias = numeroDeCompañias;
    }

    public int getNumeroDeSillas() {
        return numeroDeSillas;
    }

    public void setNumeroDeSillas(int numeroDeSillas) {
        this.numeroDeSillas = numeroDeSillas;
    }

    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    public int getNumeroDeSedes() {
        return numeroDeSedes;
    }

    public void setNumeroDeSedes(int numeroDeSedes) {
        this.numeroDeSedes = numeroDeSedes;
    }
    
    public void nuevosAsistentes(int nuevoNumeroDeAsistentes){
        if(nuevoNumeroDeAsistentes<=this.numeroDeAsistentes){
            System.out.println("No hay nuevos asistentes: ");
        }else{
            this.numeroDeAsistentes = nuevoNumeroDeAsistentes;
            System.out.println("Los nuevos asistentes son: ");         
        }
    }


    
}
