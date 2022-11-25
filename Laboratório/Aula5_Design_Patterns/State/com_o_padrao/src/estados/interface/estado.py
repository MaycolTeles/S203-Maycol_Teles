""""""

from abc import ABC, abstractmethod


class Estado(ABC):
    """"""

    @abstractmethod
    def publicar(self) -> None:
        """"""

    @abstractmethod
    def reprovar(self) -> None:
        """"""
