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
            throw new IllegalArgumentException("Nome de arquivo inválido");
        }
        this.nomeArquivo = nomeArquivo;
    }
    
    public void play(){
        System.out.println("Reproduzindo áudio em aberto");
    }
    
    public void stop(){
    	System.out.println("Reprodução de áudio pausada");
    }
    
    public int pause(int segundos){
    	System.out.println("Reprodução de áudio pausada, selecione uma nova posição para o cursor");
        return segundos;
    }
    
    public void release(){
    	System.out.println("Arquivo liberado da memória");
    }
    
}