class Solution {
    public List<Integer> primeRange(int l, int r) {
        // code here
        ArrayList<Integer> primes = new ArrayList<>();

         for (int num = l; num <= r; num++) {
             if (isPrime(num)) {
                 primes.add(num);
             }
         }
         return primes;
    }
    private boolean isPrime(int n) {
         if (n <= 1) return false;
         if (n == 2) return true;
         if (n % 2 == 0) return false;

         int sqrtN = (int)Math.sqrt(n);
         for (int i = 3; i <= sqrtN; i += 2) {
             if (n % i == 0) return false;
         }
         return true;
     }
}