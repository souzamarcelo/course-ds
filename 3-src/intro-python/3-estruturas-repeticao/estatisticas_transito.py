maior_indice = float('-inf')
menor_indice = float('inf')
cidade_maior_indice = 0
cidade_menor_indice = 0
total_veiculos = 0
total_acidentes_2000 = 0
quantidade_2000 = 0

for i in range(5):
    codigo = int(input('Código da cidade ' + str(i + 1) + ': '))
    veiculos = int(input('Número de veículos: '))
    acidentes = int(input('Número de acidentes: '))

    if acidentes > maior_indice:
        maior_indice = acidentes
        cidade_maior_indice = codigo
    if acidentes < menor_indice:
        menor_indice = acidentes
        cidade_menor_indice = codigo

    total_veiculos = total_veiculos + veiculos

    if veiculos < 2000:
        total_acidentes_2000 = total_acidentes_2000 + acidentes
        quantidade_2000 = quantidade_2000 + 1

print('Cidade com maior índice de acidentes:', cidade_maior_indice, 'com total de', maior_indice, 'acidentes.')
print('Cidade com menor índice de acidentes:', cidade_menor_indice, 'com total de', menor_indice, 'acidentes.')
print('Média do número de veículos:', total_veiculos / 5)
print('Média de acidentes em cidades com menos de 2000 veículos:', total_acidentes_2000 / quantidade_2000)