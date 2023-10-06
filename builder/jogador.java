package builder;

import java.util.Date;

public class Jogador {
    private int numeroContrato;
    private String nome;
    private String cpf;
    private String rg;
    private String nacionalidade;
    private float peso;
    private float altura;
    private Date dataNascimento;
    private int numeroCamisa;
    private String endereco;
    private String email;
    private String telefone;
    private String posicao;
    private boolean temHabilidadeComPernaEsquerda;
    private boolean temHabilidadeComPernaDireita;

    public Jogador() {
        this.numeroContrato = 0;
        this.nome = "";
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public boolean getTemHabilidadeComPernaEsquerda() {
        return temHabilidadeComPernaEsquerda;
    }

    public void setTemHabilidadeComPernaEsquerda(boolean habilidade) {
        this.temHabilidadeComPernaEsquerda = habilidade;
    }

    public boolean getTemHabilidadeComPernaDireita() {
        return temHabilidadeComPernaDireita;
    }

    public void setTemHabilidadeComPernaDireita(boolean habilidade) {
        this.temHabilidadeComPernaDireita = habilidade;
    }
}