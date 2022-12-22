package Animals;
import static Validate.Validate.validateInteger;
import static Validate.Validate.validateString;
public class Herbivore extends Mammal {

    public Herbivore(String name, int age, String LivingEnvironment, int movementSpeed, String food) {
        super(name, age, LivingEnvironment, movementSpeed, food);
    }

    @Override
    public void eat() {
        System.out.println("Кушает: " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Спит на земле");
    }

    @Override
    public void go() {
        System.out.println("Перемещается по земле");
    }

    @Override
    public void walk() {
        System.out.println("гуляет");
    }

    public void pastiche() {
        System.out.println("Пасется");
    }
    @Override
    public String toString() {
        return "Herbivore{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnvironment='" + getLivingEnvironment()+ '\'' +
                ", movementSpeed=" + getMovementSpeed() +
                ", food=" + getFood() + '\'' +
                '}';

    }
}


