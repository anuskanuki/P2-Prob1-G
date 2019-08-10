public class AIFFSuperPlayer extends FormatoAudio {
    
    private int cursor;

    public AIFFSuperPlayer(int cursor) {
        this.setCursor(cursor);
    }
    

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }
    
    public void play(){
       
        System.out.println("Audio reproduzindo");
    }
    
    public void strop(){
        
    }
    
    public int pause(int segundos){
       
        return segundos;
    }
    
    public void release(){
        
    }
    
}