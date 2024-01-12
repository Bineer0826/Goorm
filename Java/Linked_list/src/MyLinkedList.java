import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T>{

    private  Node<T> head;

    private  int size = 0;

    public void add(T data) {
        //데이터 생성
        Node<T> node = new Node<>(data);

        //linked list가 비어있는 경우
        if (size == 0) {
            head = node;
        }
        //linked list가 비어있지 않는 경우 -> 1개 이상

        else  {
            //마지막 노드를 뒤로 넣어주어야 함
            //마지막 노드 탐색
            Node<T> current = head;
            while (current.getNext() !=null) {
                current = current.getNext();
            }
            //현재 노드는 가장 마지막 노드가 위치함
            //마지막 노드 next에 추가
            current.setNext(node);
        }

        this.size++;
    }
    //todo get(index 1)

    public T get(int index) {
        //linked list보다 큰 인덱스를 받을 경우 예외처리

        if (index<0 || this.size<=index) {
            throw new IndexOutOfBoundsException();
        }

        //정상적ㅇ니 인덱스 값일 경우
        Node<T> current = this.head;
        for (int i = 0; i<index; i++) {
            current = current.getNext();
        }
        return current.getData();

    }

    //todo delete(index 1)

    //중간 값을 삭제 -> 노드들의 주소를 정리
    //1->2->3->4
    //김 이 박 최 예로 박이 지워지면 1->2->4로!

    public void delete(int index) {
        //양 끝 경계에 대한 예외처리
        if (index<0 || this.size<=index) {
            throw new IndexOutOfBoundsException();
        }
        //분기
        if (index == 0) {
            head = head.getNext();
        }
        else  {
            //인덱스 2번째노드를 받음
            Node<T> current = this.head;
            for (int i = 0; i<index -1; i++) {
                current = current.getNext();
            }
            //직전 노드에서 다음노드로 이동하게끔
            current.setNext(current.getNext().getNext());
        }
        this.size--;


    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            //맨 처음 head부터 순회
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                //다음 노드가 있는지 확인
                if(hasNext()) {
                    throw new NoSuchElementException();
                }

                T data = current.getData();
                current = current.getNext();
                return data;
            }
        };
    }
}
