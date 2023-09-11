import java.util.Stack;

class StackDemo {

    public static void main(String[] args) {
        
        Stack stk = new Stack<>();

        stk.addElement("Mango");
        stk.addElement("Apple");
        stk.addElement("PineApple");
        stk.addElement("Grapes");
        stk.addElement("Jamun");
        
        System.out.println(stk);

        stk.push("Custerd Apple");

        System.out.println(stk);

        stk.pop();

        System.out.println(stk);

        System.out.println("isEmpty() " + stk.isEmpty());
        System.out.println("empty() " + stk.empty());

        
        System.out.println("peek element " + stk.peek());

        System.out.println("Search element :  " + stk.search("Mango"));

        
    
    }
}