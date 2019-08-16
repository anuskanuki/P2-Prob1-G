
public class AIFFSuperPlayer extends FormatoAudio {

    private int cursor;
    private String nomeArquivo;

    public AIFFSuperPlayer(int cursor) {
        this.setCursor(cursor);
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        if (nomeArquivo.length() <= 0) {
            throw new IllegalArgumentException("Nome de arquivo invalido");
        }
        this.nomeArquivo = nomeArquivo;
    }

    public void play() {
        System.out.println("Reproduzindo audio em aberto");
    }

    public void stop() {
        System.out.println("Reproducao de audio pausada");
    }

    public int pause(int segundos) {
        System.out.println("Reproducao de audio pausada, selecione uma nova posicao para o cursor");
        return segundos;
    }

    public void release() {
        System.out.println("Arquivo liberado da memoria");
    }

    @Override
    public String tipoDeAudio(String tipoAudio) {
        return tipoAudio = "AIFF";
    }

}
