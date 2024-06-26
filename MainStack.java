public class MainStack{
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    public MainStack(){
        this(DEFAULT_SIZE);
    }
    public MainStack(int size){
        this.data = new int[size];
    }
    public boolean push(int element) {
        if(isfull()){
            System.out.println("Stack is full");
        }
        ptr++;
        data[ptr]=element;
        return true;
    }
    public boolean isfull(){
        return ptr==data.length;
    }
    public int pop() throws stackexception{
        if(isempty()){
            throw new stackexception("Stack is empty");
        }
        ptr--;
        return data[ptr];
    }
    public boolean isempty(){
        return ptr==-1;
    }

    public void peek() throws stackexception{
        if(isempty()){
            throw new stackexception("Stack is empty");
        }        
        System.out.println(data[ptr]);
    }

}