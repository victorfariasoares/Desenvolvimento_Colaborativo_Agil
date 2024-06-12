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
- [Projeto Final](#projeto-final)

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

Descrição breve do conteúdo da APS 3, abordando os objetivos e o que foi desenvolvido.

## APS 4

Descrição breve do conteúdo da APS 4, abordando os objetivos e o que foi desenvolvido.

## APS 5

Descrição breve do conteúdo da APS 5, abordando os objetivos e o que foi desenvolvido.

## APS 6

Descrição breve do conteúdo da APS 6, abordando os objetivos e o que foi desenvolvido.

## Projeto Final

Descrição breve do conteúdo do projeto final, abordando os objetivos, as tecnologias utilizadas, as funcionalidades desenvolvidas e os resultados alcançados.

---

Esse esqueleto dá uma visão clara e organizada das atividades práticas e do projeto final desenvolvidos no curso de Desenvolvimento Colaborativo Ágil. Se precisar de descrições específicas para cada APS ou para o projeto final, forneça os detalhes e eu as adicionarei conforme necessário.
