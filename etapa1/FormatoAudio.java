
public abstract class FormatoAudio {

    public void abrir(String arquivoAudio) {
        System.out.println("Áudio aberto");
    }

    public void reproduzir() {
        System.out.println("Áudio reproduzido");
    }

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
        System.out.println("Áudio retrocedido em " + segundosVoltados + " seundos");
    }

    public void liberar() {
        System.out.println("Arquivo de áudio fechado");
    }

}
