package br.com.ucsal.olimpiadas.view;

import br.com.ucsal.olimpiadas.service.ExecucaoService;

public class AplicarProvaAction implements MenuAction {
    private final ExecucaoService service;

    public AplicarProvaAction(ExecucaoService service) {
        this.service = service;
    }

    @Override
    public boolean execute() {
        service.aplicarProva();
        return true;
    }

    @Override
    public String getDescription() {
        return "Aplicar prova (selecionar participante + prova";
    }
}
