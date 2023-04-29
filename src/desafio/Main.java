package desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso C");
        curso2.setDescricao("descrição curso C");
        curso2.setCargaHoraria(4);

        //polimorfismo
        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Code Girls");
        bootcamp.setDescricao("Descrição Bootcamp Code Girls");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAline = new Dev();
        devAline.setNome("Aline");
        devAline.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Aline:" + devAline.getConteudosInscritos());
        devAline.progredir();
        devAline.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Aline:" + devAline.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Aline:" + devAline.getConteudoConcluidos());
        System.out.println("XP:" + devAline.calcularXp());

        System.out.println("-----------");

        Dev devSophia = new Dev();
        devSophia.setNome("Sophia");
        System.out.println("-");
        devSophia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sophia:" + devSophia.getConteudosInscritos());
        devSophia.progredir();
        devSophia.progredir();
        devSophia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Sophia:" + devSophia.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Sophia:" + devSophia.getConteudoConcluidos());
        System.out.println("XP:" + devSophia.calcularXp());

    }
}
