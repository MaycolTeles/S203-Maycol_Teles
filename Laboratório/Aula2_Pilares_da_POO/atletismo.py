"""
Module containing all the classes for ex. 2.
"""

class Pessoa():
    """"""
    nome: str
    idade: int

    def __init__(self, nome: int, idade: str):
        """"""
        self.nome = nome
        self.idade = idade

    def envelhecer(self):
        """"""
        self.idade += 1


class Atleta(Pessoa):
    """"""
    peso: float
    aposentado = None

    def __init__(self, nome: str, idade: int, peso: float):
        """"""
        super().__init__(nome, idade)
        self.peso = peso

    def aquecer(self):
        """"""
        print("Atleta aquecido")

    def aposentar(self):
        """"""
        self.aposentado = True


class Corredor(Atleta):
    """"""

    def correr(self):
        """"""
        print("Corredor correndo...")


class Nadador(Atleta):
    """"""

    def nadar(self):
        """"""
        print("Nadador nadando....")


class Ciclista(Atleta):
    """"""

    def pedalar(self):
        """"""
        print("Ciclista pedalando...")


# Corredor
corredor_1 = Corredor("Maycol", 22, 85)
corredor_1.aquecer()
corredor_1.correr()

# Nadador
nadador_1 = Nadador("Michael Phelps", 37, 88)
print("Está aposentado?")

if nadador_1.aposentado:
    print("Sim")
else:
    print("Não")

nadador_1.nadar()
nadador_1.envelhecer()
nadador_1.aposentar()

print("Agora já está aposentado?")
print("Sim" if nadador_1.aposentado else "Não")
