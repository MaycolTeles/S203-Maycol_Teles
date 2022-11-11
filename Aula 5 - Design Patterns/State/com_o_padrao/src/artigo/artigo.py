""""""

from datetime import datetime

from ..estados import EstadoRascunho



class ArtigoState:
    """"""
    __estado: str
    __log_historico: list[str]

    def __init__(self) -> None:
        """"""
        self.__estado = EstadoRascunho()

    def get_estado(self) -> str:
        """"""
        return self.__estado

