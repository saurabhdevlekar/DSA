package day_01;
public class QueueImplementation {
    final int SIZE=3;
    int arr[]=new int[SIZE];
    int front=0;
    int rear=0;
    
    public void push(int value){
        if((rear==SIZE && front==0)||(rear==front-1)){
            System.out.println("Queue is full..");
        }
        else if(rear==SIZE && front!=0){
            rear=0;
            arr[rear]=value;
            rear++;
        }
        else{
        arr[rear]=value;
        rear++;
        }
    }
    
    public void pop(){
        if(rear==front){
            System.out.println("Queue is emptty");
             rear=front=0;
        }else{
        System.out.println("Popped element is "+arr[front]);
            
        }
    }
    public static void main(String[] args) {
        QueueImplementation qi=new QueueImplementation();
        qi.push(10);System.out.println("pushed 10");
        qi.push(20);System.out.println("pushed 20");
        qi.push(30);System.out.println("pushed 30");
        qi.push(40);
        
        qi.pop();
        qi.pop();
        
        
        qi.push(30);System.out.println("pushed 30");
        qi.push(20);System.out.println("pushed 20");
//        qi.push(10);
        
        qi.pop();
        qi.pop();
        
        
    }
}
