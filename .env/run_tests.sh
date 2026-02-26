#!/usr/bin/env bash
set -euo pipefail

# Run this script from the project root (~/Documentos/compiladores)
# Examples:
#   ./.env/run_tests.sh            # run using Entradas Validas file
#   ./.env/run_tests.sh "not 10 == 5 or 2 < 3"     # run with a single expression (quotes preserved)

ROOT_DIR="$(cd "$(dirname "$0")/.." && pwd)"
cd "$ROOT_DIR"

mkdir -p lib

# Download ANTLR tool and runtime (4.13.2) if missing
if [ ! -f "antlr-4.13.2-complete.jar" ]; then
  echo "Downloading antlr tool (antlr-4.13.2-complete.jar)..."
  curl -L -o antlr-4.13.2-complete.jar https://www.antlr.org/download/antlr-4.13.2-complete.jar
fi

if [ ! -f "lib/antlr4-runtime-4.13.2.jar" ]; then
  echo "Downloading ANTLR runtime (lib/antlr4-runtime-4.13.2.jar)..."
  curl -L -o lib/antlr4-runtime-4.13.2.jar https://repo1.maven.org/maven2/org/antlr/antlr4-runtime/4.13.2/antlr4-runtime-4.13.2.jar
fi

echo "Generating parser/lexer (visitor enabled)..."
java -jar antlr-4.13.2-complete.jar -visitor Expr.g4

echo "Compiling Java sources..."
javac -cp "lib/antlr4-runtime-4.13.2.jar:." *.java

echo "Running ParserTest..."
if [ "$#" -gt 0 ]; then
  # pass all args as a single expression (join with spaces)
  java -cp "lib/antlr4-runtime-4.13.2.jar:." ParserTest "$@"
else
  java -cp "lib/antlr4-runtime-4.13.2.jar:." ParserTest
fi

echo "Done."
