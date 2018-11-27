package HashTables;

import HashTables.Employee;

public class HashTablesMain {

    public static void main(String[] args) {

        Employee jane=  new Employee( "Jane","John",123 ) ;
        Employee john=   new Employee( "John","Doe",456  );
        Employee mary=   new Employee( "Mary" ,"Smith",22 );
        Employee mike=  new Employee( "Mike","Wilson" ,3264 );
        Employee bill=new Employee( "Bill","End" ,22 );
        Employee andrew=new Employee( "Andrew","Endiston" ,390 );
        Employee polo=new Employee( "Polo","Angelicas" ,209 );
        Employee paul=new Employee( "Paul","WalkerStone" ,209 );

        SimpleHashTable hashTable=new SimpleHashTable();

        hashTable.put( "john",jane );
        hashTable.put( "doe",john );
        hashTable.put( "smith" , mary );
        hashTable.put( "wilson",mike );
        hashTable.put( "end",bill );


        hashTable.print();
        System.out.println("Retrieving employee : " +hashTable.get( "end" ));
        System.out.println("Remove Jane : " +hashTable.remove( "john" ));
        hashTable.print();
        System.out.println("Getting bill end"+hashTable.get( "end" ));

    }


}