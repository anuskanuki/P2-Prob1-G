
public abstract class FormatoAudio {

    private String tipoAudio;
    
    public void abrir(String arquivoAudio) {
        System.out.println("Áudio aberto");
    }

    public void reproduzir() {
        System.out.println("Áudio reproduzido. TIpo: " + tipoDeAudio(tipoAudio));
    }

    public abstract String tipoDeAudio(String tipoAudio);

    public void pausar() {
        System.out.println("Reprodução do áudio pausada");
    }

    public void parar() {
        System.out.println("Áudio reiniciado");
    }

    public void avancar(int segundosAvancados) {
        System.out.println("Áudio avançado em " + segundosAvancados + " segundos");
    }

    public void retornar(int segundosVoltados) {
        System.out.println("Áudio retrocedido em " + segundosVoltados + " segundos");
    }

    public void liberar() {
        System.out.println("Arquivo de áudio fechado");
    }

}
