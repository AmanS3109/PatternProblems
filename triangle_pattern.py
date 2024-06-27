def pattern1(n):
    for row in range(1, n+1):
        for col in range(1, row+1):
            print("* ", end = '')
        print()
# O(N^2)
def pattern1_optimized(n):
    for row in range(1, n+1):
        for col in range(1, row+1):
            print("* ", end = '')
        print()
pattern1_optimized(6) # O(N)