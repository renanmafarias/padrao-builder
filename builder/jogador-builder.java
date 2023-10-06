package builder;

import java.util.Date;

public class JogadorBuilder {

    private Jogador jogador;

    public JogadorBuilder() {
        jogador = new Jogador();
    }

    public Jogador build() {
        if (jogador.getNumeroContrato() == 0) {
            throw new IllegalArgumentException("Número de contrato inválido.");
        }
        if (jogador.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        return jogador;
    }

    public JogadorBuilder setNumeroContrato(int numeroContrato) {
        aluno.setNumeroContrato(numeroContrato);
        return this;
    }

    public JogadorBuilder setNome(String nome) {
        aluno.setNome(nome);
        return this;
    }

    public JogadorBuilder setCpf(String cpf) {
        jogador.setCpf(cpf);
        return this;
    }

    public JogadorBuilder setRg(String rg) {
        jogador.setRg(rg);
        return this;
    }

    public JogadorBuilder setNacionalidade(String nacionalidade) {
        jogador.setNacionalidade(nacionalidade);
        return this;
    }

    public JogadorBuilder setPeso(float peso) {
        jogador.setPeso(peso);
        return this;
    }

    public JogadorBuilder setAltura(float altura) {
        jogador.setAltura(altura);
        return this;
    }

    public JogadorBuilder setDataNascimento(Date dataNascimento) {
        jogador.setDataNascimento(dataNascimento);
        return this;
    }

    public JogadorBuilder setNumeroCamisa(int numeroCamisa) {
        jogador.setNumeroCamisa(numeroCamisa);
        return this;
    }

    public JogadorBuilder setEndereco(String endereco) {
        jogador.setEndereco(endereco);
        return this;
    }

    public JogadorBuilder setEmail(String email) {
        jogador.setEmail(email);
        return this;
    }

    public JogadorBuilder setTelefone(String telefone) {
        jogador.setTelefone(telefone);
        return this;
    }

    public JogadorBuilder setPosicao(String posicao) {
        jogador.setPosicao(posicao);
        return this;
    }

    public JogadorBuilder setTemHabilidadeComPernaEsquerda(boolean habilidade) {
        jogador.setTemHabilidadeComPernaEsquerda(habilidade);
        return this;
    }

    public JogadorBuilder setTemHabilidadeComPernaDireita(boolean habilidade) {
        jogador.setTemHabilidadeComPernaDireita(habilidade);
        return this;
    }
}