package tutorialpoints.linklist;

public class Tree {
    public static Node root;

    public Tree(){}

    public Node search(int data) {
        Node current = root;
        System.out.println("Visiting elements : ");
        while(current.data !=data){
            if(current !=null){
                System.out.println(current.data + " ");
                //go to left tree
                if(current.data > data){
                    current = current.leftChild;
                }else{
                    //go to right tree
                    current = current.rightChild;
                }

                if(current == null) return null;
            }
        }
        return current;
    }

    public void insert(int data){
        Node tempNode = new Node();
        tempNode.data = data;

        //if tree is empty
        if(root == null){
            root = tempNode;
        }else{
            Node current = root;
            Node parent = null;

            while(true){
                parent = current;
                //go to left of the tree
                if(data < parent.data){
                    current = current.leftChild;
                    if(current == null){
                        parent.leftChild = tempNode;
                        return;
                    }
                } else{
                    //go to right tree
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = tempNode;
                        return;
                    }
                }
            }
        }
    }

    public void displayTree(Node root){
        //display as tree format

        if(root != null){
            System.out.println(root.data);
            if(root.leftChild != null){
                System.out.print("L" + root.leftChild.data + " ");
            }
            if(root.rightChild != null){
                System.out.print("R" + root.rightChild.data);
            }
            System.out.println();
            displayTree(root.leftChild);
            displayTree(root.rightChild);
        }

    }

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(2);
        tree.insert(8);
        tree.insert(12);
        tree.insert(17);
        tree.displayTree(tree.root);
    }
}
