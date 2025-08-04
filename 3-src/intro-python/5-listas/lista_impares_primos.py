impares = [0] * 20
atual = 1
for i in range(len(impares)):
    impares[i] = atual
    atual += 2
print(impares)

primos = [0] * 20
ultimo = 1
for i in range(len(primos)):
    primo = False
    while not primo:
        ultimo += 1
        primo = True
        for x in range(2, ultimo):
            if ultimo % x == 0:
                primo = False
                break
    primos[i] = ultimo
print(primos)