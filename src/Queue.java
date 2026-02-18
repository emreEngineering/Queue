public class Queue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[size];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    public void enqueue(int data) {
        if (isFull()){
            System.out.println("Kuyruk dolu eleman eklenemiyor : "+data);
            return;
        }
        if (rear==maxSize-1){
            rear=0;
        }else {
            rear++;
        }

        queueArray[rear]=data;
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Kuyruk boş! Eleman çıkarılamıyor.");
            return -1;
        }
        int data = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return data;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Kuyruk boş! Eleman yok.");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void printQueue(){
        if (isEmpty()){
            System.out.println("Kuyruk boş!");
            return;
        }
        for (int i = front; i < front + currentSize; i++) {
            int index = i;
            if (index >= maxSize) {
                index = index - maxSize;
            }
            System.out.print(queueArray[index] + " ");
        }
        System.out.println();
    }
}
