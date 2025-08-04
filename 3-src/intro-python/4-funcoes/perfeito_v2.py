def perfeito(n):
    soma = 0
    divisores = ''
    for i in range(1, n):
        if n % i == 0:
            soma += i
            if divisores == '':
                divisores = f'{i}'
            else:
                divisores = f'{divisores} + {i}'
    
    if n == soma:
        print(f'{n} é um número perfeito, pois {divisores} = {n}!')

perfeito(6)