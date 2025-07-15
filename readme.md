# CookLang Compiler (T6 - Compiladores)
### Autor : Yago David Pimenta      RA : 800273

Este repositório contém a implementação de um **compilador completo para uma linguagem de receitas chamada CookLang**, desenvolvida como parte do Trabalho 6 (T6) da disciplina de Compiladores (UFSCar).

## 📋 Sobre a Linguagem CookLang

CookLang é uma linguagem declarativa criada para descrever receitas de forma estruturada. Seu foco é permitir que ingredientes, quantidades e instruções sejam descritos com regras claras, facilitando tanto a leitura humana quanto o processamento automático , e no final , caso não tenha nenhum erro gerar um .html estilizado para facilitar a visualização.

Exemplo de um template `.rec` válido:

```
Receita: X
Ingredientes:
1 unid Y
Modo de Preparo:
1. Z Tempo:1min
```
Ou seja , no meu compilador , vamos dividir em 3 seções : 

1 - Receita: "Nome da receita"
2 - Ingredientes: 
3 - Modo de preparo

No modo de preparo vai pedir um token de tempo 

Importante ressaltar para não dar nenhum erro léxico ou sintático olhar melhor o arquivo Cooklang.g4
---
### Primeiramente - baixe ou clone o repositório com todas as suas dependências em seu computador , é necessário um terminal linux e java 

## 🧠 Etapas do Compilador

O compilador é composto por quatro etapas principais:

### 1. Análise Léxica e Sintática ✅
- A gramática da linguagem foi definida em ANTLR4.
- São reconhecidas unidades como  :
UNIT           : 'g'
               | 'kg'
               | 'ml'
               | 'l'
               | 'unid'
               | 'xic'
               | 'colher'
               | 'colheres'

- São detectados e reportados erros como:
  - Caractere inválido
  - Ingrediente mal formatado
  - Passos sem número ou sem tempo

Foi selecionado vários testes específicos dessa parte 


###  **Execução dos testes de análise léxica sintática:**
Primeiro entre no repositório específico
```bash

cd casos-de-testes/AnaliseLexicaSintatica 
```
Agora executa o teste 
```bash
./run_tests.sh
```

-Saídas válidas serão armazenadas na pasta out , ou seja só vai gerar o html das válidas-  
-Erros léxicos e sintáticos vão para err , o meu próprio compilador vai identificar se é um erro léxico ou sintático

---

### 2. Análise Semântica ✅
São realizadas **verificações adicionais** que vão além da gramática, como:

- Verificação se a quantidade de ingredientes é maior que zero
- Verificação se o passo está na ordem correta
- Verificação se a duração (tempo) do passo é positiva
- Verificação se os ingredientes possuem descrição textual

###  **Execução dos testes de análise semantica:**
Primeiro entre no repositório específico
```bash

cd casos-de-testes/AnaliseSemantica 
```
Agora executa o teste 
```bash
./run_semantic_tests.sh
```

-Casos válidos geram HTML em semantics_out  
-Casos com erro semântico vão para semantics_err

---

### 3. Geração de Código (HTML) 🧾
Ao final , caso não apresente erro de compilação , o compilador gera uma **página HTML estilizada**, com:
- Título da receita
- Lista de ingredientes
- Modo de preparo enumerado
- Estilização com `style.css`

**Exemplo de execução manual com geração de HTML:**
Volte para a raíz do meu diretório
```bash
mvn clean generate-sources package
```
```bash
java -jar target/cooklang.jar template.rec > template.html
```

---



##  Vídeo Demonstrativo 

---

## 📚 Créditos

Trabalho desenvolvido por:  
**Yago David Pimenta**  
Curso de bacharelado em ciências da computação - UFSCar  
Disciplina de Construção de Compiladores

---

## 📜 Licença

Sem lisença 