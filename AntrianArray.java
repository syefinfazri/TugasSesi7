public class AntrianArray {
    private int[] queue;
    private int front, rear, size, capacity;

    public AntrianArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue penuh! Tidak bisa menambah " + data);
            return;
        }
        rear++;
        queue[rear] = data;
        size++;
        System.out.println(data + " masuk ke antrian");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return;
        }
        System.out.println(queue[front] + " keluar dari antrian");
        front++;
        size--;
    }

    // Tantangan: elemen depan
    public int peekFront() {
        if (isEmpty()) return -1;
        return queue[front];
    }

    // Tantangan: elemen belakang
    public int peekRear() {
        if (isEmpty()) return -1;
        return queue[rear];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
            return;
        }
        System.out.print("Isi Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AntrianArray q = new AntrianArray(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40); // melebihi kapasitas

        q.display();
        System.out.println("Depan: " + q.peekFront());
        System.out.println("Belakang: " + q.peekRear());
    }
}
