package locacaoAutomoveis;

public class tipoOffRoad extends AbstraticHandler {

    public tipoOffRoad(Handler nextHandler) {
        super(nextHandler);
    }

    public Handler next(Handler handler) {       
        return handler;
    }

    
    public String handle(String request) {
        if (request.equals(" médios")) {
            return "Carros Off-road tem valores" + request;
        } else {
            return super.handle(request);
        }
    }

   
}
