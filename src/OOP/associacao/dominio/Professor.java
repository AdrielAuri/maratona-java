package OOP.associacao.dominio;

//Classe que será associada
public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("=============");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if(this.seminarios == null )return;
        System.out.println("Seminários Disponiveis: ");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());
            if( seminario.getAlunos() == null ) continue; // Esse comando serve para parar o proximo comando e continuar.
            System.out.println(" === alunos ===");
            for (Aluno alunos : seminario.getAlunos()) {
                System.out.println("Aluno: " + alunos.getNome() + "\nIdade: " + alunos.getIdade());
            }

        }

    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
