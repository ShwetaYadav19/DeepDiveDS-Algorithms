package HashTables_Challenge;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        Map<Integer,Employee> employeeTable=new HashMap(  );
        System.out.println("List of employees with duplicates is :");
        employees.forEach(e -> System.out.println(e));

        ListIterator<Employee>  iterator=employees.listIterator();
        List<Employee> remove=new ArrayList<>(  );

        while(iterator.hasNext()){
            Employee employee=iterator.next();

            if(employeeTable.containsKey( employee.getId() )){
                 remove.add( employee );
            } else{
                employeeTable.put( employee.getId(),employee );
            }
        }

        for(Employee e:remove){
            employees.remove(e);
        }
        System.out.println("List of employees without duplicate is: ");
      employeeTable.forEach( (s,e) -> System.out.println(e) );
/*
        int[] nums = new int[10];
        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
        for (int i = 0; i < numsToAdd.length; i++) {
            nums[hash(numsToAdd[i])] = numsToAdd[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }*/
    }

    public static int hash(int value) {

        return Math.abs(value)%10;
    }

}
