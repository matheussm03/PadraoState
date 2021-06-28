package padroescomportamentais.state;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaquinaTest {
	Maquina maquina;

    @BeforeEach
    public void setUp(){
        maquina = new Maquina();
    }
    
    //Estado Ligar
    @Test
    public void ligadoDeveRetornarLigarNaoRealizado() {
        maquina.setEstado(MaquinaEstadoLigar.getInstance());
        assertEquals("Ligar nao realizado", maquina.ligar());
    }
    
    @Test
    public void ligadoDeveRetornarEncherRealizado() {
        maquina.setEstado(MaquinaEstadoLigar.getInstance());
        assertEquals("Encher realizado", maquina.encher());
    }
    
    @Test
    public void ligadoDeveRetornarBaterRealizado() {
        maquina.setEstado(MaquinaEstadoLigar.getInstance());
        assertEquals("Bater realizado", maquina.bater());
    }
    
    @Test
    public void ligadoDeveRetornarEnxaguarRealizado() {
        maquina.setEstado(MaquinaEstadoLigar.getInstance());
        assertEquals("Enxaguar realizado", maquina.enxaguar());
    }
    
    @Test
    public void ligadoDeveRetornarCentrifugarRealizado() {
        maquina.setEstado(MaquinaEstadoLigar.getInstance());
        assertEquals("Centrifugar realizado", maquina.centrifugar());
    }
    
    @Test
    public void ligadoDeveRetornarDesligarRealizado() {
        maquina.setEstado(MaquinaEstadoLigar.getInstance());
        assertEquals("Desligar realizado", maquina.desligar());
    }
    
    
  //Estado Encher
    @Test
    public void encherDeveRetornarLigarNaoRealizado() {
        maquina.setEstado(MaquinaEstadoEncher.getInstance());
        assertEquals("Ligar nao realizado", maquina.ligar());
    }
    
    @Test
    public void encherDeveRetornarEncherNaoRealizado() {
        maquina.setEstado(MaquinaEstadoEncher.getInstance());
        assertEquals("Encher nao realizado", maquina.encher());
    }
    
    @Test
    public void encherDeveRetornarBaterRealizado() {
        maquina.setEstado(MaquinaEstadoEncher.getInstance());
        assertEquals("Bater realizado", maquina.bater());
    }
    
    @Test
    public void encherDeveRetornarEnxaguarRealizado() {
        maquina.setEstado(MaquinaEstadoEncher.getInstance());
        assertEquals("Enxaguar realizado", maquina.enxaguar());
    }
    
    @Test
    public void encherDeveRetornarCentrifugarRealizado() {
        maquina.setEstado(MaquinaEstadoEncher.getInstance());
        assertEquals("Centrifugar realizado", maquina.centrifugar());
    }
    
    @Test
    public void encherDeveRetornarDesligarRealizado() {
        maquina.setEstado(MaquinaEstadoEncher.getInstance());
        assertEquals("Desligar realizado", maquina.desligar());
    }
    
    
    //Estado Bater
    @Test
    public void baterDeveRetornarLigarNaoRealizado() {
        maquina.setEstado(MaquinaEstadoBater.getInstance());
        assertEquals("Ligar nao realizado", maquina.ligar());
    }
    
    @Test
    public void baterDeveRetornarEncherNaoRealizado() {
        maquina.setEstado(MaquinaEstadoBater.getInstance());
        assertEquals("Encher nao realizado", maquina.encher());
    }
    
    @Test
    public void baterDeveRetornarBaterRealizado() {
        maquina.setEstado(MaquinaEstadoBater.getInstance());
        assertEquals("Bater realizado", maquina.bater());
    }
    
    @Test
    public void baterDeveRetornarEnxaguarRealizado() {
        maquina.setEstado(MaquinaEstadoBater.getInstance());
        assertEquals("Enxaguar realizado", maquina.enxaguar());
    }
    
    @Test
    public void baterDeveRetornarCentrifugarRealizado() {
        maquina.setEstado(MaquinaEstadoBater.getInstance());
        assertEquals("Centrifugar realizado", maquina.centrifugar());
    }
    
    @Test
    public void baterDeveRetornarDesligarRealizado() {
        maquina.setEstado(MaquinaEstadoBater.getInstance());
        assertEquals("Desligar realizado", maquina.desligar());
    }
    
    //Estado Enxaguar
    @Test
    public void enxaguarDeveRetornarLigarNaoRealizado() {
        maquina.setEstado(MaquinaEstadoEnxaguar.getInstance());
        assertEquals("Ligar nao realizado", maquina.ligar());
    }
    
    @Test
    public void enxaguarDeveRetornarEncherNaoRealizado() {
        maquina.setEstado(MaquinaEstadoEnxaguar.getInstance());
        assertEquals("Encher nao realizado", maquina.encher());
    }
    
    @Test
    public void enxaguarDeveRetornarBaterRealizado() {
        maquina.setEstado(MaquinaEstadoEnxaguar.getInstance());
        assertEquals("Bater realizado", maquina.bater());
    }
    
    @Test
    public void enxaguarDeveRetornarEnxaguarNaoRealizado() {
        maquina.setEstado(MaquinaEstadoEnxaguar.getInstance());
        assertEquals("Enxaguar nao realizado", maquina.enxaguar());
    }
    
    @Test
    public void enxaguarDeveRetornarCentrifugarRealizado() {
        maquina.setEstado(MaquinaEstadoEnxaguar.getInstance());
        assertEquals("Centrifugar realizado", maquina.centrifugar());
    }
    
    @Test
    public void enxaguarDeveRetornarDesligarRealizado() {
        maquina.setEstado(MaquinaEstadoEnxaguar.getInstance());
        assertEquals("Desligar realizado", maquina.desligar());
    } 
    
    //Estado Centrifugar
    @Test
    public void centrifugarDeveRetornarLigarNaoRealizado() {
        maquina.setEstado(MaquinaEstadoCentrifugar.getInstance());
        assertEquals("Ligar nao realizado", maquina.ligar());
    }
    
    @Test
    public void centrifugarDeveRetornarEncherRealizado() {
        maquina.setEstado(MaquinaEstadoCentrifugar.getInstance());
        assertEquals("Encher realizado", maquina.encher());
    }
    
    @Test
    public void centrifugarDeveRetornarBaterNaoRealizado() {
        maquina.setEstado(MaquinaEstadoCentrifugar.getInstance());
        assertEquals("Bater nao realizado", maquina.bater());
    }
    
    @Test
    public void centrifugarDeveRetornarEnxaguarRealizado() {
        maquina.setEstado(MaquinaEstadoCentrifugar.getInstance());
        assertEquals("Enxaguar realizado", maquina.enxaguar());
    }
    
    @Test
    public void centrifugarDeveRetornarCentrifugarNaoRealizado() {
        maquina.setEstado(MaquinaEstadoCentrifugar.getInstance());
        assertEquals("Centrifugar nao realizado", maquina.centrifugar());
    }
    
    @Test
    public void centrifugarDeveRetornarDesligarRealizado() {
        maquina.setEstado(MaquinaEstadoCentrifugar.getInstance());
        assertEquals("Desligar realizado", maquina.desligar());
    }    
    
    //Estado Desligar
    @Test
    public void desligadoDeveRetornarLigarRealizado() {
        maquina.setEstado(MaquinaEstadoDesligar.getInstance());
        assertEquals("Ligar realizado", maquina.ligar());
    }
    
    @Test
    public void desligadoDeveRetornarEncherNaoRealizado() {
        maquina.setEstado(MaquinaEstadoDesligar.getInstance());
        assertEquals("Encher nao realizado", maquina.encher());
    }
    
    @Test
    public void desligadoDeveRetornarBaterNaoRealizado() {
        maquina.setEstado(MaquinaEstadoDesligar.getInstance());
        assertEquals("Bater nao realizado", maquina.bater());
    }
    
    @Test
    public void desligadoDeveRetornarEnxaguarNaoRealizado() {
        maquina.setEstado(MaquinaEstadoDesligar.getInstance());
        assertEquals("Enxaguar nao realizado", maquina.enxaguar());
    }
    
    @Test
    public void desligadoDeveRetornarCentrifugarNaoRealizado() {
        maquina.setEstado(MaquinaEstadoDesligar.getInstance());
        assertEquals("Centrifugar nao realizado", maquina.centrifugar());
    }
    
    @Test
    public void desligadoDeveRetornarDesligarNaoRealizado() {
        maquina.setEstado(MaquinaEstadoDesligar.getInstance());
        assertEquals("Desligar nao realizado", maquina.desligar());
    }
    


}
