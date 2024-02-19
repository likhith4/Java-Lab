


import java.util.Scanner;



public class Main {
    private static final int MAX_SIZE=10;
    private int[] stackArray;
    private int top;
    public Main(){
        stackArray=new int[MAX_SIZE];
        top=-1;
    }

    public void push(int value){
        if (top<MAX_SIZE-1) {
            stackArray[++top]=value;
            System.out.println("Pushed: "+value);

        }else{
            System.out.println("Stack overflow");
        }
    }
    public int pop(){
        if (top>=0) {
            int poppedValue=stackArray[top--];
            System.out.println("Popped"+poppedValue);
            return poppedValue;
            
        }else{
            System.out.println("Stack Underflow can't pop");
            return -1;
        }
    }
    public int peek(){
        if (top>=0) {
            System.out.println("Peeked:"+stackArray[top]);
            return stackArray[top];
        }else{
            System.out.println("Stack is empty can't open");
            return -1;
        }
    }
    public void display(){
        if (top>=0) {
            System.out.println("Stack contents:");
            for(int i=0;i<=top;i++){
                System.out.println(stackArray[i]+" ");
            }
            System.out.println();
            
        }else{
            System.out.println("Stack is empty.");
        }
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==MAX_SIZE-1;
    }
    
   
    public static void main(String[] args) {
        Main stack= new Main();
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nStack menu");
            System.out.println("1. Push\n");
            System.out.println("2.Pop\n");
            System.out.println("3.Peek\n");
            System.out.println("4.Display stack contents\n");
            System.out.println("5.Check if stack is empty\n");
            System.out.println("6.Check if stack is full\n");
            System.out.println("0.Exit\n");
            System.out.println("Enter your choice:");
            choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value to push");
                    int valueToPush=scanner.nextInt();
                    stack.push(valueToPush);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                case 5:
                    System.out.println("Is stack empty?"+stack.isEmpty());
                    break;
                case 6:
                    System.out.println("Is stack full ?"+stack.isFull());
                    break;
                case 0:
                    System.out.println("Exiting the program....");
                    break;
                default:
                    System.out.println("Invalid choice Please try again");
            
                
            }
        } while (choice != 0);
        scanner.close();

        
    }
}
