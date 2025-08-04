valor = float(input('Valor da casa: '))
salario = float(input('Salário: '))
anos = int(input('Período para pagar (anos): '))

prestacao = valor / (anos * 12)

if prestacao > salario * 0.3:
    print('Empréstimo negado')
else:
    print('Empréstimo aprovado')