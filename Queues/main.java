public class Main {

    public static void main(String[] args) {

        //creating an object of the class Queue
        Queue queue = new Queue();

        //INSERTING VALUES INTO QUEUE
        queue.enQueue("Corolaa");
        queue.enQueue("BMW");
        queue.enQueue("Benz");
        queue.enQueue("Audi");
        queue.enQueue("Mitsubishi");
        queue.enQueue("VW");

        //display welcome message
        System.out.println("-------------------------------------------");
        System.out.println("WELCOME TO HIGHWAY TOLL BOOTH. \nKindly pay your toll and remember to drive safely");
        System.out.println("-------------------------------------------\n");


        //DISPLAYING SIZE AND VALUES OF THE INITIAL QUEUE
        System.out.println("Initial number of car in the queue: " + queue.size());
        System.out.println("\nLIST OF CARS IN THE QUEUE: ");
        queue.displayQueue();
        System.out.println("\n");     //next line

        //DELETING ITEM FROM QUEUE AND DISPLAY
        System.out.println( queue.deQueue() + " pays toll and leaves toll booth\n");

        //DISPLAYING CURRENT SIZE OF QUEUE
        System.out.println("Current number of cars in queue " + queue.size());

        //DISPLAYING QUEUE AFTER ITEM IS DELETED IS FROM THE QUEUE
        System.out.println("\nLIST OF CARS LEFT IN QUEUE: ");
        queue.displayQueue();

        System.out.println("\n");   //next line
    }
}
