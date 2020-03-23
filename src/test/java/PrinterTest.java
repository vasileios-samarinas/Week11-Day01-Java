import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before(){
        printer= new Printer(19);
    }

    @Test
    public void hasSheets(){
        assertEquals(19,printer.getSheets());
    }

    @Test
    public void print(){
        printer.print(5,2);
        assertEquals(9,printer.getSheets());
    }

    @Test
    public void hasEnoughPapers(){
        assertEquals(true,printer.enoughPapers(10));
    }

    @Test
    public void hasNotEnoughPapers(){
        assertEquals(false,printer.enoughPapers(20));
    }
}
