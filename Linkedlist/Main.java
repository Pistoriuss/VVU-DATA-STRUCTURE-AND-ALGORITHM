public class Main {
    public static void main(String[] args) {
        LinkedList lList = new LinkedList();


        //Add nodes to the list
        lList.addNode(8);
        lList.addNode(10);
        lList.addNode(12);
        lList.addNode(16);
        lList.addNode(9);
        lList.addNode(14);

        //Displays the nodes present in the list
        lList.display();

        lList.addAtStart(15);
        lList.display();

        //Displays the nodes present after 9 has been removed
        System.out.println("\nList After node 9 has been deleted");
        lList.deleteNode(9);
        lList.display();

        //Displays the list after inserting 30 after node 10
        System.out.println("\nList after inserting 30 after node 10");
        lList.insertAfter( lList.head.next.next, 30);
        lList.display();

        //Displays the list after inserting 45 at the end of the list
        lList.insertAtEnd(45);
        lList.display();


    }
}