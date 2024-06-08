public class reverse {
    public static void main(String[] args) {
        int res=sum(1342);
        System.out.println(res);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}
