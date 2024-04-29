package iphone.products;

import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.ReprodutorMusical;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private Calendar dataLancamento;

    public IPhone(String modelo, Calendar dataLancamento) {
        this.modelo = modelo;
        this.dataLancamento = dataLancamento;
    }

    public void getNomeModelo() {
        System.out.println("Nome do modelo: " + modelo);
    }

    public void getDataLancamento() {
        Locale brasil = new Locale("pt", "BR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MONTH_FIELD, brasil);
        System.out.printf("Lançado em: %s\n", dateFormat.format(dataLancamento.getTime()));
    }

    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("A música: \"%s\", foi selecionada.\n", musica);
    }

    @Override
    public void ligar() {
        System.out.println("Chamando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página exibida.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
