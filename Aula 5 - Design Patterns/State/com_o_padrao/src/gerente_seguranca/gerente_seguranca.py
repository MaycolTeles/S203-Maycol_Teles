""""""

from __future__ import annotations


class Singleton(type):
    """
    Class to represent a Singleton.

    Every classes that inherits from this class (via 'metaclass')
    is now a singleton.
    """
    __instances = {}

    def __call__(cls, *args, **kwargs):
        """
        Method that will be called every time that this class is instantiated.
        """
        if cls not in cls.__instances:
            cls.__instances[cls] = super(Singleton, cls).__call__(*args, **kwargs)

        return cls.__instances[cls]


class GerenteDeSeguranca(metaclass=Singleton):
    """"""
    __usuario_corrente: str

    @classmethod
    def get_instance(cls) -> GerenteDeSeguranca:
        """"""
        return GerenteDeSeguranca()

    def get_usuario_corrente(self) -> str:
        """"""
        return self.__usuario_corrente

    def set_usuario_corrente(self, usuario_corrente: str) -> None:
        """"""
        self.__usuario_corrente = usuario_corrente

    def eh_usuario_moderador(self) -> bool:
        """"""
        return self.__usuario_corrente == "MODERADOR"
    
    def eh_usuario_autor(self) -> bool:
        """"""
        return self.__usuario_corrente == "AUTOR"