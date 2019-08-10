
public class WAVPlayer extends FormatoAudio {

    private String nomeArquivo;

    public WAVPlayer(String nomeArquivo) {
        this.setNomeArquivo(nomeArquivo);
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        if (nomeArquivo.length() <= 0) {
            throw new IllegalArgumentException("Nome de arquivo inválido");
        }
        this.nomeArquivo = nomeArquivo;
    }

    protected void finalize() throws Throwable {
        System.out.println(this.nomeArquivo + " fechado");
        super.finalize();
    }

}
