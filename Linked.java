public class Linked {
    private Node2 head;
    private Node2 tail;

    public Linked(){
        head = null;
        tail = null;
    }
    public void append(int data){
        if(head == null){
            Node2 newhead = new Node2(null, null, data);
            head = newhead;
        }
        else {
            Node2 notnew = head;
            while (notnew.getNext() != null) {
                notnew = notnew.getNext();
            }
            Node2 newthing = new Node2(notnew, null, data);
            notnew.setnext(newthing);
            tail = newthing;
        }
    }
    public static String fullprint(Linked c){
        return toString(c.head);
    }
    public static String toString(Node2 c){
        String toString = "";
        while(c.getNext() != null){
            toString += (c.returncontent() + " ");
            c = c.getNext();
        }
        toString += (c.returncontent() + " ");

        return toString;
    }
    public Node2 Node2search(int x){
        if(head == null) return null;
        Node2 test = head;
        while(test != null && test.returncontent() != x) {
            test = test.getNext();
        }
        return test;
    }
    public Node2 Node2ss(Linked list, int x){
        Node2 test = list.head;
        while(test != null && test.returncontent() != x ){
            test = test.getNext();
        }
        return test;

    }
    public void delete(Node2 a){
        if (a.prev() != null){
            a.prev().setnext(a.getNext());
        }
        else{
            head = a.getNext();
        }
        if(a.getNext()!=null){
            a.getNext().setPrevious(a.prev());
        }
    }
    public Node2 getHead(){return head;}
    public Node2 getTail(){return tail;}

}
