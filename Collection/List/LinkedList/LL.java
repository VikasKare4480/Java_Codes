class LL {

    // create node

    class Node {
        String data;
        Node next;

        Node(String data) {

            this.data = data;
            this.next = null;

        }
    }

    private LL.Node head;

    // add element at the first

    public void addFirst(String data) {

        Node newNode = new Node(data);
        if (head == null) {

            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public static void main(String[] args) {

        LL list = new LL();

        list.addFirst("vikas");
    }
}
