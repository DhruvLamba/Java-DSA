public class DynamicStack extends MainStack {
    public DynamicStack() {
        super(); 
    }

    public DynamicStack(int size) {
        super(size); 
    }

    @Override
    public boolean push(int element){
        if(this.isfull()){
            int temp[]=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(element);
    }
}
