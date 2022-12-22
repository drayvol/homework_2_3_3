package Animals;
import static Validate.Validate.validateInteger;
import static Validate.Validate.validateString;
public abstract class Bird extends Animal {
    private final String typeArea;

    public Bird(String name, int age, String livingEnvironment, String typeMovement) {
        super(name,age, livingEnvironment);
        this.typeArea = validateString(typeMovement, "tropics");
    }

        public String getTypeArea() { return typeArea; }

        abstract public void hunting();
}