package main.com.estudos.domain;

import java.time.LocalDate;

public class Item {

    private Long id;
    private String nomeDoItem;
    private String descricao;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private boolean constaEmEstoque;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDoItem() {
        return nomeDoItem;
    }

    public void setNomeDoItem(String nomeDoItem) {
        this.nomeDoItem = nomeDoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getConstaEmEstoque() {
        return constaEmEstoque == true  ? "S" : "N" ;
    }

    public void setConstaEmEstoque(boolean constaEmEstoque) {
        this.constaEmEstoque = constaEmEstoque;
    }
}
