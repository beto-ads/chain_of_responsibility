package locacaoAutomoveis;

public class tipoClassic extends AbstraticHandler {

    public tipoClassic(Handler nextHandler) {
        super(nextHandler);
    }

    public Handler next(Handler handler) {       
        return handler;
    }

    
    public String handle(String request) {
        if (request.equals(" mais baratos")) {
            return "Carros classicos tem valores" + request;
        } else {
            return super.handle(request);
        }
    }

   
}
