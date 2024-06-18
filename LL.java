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
        list.addfirst(7);
        list.addfirst(8);
        list.display();        
        list.deletefirst();
        list.display();
        list.deleteLast();
        list.display();




    }
}