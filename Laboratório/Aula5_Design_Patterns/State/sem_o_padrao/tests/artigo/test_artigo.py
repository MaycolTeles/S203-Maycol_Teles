""""""

import unittest

from src import Artigo, GerenteDeSeguranca


class TestArtigo(unittest.TestCase):
    """"""

    def test_deve_criar_artigo_com_estado_correto(self) -> None:
        """"""
        artigo = Artigo()

        actual = artigo.get_estado()
        expected = "RASCUNHO"

        self.assertEqual(actual, expected)

    def test_deve_artigo_transitar_rascunho_para_aprovado(self) -> None:
        """"""
        gerente_seguranca = GerenteDeSeguranca()
        artigo = Artigo()

        gerente_seguranca.set_usuario_corrente("AUTOR")
        artigo.publicar()

        actual = artigo.get_estado()
        expected = "REVISANDO"

        self.assertEqual(actual, expected)
