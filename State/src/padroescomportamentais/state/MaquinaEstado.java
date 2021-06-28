package padroescomportamentais.state;

public interface MaquinaEstado {
    
    String getEstado();
    
    String ligar(Maquina maquina);
    
    String encher(Maquina maquina);
    
    String bater(Maquina maquina);
    
    String enxaguar(Maquina maquina);
    
    String centrifugar(Maquina maquina);

    String desligar(Maquina maquina);
    
}
