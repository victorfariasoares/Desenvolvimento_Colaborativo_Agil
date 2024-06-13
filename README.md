# Repositorio do Curso de Desenvolvimento Colaborativo Ágil

**Descrição das Atividades Práticas (APSs) e Projeto Final**

Este repositório contém todas as atividades práticas (APSs) e o projeto desenvolvido durante o curso de Desenvolvimento Colaborativo Ágil. Abaixo está uma descrição de cada atividade e do projeto final.

## Conteúdo

- [APS 1](#aps-1)
- [APS 2](#aps-2)
- [APS 3](#aps-3)
- [APS 4](#aps-4)
- [APS 5](#aps-5)
- [APS 6](#aps-6)

## APS 1

Nesta atividade, foram desenvolvidos quatro métodos em Java para treinar conceitos iniciais de programação na linguagem. Cada método abordou um aspecto específico da linguagem, com o objetivo de reforçar a compreensão e a aplicação prática dos conceitos estudados em aula.

### Método 1

O método `verifica` recebia um inteiro positivo e devolvia um booleano que indicava se o número era uma potência de dois. Por exemplo, se recebia 4, devolvia `true`, pois 4 = 2²; se recebia 6, devolvia `false`, pois não existia um inteiro k tal que 2ᵏ = 6. Este método ajudou a entender como manipular e verificar propriedades matemáticas de números utilizando lógica básica de programação.

### Método 2

O método `aproxima` recebia um inteiro positivo `n` e devolvia uma aproximação do valor de π utilizando a fórmula de Leibniz:

$$ \pi = 4 \left(1 - \frac{1}{3} + \frac{1}{5} - \frac{1}{7} + \frac{1}{9} - \frac{1}{11} + \ldots \right) $$

O cálculo considerava apenas as `n` primeiras partes da série. Por exemplo, se recebia 1, devolvia:

$$ 4 \cdot \left( 1 - \frac{1}{3} \right) $$

se recebia 2, devolvia:

$$ 4 \cdot \left( 1 - \frac{1}{3} + \frac{1}{5} \right) $$

Este método foi um excelente exercício para trabalhar com séries infinitas e entender aproximações numéricas.


### Método 3

O método `limpa` recebia uma string alfanumérica e devolvia uma versão limpa dessa string. Mais especificamente, dígitos eram apagados, letras maiúsculas eram convertidas para minúsculas e letras minúsculas eram copiadas. Por exemplo, se recebia "A1b2C3", devolvia "abc". Este método focou na manipulação de strings e no uso de condições para modificar e filtrar caracteres.

### Método 4

O método `constroi` recebia um inteiro positivo `n` e devolvia uma string que representava um “xis” de tamanho `n`. Por exemplo, se recebia 3, devolvia a string:
```
X   X
 X X
  X
 X X
X   X
```
Cada linha terminava com uma quebra de linha. Este método ajudou a entender como construir padrões e formas geométricas utilizando loops e condições.

Cada um desses métodos foi projetado para reforçar diferentes aspectos da programação orientada a objetos e da lógica de programação, utilizando os recursos ensinados durante o curso.

## APS 2

O objetivo desta Atividade Prática Supervisionada foi praticar estruturas de dados e orientação a objetos em Java. Para isso, foram criadas quatro classes que interagem entre si.

### Classe 1

A classe `Diretor` possui um identificador inteiro que pode ser lido, mas não pode ser modificado por código de outras classes, e deve ser recebido na construção. Além disso, possui um nome que pode ser lido e escrito por código de outras classes, e também deve ser recebido na construção. Os nomes dos atributos e métodos foram definidos pelos testes fornecidos.

### Classe 2

A classe `Episodio` possui um diretor que pode ser lido, mas não pode ser modificado por código de outras classes, e deve ser recebido na construção. Possui um título que pode ser lido, mas não pode ser modificado por código de outras classes, e deve ser recebido na construção. Também possui uma duração inteira, em segundos, que não pode ser lida nem escrita por código de outras classes, e deve ser recebida na construção. A classe possui um método que devolve a duração do episódio em minutos, desconsiderando as casas decimais se a quantidade de minutos não for exata.

### Classe 3

A classe `Temporada` possui um dicionário cujas chaves são números de episódios (inteiros) e cujos valores são episódios. Este dicionário pode ser lido por código de outras classes, mas não pode ser modificado diretamente e deve ser inicializado como vazio. A classe possui um método que recebe um número e um episódio, adicionando ao dicionário um novo item cuja chave é o número recebido e cujo valor é o episódio recebido. Outro método da classe devolve uma string que representa a duração total da temporada no formato "h:mm". Por exemplo:
- Se os episódios juntos têm um total de 5 minutos, devolve "0:05";
- Se os episódios juntos têm um total de 30 minutos, devolve "0:30";
- Se os episódios juntos têm um total de 65 minutos, devolve "1:05";
- Se os episódios juntos têm um total de 155 minutos, devolve "2:35".

### Classe 4

A classe `Serie` possui uma lista de temporadas que não pode ser lida nem escrita diretamente por código de outras classes e deve ser recebida na construção. A classe possui um método que devolve uma lista de strings que representa as durações de suas temporadas.

Estas quatro classes foram desenvolvidas para reforçar o entendimento e a aplicação de conceitos de orientação a objetos e manipulação de estruturas de dados em Java, conforme os objetivos da APS.


## APS 3

O objetivo desta Atividade Prática Supervisionada foi praticar modelagem e herança em Java. A atividade foi dividida em três tarefas: desenhar um diagrama de classes a partir de um código, implementar um mini-sistema e implementar testes para esse mini-sistema.

### Tarefa 1

Nesta tarefa, foi necessário desenhar o diagrama de classes do projeto banco. O diagrama deveria representar:

- Classes
- Atributos
- Métodos
- Associações
- Agregações
- Extensões

Os métodos privados, getters, setters e construtores foram omitidos. Métodos foram escritos apenas na superclasse mais alta que os define e não foram escritos em subclasses, mesmo que as sobrescrevessem.

### Tarefa 2

Nesta tarefa, foi necessário implementar uma parte da arquitetura básica da plataforma fictícia `fifthfloor`, projetada para conectar interessados em imóveis com proprietários. A implementação envolveu a criação e implementação de 5 diferentes classes.

### Tarefa 3

A tarefa 3 consistia em verificar o funcionamento das classes desenvolvidas acima através da criação de testes específicos das classes e dos métodos.


## APS 4

O objetivo desta Atividade Prática Supervisionada foi praticar refatoração de arquitetura identificando pelo menos uma oportunidade de abstração e uma de coesão, conhecer boas práticas de controle de versão e passar pela experiência de modificar um código escrito há muito tempo atrás.

## APS 5

O objetivo desta Atividade Prática Supervisionada foi praticar tudo o que foi visto até a Aula 10 (exceções), exceto a Aula 9 (interfaces). Para isso, foram realizadas quatro tarefas: desenhar um diagrama de classes a partir de um código, implementar um mini-sistema, implementar testes para esse mini-sistema e refatorar um código existente.

### Tarefa 1

Nesta tarefa, foi necessário desenhar o diagrama de classes do projeto `imovel`. O diagrama deveria representar:

- Classes
- Atributos
- Métodos
- Associações
- Agregações
- Extensões

Os métodos privados, getters, setters e construtores foram omitidos. Métodos foram escritos apenas na superclasse mais alta que os define e não foram escritos em subclasses, mesmo que as sobrescrevessem.

### Tarefa 2

Nesta tarefa, foi necessário implementar uma parte da arquitetura básica da plataforma `copa`, projetada para simular campeonatos de futebol. A implementação envolveu a criação e implementação de 5 diferentes classes.

### Tarefa 3

A tarefa 3 consistia em verificar o funcionamento das classes desenvolvidas acima através da criação de testes específicos das classes e dos métodos.

### Tarefa 4
Nesta tarefa, foi necessário abrir o projeto hercules e fazer um pull request para o repositório, identificando e aproveitando uma oportunidade de abstração ou uma oportunidade de melhorar a coesão no projeto.


## APS 6

O objetivo desta Atividade Prática Supervisionada foi praticar Web API e DAO. Para isso, foram realizadas quatro partes: entender o código existente, preparar a infraestrutura, popular o banco de dados e criar a API.

### Parte 1: Entender Código Existente

A primeira parte da atividade consistiu em entender o código existente fornecido como base para o projeto. Esse código incluía a estrutura inicial do servidor, a configuração do banco de dados e alguns exemplos de operações básicas de CRUD (Create, Read, Update, Delete).

### Parte 2: Preparar a Infraestrutura

Na segunda parte, foi necessário preparar a infraestrutura do projeto. Isso envolveu configurar o servidor web e o banco de dados. A configuração do servidor incluiu a definição das rotas e endpoints que seriam expostos pela API.

### Parte 3: Popular o Banco

A terceira parte da atividade consistiu em popular o banco de dados com dados de teste. Isso foi feito para garantir que a API tivesse dados para manipular e retornar nas requisições. Scripts foram criados para inserir dados iniciais nas tabelas, permitindo simular um ambiente realista para testes e desenvolvimento.

### Parte 4: Criar a API

Na última parte, foi criada a API REST. Esta etapa envolveu a implementação dos endpoints para realizar as operações de CRUD no banco de dados. Cada endpoint foi projetado para manipular um recurso específico e realizar as operações necessárias, como criar, ler, atualizar e deletar.
