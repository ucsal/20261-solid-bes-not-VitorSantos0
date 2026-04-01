package br.com.ucsal.olimpiadas.view;

import br.com.ucsal.olimpiadas.service.ExecucaoService;

public class ListarTentativasAction implements MenuAction {
    private ExecucaoService service;

    public ListarTentativasAction(ExecucaoService service) {
        this.service = service;
    }

    @Override
    public boolean execute() {
        service.listarTentativas();
        return true;
    }

    @Override
    public String getDescription() {
        return "Listar tentativas (resumo)";
    }
}
