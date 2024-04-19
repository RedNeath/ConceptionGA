import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ButtonTest {
    @Test
    public void testSetAction() {
        // On crée deux boutons et une action.
        // On va ensuite attacher l'action à un premier bouton et vérifier
        // qu'il s'est bien rattachéé à notre bouton de lui-même.
        // Enfin, on va l'attacher à un deuxième, puis vérifier qu'elle s'est
        // rattachée à notre bouton, et que le premier bouton n'y est lui-même
        // plus attaché.

        Action action = new Action(); // Action seule, sans attache

        Button firstButton = new Button();
        Button secondButton = new Button();

        // Première vérification des attaches :
        assertNull(action.getButton());
        assertNull(firstButton.getAction());
        assertNull(secondButton.getAction());

        firstButton.setAction(action);

        // A nouveau, vérification des attaches :
        assertEquals(firstButton, action.getButton());
        assertEquals(action, firstButton.getAction());
        assertNull(secondButton.getAction());

        secondButton.setAction(action);

        // Et la dernière vérification :
        assertEquals(secondButton, action.getButton());
        assertNull(firstButton.getAction());
        assertEquals(action, secondButton.getAction());
    }
}
