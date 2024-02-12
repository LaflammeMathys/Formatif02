package formatif2.exeptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CercleTest {

    private Cercle c1 ;

    private Cercle c2;
    private Cercle cnull;
    private Cercle cMIN ;
    private Cercle cMAX;
    @BeforeEach
    void setUp() {
        init();
    }

    private void init() {
        c1 = new Cercle(5);
        c2 = new Cercle(7);
        cnull = null;
        cMIN = new Cercle(Cercle.MIN_VAL);
        cMAX = new Cercle(Cercle.MAX_VAL);

    }

    @Test
    void testEquals() {
        assertTrue(c2.equals(new Cercle(7)));
        assertFalse(cMAX.equals(cMIN));
        assertFalse(cMAX.equals(cnull));
        c2.setCouleur("bleu");
        assertFalse(c2.equals(new Cercle(7)));
    }

    @Test
    void getCouleur() {
        c1.setCouleur("bleu");
        assertEquals(c1.getCouleur(),"bleu");
    }

    @Test
    void calculerSurface() {
        assertEquals(78,c1.calculerSurface());
        assertEquals(153,c2.calculerSurface());
        assertEquals(3,cMIN.calculerSurface());
        assertEquals(2827,cMAX.calculerSurface());
    }

    @Test
    void rayonEstValide() {
        assertFalse(c2.rayonEstValide(35));
        assertTrue(c2.rayonEstValide(1));
        assertTrue(c2.rayonEstValide(30));

    }

    @Test
    void setCouleur() {
        c1.setCouleur("bleu");
        assertEquals(c1.getCouleur(),"bleu");
        assertThrows(FormeExeption.class, () -> {
            c2.setCouleur("magenta");
        });
    }

    @Test
    void couleurEstValide() {
        assertFalse(c2.couleurEstValide("magenta"));
        assertTrue(c2.couleurEstValide("          BLEU                 "));
    }

    @Test
    void testToString() {
        assertEquals(c1.toString(),"Cercle vert 5");
    }

    @Test
    void getRayon() {
        assertEquals(c1.getRayon(),5);
    }

    @Test
    void getNom() {
    }

    @Test
    void setRayon() {
        c1.setRayon(9);
        assertEquals(c1.getRayon(),9);
        assertThrows(FormeExeption.class, () -> {
            c2.setRayon(-10);
            c2.setRayon(70);
        });
    }

    @Test
    void calculerPerimetre() {
        assertEquals(31,c1.calculerPerimetre());
        assertEquals(43,c2.calculerPerimetre());
        assertEquals(6,cMIN.calculerPerimetre());
        assertEquals(188,cMAX.calculerPerimetre());
    }
}