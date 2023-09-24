package locacaoAutomoveis;

public abstract class AbstraticHandler implements Handler {

    private Handler nexHandler;

    public AbstraticHandler(Handler nexHandler) {
        this.nexHandler = nexHandler;
    }

    public String handle(String request){
        if (nexHandler != null) {
            return nexHandler.handle(request);
        }
        return" ";
    }
    
}
