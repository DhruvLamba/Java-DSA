public class fibonachi {
    public static void main(String[] args) {
         int n=fib(4);
         System.out.println(n);
    }
    static int fib(int n){
        if (n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
