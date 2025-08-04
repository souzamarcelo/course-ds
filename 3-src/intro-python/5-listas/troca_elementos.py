lista = []
for i in range(16):
    lista[i] = int(input(f'Informe o elemento da posição {i}: '))

lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
for i in range(8):
    aux = lista[i]
    lista[i] = lista[8 + i]
    lista[8 + i] = aux

print(lista)