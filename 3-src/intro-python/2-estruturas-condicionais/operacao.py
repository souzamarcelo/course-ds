n1 = float(input('Primeiro número: '))
n2 = float(input('Segundo número: '))
op = input('Operação (+, -, *, /): ')

if op == '+':
    print(n1 + n2)
elif op == '-':
    print(n1 - n2)
elif op == '*':
    print(n1 * n2)
elif op == '/':
    if n2 != 0:
        print(n1 / n2)
    else:
        print('Valor inválido!')
else:
    print('Operação inválida!')