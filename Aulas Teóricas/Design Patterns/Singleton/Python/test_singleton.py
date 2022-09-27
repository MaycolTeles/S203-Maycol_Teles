"""
Module containing the "TestLogMessager2" Class.
"""

import unittest

from singleton import LogMessager2


class TestLogMessager2(unittest.TestCase):
    """
    Class to test the 'LogMessager2' Class.
    """

    def test_is_singleton(self) -> None:
        """
        Method to assert whether the class is a singleton or not.
        """
        log_messager1 = LogMessager2()
        log_messager2 = LogMessager2()

        self.assertIs(log_messager1, log_messager2)


if __name__ == '__main__':
    unittest.main()
