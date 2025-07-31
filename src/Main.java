import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.printf("Conteúdos inscritos Gustavo: %s\n", devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("-");
        System.out.printf("Conteúdos inscritos Gustavo: %s\n", devGustavo.getConteudosInscritos());
        System.out.printf("Conteúdos concluídos Gustavo: %s\n", devGustavo.getConteudosConcluidos());
        System.out.printf("XP: %.1f\n", devGustavo.calcularTotalXp());

        System.out.println("----------------------------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.printf("Conteúdos inscritos João: %s\n", devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.printf("Conteúdos inscritos João: %s\n", devJoao.getConteudosInscritos());
        System.out.printf("Conteúdos concluídos João: %s\n", devJoao.getConteudosConcluidos());
        System.out.printf("XP: %.1f\n", devJoao.calcularTotalXp());



    }
}
