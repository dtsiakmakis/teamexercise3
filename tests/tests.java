import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Melanie on 11/12/2017.
 */
public class tests {
    Rectangle easy = new Rectangle(10, 10);


    @Test
    public void perimeter(){
        assertEquals(easy.getPerimeter(),40.0, 0.0);
    }
}
