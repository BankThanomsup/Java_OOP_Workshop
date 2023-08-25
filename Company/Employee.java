package Company;
class Employee {
//Attributes
    private String id;
    private String name;
    private Double Salary;

    //Static Attributes
    static int minSalary =12000;
    //Default Constructor
    public Employee() {
        System.out.println("I'm employee");
    }
    

    public Employee(String name, Double Salary){
        this.name = name;
        this.Salary = Salary;
        displayEmployee();
    }
    //Method
    public void setID(String id) {
        this.id=id ;

    }
    public void setName(String name) {
        this.name=name ;
    }
    public void setSalary(Double Salary) {
        this.Salary=Salary;

    }

    public void displayEmployee(){
        
        System.out.println("Name = " + this.name);
        System.out.println("Salary = " + this.Salary);
        
    }
    public String getName() {
        return this.name ;
    }
    public Double getSalary() {
        return this.Salary;
    }
    public void bonus(){
        System.out.println("Show Bonus Employee");
    }

    
    }

    
