class Employee {
//Attributes
    private String id;
    private String name;
    private Double Salary;

    //Default Constructor
    public Employee(){
    
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
        System.out.println("ID = " + this.id);
        System.out.println("Name = " + this.name);
        System.out.println("ID = " + this.Salary);
    }
    public String getName() {
        return this.name ;
    }
    public Double getSalary() {
        return this.Salary;
    }
    }

    
