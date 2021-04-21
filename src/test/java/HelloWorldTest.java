import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest
{
    @Test
    public void isWelcomeMessageCorrect()
    {
        String welcomeMessage = HelloWorld.welcomeMessage();
        Assertions.assertEquals(welcomeMessage,"Welcome to the DNTP at Murex");
    }
}