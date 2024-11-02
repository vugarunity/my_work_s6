public class Greeter {
    private GreetingStrategy greetingStrategy;

    public void setGreetingStrategy(GreetingStrategy greetingStrategy) {
        this.greetingStrategy = greetingStrategy;
    }

    public String greet() {
        if (greetingStrategy == null) {
            return "Greeting strategy not set.";
        }
        return greetingStrategy.greet();
    }
}
