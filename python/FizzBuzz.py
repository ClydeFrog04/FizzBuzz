fizz = [0b1000110, 0b1110101, 0b1100011, 0b1101011]
buzz = [0b1010100, 0b1101000, 0b1101001, 0b1110011]

def main():
    limit = 100
    for i in range(1, limit + 1):
        print(getFizzBuzz(i))


def charArrToString(str1):
    out = ""
    for i in range(len(str1)):
        out = out + chr(str1[i])

    return out

def getFizzBuzz(n):
    out = ""
    test1 = 3
    test2 = 5

    if n % test1 == 0:
        out += charArrToString(fizz)

    if n % test2 == 0:
        out += charArrToString(buzz)

    if len(out) == 0:
        out = str(n)

    return out

main()
