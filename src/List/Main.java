package List;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
       List<Employee> employeeList=new ArrayList<>();
        //List<Employee> employeeList=new Vector<>();
       employeeList.add( new Employee( "Jane","John",123 ) );
       employeeList.add( new Employee( "John","Doe",456 ) );
       employeeList.add(new Employee( "Mary" ,"Smith",22 ));
       employeeList.add( new Employee( "Mike","Wilson" ,3264 ) );

       employeeList.forEach( employee -> System.out.println( employee ));

        System.out.println( employeeList.contains( new Employee( "John","Doe",456  ) ));

    employeeList.remove( 3 );
        employeeList.forEach( employee -> System.out.println( employee ));

    }
}
