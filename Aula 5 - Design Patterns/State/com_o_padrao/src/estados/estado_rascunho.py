""""""

from .interface import Estado
from ..artigo import ArtigoState


class EstadoRascunho(Estado):
    """"""
    __artigo: ArtigoState

    def publicar(self) -> None:
        """"""
        self.__estado = EstadoRevisando()

    def reprovar(self) -> None:
        """"""
        print('...')