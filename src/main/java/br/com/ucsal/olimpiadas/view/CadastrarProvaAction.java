package br.com.ucsal.olimpiadas.view;

import br.com.ucsal.olimpiadas.service.ProvaService;

public class CadastrarProvaAction implements MenuAction {
    private final ProvaService service;

    public CadastrarProvaAction(ProvaService service) {
        this.service = service;
    }

    @Override
    public boolean execute() {
        service.cadastrarProva();
        return true;
    }

    @Override
    public String getDescription() {
        return "Cadastrar prova";
    }
}
