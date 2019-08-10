public class WMAPlay extends FormatoAudio {
    
   String file;
   int location;

    public int getLocation() {
        return location;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }
    
    public void play(){
    	System.out.println("Reproduzindo arquivo em aberto");   
    }
    
    public void stop(){
    	System.out.println("Reprodução de áudio pausada");
    }
    
    public void open(){
    	System.out.println("Um arquivo de áudio foi aberto");
    }
 
}