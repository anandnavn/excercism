def square(number):

    if number < 1 or number > 64 :
        raise ValueError("square must be between 1 and 64")
    else :
        return 2 ** (number-1)

def total():
    total_number_of_grains = 0
    count = 0
    while count < 64 :
        total_number_of_grains = 2 ** count + total_number_of_grains
        count = count + 1
    return total_number_of_grains