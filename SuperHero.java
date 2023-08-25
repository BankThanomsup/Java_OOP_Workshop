abstract class SuperHero {
    private String name;
    private String age;
    private String job;

    //method
    public void setName(String name) {
        this.name=name;
    }
    public void setAge(String age) {
        this.age=age;
    }
    
    
    public void display(){
        System.out.println("Name = " + this.name);
        System.out.println("Age = " + this.age);
    }
    public abstract void skill(String skill);
}
