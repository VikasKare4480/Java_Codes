import java.util.LinkedList;

class LinkedListDemo {

    public static void main(String[] args) {

        // Create LinkedList object

        LinkedList ll = new LinkedList();

        System.out.println("class of Object LL " + ll.getClass().getName());

        // Adding elements to the LinkedList

        ll.add(10);
        ll.add(10.00f);
        ll.add(true);
        ll.add(10.15);

        // Iterator -- universal Iterator

        for (var x : ll) {

            System.out.print(x + " ");

        }

        System.out.println("After adding elements " + ll);

        // push element at the top of the stack
        ll.push(1000); // 1000 added tp the top

        System.out.println("after pushing 1000 " + ll);

        // remove element from the top of the stack
        ll.pop(); // 100 removed from the top
        System.out.println("After poping " + ll);

        // addFirst(object) -->> element added Before the first elemetnt in L-List

        ll.addFirst("Vikas");

        System.out.println("After adding to First " + ll);

        // addLast(Object) -->> Element added to after last Node of the List

        ll.addLast("Kare");

        System.out.println("after adding to the last " + ll);

        // E getFirst() -->> to get the first element of the L-List

        System.out.println("get First Element " + ll.getFirst());

        // E getLast() -->> to get last element of the LinkedList

        System.out.println("getLast element " + ll.getLast());
        // removeFirst(Object) -->> removes the first Node from List

        ll.removeFirst();
        System.out.println("After remove first " + ll);

        // removeLast(Object) -->> removes the last Node(Element) of the L-List

        ll.removeLast();
        System.out.println("After remove Last " + ll);

        //

        Object obj = ll.clone();

        System.out.println("clone obj " + obj);

    }
}