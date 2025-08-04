def soma(m, n):
    s = 0
    for i in range(m, n + 1):
        s += i
    return s


def leitura():
    m = int(input('Informe m: '))
    n = int(input('Informe n: '))
    
    if m >= n:
        print('Execução finalizada.')
        exit()
    
    return soma(m, n)


while True:
    print(leitura())