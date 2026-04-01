package br.com.ucsal.olimpiadas.view;

import java.util.*;

public class Menu {
    private Map<String, MenuAction> actions = new LinkedHashMap<>();
    private Scanner entrada;

    public Menu(Scanner entrada) {
        this.entrada = entrada;
    }

    public void addOption(String nome, MenuAction acao) {
        actions.put(nome, acao);
    }

    public boolean displayAndExecute() {
        System.out.println("\n=== OLIMPÍADA DE QUESTÕES (V1) ===");
        actions.forEach((key, action) ->
                System.out.println(key + ") " + action.getDescription()));

        System.out.print("> ");
        String choice = entrada.nextLine();

        if (actions.containsKey(choice)) {
            return actions.get(choice).execute();
        }
        System.out.println("Opção inválida!");
        return true;
    }
}
