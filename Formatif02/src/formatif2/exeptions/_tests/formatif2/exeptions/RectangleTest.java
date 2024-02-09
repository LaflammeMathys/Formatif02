package formatif2.exeptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle r1 ;
    private Rectangle rnull;
    private Rectangle rMIN ;
    private Rectangle rMAX;



    @BeforeEach
    void setUp() {
        init();
    }

    private void init() {
        r1 = new Rectangle(5,5);
        rnull = null;
        rMIN = new Rectangle(Rectangle.MIN_VAL,Rectangle.MAX_VAL);
    }

    @Test
    void constructeur_instencieQueDesRectanglesValides() {
        assertEquals(rMIN, new Rectangle(Rectangle.MIN_VAL,Rectangle.MIN_VAL).getLargeur());
    }
    @Test

    void calculerSurface() {
    }

    @Test
    void getLargeur() {
    }

    @Test
    void getCouleur() {
    }

    @Test
    void calculerPerimetre() {
    }

    @Test
    void getHauteur() {
    }

    @Test
    void testToString() {
    }

    @Test
    void getNom() {
    }

    @Test
    void testEquals() {
    }
}