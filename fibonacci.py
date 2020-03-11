class Solution:
    def fib(self, N: int) -> int:
        if N == 0:
            return 0
        elif N == 1 or N == 2:
            return 1
        arr = [None] * (N+1)
        arr[0] = 0
        arr[1] = 1
        arr[2] = 1
        for i in range(2, N+1):
            arr[i] = arr[i - 1] + arr[i - 2]
        return arr[N]

    def fib_rec(self, N: int) -> int:
        if N == 0:
            return 0
        elif N == 1:
            return 1
        return self.fib_rec(N - 1) + self.fib_rec(N - 2)
