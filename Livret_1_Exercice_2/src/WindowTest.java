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
        this.window.getDelegateFields().add(field);

        /*
         * NOTE :
         * Dans un vrai test unitaire, on aurait utilisé la Reflection pour accéder directement
         * aux attributs privés `fields` de window puis `fields` de delegate handler, et ainsi
         * ne pas faire dépendre le test des méthodes `getDelegateFields` de window et `contains`
         * de delegate handler.
         */

        /*
         * AUTRE NOTE :
         * Ce test n'a plus vraiment de sens. A moins qu'on rajoute une méthode `add` à nouveau dans
         * window, puisqu'on est en train de tester une méthode d'une autre classe dans le test pour
         * une classe en particulier.
         */
        assertTrue(this.window.getDelegateFields().contains(field));
    }
}
