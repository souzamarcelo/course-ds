lista1 = ['A', 'B', 'C', 'D', 'B']
lista2 = ['B', 'A', 'D', 'C', 'B']

for elemento1 in lista1:
    achou = False
    for elemento2 in lista2:
        if elemento1 == elemento2:
            achou = True
            lista2.remove(elemento2)
            break
    if achou == False:
        print('Conteúdos diferentes!')
        exit()

print('Conteúdos iguais!')

'''IMPLEMENTAÇÃO ALTERNATIVA
lista1 = ['A', 'B', 'C', 'D', 'B']
lista2 = ['B', 'A', 'D', 'C', 'D']

for elemento in lista1:
    if elemento in lista2:
        lista2.remove(elemento)
    else:
        print('Conteúdos diferentes!')
        exit()

print('Conteúdos iguais!')
'''