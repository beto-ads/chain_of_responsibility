package locacaoAutomoveis;

interface Handler{
    Handler next(Handler handler);
    String handle(String request);

}