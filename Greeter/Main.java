public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        
        greeter.setGreetingStrategy(new FormalGreeting());
        System.out.println(greeter.greet()); 

        
        greeter.setGreetingStrategy(new CasualGreeting());
        System.out.println(greeter.greet());

        
        greeter.setGreetingStrategy(new IntimateGreeting());
        System.out.println(greeter.greet()); 
        
        
        greeter.setGreetingStrategy(new DefaultGreeting());
        System.out.println(greeter.greet()); 
    }
}


// Принцип открытости/закрытости (OCP) и Принцип единственной ответственности (SRP).

// Каждый класс, реализует GreetingStrategy, отвечает за свою собственную логику приветствия.
// Класс Greeter открыт для расширения, но закрыт для модификации.