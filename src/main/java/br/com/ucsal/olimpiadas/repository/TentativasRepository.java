package br.com.ucsal.olimpiadas.repository;

import br.com.ucsal.olimpiadas.model.Tentativa;

import java.util.ArrayList;
import java.util.List;

public class TentativasRepository implements Repository<Tentativa> {
    private long proximaTentativaId = 1;
    private List<Tentativa> tentativas = new ArrayList<>();

    @Override
    public Tentativa add(Tentativa entity) {
        entity.setId(proximaTentativaId++);
        tentativas.add(entity);
        return entity;
    }

    @Override
    public List<Tentativa> list() {
        return this.tentativas;
    }
}
