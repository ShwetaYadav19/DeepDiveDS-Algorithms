package JDK_Hashtable;

import JDK_Hashtable.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Employee jane=  new Employee( "Jane","John",123 ) ;
        Employee john=   new Employee( "John","Doe",456  );
        Employee mary=   new Employee( "Mary" ,"Smith",22 );
        Employee mike=  new Employee( "Mike","Wilson" ,3264 );
        Employee bill=new Employee( "Bill","End" ,22 );

        Map<String, Employee> hashmap=new HashMap<>(  );
        hashmap.put( "john" ,jane);
        hashmap.put( "doe",john );
        hashmap.put( "smith",mary );
        hashmap.put( "wilson",mike );

        Iterator<Employee> iterator=hashmap.values().iterator();

        while( iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
