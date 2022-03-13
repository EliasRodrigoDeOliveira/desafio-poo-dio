import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devElias = new Dev();
        devElias.setNome("Elias");
        devElias.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Elias:" + devElias.getConteudosInscritos());
        devElias.progredir();
        devElias.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos Elias:" + devElias.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos Elias:" + devElias.getConteudosConcluidos());
        System.out.println("XP:" + devElias.calcularTotalXp());

        System.out.println("-------");

        Dev devRaquel = new Dev();
        devRaquel.setNome("Raquel");
        devRaquel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Raquel:" + devRaquel.getConteudosInscritos());
        devRaquel.progredir();
        devRaquel.progredir();
        devRaquel.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos Raquel:" + devRaquel.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos Raquel:" + devRaquel.getConteudosConcluidos());
        System.out.println("XP:" + devRaquel.calcularTotalXp());


    }
}
