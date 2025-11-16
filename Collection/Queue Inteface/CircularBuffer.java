public class CircularBuffer {
    int[] buffer;
    int size;
    int head = 0; 
    int count = 0; 

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void insert(int x) {
        buffer[(head + count) % size] = x;

        if (count < size) {
            count++;
        } else {
            head = (head + 1) % size;  
        }
    }

    public void printBuffer() {
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(head + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);   

        cb.printBuffer();  
    }
}
