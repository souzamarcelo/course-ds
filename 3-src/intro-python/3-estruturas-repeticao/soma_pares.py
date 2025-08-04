while True:
    m = int(input('Informe m: '))
    n = int(input('Informe n: '))

    if m >= n:
        break

    soma = 0
    for i in range(m, n + 1):
        soma = soma + i
    print(soma)