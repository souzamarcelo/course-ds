km = float(input('Km percorridos com o carro: '))
dias = int(input('Quantos dias ficou com o carro: '))
preco = (60 * dias) + (km * 0.15)

print(f'O preço total do aluguel é ${preco:.2f}.')