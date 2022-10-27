import br.com.desafio.dio.dominio.Bootcamp;
import br.com.desafio.dio.dominio.Curso;
import br.com.desafio.dio.dominio.Dev;
import br.com.desafio.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso java = new Curso();
        java.setTitulo("curso java");
        java.setDescricao("descrição curso java");
        java.setCargaHoraria(8);

        Curso javascript = new Curso();
        javascript.setTitulo("curso js");
        javascript.setDescricao("descrição curso js");
        javascript.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(java);
        System.out.println(javascript);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(java);
        bootcamp.getConteudos().add(javascript);
        bootcamp.getConteudos().add(mentoria);

        Dev devGreaziel = new Dev();
        devGreaziel.setNome("Greaziel");
        devGreaziel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Greaziel:" + devGreaziel.getConteudosInscritos());
        devGreaziel.progredir();
        devGreaziel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Greaziel:" + devGreaziel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Greaziel:" + devGreaziel.getConteudosConcluidos());
        System.out.println("XP:" + devGreaziel.calcularTotalXp());

        System.out.println("-------");

        Dev devJefferson = new Dev();
        devJefferson.setNome("Jefferson");
        devJefferson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jefferson:" + devJefferson.getConteudosInscritos());
        devJefferson.progredir();
        devJefferson.progredir();
        devJefferson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jefferson:" + devJefferson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jefferson:" + devJefferson.getConteudosConcluidos());
        System.out.println("XP:" + devJefferson.calcularTotalXp());
    }
}