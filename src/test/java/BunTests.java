import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;

@RunWith(MockitoJUnitRunner.class)
public class BunTests {

    @Test
    public void checkBunGetName() {
        Bun bun = new Bun("Bulka", 5);
        String bunName = "Bulka";
        Assert.assertEquals(bunName, bun.getName());
    }

    @Test
    public void checkBunGetPrice() {
        Bun bun = new Bun("Bulka2", 5.6F);
        float bunPrice = 5.6F;
        Assert.assertEquals(bunPrice, bun.getPrice(),0F);
    }
}
