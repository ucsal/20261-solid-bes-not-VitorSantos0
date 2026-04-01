# Aplicando Conceitos de SOLID

## Modificações Realizadas

### 1. Responsabilidade Única (SRP) e Aberto/Fechado (OCP)

- Desacoplamento de Lógica: Criação dos pacotes repository e view para separar a persistência de dados da lógica de exibição.

- Menu Dinâmico: Implementação do Command Pattern no pacote view. Cada item do menu agora possui sua própria classe, 
eliminando o switch da classe App.

- Extensibilidade: O sistema agora está aberto para extensão e fechado para modificação; 
adicionar uma nova opção ao menu agora exige apenas a criação de uma nova classe, sem alterar o loop principal de execução.

### 2. Inversão de Dependência (DIP)

- Abstrações sobre Implementações: Introdução da interface MenuAction. O Menu não depende mais de implementações concretas, 
e sim de uma interface comum.

- Redução de Acoplamento: Removidas instâncias diretas e inicializações dentro da classe App, 
delegando a execução de ações para camadas específicas.

### 3. Segregação de Interfaces (ISP) e Substituição de Liskov (LSP)

- Interfaces Específicas: Criação de interfaces de serviço como: ParticipanteService e ProvaService 
para que as classes Action conheçam apenas os métodos que realmente utilizam, evitando que uma ação de "Cadastro"
tenha acesso a métodos de "Execução de Prova".

- Contratos Previsíveis: Padronização dos Repositories. Qualquer implementação de repositório agora se comporta de forma 
previsível através das interfaces, garantindo que a troca de um repositório em memória por um banco de dados não quebre o sistema.

- Isolamento de Modelos: O uso de interfaces protege o núcleo da aplicação de mudanças colaterais em modelos 
ou serviços de terceiros.
