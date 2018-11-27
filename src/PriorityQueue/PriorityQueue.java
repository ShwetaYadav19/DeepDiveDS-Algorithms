package PriorityQueue;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> pq= new java.util.PriorityQueue<Integer>();//Uses Min Heap

        pq.add(25);
        pq.add( -22 );
        pq.add(1343);
        pq.add( 54 );
        pq.add( 0 );
        pq.add( -3492 );
        pq.add( 429 );

        System.out.println(pq.peek());

        pq.remove( );

        System.out.println(pq.peek());

        System.out.println(pq.poll());

        System.out.println(pq.peek());
    }
}
