public class name {
    public static void main(String[] args) {
        int i=1;
        name1(i);
    }
    static void name1(int i){
        if(i==6){
            return;
        }
        System.out.println(i);
        i++;
        name1(i);
    }
}
