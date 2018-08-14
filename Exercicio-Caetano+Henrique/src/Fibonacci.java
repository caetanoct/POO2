public class Fibonacci {
  
    static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
  
    public static void main(String[] args) {   
     
           
    for (int i = 0; i < 8; i++) {
    	System.out.println(Fibonacci.fibo(i));
        }
  
    }
  
}