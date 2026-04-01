package br.com.ucsal.olimpiadas.repository;

import br.com.ucsal.olimpiadas.model.Questao;

import java.util.ArrayList;
import java.util.List;

public class QuestaoRepository implements Repository<Questao> {
    private long proximaQuestaoId = 1;
    private List<Questao> questoes = new ArrayList<>();

    @Override
    public Questao add(Questao questao) {
        questao.setId(++proximaQuestaoId);
        this.questoes.add(questao);
        return questao;
    }

    @Override
    public List<Questao> list() {
        return this.questoes;
    }
}
