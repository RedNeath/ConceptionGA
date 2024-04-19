import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ActionTest {
    @Test
    public void testSetButton() {
        // On crée deux actions et un bouton.
        // On va ensuite attacher le bouton à une première action et vérifier
        // qu'il s'est bien rattaché à notre action de lui-même.
        // Enfin, on va l'attacher à une deuxième, puis vérifier qu'il s'est
        // rattaché à notre action, et que la première action n'y est elle-même
        // plus attachée.

        Button button = new Button(); // Bouton seul, sans attache

        Action firstAction = new Action();
        Action secondAction = new Action();

        // Première vérification des attaches :
        assertNull(button.getAction());
        assertNull(firstAction.getButton());
        assertNull(secondAction.getButton());

        firstAction.setButton(button);

        // A nouveau, vérification des attaches :
        assertEquals(firstAction, button.getAction());
        assertEquals(button, firstAction.getButton());
        assertNull(secondAction.getButton());

        secondAction.setButton(button);

        // Et la dernière vérification :
        assertEquals(secondAction, button.getAction());
        assertNull(firstAction.getButton());
        assertEquals(button, secondAction.getButton());
    }
}
