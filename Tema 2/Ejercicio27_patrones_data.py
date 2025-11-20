import re

data = """
Usuario: perez.juan
Email de contacto: juan.perez@dominio.com
Fecha de acceso: 15-09-2023
Código de cliente: ABC123456
Teléfono de emergencia: 601 234 567
Archivos encontrados: a_1.txt, b_22.py, c_333.pdf, d_4444.jpg
"""

# Buscar correo
patron_email = r'\w+\.?\w+@\w+\.\w+'
print(re.findall(patron_email, data))
# Buscar fecha
patron_fechas = r'\d{2}-\d{2}-\d{4}'
print(re.findall(patron_fechas, data))
# Buscar patrón
patron_codigo = r'\w{3}\d{6}'
print(re.findall(patron_codigo, data))
# Buscar archivo .py
patron_nombreArchivo = r'\w+\.py'
print(re.findall(patron_nombreArchivo, data))