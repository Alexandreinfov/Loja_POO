package me.dio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*Endereco endereco = new Endereco();
        endereco.setRua("Endereço qualquer");
        System.out.println(endereco.getRua());*/

        Endereco endereco = new Endereco("endereco qualquer","complemento ","bairro");
        //JOptionPane.showMessageDialog(null,"" + endereco.getRua() + "\n" + endereco.getBairro() + "\n" + endereco.getComplemento());
      //  JOptionPane.showMessageDialog(null,endereco);

        //Vendedor vendedor = new Vendedor("Alexandre","11.111.111.11",1646d, endereco);
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Alexandre");
        vendedor.setDocumento("11.11.54645.5");
        vendedor.setValorSalario(165465d);
        vendedor.setEndereco(endereco);

        System.out.println(vendedor);

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("teste","16196.64.41",555d,endereco);

        System.out.println(operadorDeCaixa);
    }
}
