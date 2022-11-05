import org.assertj.core.api.SoftAssertions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CrocodileTest {
    Crocodile crocodile = new Crocodile();
    @BeforeEach
    public void setUp(){
      crocodile.setName("Jon");
      crocodile.setColor("green");
      crocodile.setLength(98);
      crocodile.setHungry(true);
      crocodile.setSize(90);
    }
    @AfterEach
    public void tearDown(){
        crocodile = null;
    }
    @Test
    public void test1ForCrocodile(){
        SoftAssertions softAssertions  = new SoftAssertions();
        softAssertions.assertThat(crocodile.getName()).isEqualTo("Paul");
        softAssertions.assertThat(crocodile.getSize()).isGreaterThan(100);
        softAssertions.assertThat(crocodile.getColor()).isEqualTo("green");
        softAssertions.assertThat(crocodile.getLength()).isEqualTo("male");
        softAssertions.assertThat(crocodile.getHungry()).isTrue();




        System.out.println(crocodile.getColor());
        System.out.println(crocodile.getColor());
        System.out.println(crocodile.getSize());
        System.out.println(crocodile.getLength());
        System.out.println(crocodile.getHungry());

    }

}
