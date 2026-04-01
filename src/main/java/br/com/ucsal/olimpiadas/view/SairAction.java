package br.com.ucsal.olimpiadas.view;

public class SairAction implements MenuAction {
    @Override
    public boolean execute() {
        System.out.println("Tchau!");
        return false;
    }

    @Override
    public String getDescription() {
        return "Sair";
    }
}
