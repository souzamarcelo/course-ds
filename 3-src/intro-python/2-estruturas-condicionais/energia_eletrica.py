consumo = float(input('Consumo (kWh): '))
tipo = input('Tipo de instalação (R, I, C): ')

if tipo == 'R':
    if consumo <= 500:
        preco = consumo * 0.4
    else:
        preco = consumo * 0.65
elif tipo == 'C':
    if consumo <= 1000:
        preco = consumo * 0.55
    else:
        preco = consumo * 0.6
elif tipo == 'I':
    if consumo <= 5000:
        preco = consumo * 0.57
    else:
        preco = consumo * 0.68
else:
    print('Tipo inválido!')
    exit()

print(f'Preço a pagar é de ${preco:.2f}.')