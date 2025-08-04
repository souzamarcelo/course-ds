import math

qtd_10 = 0
qtd_15 = 0
qtd_20 = 0
qtd_25 = 0
maiores = 0

def diametro(a, b, c):
    return math.sqrt(a ** 2 + b ** 2 + c ** 2)

def esfera():
    a = float(input('Informe a dimensão A: '))
    if a <= 0:
        mostra_resultado()
    
    b = float(input('Informe a dimensão B: '))
    c = float(input('Informe a dimensão C: '))
    
    D = diametro(a, b, c)
    
    if D <= 10:
        return '10'
    elif D <= 15:
        return '15'
    elif D <= 20:
        return '20'
    elif D <= 25:
        return '25'
    else:
        return None
    
    
def mostra_resultado():
    print()
    print('RESULTADO:')
    print(f'Esferas de tamanho 10: {qtd_10}')
    print(f'Esferas de tamanho 15: {qtd_15}')
    print(f'Esferas de tamanho 20: {qtd_20}')
    print(f'Esferas de tamanho 25: {qtd_25}')
    print(f'Total de esferas: {qtd_10 + qtd_15 + qtd_20 + qtd_25}')
    print(f'Caixas que não cabem em nenhuma esfera: {maiores}')
    exit()
    
    
while True:
    e = esfera()
    if e == '10':
        qtd_10 += 1
    elif e == '15':
        qtd_15 += 1
    elif e == '20':
        qtd_20 += 1
    elif e == '25':
        qtd_25 += 1
    else:
        maiores += 1
