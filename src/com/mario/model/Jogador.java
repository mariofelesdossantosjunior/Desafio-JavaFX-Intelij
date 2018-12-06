package com.mario.model;

import javafx.collections.ObservableList;

public class Jogador {

    private String nome;
    private ObservableList<Personagem> personagems;

    public Jogador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ObservableList<Personagem> getPersonagems() {
        return personagems;
    }

    public void setPersonagems(ObservableList<Personagem> personagems) {
        this.personagems = personagems;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", personagems=" + personagems + '}';
    }




}