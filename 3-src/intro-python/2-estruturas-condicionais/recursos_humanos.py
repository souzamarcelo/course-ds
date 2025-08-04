print('=== Menu de opções ===')
print('  (1)    Imposto')
print('  (2)    Novo salário')
print('  (3)    Classificação')
print('======================')
op = int(input('Informe sua opção: '))

if op == 1:    
    salario = float(input('Informe o salário: '))
    if salario < 500: imposto = salario * 0.05
    elif salario <= 850: imposto = salario * 0.1
    else: imposto = salario * 0.15
    print(f'Imposto: ${imposto:.1f}')

elif op == 2:
    salario = float(input('Informe o salário: '))
    if salario > 1500: novo = salario + 25
    elif salario >= 750: novo = salario + 50
    elif salario >= 450: novo = salario + 75
    else: novo = salario + 100
    print(f'Novo salário: ${novo:.1f}')

elif op == 3:
    salario = float(input('Informe o salário: '))
    if salario <= 700: print('Mal remunerado')
    else: print('Bem remunerado')

else:
    print('Opção inválida!')