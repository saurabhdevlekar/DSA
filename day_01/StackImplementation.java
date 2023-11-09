package day_01;
class MyStack{
    final int SIZE=3;
    int arr[]=new int[SIZE];
    int top=-1;
    
    public boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(top == SIZE-1)
            return true;
        else
            return false;
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is Full....");
        }
        else{
            ++top;
            arr[top]=value;
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty....");
        }
        else{
            System.out.println(arr[top]+" is popped...");
            top--;
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty....");
            return;
        }
            System.out.println("Peeked element is "+arr[top]);  
    }
    
}
public class StackImplementation {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(10);
        System.out.println("10 is pushed");
//        stack.pop();
        stack.push(20);
        System.out.println("20 is pushed");
        stack.push(30);
        System.out.println("30 is pushed");
        stack.pop();
        
        stack.push(40);
        System.out.println("40 is pushed");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.peek();
    }
}
