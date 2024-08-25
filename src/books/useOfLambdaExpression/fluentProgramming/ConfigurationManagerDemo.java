package books.useOfLambdaExpression.fluentProgramming;

public class ConfigurationManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager confManager = ConfigurationManager.make(configurationManager -> configurationManager
                .setUrl("production.mydatabase.com")
                .setUsername("ahmed.bulbul")
                .setPassword("bulbul123")
                .addRole("admin")
                .addRole("developer"));
        System.out.println(confManager);
    }
}
