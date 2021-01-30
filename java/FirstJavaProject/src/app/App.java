package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        MyCustomLinkedList list = new MyCustomLinkedList();
        list.displayList();

        list.insertNode(new MyNode(1));
        list.insertNode(new MyNode(2));
        list.insertNode(new MyNode(3));
        list.deleteNode(22);
        list.deleteNode(3);
        list.displayList();
    }
}

class MyNode{
    Object data;
    MyNode next;
    MyNode previous;

    public MyNode(){
        this.data = 0;
        this.next = null;
        this.previous = null;
    }
    public MyNode(Object nodeData){
        this.data = nodeData;
        this.next = null;
        this.previous = null;
    }
}

class MyCustomLinkedList{
    MyNode headNode;
    Integer listLength;
    MyNode currentNode;

    public MyCustomLinkedList (){
        this.headNode = null;
        this.listLength = 0;
        this.currentNode = null;
    }

    public void insertNode(MyNode node){
        if (null == this.headNode){
            System.out.println("List Empty : Inserting First Node");
            this.headNode = node;
            this.currentNode = node;
        }
        this.currentNode.next = node;
        node.previous = this.currentNode;
        this.currentNode = node;
    }

    public void deleteNode(Object data){
        if (null == this.headNode){
            System.err.println("Cannot delete Node: List is Empty");
            return;
        }
        MyNode tempNode = this.headNode;
        while (null != tempNode){
            if (tempNode.data == data){
                System.out.println("Matching Node Found");
            }
            tempNode = tempNode.next;
        }
    }

    public void displayList(){
        if (null == this.headNode){
            System.out.println("List is Empty !");
            return;
        }
        MyNode tempNode = this.headNode;
        System.out.println("------------");
        while(null != tempNode){
            System.out.print(tempNode.data + " <--> ");
            tempNode = tempNode.next;
        }
        System.out.print("X");
    }
}