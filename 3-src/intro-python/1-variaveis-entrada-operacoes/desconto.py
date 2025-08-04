import sys

preco = float(sys.argv[1])
percentual = float(sys.argv[2])
valor_desconto = preco * percentual / 100
valor_pagar = preco - valor_desconto

print(f'O valor de desconto é ${valor_desconto:.2f}, e o preço a pagar é ${valor_pagar:.2f}.')