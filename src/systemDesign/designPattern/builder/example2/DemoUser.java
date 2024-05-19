package systemDesign.designPattern.builder.example2;

public class DemoUser {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("101")
                .setUserName("ahmed-bulbul")
                .setEmailId("bulbul@gmail.com")
                .build();

        System.out.println(user);

    }

}
