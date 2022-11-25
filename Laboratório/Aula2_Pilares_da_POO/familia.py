"""
Module containing all the classes for ex. 1.
"""

class Pai():
    nome: str = "Carlos"
    sobrenome: str = "Oliveira"
    residencia: str = "Ilha Bela"
    olhos: str = "azuis"


class Filha(Pai):
    nome: str = "Luciana"
    olhos: str = "castanhos"


class Neta(Filha):
    nome: str = "Maria"


print("Nomes:")
print(Pai.nome)
print(Filha.nome)
print(Neta.nome)


print("Residências:")
print(Pai.residencia)
print(Filha.residencia)
print(Neta.residencia)


print("Olhos:")
print(Pai.olhos)
print(Filha.olhos)
print(Neta.olhos)