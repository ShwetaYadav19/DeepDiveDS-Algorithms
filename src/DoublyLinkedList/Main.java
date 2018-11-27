package DoublyLinkedList;



public class Main {
    public static void main(String[] args) {
        Employee jane=new Employee( "Jane","John",123 );
      Employee john=new Employee( "John","Doe",456 );
      Employee mary=new Employee( "Mary" ,"Smith",22  );
        Employee mike=new Employee( "Mike","Wilson" ,3264 );
        Employee bill=new Employee( "Bill","Andy" ,78 );
        Employee shweta=new Employee( "Shweta","Yadav" ,63542 );

        EmployeeDoublyLinkedList employeeDoublyLinkedList=new EmployeeDoublyLinkedList();
        employeeDoublyLinkedList.addToFront( jane );
        employeeDoublyLinkedList.addToFront( john );

        employeeDoublyLinkedList.addToFront(mary );
        employeeDoublyLinkedList.addToFront( mike );
        employeeDoublyLinkedList.addToEnd( bill );

/*
    employeeDoublyLinkedList.removeFromFront();
        employeeDoublyLinkedList.printList();
        System.out.println();

        employeeDoublyLinkedList.removeFromEnd();
        employeeDoublyLinkedList.printList();
*/


        System.out.println(employeeDoublyLinkedList.addBefore( shweta,new Employee( "Henry" ,"beckham",234 )));
        employeeDoublyLinkedList.printList();



    }
}
