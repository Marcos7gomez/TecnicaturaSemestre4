
# Bool contiene los valores de True y False
# Los tipos numéricos, es false para el 0, true para los demás valores
valor = 0
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = -0.1
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

# Tipo String -> False '', True demás valores
valor = ''
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 'Hello'
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

# Tipo colecciones -> False para colecciones vacías
# Tipo colecciones -> True para todas las demás
# Lista
valor = []
resultado = bool(valor)
print(f'valor de lista vacía: {valor}, Resultado: {resultado}')

valor = [1, 2, 3]
resultado = bool(valor)
print(f'valor de lista con elementos: {valor}, Resultado: {resultado}')

# Tupla
valor = ()
resultado = bool(valor)
print(f'valor de tupla vacía: {valor}, Resultado: {resultado}')

valor = (5,)
resultado = bool(valor)
print(f'valor de tupla con elementos: {valor}, Resultado: {resultado}')

# Diccionario
valor = {}
resultado = bool(valor)
print(f'valor de diccionario vacío: {valor}, Resultado: {resultado}')

valor = {'Nombre': 'Juan', 'Apellido': 'Perez'}
resultado = bool(valor)
print(f'valor de diccionario con elementos: {valor}, Resultado: {resultado}')


# Sentencias de control con bool
if (1,):
    print('Regresa verdadero')
else:
    print('Regresa falso')

# Ciclos
variable = 17
while variable:
    print('Regresa verdadero')
    break
else:
    print('Regresa falso')

