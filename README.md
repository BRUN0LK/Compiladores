
---

# 📘 Parser de Expressões Booleanas com ANTLR

## 📌 Descrição do Projeto

Este projeto consiste no desenvolvimento de uma **linguagem formal para reconhecimento e validação de expressões booleanas**, utilizando o **ANTLR** como ferramenta de **análise léxica e sintática**.

A linguagem proposta **não utiliza variáveis**, operando exclusivamente sobre **valores literais inteiros**, operadores relacionais e operadores lógicos.

O objetivo principal é aplicar, de forma prática, os conceitos fundamentais abordados na disciplina de **Compiladores**, incluindo:

* análise léxica;
* análise sintática;
* precedência de operadores;
* associatividade;
* uso de parênteses para controle da ordem de avaliação.

---

## 🎯 Objetivos

* Construir uma gramática formal em **ANTLR (`.g4`)**;
* Reconhecer e validar expressões booleanas formadas apenas por literais;
* Garantir a precedência correta entre operadores relacionais e lógicos;
* Permitir o uso de parênteses para controle explícito da ordem de avaliação;
* Rejeitar expressões sintaticamente inválidas.

---

## 🧩 Elementos Suportados pela Linguagem

### 🔢 Valores

* Números inteiros positivos

  * Ex.: `0`, `5`, `10`, `42`

### 🔗 Operadores Relacionais

* `>`
* `<`
* `>=`
* `<=`
* `==`
* `!=`

### 🧠 Operadores Lógicos

* `and`
* `or`
* `not` *(opcional, com maior precedência)*

### 🧮 Estruturas

* Parênteses `( )` para controle de precedência

---

## ✅ Exemplos de Expressões Válidas

```text
10 > 5 and 3 < 8
(7 >= 4) or (2 != 2)
(10 < 20) and (5 > 3 or 1 == 0)
not (3 > 5)
```

Essas expressões são aceitas pois:

* Utilizam corretamente operadores relacionais entre inteiros;
* Respeitam a precedência entre operadores lógicos;
* Possuem parênteses bem formados quando utilizados.

---

## ❌ Exemplos de Expressões Inválidas

```text
10 and 5
> 3 4
10 > and 5
(5 > 3
3 < < 4
```

Essas expressões são rejeitadas por:

* Ausência de operadores relacionais válidos;
* Ordem incorreta de tokens;
* Uso incorreto de operadores lógicos;
* Parênteses não balanceados.

---

## 🏗️ Organização da Gramática

A gramática foi estruturada de forma **hierárquica**, refletindo a precedência natural dos operadores lógicos e relacionais:

1. **Operadores relacionais** (maior precedência)
2. **Operador lógico `not`**
3. **Operador lógico `and`**
4. **Operador lógico `or`** (menor precedência)

Cada nível de precedência é representado por uma **regra sintática específica**, evitando ambiguidades e garantindo uma análise sintática **determinística**.

---

## 🧠 Justificativa da Precedência e Associatividade

* Operadores relacionais operam diretamente sobre **dois valores inteiros**, produzindo resultados booleanos;
* O operador `not` possui maior precedência entre os operadores lógicos, atuando sobre uma única expressão;
* O operador `and` possui precedência maior que `or`, conforme a lógica booleana clássica;
* A associatividade é tratada **à esquerda** para operadores binários (`and` e `or`);
* O uso de parênteses permite ao usuário sobrescrever a precedência padrão da linguagem.

Essa abordagem torna a gramática:

* ✅ Clara;
* ✅ Livre de ambiguidades;
* ✅ Fácil de manter e expandir futuramente.

---

## 🧪 Testes

A gramática foi testada utilizando o **ANTLR Lab**, ferramenta online oficial do ANTLR, permitindo:

* Inserção direta do arquivo `.g4`;
* Definição da regra inicial do parser;
* Testes com expressões válidas e inválidas;
* Visualização da árvore sintática para validação da precedência e estrutura das expressões.

---

## 📦 Entregáveis

* 📄 Arquivo `.g4` contendo a gramática da linguagem;
* 📋 Exemplos de entradas válidas e inválidas;
* 📝 Este arquivo **README.md**, documentando a organização e os critérios da linguagem.

---

## 🚀 Possíveis Extensões Futuras

* Implementação de um **Visitor** para avaliação das expressões (`true` / `false`);
* Inclusão de variáveis e tabela de símbolos;
* Integração com Java para construção de um interpretador completo;
* Expansão da linguagem com novos operadores lógicos.

---

📚 **Projeto desenvolvido com fins educacionais, voltado ao estudo de compiladores e linguagens formais.**
