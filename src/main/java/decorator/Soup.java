package decorator;

/**
 * 原味的汤
 */
public abstract class Soup {

    protected String description = "Unknown soup";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return "Soup{" +
                "description='" + description + '\'' +
                '}';
    }
}
