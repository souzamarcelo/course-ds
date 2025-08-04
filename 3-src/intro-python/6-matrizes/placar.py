def leitura():
    resultados = []
    resultados.append([])

    resultados[0].append(input('Nome do primeiro time: '))
    resultados[0].append(input('Nome do segundo time: '))
    n = int(input('Informe o número de jogos: '))

    for i in range(n):
        resultados.append([])
        resultados[i + 1].append(int(input(f'Informe o número de gols do {resultados[0][0]}: ')))
        resultados[i + 1].append(int(input(f'Informe o número de gols do {resultados[0][1]}: ')))

    return resultados


def relatorio(resultados):
    pontos = [0, 0]
    for i in range(1, len(resultados)):
        if resultados[i][0] > resultados[i][1]:
            pontos[0] += 3
        elif resultados[i][0] < resultados[i][1]:
            pontos[1] += 3
        else:
            pontos[0] += 1
            pontos[1] += 1
    
    print(f'{resultados[0][0]}: {pontos[0]} pontos')
    print(f'{resultados[0][1]}: {pontos[1]} pontos')
    if pontos[0] > pontos[1]:
        print(f'{resultados[0][0]} tem melhor desempenho')
    elif pontos[0] < pontos[1]:
        print(f'{resultados[0][1]} tem melhor desempenho')
    else:
        print('As equipes estão empatadas')

resultados = leitura()
relatorio(resultados)