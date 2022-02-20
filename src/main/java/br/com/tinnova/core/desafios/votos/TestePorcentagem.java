package br.com.tinnova.core.desafios.votos;

public class TestePorcentagem {
    public static void main(String[] args) {
        Votacao totalvotos = new Votacao();
        PorcentagemVotos porcent = new PorcentagemVotos();

        System.out.println(porcent.porcentagemValidos(totalvotos));
        System.out.println(porcent.porcentagemBrancos(totalvotos));
        System.out.println(porcent.porcentagemNulos(totalvotos));
    }
}
