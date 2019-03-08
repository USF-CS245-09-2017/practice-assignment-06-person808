public class ArrayStack<T> implements Stack<T> {

    private T[] arr;
    private int head = -1;

    public ArrayStack() {
        Object[] tempArr = new Object[10];
        arr = (T[]) tempArr;
    }


    private void growArray() {
        Object[] tempArr = new Object[arr.length * 2];
        T[] nameArr = (T[]) tempArr;
        for (int i = 0; i < arr.length; i++) {
            nameArr[i] = arr[i];
        }
        arr = nameArr;
    }

    @Override
    public void push(T item) {
        if (head == arr.length - 1) {
            growArray();
        }
        arr[++head] = item;
    }

    @Override
    public T pop() {
        if (empty()) {
            return null;
        }
        return arr[head--];
    }

    @Override
    public T peek() {
        if (empty()) {
            return null;
        }
        return arr[head];
    }

    @Override
    public boolean empty() {
        return head == -1;
    }
}
