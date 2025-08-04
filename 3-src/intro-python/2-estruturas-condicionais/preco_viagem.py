km = float(input('Distância a percorrer: '))

if km <= 200:
    preco = km * 0.5
else:
    preco = km * 0.45

print(f'Preço da passagem: {preco:.1f}')