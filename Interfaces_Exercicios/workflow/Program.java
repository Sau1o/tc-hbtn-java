import atividades.*;

public class Program {
    public static void main(String[] args) {
        MaquinaWorkflow maquinaWorkflow = new MaquinaWorkflow();
        
        Workflow workflowEncodificarVideos = new Workflow();

        workflowEncodificarVideos.RegistrarAtividade(new CarregarVideo());
        workflowEncodificarVideos.RegistrarAtividade(new CodificarVideo());
        workflowEncodificarVideos.RegistrarAtividade(new EnviarEmail());
        
        maquinaWorkflow.executar(workflowEncodificarVideos);

        System.out.println("-----");

        Workflow workflowVideos = new Workflow();

        workflowVideos.RegistrarAtividade(new CarregarVideo());
        workflowVideos.RegistrarAtividade(new EnviarEmail());

        maquinaWorkflow.executar(workflowVideos);

        System.out.println("-----");

        Workflow workflowVideosStatus = new Workflow();

        workflowVideosStatus.RegistrarAtividade(new CarregarVideo());
        workflowVideosStatus.RegistrarAtividade(new ModificarStatusVideo());
        workflowVideosStatus.RegistrarAtividade(new EnviarEmail());

        maquinaWorkflow.executar(workflowVideosStatus);        
    }
}
