package padroescomportamentais.state;

public class Maquina {
    
    private String nome;
    private MaquinaEstado estado;    


    public Maquina() {
        this.estado = MaquinaEstadoDesligar.getInstance();
    }

    
    public void setEstado(MaquinaEstado estado) {
        this.estado = estado;
    }

    public MaquinaEstado getEstado() {
        return estado;
    } 

    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    


    public String ligar() {
        return estado.ligar(this);
    }

    public String encher() {
        return estado.encher(this);
    }
    
    public String bater() {
        return estado.bater(this);
    }
    
    public String enxaguar() {
        return estado.enxaguar(this);
    }
    
    public String centrifugar() {
        return estado.centrifugar(this);
    }

    public String desligar() {
        return estado.desligar(this);
    }


   
}
