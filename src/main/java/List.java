import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a =0;
        ImplementList list = new ImplementList();
        while(a!=-1)
        {
            System.out.println("Enter 1 to Add element to the list");
            System.out.println("Enter 2 to Remove element from the list");
            System.out.println("Enter 3 to Find index of element in the list");
            System.out.println("Enter 4 to Print the list");
            System.out.println("Enter -1 to exit the program");
            a = sc.nextInt();
            switch (a)
            {
                case 1 :
                    System.out.println("Enter element to be inserted in the list");
                    list.addElement(sc.nextInt());
                    break;
                case 2 :
                    System.out.println("Enter the element to be removed from the list");
                    list.removeElement(sc.nextInt());
                    break;
                case 3:System.out.println("Enter 1 to add element to list");
                    System.out.println("Enter element to find its index");
                    int index = list.getIndex(sc.nextInt());
                    if(index>=0)
                        System.out.println("Element is at "+index+" in the list");
                    else
                        System.out.println("Element is not present in the list");
                    break;
                case 4:
                    System.out.println("Elements in the list are ");
                    list.print();
                    break;
                case -1:
                    break;

            }

        }
    }
}





