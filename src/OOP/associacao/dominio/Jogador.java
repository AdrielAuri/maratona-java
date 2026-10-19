package OOP.associacao.dominio;

// 1 - Criação da classe que será Associada
// 2 - Criação de instancia da classe Time
// 3 - Associando objeto Time ao objeto Jogador e dando valor.

public class Jogador {
    private String nome;
    private Time time; // Segundo

    public void imprime(){
        System.out.println(this.nome);
        //Regra de validação para evitar exception no caso de objeto sem valor
        if(time != null){
            System.out.println(time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
