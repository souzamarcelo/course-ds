lab = float(input('Nota do trabalho de laboratório: '))
prova = float(input('Nota da prova semestral: '))
exame = float(input('Nota do exame final: '))

media = (lab * 2 + prova * 3 + exame * 5) / 10

if media < 5:
    print('Conceito E')
elif media < 6:
    print('Conceito D')
elif media < 7:
    print('Conceito C')
elif media < 8:
    print('Conceito B')
else:
    print('Conceito A')

print(f'Média: {media:.1f}')