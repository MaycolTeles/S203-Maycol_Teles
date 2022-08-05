"""
Module containing the Exercício Proposto resolution.
"""

import math


def get_user_number() -> float:
    """
    Function to return the user number.

    Returns
    --------
    float
        The user number in float format
    """
    user_number = input('Digite um número para elevá-lo ao cubo: ')

    return float(user_number)


def get_cubed_number(number: float) -> float:
    """
    Function to return the cubed received number.

    Parameters
    ----------
    number : float
        The number.

    Returns
    --------
    float
        The number cubed.
    """
    return math.pow(number, 3)


def compare_number(number: float) -> None:
    """
    Function to compare and prfloat a message whether
    the received number is greather than the threshold or not.

    Parameters
    ----------
    number : float
        The number.
    """
    THRESHOLD = 100.0

    if number > THRESHOLD:
        print(f'O número {number} é MAIOR que {THRESHOLD}!')

    elif number < THRESHOLD:
        print(f'O número {number} é MENOR que {THRESHOLD}!')

    else:
        print(f'O número {number} é IGUAL a {THRESHOLD}')

def main() -> None:
    """
    Main function.
    """

    number = get_user_number()

    number_cubed = get_cubed_number(number)

    compare_number(number_cubed)


if __name__ == '__main__':
    main()
