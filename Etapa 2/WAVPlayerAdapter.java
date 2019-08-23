/**
 *
 * @author augus
 */
public class WAVPlayerAdapter extends FormatoAudio {

    @Override
    public String tipoDeAudio(String tipoAudio) {
        WAVPlayer wavPlayer = new WAVPlayer("Nome do Arquivo");
        return wavPlayer.tipoDeAudio(tipoAudio);
    }
    
}
