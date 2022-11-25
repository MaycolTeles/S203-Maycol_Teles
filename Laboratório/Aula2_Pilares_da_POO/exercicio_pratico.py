"""
Module containing all the classes for ex. "Exercício Prático". 
"""

class Pessoa():
    """"""
    nome: str
    sexo: str
    idade: int

    def __init__(self, nome: str, sexo: str, idade: int) -> None:
        """"""
        self.nome = nome
        self.sexo = sexo
        self.idade = idade


class Cidadao(Pessoa):
    """"""
    cpf: str

    def __init__(self, nome: str, sexo: str, idade: int, cpf: str) -> None:
        super().__init__(nome, sexo, idade)
        self.cpf = cpf


print()
print("Hora de criar um Cidadão!")
nome = input("Digite o nome do Cidadão: ")
sexo = input("Digite o sexo do Cidadão: ")
idade = input("Digite a idade do Cidadão: ")
cpf = input("Digite o CPF do Cidadão: ")

cidadao = Cidadao(
    nome=nome,
    sexo=sexo,
    idade=idade,
    cpf=cpf
)

print()
print("Printando as informações do Cidadão!")
print(f"Nome: {cidadao.nome}")
print(f"Sexo: {cidadao.sexo}")
print(f"Idade: {cidadao.idade}")
print(f"CPF: {cidadao.cpf}")
