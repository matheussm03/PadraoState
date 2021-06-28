package padroescomportamentais.state;

public class MaquinaEstadoBater implements MaquinaEstado {

    private MaquinaEstadoBater() {};
    private static MaquinaEstadoBater instance = new MaquinaEstadoBater();
    public static MaquinaEstadoBater getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Bater";
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
        maquina.setEstado(MaquinaEstadoEnxaguar.getInstance());
        return "Enxaguar realizado";
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
