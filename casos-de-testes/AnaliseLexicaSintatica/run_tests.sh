#!/usr/bin/env bash
# Script para executar apenas testes ALS bem-sucedidos e garantir uso de style.css

# Configurações
tests_dir="tests/AnaliseLexicaSintatica"
out_dir="out"
err_dir="err"
style_src="style.css"

# Cria diretórios
mkdir -p "$out_dir" "$err_dir"

# Copia style.css para saída (para que cada HTML tenha acesso ao CSS)
cp "$style_src" "$out_dir/"

pass=0
fail=0

echo "Iniciando testes de Análise Léxica e Sintática..."
for f in "$tests_dir"/*.rec; do
  base=$(basename "$f" .rec)
  echo -n "Testando $base ... "

  # Executa o compilador, gera HTML temporário e log de erros
  temp_html="${out_dir}/${base}.html"
  log_file="${err_dir}/${base}.log"
  java -jar target/cooklang.jar "$f" > "$temp_html" 2> "$log_file"

  if [ -s "$log_file" ]; then
    # falhou: remove HTML gerado e contabiliza erro
    rm -f "$temp_html"
    echo "❌"
    ((fail++))
  else
    # passou: mantém HTML, remove log vazio e contabiliza
    rm -f "$log_file"
    echo "✅"
    ((pass++))
  fi
done

# Sumário final
echo
echo "✔️ Passaram: $pass"
echo "❌ Falharam: $fail"

