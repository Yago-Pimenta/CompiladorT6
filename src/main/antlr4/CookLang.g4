grammar CookLang;

@header {
  package br.ufscar.dc.compiladores.cooklang;
}

// ----------------------
// Regras de Parser
// ----------------------

receita
    : RECEITA title NL
      INGREDIENTES NL
      ingrediente+
      MODO_PREPARO NL
      passo+
      NL*    // aceita 0 ou mais linhas em branco extras
      EOF
    ;

title
    : WORD+                         // um ou mais WORDs formam o título
    ;

ingrediente
    : NUMBER UNIT WORD+ NL         // quantidade, unidade, descrição, fim de linha
    ;

passo
    : NUMBER DOT WORD+ TEMPO_KW TEMPO NL
    ;

// ----------------------
// Tokens Léxicos
// ----------------------

RECEITA        : 'Receita:' ;
INGREDIENTES   : 'Ingredientes:' ;
MODO_PREPARO   : 'Modo de Preparo:' ;
TEMPO_KW       : 'Tempo:' ;

NUMBER         : [0-9]+ ;
UNIT           : 'g'
               | 'kg'
               | 'ml'
               | 'l'
               | 'unid'
               | 'xic'
               | 'colher'
               | 'colheres'
               ;
TEMPO          : [0-9]+ ('min' | 'h') ;

DOT            : '.' ;
WORD           : [A-Za-zçéúáãõêíóô-]+ ;

WS             : [ \t]+    -> skip ;
NL             : '\r'? '\n' ;
