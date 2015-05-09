import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andousadayoshi on 15/05/09.
 */
public class ExprTest {

    @Test
    public void plusTest() {
        Expr expr = new Expr();
        assertEquals("1 + 1 = 2",expr.plus(1,1),2);
    }
}