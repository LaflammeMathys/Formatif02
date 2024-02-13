import formatif2.exeptions.FormeExeption;
import formatif2.formes.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle r1 ;

    private Rectangle r2;
    private Rectangle rnull;
    private Rectangle rMIN ;
    private Rectangle rMAX;
    private Rectangle rMOY;



    @BeforeEach
    void setUp() {
        init();
    }

    private void init() {
        r1 = new Rectangle(5,5);
        r2 = new Rectangle(7,5);
        rnull = null;
        rMIN = new Rectangle(Rectangle.MIN_VAL,Rectangle.MIN_VAL);
        rMAX = new Rectangle(Rectangle.MAX_VAL,Rectangle.MAX_VAL);
        rMOY = new Rectangle(Rectangle.MIN_VAL,Rectangle.MAX_VAL);
    }

    @Test
    void constructeur_instencieQueDesRectanglesValides() {
        assertEquals(rMIN, new Rectangle(Rectangle.MIN_VAL,Rectangle.MIN_VAL));
        assertEquals(rMAX, new Rectangle(Rectangle.MAX_VAL,Rectangle.MAX_VAL));

        assertThrows(FormeExeption.class,()-> {
            new Rectangle(Rectangle.MIN_VAL - 1,Rectangle.MIN_VAL - 1);
        });
        assertThrows(FormeExeption.class, () -> {
            new Rectangle(Rectangle.MAX_VAL + 1,Rectangle.MAX_VAL + 1);
        });

    }

    @Test
    void getSurface_retourneLaBonneSurfaceDuRectangle() {
        assertEquals(25, r1.calculerSurface());
        assertEquals(35, r2.calculerSurface());

        assertEquals(Rectangle.MIN_VAL * Rectangle.MIN_VAL, rMIN.calculerSurface());
        assertEquals(Rectangle.MAX_VAL * Rectangle.MAX_VAL, rMAX.calculerSurface());
        assertEquals(Rectangle.MAX_VAL * Rectangle.MIN_VAL, rMOY.calculerSurface());
        assertEquals(Rectangle.MIN_VAL * Rectangle.MAX_VAL, rMOY.calculerSurface());
    }

    @Test
    void getCouleurRetourneBien() {
        assertEquals(r1.getCouleur(),"rouge");
    }

    @Test
    void estCouleurApprouveSeulementDesCouleursValdie() {
        assertThrows(FormeExeption.class, () -> {
            r1.setCouleur("magenta");
        });
        r2.setCouleur("bleu");
        assertEquals(r2.getCouleur(),"bleu");
    }


    @Test
    void testToString() {
        assertEquals(r1.toString(),"Rectangle rouge 5,5");

    }

    @Test
    void testEquals() {
        assertTrue(r2.equals(new Rectangle(5,7)));
        assertFalse(rMAX.equals(rMIN));
        assertFalse(rMAX.equals(rnull));
        r2.setCouleur("bleu");
        assertFalse(r2.equals(new Rectangle(7,5)));
        assertTrue(new Rectangle(10,3).equals(new Rectangle(6,5)));

    }

}