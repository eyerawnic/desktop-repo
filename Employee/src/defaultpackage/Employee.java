package defaultpackage;
class Employee{
    private int eid;
    private String name;
    private int sal;
    private String branch;

    public Employee(int eid){
        super();
        this.eid = eid;
    }

    // constructor chaining 

    public Employee(int eid,String name){
        this(eid);
        this.name = name;
    }

    public Employee(int eid,String name,int sal){
        this(eid,name);
        this.sal = sal;
    }

    public Employee(int eid,String name, int sal, String branch){
        this(eid,name,sal);
        this.branch = branch;
    }

    public static void main(String args[]){
        System.out.println("constructor chaining");
    }
}