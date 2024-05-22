# Desafio Dio Trilha Java

## Desafio de POO

Modelagem e Diagramação de um Componente iPhone

> Desafio disponível no GitHub [Desafio iPhone](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo)

## Funcionalidades a Modelar

1. Reprodutor Musical
> Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`

2. Aparelho Telefônico
> Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`

3. Navegador na Internet
> Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

## Objetivo

1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

## Solução desenvolvida

### Modelagem

Como solução proposta, após assistir o vídeo e abstrair os problemas, fiz a modelagem utilizando o draw.io

![Modelagem feita no draw.io](doc/images/desafio-modelagem-uml-iphone.drawio.png.png)

> As funcionalidades - ReprodutorMusical, AparelhoTelefonico e NavegadorInternet desenvolvi como interfaces com os métodos a serem implementados, no caso pela classe Iphone.

### Codificação em Java

O projeto foi feito inicialmente e testado na IDE Eclise com o Java 17, posteriorme, fiz novo projeto utilizando o VSCode para fazer a publicação no repositório.

## Passos da Codificação

1. Criação das três interfaces
2. Declaração das assinaturas dos métodos a serem implementados
3. Criação da classe IPhone
4 Criação dos atributos
5. Criação do Construtor
6. Criação dos Getters e Setters
7. Implementar - implements - as interfaces
8. Implementação de cada método das interfaces

> Os itens 4, 5 e 6 não eram tarefas obrigatórias no desafio.

## Testes simples

1. Criação de um objeto `Iphone iphone` no programa principal, `main`.
2. Utilização do `System.out.println()` para exibir mensagens.
3. Evocação de cada um dos `métodos` que foram implementados na classe `Iphone`.

Salve Devs,

Até a próxima!
