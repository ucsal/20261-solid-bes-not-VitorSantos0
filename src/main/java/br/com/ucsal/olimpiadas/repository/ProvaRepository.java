package br.com.ucsal.olimpiadas.repository;

import br.com.ucsal.olimpiadas.model.Prova;

import java.util.ArrayList;
import java.util.List;

public class ProvaRepository implements Repository<Prova> {
    private long proximaProvaId = 1;
    private List<Prova> provas = new ArrayList<>();

    @Override
    public Prova add(Prova prova) {
        prova.setId(++proximaProvaId);
        this.provas.add(prova);
        return prova;
    }

    @Override
    public List<Prova> list() {
        return this.provas;
    }
}
