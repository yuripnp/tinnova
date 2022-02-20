package br.com.tinnova.core.desafios.votos;

public class Votacao {

    // levando em consideração que o eleitor é obrigado a votar e não podendo se abster.

    private Integer validos = 800;
    private Integer votosBrancos = 150;
    private Integer nulos = 50;
    private Integer totalDeEleitores = validos + votosBrancos + nulos;

    public Votacao() {
    }

    public Votacao(Integer validos, Integer votosBrancos, Integer nulos) {
        this.validos = validos;
        this.votosBrancos = votosBrancos;
        this.nulos = nulos;
    }

    public Integer getTotalDeEleitores() {
        return totalDeEleitores;
    }

    public void setTotalDeEleitores(Integer totalDeEleitores) {
        this.totalDeEleitores = totalDeEleitores;
    }

    public Integer getValidos() {
        return validos;
    }

    public void setValidos(Integer validos) {
        if (validos <= totalDeEleitores || totalDeEleitores == (validos + votosBrancos + nulos)) {
            this.validos = validos;
        } else {
            System.err.println("Valor invalido de votos ");
        }
    }

    public Integer getVotosBrancos() {
        return votosBrancos;
    }

    public void setVotosBrancos(Integer votosBrancos) {
        if (votosBrancos <= totalDeEleitores || totalDeEleitores == (validos + votosBrancos + nulos)) {
            this.votosBrancos = votosBrancos;
        } else {
            System.err.println("Valor invalido");
        }

    }

    public Integer getNulos() {
        return nulos;
    }

    public void setNulos(Integer nulos) {
        if (votosBrancos <= totalDeEleitores || totalDeEleitores == (validos + votosBrancos + nulos)) {
            this.nulos = nulos;
        } else {
            System.err.println("Valor invalido");
        }

    }
}
