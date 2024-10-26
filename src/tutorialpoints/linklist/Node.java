package tutorialpoints.linklist;

public class Node {
    public int data;
    public Node leftChild;
    public Node rightChild;

    public Node(){}

    public void display(){
        System.out.println("("+data+")");
    }
}
