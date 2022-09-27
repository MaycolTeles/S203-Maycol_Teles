"""
Module containing the "LogMessager2" Singleton Class.

This is a Singleton because it provides a global access to this class,
via LOG_MESSAGER constant variable.
"""

class Singleton(type):
    """
    Class to represent a Singleton.

    Every classes that inherits from this class (via 'metaclass')
    is now a singleton.
    """
    _instances = {}

    def __call__(cls, *args, **kwargs):
        """
        Method that will be called every time that this class is instantiated.
        """
        if cls not in cls._instances:
            cls._instances[cls] = super(Singleton, cls).__call__(*args, **kwargs)

        return cls._instances[cls]


class LogMessager2(metaclass=Singleton):
    """"""

    def error(self, msg: str) -> None:
        """"""
        print(f'ERROR! Message: {msg}')

    def info(self, msg: str) -> None:
        """"""
        print(f'INFO - Message: {msg}')

    def warn(self, msg: str) -> None:
        """"""
        print(f'WARNING! Message: {msg}')
