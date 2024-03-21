package src2;

import java.util.Objects;
import java.util.Scanner;

public class MyLinkedList {


    public static Node createNewProduct(Node head, Product newProduct) {
        Node newNode = new Node (newProduct);
        head.next = newNode;
        return newNode;
    }

    public static void printList(Node head) {
        Node current = head;
        int i = 1;
        while (current != null) {
            System.out.print ("\nProduct " + i + current.product.toString ());
            current = current.next;
            i++;
        }
    }

    public static Node addFirstProduct(Node head, Product newProduct) {
        Node newNode = new Node (newProduct);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node addLastProduct(Node tail, Product newProduct) {
        Node newNode = new Node (newProduct);
        tail.next = newNode;
        return newNode;
    }


//    DELETE NODE
    public static Node deleteProduct(Node head, int ID) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current.product.getId() == ID) {
                if (previous == null) {
                    // If the matching node is the first node
                    head = current.next;
                } else {
                    // If the matching node is not the first node
                    previous.next = current.next;
                }
                System.out.println("Product with ID " + ID + " deleted.");
                return head;
            }

            // Move to the next node
            previous = current;
            current = current.next;
        }

        System.out.println("Product with ID " + ID + " not found.");
        return head;
    }

    //    SEARCH
    public static void searchProduct(Node head, String name) {
        Product product = null;
        Node current = head;
        int i = 0;
        while (current != null) {
            if (Objects.equals (current.product.getName (), name)) {
                i++;
                System.out.println ("Product "+ i +  current.product.toString ());
            }
            current = current.next;
        }

    }


//    SORT
public static Node sortASC(Node head) {
    if (head == null || head.next == null) {
        return head;
    }

    boolean wasChanged;

    do {
        Node current = head;
        Node previous = null;
        Node next = head.next;
        wasChanged = false;

        while (next != null) {
            if (current.product.getPrice() > next.product.getPrice()) {
                wasChanged = true;

                if (previous != null) {
                    Node sig = next.next;

                    previous.next = next;
                    next.next = current;
                    current.next = sig;
                } else {
                    Node sig = next.next;

                    head = next;
                    next.next = current;
                    current.next = sig;
                }

                previous = next;
                next = current.next;
            } else {
                previous = current;
                current = next;
                next = next.next;
            }
        }
    } while (wasChanged);

    return head;
}

    /*    ------------------------------------------------MAIN------------------------------------------------------------*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter number product\n...");
        int numberProduct = scanner.nextInt ();
        scanner.nextLine ();

        System.out.println ("ADD PRODUCT TO LINKED LIST");
//        Enter product information
        System.out.println ("Enter ID, Name Product, Price\n...");
        int id = scanner.nextInt ();
        scanner.nextLine ();
        String name = scanner.nextLine ();
        double price = scanner.nextDouble ();
        Product product = new Product (id, name, price);

//        create first product
        Node firstProduct = new Node (product);
        Node lastProduct = firstProduct;

        /*---------------------------------------------MAIN FUNCTION--------------------------------------------------*/


//        CREATE NODE
        for (int i = 1; i < numberProduct; i++) {
            System.out.println ("Enter ID, Name Product, Price\n...");
            id = scanner.nextInt ();
            scanner.nextLine ();
            name = scanner.nextLine ();
            price = scanner.nextDouble ();
            Product product1 = new Product (id, name, price);
            lastProduct = createNewProduct (lastProduct, product1);
        }


//        PRINT NODE
        System.out.println ("PRINT LINKED LIST");
        printList (firstProduct);




        boolean check = true;
        while (check != false) {
            System.out.println ("\nEnter to chose function");
            System.out.println ("Enter 0 to exit function");
            System.out.println ("Enter 1 to add product to head node");
            System.out.println ("Enter 2 to add product to tail node");
            System.out.println ("Enter 3 to delete product");
            System.out.println ("Enter 4 to search by name");
            System.out.println ("Enter 5 to sort by price");
            System.out.println ("Enter 6 to print list");
            int choice = scanner.nextInt ();
            switch (choice) {
                case 1:
//                    ADD FIRST
                    System.out.println ("Enter ID, Name Product, Price\n...");
                    id = scanner.nextInt ();
                    scanner.nextLine ();
                    name = scanner.nextLine ();
                    price = scanner.nextDouble ();
                    Product product1 = new Product (id, name, price);
                    firstProduct = addFirstProduct (firstProduct, product1);

                    System.out.println ("Product after adding to head");
                    printList (firstProduct);
                    break;

                case 2:
//                    ADD TAIL
                    System.out.println ("Enter ID, Name Product, Price\n...");
                    id = scanner.nextInt ();
                    scanner.nextLine ();
                    name = scanner.nextLine ();
                    price = scanner.nextDouble ();
                    Product product2 = new Product (id, name, price);
                    lastProduct = addLastProduct (lastProduct, product2);

                    System.out.println ("Product after adding to tail");
                    printList (firstProduct);
                    break;

                case 3:
                    System.out.println("Enter the ID of the product to delete\n...");
                    int deleteID = scanner.nextInt();
                    firstProduct = deleteProduct(firstProduct, deleteID);

                    System.out.println("Product after deletion:");
                    printList(firstProduct);
                    break;

                case 4:
                    scanner.nextLine ();
                    System.out.println ("Enter name to search\n...");
                    String nameToSearch = scanner.nextLine ();
                    searchProduct (firstProduct, nameToSearch);

                    break;

                case 5:
                    firstProduct = sortASC (firstProduct);
                    break;

                case 6:
                    printList (firstProduct);
                    break;
                case 0:
                    check = false;
                    System.out.println ("Exit function");
                    break;
            }
        }
    }
}
