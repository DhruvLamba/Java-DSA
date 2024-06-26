public class LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node; 
            return;           
        }
        new_node.next=head;
        head=new_node;
    }

    public void addlast(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node; 
            return;           
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=new_node;
        new_node.next=null;
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head=head.next;
    }

    public void deleteLast(){
        Node last=head.next;
        Node secondlast=head;
        while (last.next!=null) {
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }

    public void addindex(int index,int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        new_node.next=temp.next;
        temp.next=new_node;        
    }

    public void delindex(int index){        
        if(head==null){
           System.out.println("The list is empty");
            return;
        }
        Node last=head.next;
        Node second=head;
        for(int i=1;i<index;i++){
            last=last.next;
            second=second.next;            
        }
        second.next=last.next;        
        
    }
    public void display(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("END");

    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addfirst(5);
        list.addfirst(6);
        list.addfirst(10);
        list.addfirst(8);
        list.delindex(2);
        // list.display();        
        // list.deletefirst();
        // list.display();
        // list.deleteLast();
        // list.display();
        list.addindex(3, 7);
        list.display();
    }
}