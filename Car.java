public class Car {
    public boolean turnKey(){
        return true;

    }

    public static void main(String[] args) {
        Car honda=new Car();
        honda.turnKey();
        System.out.println(honda.turnKey());
    }
}
