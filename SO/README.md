# Revisão CP01

## Sistema Operacional (SO)
O Sistema Operacional é uma camada de software que se coloca sobre o hardware para gerenciar todos os componentes do sistema, apresentando-o ao usuário com uma interface simples de entender e programar.

## BIOS (Basic Input/Output System)
- **Sequência de Boot:**  
  - Conjunto de etapas realizadas quando o computador é ligado.  
  - Inicia com o **POST** (teste de hardware) que verifica os componentes essenciais.  
  - Lê as configurações da **CMOS** para definir a ordem de boot (disco rígido, CD/DVD, USB, etc.).  
  - Carrega o **bootloader**, que inicia o carregamento do sistema operacional.
- **ROM BIOS:**  
  - Firmware gravado na placa-mãe em memória não volátil (originalmente ROM, hoje em dia flash).  
  - Responsável por inicializar e configurar os componentes do hardware, executar o POST e transferir o controle para o bootloader.

## UEFI (Unified Extensible Firmware Interface)
- Especificação que define uma interface de software entre o sistema operacional e o firmware da plataforma.
- Pretende substituir o BIOS.
- Na prática, a maioria das imagens UEFI oferece suporte legado para os serviços do BIOS.
- Pode oferecer recursos como diagnósticos remotos e reparação de computadores, mesmo sem a presença de um sistema operacional.

## Máquina Virtual e Gerente de Recursos
- **Máquina Virtual:**  
  - Visão de cima para baixo, onde o SO é visto como uma extensão do hardware que implementa uma interface para as aplicações.
- **Gerente de Recursos:**  
  - Visão de baixo para cima, na qual o SO atua como controlador dos recursos do sistema.

## Instruções Privilegiadas vs. Não-Privilegiadas
- **Instruções Privilegiadas:**  
  - São aquelas que podem comprometer a segurança e integridade do sistema (por exemplo, instruções de E/S e de ativação/desativação de interrupções).
- **Instruções Não-Privilegiadas:**  
  - Não oferecem risco à operação correta do sistema.

## Processos e Multiprogramação
- **Processo:**  
  - Um programa em execução. O processador é alternado entre vários processos.
  - Em um sistema multiprogramável, um processo pode estar em diferentes estados:
    - **Rodando (Running):** Utilizando o processador.
    - **Pronto (Ready):** Em condições de ser executado, aguardando a CPU.
    - **Bloqueado (Wait):** Paralisado até que ocorra um evento externo.
- **Troca de Contexto:**  
  - Quando um processo deixa de usar a CPU, o sistema operacional salva seu contexto (conteúdo dos registradores, contador de programa, apontador de pilha, flags, etc.) para, depois, carregar o contexto de outro processo.

## Estrutura de Dados do Processo
- **PCB (Process Control Block):**  
  - Estrutura de dados que mantém todas as informações sobre um processo:  
    - Contexto de hardware (registradores, IP, SP, flags).  
    - Contexto de software e espaço de endereçamento (onde o programa, os dados e a pilha estão armazenados).
- **Tabela de Processos:**  
  - O sistema operacional mantém uma tabela com uma entrada (PCB) para cada processo criado, identificados por um número único, o **PID (Process Identification)**.

## Quotas e Privilégios dos Processos
- **Quotas:**  
  - Limites para recursos do sistema que cada processo pode utilizar (ex.: número máximo de arquivos abertos, tamanho máximo de memória, número de operações de E/S pendentes).
- **Privilégios:**  
  - Definem as ações que um processo pode realizar:
    - **Sobre si próprio:** Alterar sua prioridade, memória alocada, etc.
    - **Sobre o SO:** Alterar regras de segurança, parâmetros de configuração, etc.

## Espaço de Endereçamento
- Cada processo possui seu próprio espaço de endereçamento, onde são armazenadas as instruções e dados.  
- Este espaço deve ser protegido contra acessos indevidos por outros processos.

## Imagens Ilustrativas
Abaixo, algumas imagens que podem ser incluídas para ilustrar os conceitos:

![Processos e PCB](https://github.com/user-attachments/assets/d269c3d1-a6df-4fb4-ac58-d8f5721fce27)
![Tabela de Processos](https://github.com/user-attachments/assets/0eb3ce5b-155c-49af-bc4a-229986b94b00)
![Contexto de Hardware](https://github.com/user-attachments/assets/b7554371-8aee-4466-9154-93d9e4e13f52)
![Espaço de Endereçamento](https://github.com/user-attachments/assets/234c8037-9191-4528-8e2a-dd57b21f4c6a)
![Diagrama de Troca de Contexto](https://github.com/user-attachments/assets/8d763efa-212a-4150-8856-5f452fe4a480)
![Fluxo de Processos](https://github.com/user-attachments/assets/5abb1153-1f64-4634-b8a3-faec70a3028d)
![Processos em Execução](https://github.com/user-attachments/assets/03f9f0de-9b12-49a5-b157-349d654daebc)
![Estrutura PCB](https://github.com/user-attachments/assets/f2f98dcf-4f22-411d-a799-42e4e7459238)
![Diagrama Geral](https://github.com/user-attachments/assets/48f79f69-d6f6-4cc0-9d9b-c6ae37516225)
![Tabela de Quotas](https://github.com/user-attachments/assets/3f66ee66-ec1d-4ebc-b061-13a870cdf1bb)
