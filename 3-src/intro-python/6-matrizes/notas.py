def leitura():
    n = int(input('Informe o número de notas: '))
    notas = []
    for i in range(n + 1):
        notas.append([])
    
    nome = input('Informe o nome do aluno: ')
    while nome != '':
        notas[0].append(nome)
        for i in range(1, n + 1):
            notas[i].append(float(input(f'Informe a {i}a nota: ')))
        nome = input('Informe o nome do aluno: ')
        
    return notas


def relatorio(notas):
    print('\n--- MÉDIAS ---')
    qtd = len(notas) - 1
    melhor = float('-inf')
    melhor_nome = ''
    pior = float('inf')
    pior_nome = ''
    for i in range(len(notas[0])):
        print(notas[0][i], end = ': ')
        media = 0
        for j in range(1, qtd + 1):
            media += notas[j][i]
        media = media / qtd
        print(f'{media}')
        if media > melhor:
            melhor = media
            melhor_nome = notas[0][i]
        if media < pior:
            pior = media
            pior_nome = notas[0][i]
    print()
    print(f'Melhor aluno: {melhor_nome} ({melhor})')
    print(f'Pior aluno: {pior_nome} ({pior})')


notas = leitura()
relatorio(notas)