package DoublyLinkedList;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private  EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node=new EmployeeNode( employee );


        if(head==null){
            tail=node;
        }
        else {
            head.setPrevious( node );
            node.setNext( head );
        }
        head=node;
        size++;
    }
    public void addToEnd(Employee employee){
        EmployeeNode node=new EmployeeNode( employee );
        if(tail==null){
           head=node;
        } else {
            tail.setNext( node );
            node.setPrevious( tail );
        }
        tail=node;
        size++;
    }

    public boolean addBefore(Employee newEmployee, Employee beforeEmployee){
        EmployeeNode newEmployeeNode=new EmployeeNode( newEmployee );
        EmployeeNode beforeEmployeeNode=new EmployeeNode( beforeEmployee );
        EmployeeNode current=head;
        boolean flag=true;

        while( ! current.getEmployee().getFirstName().equals( beforeEmployeeNode.getEmployee().getFirstName())
                && current !=null){
            current=current.getNext();
        }
        beforeEmployeeNode=current;
        if(current==null){
            flag=false;
            return false;
        }

        if(beforeEmployeeNode.getPrevious()==null){
            head=newEmployeeNode;
        }else {
            beforeEmployeeNode.getPrevious().setNext( newEmployeeNode );
            newEmployeeNode.setPrevious( beforeEmployeeNode.getPrevious() );
        }
        newEmployeeNode.setNext( beforeEmployeeNode );
        beforeEmployeeNode.setPrevious( newEmployeeNode );
        return flag;

    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }

       EmployeeNode removeNode=head;

        if(head.getNext()==null){
            tail=null;
        }
        else {
            head.getNext().setPrevious(null);
        }
        head=head.getNext();
        size--;
        return removeNode;
    }

    public EmployeeNode removeFromEnd(){

        if(isEmpty()){
            return null;
        }
        EmployeeNode removeNode=tail;

        if(tail.getPrevious()== null){
            head=null;
        }
        else {
            tail.getPrevious().setNext( null );
        }
        tail=tail.getPrevious();
        size--;
        removeNode.setPrevious( null );
        return removeNode;
    }

    public int getSize(){
        return size;

    }

    public boolean isEmpty(){
        return this.head==null;
    }

    public  void printList (){
        EmployeeNode current=head;
        System.out.print("Head -->");
        while(current!=null){

            System.out.print(current.getEmployee().getFirstName());
            System.out.print("<-->");
            current=current.getNext();
        }
        System.out.print("-->null");
    }


}
