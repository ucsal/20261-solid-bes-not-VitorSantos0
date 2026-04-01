package br.com.ucsal.olimpiadas.repository;

import br.com.ucsal.olimpiadas.model.Participante;

import java.util.ArrayList;
import java.util.List;

public class ParticipanteRepository implements Repository<Participante> {

    private long proximoParticipanteId = 1;
    private List<Participante> participantes = new ArrayList<>();

    @Override
    public Participante add(Participante participante) {
        participante.setId(++proximoParticipanteId);
        this.participantes.add(participante);
        return participante;
    }

    @Override
    public List<Participante> list() {
        return this.participantes;
    }
}
