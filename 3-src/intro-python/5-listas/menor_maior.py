lista = [12, 25, 3, 23, 9, 65, 12, 43, -98, 54, -6, 0, -3, 21, 54]

menor = float('inf')
maior = float('-inf')
for elemento in lista:
    if elemento < menor:
        menor = elemento
    if elemento > maior:
        maior = elemento

print('Menor: ' + str(menor))
print('Maior: ' + str(maior))