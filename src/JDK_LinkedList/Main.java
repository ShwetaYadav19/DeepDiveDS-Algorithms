package JDK_LinkedList;


import DoublyLinkedList.EmployeeDoublyLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Employee jane=new Employee( "Jane","John",123 );
      Employee john=new Employee( "John","Doe",456 );
      Employee mary=new Employee( "Mary" ,"Smith",22  );
        Employee mike=new Employee( "Mike","Wilson" ,3264 );
        Employee bill=new Employee( "Bill","Andy" ,78 );


        LinkedList<Employee>  list=new LinkedList<>();
        list.addFirst( jane );
        list.addFirst( john );
        list.addFirst(mary  );
        list.addFirst( mike );
        list.add( bill );

       // System.out.println(list.toString());

        Iterator iter=list.iterator();
        System.out.print("Head->");
        while(iter.hasNext()){
            System.out.print(iter.next());
            System.out.print("<=>");
        }

        System.out.print("null");
        



    }
}
