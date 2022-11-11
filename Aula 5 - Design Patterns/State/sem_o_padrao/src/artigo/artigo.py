""""""

from datetime import datetime

from ..gerente_seguranca import GerenteDeSeguranca


class Artigo:
    """"""
    __estado: str
    __log_historico: list[str] = []

    def __init__(self) -> None:
        """"""
        self.__estado = "RASCUNHO" # ESTADO INICIAL

    def get_estado(self) -> str:
        """"""
        return self.__estado

    def publicar(self) -> None:
        """"""
        gerente_seguranca = GerenteDeSeguranca()

        if self.__estado == "RASCUNHO":
            if gerente_seguranca.eh_usuario_autor():
                self.__estado = "REVISANDO"
                self.__log_historico.append(f"Transitado para REVISANDO em: {datetime.now()}")
                return

            else:
                raise Exception("Usuario não tem permissão para publicar!")

        if self.__estado == "REVISANDO":
            if gerente_seguranca.eh_usuario_moderador():
                self.__estado = "APROVADO"
                self.__log_historico.append(f"Transitado para APROVADO em: {datetime.now()}")
                return

            else:
                raise Exception("Usuario não tem permissão para publicar!")

        if self.__estado == "APROVADO":
            return

    def reprovar(self) -> None:
        """"""
        gerente_seguranca = GerenteDeSeguranca()

        if self.__estado == "RASCUNHO":
            return

        if self.__estado == "REVISANDO":
            if gerente_seguranca.eh_usuario_moderador():
                self.__estado = "RASCUNHO"
                self.__log_historico.append(f"Transitado para RASCUNHO em: {datetime.now()}")
                return

            else:
                raise Exception("Usuario não tem permissão para reprovar!")

        if self.__estado == "APROVADO":
            return
