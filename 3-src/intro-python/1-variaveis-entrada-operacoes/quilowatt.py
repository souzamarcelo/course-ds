import sys

salario_minimo = float(sys.argv[1])
quilowatts = float(sys.argv[2])

valor_quilowatt = salario_minimo / 5
conta = valor_quilowatt * quilowatts
conta_desconto = conta - conta * 0.15

print(f'Valor do quilowatt: {valor_quilowatt:.2f}')
print(f'Valor da conta: {conta:.2f}')
print(f'Valor da conta com desconto: {conta_desconto:.2f}')