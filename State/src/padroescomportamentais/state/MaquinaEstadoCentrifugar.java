package padroescomportamentais.state;

public class MaquinaEstadoCentrifugar implements MaquinaEstado {

    private MaquinaEstadoCentrifugar() {};
    private static MaquinaEstadoCentrifugar instance = new MaquinaEstadoCentrifugar();
    public static MaquinaEstadoCentrifugar getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Centrifugar";
    }

    public String ligar(Maquina maquina) {
        return "Ligar nao realizado";
    }
    
    public String encher(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoEncher.getInstance());
        return "Encher realizado";
    }
    
    public String bater(Maquina maquina) {
        return "Bater nao realizado";
    }
    
    public String enxaguar(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoEnxaguar.getInstance());
        return "Enxaguar realizado";
    }
    
    public String centrifugar(Maquina maquina) {
        return "Centrifugar nao realizado";
    }

    public String desligar(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoDesligar.getInstance());
        return "Desligar realizado";
    }



}
