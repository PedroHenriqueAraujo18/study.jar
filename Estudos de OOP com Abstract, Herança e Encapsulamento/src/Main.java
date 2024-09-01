public class Main {
    public static void main(String[] args)
    {

        MSN msn = new MSN();
        FacebookMessenger fcb = new FacebookMessenger();
        Telegram tl = new Telegram();
        fcb.envioMSG();
        fcb.receberMensagem();
        tl.envioMSG();
        tl.receberMensagem();
        msn.envioMSG();
        msn.receberMensagem();






    }
}