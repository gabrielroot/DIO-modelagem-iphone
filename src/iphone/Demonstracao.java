package iphone;

import iphone.products.IPhone;

import java.util.Calendar;

public class Demonstracao {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2007);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 29);

        IPhone iPhone = new IPhone("iPhone", calendar);

        System.out.println("- Características");
        iPhone.getNomeModelo();
        iPhone.getDataLancamento();

        System.out.println();

        System.out.println("- Características de reprodutor musical:");
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Fly Me to the Moon");

        System.out.println();

        System.out.println("- Características de um aparelho telefônico:");
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println();

        System.out.println("- Funcionalidade de um computador:");
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
