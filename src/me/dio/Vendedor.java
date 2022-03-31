package me.dio;

public class Vendedor extends FuncionarioCLT{
    private Double valorDaBonificacao;

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                ", valorDaBonificacao=" + valorDaBonificacao +
                '}';
    }
}
