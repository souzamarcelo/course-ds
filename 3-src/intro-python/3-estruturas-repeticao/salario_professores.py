quantidade_a = 0
quantidade_b = 0
valor = 146

salarios_a = 0
salarios_b = 0

classe = input('Informe classe: ')

while classe == 'A' or classe == 'B':
    horas = int(input('Informe as horas/aula: '))

    salario_bruto = horas * valor
    if classe == 'A':
        salario_liquido = salario_bruto - (salario_bruto * 0.1)
        quantidade_a = quantidade_a + 1
        salarios_a = salarios_a + salario_liquido
    if classe == 'B':
        salario_liquido = salario_bruto - (salario_bruto * 0.05)
        quantidade_b = quantidade_b + 1
        salarios_b = salarios_b + salario_liquido
    
    print(f'Salário bruto: {salario_bruto:.2f}')
    print(f'Salário líquido: {salario_liquido:.2f}')

    classe = input('Informe classe: ')

print(f'Média de salários líquidos da classe A: {salarios_a / quantidade_a:.2f}')
print(f'Média de salários líquidos da classe B: {salarios_b / quantidade_b:.2f}')
