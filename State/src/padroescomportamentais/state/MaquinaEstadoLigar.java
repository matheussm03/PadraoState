package padroescomportamentais.state;

public class MaquinaEstadoLigar implements MaquinaEstado {

    private MaquinaEstadoLigar() {};
    private static MaquinaEstadoLigar instance = new MaquinaEstadoLigar();
    public static MaquinaEstadoLigar getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ligar";
    }
    
    public String ligar(Maquina maquina) {
        return "Ligar nao realizado";
    }
    
    public String encher(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoEncher.getInstance());
        return "Encher realizado";
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
