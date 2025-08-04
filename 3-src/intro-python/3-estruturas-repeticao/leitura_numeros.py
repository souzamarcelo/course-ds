numero = int(input('Informe número: '))
soma = 0
quantidade = 0

while numero != 0:
    quantidade = quantidade + 1
    soma = soma + numero
    numero = int(input('Informe número: '))

print(f'Quantidade: {quantidade}')
print(f'Soma: {soma}')
print(f'Média: {soma / quantidade:.1f}')