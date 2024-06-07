class factorialrecursion{
    public static void main(String[] args) {
        int res=fact(6);
        System.out.println(res);
    }
    static int fact(int n){        
            if(n==1){
                return n;
            }       
            
            return n*fact(n-1);      
        
    }
}