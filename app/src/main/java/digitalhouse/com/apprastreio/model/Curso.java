package digitalhouse.com.apprastreio.model;

public class Curso {

    private String nome;
    private String descricao;
    private String estado;

    public Curso(String nome, String descricao, String estadoAtual) {
        this.nome = nome;
        this.descricao = descricao;
        this.estado = estadoAtual;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstadoAtual() {
        return estado;
    }

    public void setEstadoAtual(String estadoAtual) {
        this.estado = estadoAtual;
    }

    @Override
    public String toString(){
        return "Curso: "+nome+"Descrição: "+descricao+"Estado: "+estado;
    }



}
