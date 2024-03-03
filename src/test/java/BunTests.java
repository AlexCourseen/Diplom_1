import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;

@RunWith(MockitoJUnitRunner.class)
public class BunTests {

    @Mock
    Bun bun;

    @Test
    public void checkBunGetName() {
        bun = new Bun("Bulka", 5);
        String bunName = "Bulka";
        Assert.assertEquals(bunName, bun.getName());
    }

    @Test
    public void checkBunGetPrice() {
        bun = new Bun("Bulka2", 5.6F);
        float bunPrice = 5.6F;
        Assert.assertEquals(bunPrice, bun.getPrice(),0F);
    }
}
