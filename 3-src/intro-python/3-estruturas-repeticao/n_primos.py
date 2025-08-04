import sys

n = int(sys.argv[1])

quantidade = 0
numero = 2
while quantidade != n:
    primo = True
    for i in range(2, numero):
        if numero % i == 0:
            primo = False
            break
    if primo:
        print(numero)
        quantidade = quantidade + 1
    numero = numero + 1