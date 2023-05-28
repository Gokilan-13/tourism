package workingPurpose;

public class LL {
    Node head;
    Node tail;
    int size;

    public LL() {
        this.size = 0;
    }

    private class Node{
        int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next=next;
        }

    }

    public void insertfirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void display(){
        Node temp=head;
        for(int i=0;i<size;i++){
            System.out.print(temp.value+"->");
            temp= temp.next;
        }
        System.out.println("END");
    }

    public void insertlastindex(int value){
        Node node=new Node(value);
        if(tail!=null) {
            tail.next=node;
            tail = node;
            size+=1;
        }else{
            head=node;
            tail=node;
            tail.next=null;
            size+=1;
        }
    }
    public void insertAtPosition(int value,int index){
        if(index==0){
            insertfirst(value);
            return;
        }
        if(index==size){
            insertlastindex(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp= temp.next;
        }
        Node node=new Node(value, temp.next);
        node.next=temp.next;
        temp.next=node;
        size+=1;
    }
    public int deletefirst(){
        if(size==0){
            System.out.println("list is empty");
            return 0;
        }
        int val= head.value;
        head= head.next;
        size--;
        return val;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node= node.next;
        }
        return node;
    }
    public int deletelast(){
        if(size<=1){
          deletefirst();
        }
        Node node=get(size-2);
        int value=tail.value;
        tail=node;
        tail.next=null;
        return value;
    }
}
