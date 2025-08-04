nome = ['Maria', 'Ana', 'João', 'José', 'Pedro']
salario = [5400, 3200, 1000, 850, 7900]
tempo = [5, 6, 4, 7, 6]

sem_aumento = []
com_aumento = []
novo_salario = []

for i in range(len(nome)):
    if tempo[i] <= 5 and salario[i] >= 2000:
        sem_aumento.append(nome[i])
    else:
        com_aumento.append(nome[i])
        if tempo[i] > 5 and salario[i] < 2000:
            aumento = salario[i] * 1.35
        elif tempo[i] > 5:
            aumento = salario[i] * 1.27
        elif salario[i] < 2000:
            aumento = salario[i] * 1.15
        novo_salario.append(aumento)

print('=== FUNCIONÁRIOS SEM AUMENTO ===')
for funcionario in sem_aumento:
    print('-', funcionario)

print('=== FUNCIONÁRIOS COM AUMENTO ===')
for i in range(len(com_aumento)):
    print('-', com_aumento[i])
    print('   - Novo salário:', novo_salario[i])