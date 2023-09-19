package queque;
import java.util.LinkedList;


public class Queue {
    private int maxSize;
    private char[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new char[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int i) {
        if (rear == maxSize - 1)
            rear = -1;
        queueArray[++rear] = (char) i;
        nItems++;
    }

    public char dequeue() {
        char temp = queueArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public static String invertirCadena(String input) {
        int longitud = input.length();
        char[] stack = new char[longitud];

        for (int i = 0; i < longitud; i++) {
            stack[i] = input.charAt(i);
        }

        StringBuilder invertida = new StringBuilder();

        for (int i = longitud - 1; i >= 0; i--) {
            invertida.append(stack[i]);
        }

        return invertida.toString();
    }

    public static boolean esPalindromo(String input) {
        int longitud = input.length();
        char[] stack = new char[longitud / 2];
        int top = -1;

        for (int i = 0; i < longitud / 2; i++) {
            stack[++top] = input.charAt(i);
        }

        int startIndex = (longitud % 2 == 0) ? longitud / 2 : longitud / 2 + 1;

        for (int i = startIndex; i < longitud; i++) {
            if (input.charAt(i) != stack[top--]) {
                return false;
            }
        }

        return true;
    }
}

