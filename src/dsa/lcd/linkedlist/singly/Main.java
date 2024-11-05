package dsa.lcd.linkedlist.singly;

import java.util.Scanner;

public class Main {

    public static void printMenu(){
        System.out.println("************MENU*************");
        System.out.println("ENTER 1 TO INSERT");
        System.out.println("ENTER 2 TO DELETE");
        System.out.println("ENTER 3 TO SEARCH");
        System.out.println("ENTER 4 TO DISPLAY");
        System.out.println("ENTER 5 TO EXIT");
        System.out.println("Enter your choice??");
        System.out.println("************************");
    }

    public static void printInsertMenu(){
        System.out.println("Press 1 to insert from HEAD");
        System.out.println("Press 2 to insert from TAIL");
        System.out.println("Press 3 to insert at specific position");
    }

    public static void printDeleteMenu(){
        System.out.println("Press 1 to delete from HEAD");
        System.out.println("Press 2 to delete from TAIL");
        System.out.println("Press 3 to delete at specific position");
    }

    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.insertAtBeginning(12);
//        linkedList.insertAtEnd(13);
//        linkedList.insertAtEnd(908);
//        linkedList.insertAtPosition(10,2);
//
//        linkedList.printData();

        System.out.println("***********Welcome to linked-list app********");
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                printMenu();
                //read the choice
                int choice = scanner.nextInt();
                if(choice == 1){
                    //insert
                    insertLinkedList(linkedList);
                    
                } else if (choice==2) {
                    //delete
                    deleteFromLinkedList(linkedList);
                }else if (choice==3) {
                    //search
                    System.out.println("Enter the data you want to search");
                    int data = scanner.nextInt();
                    boolean result = linkedList.searchData(data);
                    if(result){
                        System.out.println("Yes data is present ");
                    }else{
                        System.out.println("Data is not present");
                    }

                } else if (choice == 4) {
                    //display
                    linkedList.printData();
                } else if (choice == 5){
                    //exit
                    System.out.println("Thank you for using app");
                    break;
                }else {
                    System.out.println("Invalid choice");
                }


            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    private static void insertLinkedList(LinkedList linkedList) {
        printInsertMenu();
        System.out.println("Enter choice ??");
        Scanner scanner = new Scanner(System.in);
        int insertChoice = scanner.nextInt();
        if(insertChoice == 1){
            System.out.println("Insert your data");
            int data = scanner.nextInt();
            linkedList.insertAtBeginning(data);
            System.out.println("Success");
        } else if (insertChoice == 2) {
            System.out.println("Enter your data");
            int data = scanner.nextInt();
            linkedList.insertAtEnd(data);
        } else if (insertChoice == 3) {
            System.out.println("Enter your position");
            int position = scanner.nextInt();
            System.out.println("Enter your data");
            int data = scanner.nextInt();
            linkedList.insertAtPosition(data,position);
        }else{
            System.out.println("Invalid choice !!");
        }
    }

    private static void deleteFromLinkedList(LinkedList linkedList) {
        printDeleteMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter delete Choice ??");
        int deleteChoice = scanner.nextInt();
        if(deleteChoice == 1){
            linkedList.deleteFirst();
            System.out.println("Deleted !!");
        } else if (deleteChoice == 2) {
            linkedList.deleteLast();
            System.out.println("Deleted !!");
        } else if (deleteChoice==3) {
            System.out.println("Enter the position :");
            int position = scanner.nextInt();
            linkedList.deleteFromPosition(position);
            System.out.println("Deleted !!");
        }else{
            System.out.println("Invalid delete choice");
        }
    }
}
