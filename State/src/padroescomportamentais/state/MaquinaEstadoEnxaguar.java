package padroescomportamentais.state;

public class MaquinaEstadoEnxaguar implements MaquinaEstado {

    private MaquinaEstadoEnxaguar() {};
    private static MaquinaEstadoEnxaguar instance = new MaquinaEstadoEnxaguar();
    public static MaquinaEstadoEnxaguar getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Enxaguar";
    }

    public String ligar(Maquina maquina) {
        return "Ligar nao realizado";
    }
    
    public String encher(Maquina maquina) {
        return "Encher nao realizado";
    }
    
    public String bater(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoBater.getInstance());
        return "Bater realizado";
    }
    
    public String enxaguar(Maquina maquina) {
        return "Enxaguar nao realizado";
    }
    
    public String centrifugar(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoCentrifugar.getInstance());
        return "Centrifugar realizado";
    }

    public String desligar(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoDesligar.getInstance());
        return "Desligar realizado";
    }



}
