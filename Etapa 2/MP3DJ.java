
public class MP3DJ extends FormatoAudio {

    public void setFile(String arquivoASerAberto) {
        System.out.println("Abrir arquivo: " + arquivoASerAberto);
    }

    public int foward(int novaPosicaoAudioAvancar) {
        System.out.println("");
        return novaPosicaoAudioAvancar;

    }

    public int reward(int novaPosicaoAudioVoltar) {
        System.out.println("");
        return novaPosicaoAudioVoltar;
    }

    @Override
    public String tipoDeAudio(String tipoAudio) {
        return tipoAudio = "MP3DJ";
    }

}
