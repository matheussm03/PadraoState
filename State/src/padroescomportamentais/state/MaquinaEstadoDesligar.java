package padroescomportamentais.state;

public class MaquinaEstadoDesligar implements MaquinaEstado {

    private MaquinaEstadoDesligar() {};
    private static MaquinaEstadoDesligar instance = new MaquinaEstadoDesligar();
    public static MaquinaEstadoDesligar getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Desligar";
    }

    public String ligar(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoLigar.getInstance());
        return "Ligar realizado";
    }
    
    public String encher(Maquina maquina) {
        return "Encher nao realizado";
    }
    
    public String bater(Maquina maquina) {
        return "Bater nao realizado";
    }
    
    public String enxaguar(Maquina maquina) {
        return "Enxaguar nao realizado";
    }
    
    public String centrifugar(Maquina maquina) {
        return "Centrifugar nao realizado";
    }

    public String desligar(Maquina maquina) {
        return "Desligar nao realizado";
    }



}
