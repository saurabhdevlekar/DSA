package day_03;
class Node{
    int data;
    Node next;
}
public class CircularLinkedList {
    Node head;
    
    void addFirst(int val){
        Node newNode=new Node();
        newNode.data=val;
        
        if(head==null){
            newNode.next=newNode;
            head=newNode;
        }
        else{
            Node last=head;
            while(last.next!= head){
                last=last.next;
            }
            last.next=newNode;
            newNode.next=head;
            head=newNode;
        }
    }
    void addLast(int val){
     Node newNode=new Node();
        newNode.data=val;
        
        if(head==null){
            newNode.next=newNode;
            head=newNode;
        }
        else{
            Node last=head;
            while(last.next!= head){
                last=last.next;
            }
            last.next=newNode;
            newNode.next=head;
//            head=newNode;
        }
    }
    void delete(int val){
        if(head==null)
            return;
        if(head.data==val && head.next==head){
            head=null;
        }
        else if(head.data==val){
            Node temp=head;
            while(temp.next!= head){
                temp=temp.next;
            }
            temp.next=head.next;
            head=head.next;
        }
        else{
            Node temp=head;
            while(temp.next!= head){
                if(temp.next.data==val){
                    temp.next=temp.next.next;
                    break;
                }    
                temp=temp.next;
            }
        }
    }
    
    boolean search(int val){
        if(head==null)
            return false;
        Node temp=head;
        do{
            if(temp.data==val)
                return true;
            temp=temp.next;
        }while(temp!= head);
        return false;
    }
    void printList(){
        if(head==null)
            return;
        Node temp=head;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }while(temp!= head);
    }
    public static void main(String[] args) {
        CircularLinkedList cll=new CircularLinkedList();
        cll.addFirst(100);
        cll.addFirst(200);
        cll.addFirst(300);
        cll.addFirst(400);
        
        cll.addLast(10);
        cll.addLast(20);
        cll.addLast(30);
        
//        cll.delete(30);
System.out.println(cll.search(3000));
        cll.printList();
    }
}
