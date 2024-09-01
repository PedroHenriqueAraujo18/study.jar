public class MSN  extends ServicoMensagem{

    @Override
    public void envioMSG() {
        System.out.println("Mensagem enviada pelo MSN com sucesso!");
    }

    @Override
    public void receberMensagem() {
    System.out.println("Mensagem recebida pelo MSN com sucesso!");
    }



}
