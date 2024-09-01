public class FacebookMessenger extends ServicoMensagem{

    @Override
    public void envioMSG() {
        System.out.println("Mensagem enviada pelo Facebook com sucesso!");
    }

    @Override
    public void receberMensagem() {
    System.out.println("Mensagem recebida pelo Facebook com sucesso!");
    }
}
