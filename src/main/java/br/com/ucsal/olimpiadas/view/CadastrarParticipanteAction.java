package br.com.ucsal.olimpiadas.view;

import br.com.ucsal.olimpiadas.service.ParticipanteService;

public class CadastrarParticipanteAction implements MenuAction {
    private final ParticipanteService service;

    public CadastrarParticipanteAction(ParticipanteService service) {
        this.service = service;
    }

    @Override
    public boolean execute() {
        service.cadastrarParticipante();
        return true;
    }

    @Override
    public String getDescription() {
        return "Cadastrar participante";
    }
}
