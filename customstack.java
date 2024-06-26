public class customstack {
    public static void main(String[] args) throws stackexception {
        MainStack st= new MainStack();
        st.push(3);
        st.push(5);
        st.push(6);
        st.push(7);
        st.peek();
        st.pop();
        st.peek();
    }
}
