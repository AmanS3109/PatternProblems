def pattern4(n):
    for row in range(1, n+1):
        for col in range(1, row + 1):
            print(col," ", end="")
        print()
pattern4(5)