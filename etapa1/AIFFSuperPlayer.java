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
            throw new IllegalArgumentException("Nome de arquivo inv�lido");
        }
        this.nomeArquivo = nomeArquivo;
    }
    
    public void play(){
        System.out.println("Reproduzindo �udio em aberto");
    }
    
    public void stop(){
    	System.out.println("Reprodu��o de �udio pausada");
    }
    
    public int pause(int segundos){
    	System.out.println("Reprodu��o de �udio pausada, selecione uma nova posi��o para o cursor");
        return segundos;
    }
    
    public void release(){
    	System.out.println("Arquivo liberado da mem�ria");
    }
    
}