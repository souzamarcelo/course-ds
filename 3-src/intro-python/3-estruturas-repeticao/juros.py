import sys

deposito = float(sys.argv[1])
taxa = float(sys.argv[2])

montante = deposito
for i in range(1, 25):
    montante = montante + (montante * taxa)
    print(f'Mês {i}: R$ {montante:.2f}')