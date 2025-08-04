valores = []

for _ in range(10):
    valores.append(int(input('Informe um valor: ')))

x = int(input('Informe o valor a ser buscado: '))

for i in range(len(valores)):
    if valores[i] == x:
        print(f'Valor encontrado na posição {i}!')
        exit()
print(f'Valor {x} não encontrado na lista {valores}')