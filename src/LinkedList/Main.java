package LinkedList;

public class Main {
    public static void main(String[] args) {
        Employee jane=new Employee( "Jane","John",123 );
        Employee john=new Employee( "John","Doe",456 );
        Employee mary=new Employee( "Mary" ,"Smith",22  );
        Employee mike=new Employee( "Mike","Wilson" ,3264 );

        EmployeeLinkedList list=new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront( jane );
        list.addToFront( john );
        list.addToFront( mary );
        list.addToFront( mike );
        list.printList();

        System.out.println();
        System.out.println(list.isEmpty());
        list.removeFromFront();
        list.printList();
        System.out.println();
        System.out.println(list.getSize());
    }
}
