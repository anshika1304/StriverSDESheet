// https://bit.ly/3KbIjIW

public class Queue {
    int[] arr;
    int front;
    int rear;
    int size;
    
    Queue() {
        size=100001;
        arr=new int[size];
        front=0;
        rear=0;
        
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        return front==rear?true:false;
    }

    void enqueue(int data) {
        if(rear==size){
            System.out.println("Queue is full");
        }
        else{
            arr[rear++]=data;
        }
    }

    int dequeue() {
        if(front==rear){
            return -1;
        }
        else{
            int el=arr[front];
            arr[front]=-1;
            front++;
            if(front==rear){
                front=0;
                rear=0;
            }
            return el;
        }
    }

    int front() {
        if(front==rear){
            return -1;
        }
        else{
            return arr[front];
        }
    }

}
