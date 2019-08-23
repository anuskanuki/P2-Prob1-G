/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augus
 */
public class AIFFSuperPlayerAdapter extends FormatoAudio {

    @Override
    public String tipoDeAudio(String tipoAudio) {
        AIFFSuperPlayer aiffSuperPlayer = new AIFFSuperPlayer(0);
        return aiffSuperPlayer.tipoDeAudio(tipoAudio);
    }
    
}
