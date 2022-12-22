package Animals;
import java.util.Objects;

import static Validate.Validate.validateInteger;
import static Validate.Validate.validateString;
public abstract class Mammal extends Animal {
    private final int movementSpeed;
    private String food;

    public Mammal(String name, int age, String livingEnvironment, int movementSpeed, String food) {
        super(name, age, livingEnvironment);
        this.movementSpeed = validateInteger(movementSpeed, 1);
        setFood(food);}


        public int getMovementSpeed() { return movementSpeed; }

        public String getFood() { return food; }

        public void setFood(String food) { this.food = validateString(food, "любая еда") ;}

        public abstract void walk();
}