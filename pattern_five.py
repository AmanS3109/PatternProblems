def pattern5(n):
    for row in range(1, 2*n):
        c = 0
        if row > n:
            c = 2 * n - row
        else:
            c = row
        for col in range(1, c+1):
            print("* ", end="")
        print()
pattern5(5)