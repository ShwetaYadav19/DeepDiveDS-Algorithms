package Queue;



public class QueueMain {
    public static void main(String[] args) {

        Employee jane=  new Employee( "Jane","John",123 ) ;
        Employee john=   new Employee( "John","Doe",456  );
        Employee mary=   new Employee( "Mary" ,"Smith",22 );
        Employee mike=  new Employee( "Mike","Wilson" ,3264 );
        Employee bill=new Employee( "Bill","End" ,22 );

        ArrayQueue queue=new ArrayQueue( 10 );
        queue.add( jane );
        queue.add( john );
        queue.add( mary );
        queue.add( mike );
       queue.add( bill );

       //queue.printQueue();
  
       queue.remove();
       queue.remove();
        queue.remove();queue.remove();
        queue.remove();
//queue.remove();
        queue.add( mike );


       //queue.printQueue();



        queue.printQueue();

    }
}
