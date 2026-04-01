package br.com.ucsal.olimpiadas.view;

import br.com.ucsal.olimpiadas.service.ProvaService;

public class CadastrarQuestaoAction implements MenuAction {
    private final ProvaService service;

    public CadastrarQuestaoAction(ProvaService service) {
        this.service = service;
    }

    @Override
    public boolean execute() {
        service.cadastrarQuestao();
        return true;
    }

    @Override
    public String getDescription() {
        return "Cadastrar questão (A–E) em uma prova";
    }
}
