""""""

from .interface import Estado
from .estado_rascunho import EstadoRascunho
from .estado_aprovado import Es
from ..artigo import ArtigoState


class EstadoRevisando(Estado):
    """"""
    __artigo: ArtigoState

    def publicar(self) -> None:
        """"""
        self.__estado = EstadoAprovado()

    def reprovar(self) -> None:
        """"""
        self.__estado = EstadoRascunho()
