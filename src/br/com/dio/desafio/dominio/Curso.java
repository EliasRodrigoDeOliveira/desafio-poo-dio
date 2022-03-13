package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargahoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargahoraria;
    }

    public Curso() {
    }
    public int getCargahoraria(int i) {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }


}
