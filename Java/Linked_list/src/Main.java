
//

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        //add
        myLinkedList.add("김");
        myLinkedList.add("이");
        myLinkedList.add("박");
        myLinkedList.add("최");

        //get
        System.out.println("-- get !!! --");
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));

        //delete
        System.out.println("-- delete !!! --");
        myLinkedList.delete(2);

//        for(int i = 0; i < 3 ; i++) {
//            System.out.println(myLinkedList.get(i));
//        }

            for (String item: myLinkedList) {
                System.out.println(item);
            }
    }
}