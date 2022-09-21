public class Node2 {
    private Node2 previous;
    private Node2 next;
    private int data;
    public Node2(Node2 forprev, Node2 fornext, int fordata) { // sets a node
        previous = forprev;
        next = fornext;
        data = fordata;

    }
    public Node2 prev(){ // returns previous node
        return previous;
    }
    public Node2 getNext(){ // returns next node
        return next;
    }
    public void setnext(Node2 _next){
        next = _next;
    }
    public void setPrevious(Node2 _previous) { previous = _previous;}
    public int returncontent(){return data;}
    public String returnnode(){
        return("data "  + data);
    }
}
