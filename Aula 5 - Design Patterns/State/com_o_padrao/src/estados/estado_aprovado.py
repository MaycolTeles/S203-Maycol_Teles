""""""

from .interface import Estado
from .estado_revisando import EstadoRevisando
from ..artigo import ArtigoState


class EstadoAprovado(Estado):
    """"""
    __artigo: ArtigoState

    def publicar(self) -> None:
        """"""
        print('...')

    def reprovar(self) -> None:
        """"""
        self.__artigo = EstadoRevisando()
