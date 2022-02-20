package br.com.tinnova.core.desafios.votos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PorcentagemVotos {

    public String porcentagemValidos (Votacao votacao) {
        BigDecimal porcento = new BigDecimal(votacao.getValidos()).divide(new BigDecimal(votacao.getTotalDeEleitores()), 2, BigDecimal.ROUND_HALF_UP)
                .multiply(BigDecimal.valueOf(100));
         String resposta = String.format("A porcentagem de votos válidos é %.2f%%", porcento);
         return resposta;

    }

    public String porcentagemBrancos (Votacao votacao) {
        BigDecimal porcento = new BigDecimal(votacao.getVotosBrancos()).divide(new BigDecimal(votacao.getTotalDeEleitores()), 2, BigDecimal.ROUND_HALF_UP)
                .multiply(BigDecimal.valueOf(100));
        String resposta = String.format("A porcentagem de votos válidos é %.2f%%", porcento);
        return resposta;
    }

    public String porcentagemNulos (Votacao votacao) {
        BigDecimal porcento = new BigDecimal(votacao.getNulos()).divide(new BigDecimal(votacao.getTotalDeEleitores()), 2, BigDecimal.ROUND_HALF_UP)
                .multiply(BigDecimal.valueOf(100));
        String resposta = String.format("A porcentagem de votos válidos é %.2f%%", porcento);
        return resposta;
    }


}
