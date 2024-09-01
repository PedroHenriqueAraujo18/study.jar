public class Telegram extends ServicoMensagem {

    @Override
    public void envioMSG() {
        System.out.println("Mensagem enviada pelo Telegram com sucesso!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo Telegram com sucesso!");
    }
}
