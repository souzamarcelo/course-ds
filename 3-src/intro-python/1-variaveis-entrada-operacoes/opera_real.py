import sys

numero = float(sys.argv[1])

parte_inteira = int(numero)
parte_fracionaria = numero - parte_inteira

print(f'Parte inteira: {parte_inteira}')
print(f'Parte fracionária: {parte_fracionaria:f}')
print(f'Arredondamento para uma casa decimal: {numero:.1f}')
print(f'Arredondamento para um inteiro: {numero:.0f}')