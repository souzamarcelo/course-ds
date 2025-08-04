import sys

deposito_inicial = float(sys.argv[1])
taxa = float(sys.argv[2])

montante = deposito_inicial
for i in range(1, 13):
    deposito_mes = float(input('Depósito do mês ' + str(i) + ': '))
    montante = montante + deposito_mes
    montante = montante + (montante * taxa)
    print(f'Mês {i}: R$ {montante:.2f}')