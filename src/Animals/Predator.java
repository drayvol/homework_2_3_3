package Animals;

public class Predator extends Mammal{
    public Predator(String name, int age, String LivingEnvironment, int movementSpeed, String food) {
        super(name, age, LivingEnvironment, movementSpeed, food);
    }
    @Override
    public void eat() {System.out.println("Кушает: " + getFood());}

    @Override
    public void sleep() {System.out.println("Спит в пещере");}

    @Override
    public void go() {System.out.println("Перемещается шагом и бегом");}

    @Override
    public void walk() { System.out.println("гулять любит средне");}

    public void hunting() {System.out.println("Охотится на других животных");}
    @Override
    public String toString() {
        return "Predator{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnvironment='" + getLivingEnvironment()+ '\'' +
                ", movementSpeed=" + getMovementSpeed() +
                ", food=" + getFood() + '\'' +
                '}';

    }
}
