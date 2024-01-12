public class Node<T> {

    private T data;
    private Node<T> next;


    // 생성자 생성
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    //getter setter


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
