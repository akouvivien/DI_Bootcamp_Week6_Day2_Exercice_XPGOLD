public class FatherPanda {
    public boolean isPredator;
    protected int weight;
    private int age;
    
    public FatherPanda() {
        super();
    }
    public FatherPanda(int weight, int age) {
        super();
        this.weight = weight;
        this.age = age;
    }
    public void eat() {
        System.out.println("weight  "+this.weight);
        System.out.println("age in front of it  "+this.age);
        
    } 
}