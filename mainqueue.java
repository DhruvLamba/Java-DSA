public class mainqueue {
    public static void main(String[] args) throws Exception {
        CustomQueue qu =new CustomQueue();
        qu.insert(5);
        qu.insert(6);
        qu.insert(10);
        qu.display();
        qu.remove();
        qu.remove();
        qu.display();

    }
}
