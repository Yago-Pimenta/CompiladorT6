#!/usr/bin/env bash
# Script para rodar os testes de Análise Semântica da linguagem CookLang

# Diretórios de teste e saída
tests_dir="tests/AnalisadorSemantico"
out_dir="semantic_out"
err_dir="semantic_err"
style_src="style.css"
jar_file="target/cooklang.jar"

# Criação das pastas de saída (caso não existam)
mkdir -p "$out_dir" "$err_dir"

# Copia o CSS uma única vez para a pasta de HTMLs válidos
cp -u "$style_src" "$out_dir/" 2>/dev/null

# Contadores
pass=0
fail=0

echo "📘 Iniciando testes de Análise Semântica..."

# Loop pelos arquivos .rec
for f in "$tests_dir"/*.rec; do
  base=$(basename "$f" .rec)
  echo -n "Testando $base ... "

  # Executa o compilador
  java -jar "$jar_file" "$f" > "$out_dir/$base.html" 2> "$err_dir/$base.log"

  # Verifica se houve erro semântico (log não vazio)
  if [ -s "$err_dir/$base.log" ]; then
    rm -f "$out_dir/$base.html"  # Remove HTML inválido
    echo "❌"
    ((fail++))
  else
    rm -f "$err_dir/$base.log"  # Limpa log vazio
    echo "✅"
    ((pass++))
  fi
done

# Sumário
echo
echo "📊 Resultado dos Testes:"
echo "✔️ Passaram: $pass"
echo "❌ Falharam: $fail"

