import java.util.ArrayList;

public class ProcessadorVideo {
    private ArrayList<CanalNotificacao> canais;

    public ProcessadorVideo() {
        canais = new ArrayList<CanalNotificacao>();
    }

    public void registrarCanal(CanalNotificacao canal) {
        canais.add(canal);
    }

    public void processar(Video video) {
        for(CanalNotificacao c : canais) {
            c.notificar(new Mensagem(
                String.format("%s - %s", video.getArquivo(), video.getFormato()),
                TipoMensagem.LOG
            ));
        }
    }
}
