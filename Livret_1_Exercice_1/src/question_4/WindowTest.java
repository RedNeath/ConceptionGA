package question_4;

import base.Field;
import base.Window;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class WindowTest {
    private Window window;

    @Before
    public void setUp() {
        this.window = new Window();
    }

    @Test
    public void testAdd() {
        Field field = new Field();
        this.window.add(field);

        /*
         * NOTE :
         * Dans un vrai test unitaire, on aurait utilisé la Reflection pour accéder directement
         * à l'attribut privé `widgets` de window, et ainsi ne pas faire dépendre le test de la
         * méthode `contains` de window.
         */
        assertTrue(this.window.contains(field));
    }
}
