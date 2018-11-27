package Chained_HashTables;



public class Main {
    public static void main(String[] args) {

        Employee jane=  new Employee( "Jane","John",123 ) ;
        Employee john=   new Employee( "John","Doe",456  );
        Employee mary=   new Employee( "Mary" ,"Smith",22 );
        Employee mike=  new Employee( "Mike","Wilson" ,3264 );
        Employee bill=new Employee( "Bill","End" ,22 );


        ChainedHashtable hashTable=new ChainedHashtable();

        hashTable.put( "john",jane );
        hashTable.put( "doe",john );
        hashTable.put( "smith" , mary );
        hashTable.put( "wilson",mike );
        hashTable.put( "end",bill );

        hashTable.printHashtable();;

        System.out.println(hashTable.get( "end" ));
    }
}
