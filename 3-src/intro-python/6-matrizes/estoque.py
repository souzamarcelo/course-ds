produtos = ['monitor', 'tablet', 'impressora', 'teclado', 'mouse']
minimo = [20, 25, 15, 80, 120]
estoques = [
    [30, 38, 20, 96, 145],
    [18, 59, 18, 81, 138],
    [55, 21, 40, 71, 220],
    [36, 25, 21, 98, 150],
    [12, 30, 21, 112, 127]
]

def leitura():
    global produtos, minimo, estoques
    produtos = []
    minimo = []
    estoques = []

    m = int(input('Informe o número de produtos: '))
    n = int(input('Informe o número de lojas: '))

    for j in range(n):
        estoques.append([])

    for i in range(m):
        produtos.append(input(f'Informe o nome do produto {i + 1}: '))
        minimo.append(int(input(f'Informe o estoque mínimo do produto {produtos[i]}: ')))
        for j in range(n):
            estoques[j].append(int(input(f'Informe o estoque do produto {produtos[i]} na loja {j + 1}: ')))


#leitura()

for i in range(len(estoques)):
    print(f'Loja {i + 1}:')
    ok = True
    for j in range(len(estoques[i])):
        if estoques[i][j] < minimo[j]:
            ok = False
            print(f'  - faltando {minimo[j] - estoques[i][j]} unidades do produto {produtos[j]}.')
    if ok:
        print('  - todos os produtos estão de acordo com o estoque mínimo!')