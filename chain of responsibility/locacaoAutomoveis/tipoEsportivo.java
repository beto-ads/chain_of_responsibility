package locacaoAutomoveis;

public class tipoEsportivo extends AbstraticHandler {

    public tipoEsportivo(Handler nextHandler) {
        super(nextHandler);
    }

    public Handler next(Handler handler) {       
        return handler;
    }

    
    public String handle(String request) {
        if (request.equals(" mais caros")) {
            return "Carros esportivos tem valores " + request;
        } else {
            return super.handle(request);
        }
    }

   
}
