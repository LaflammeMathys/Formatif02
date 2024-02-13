package Quiz1.forme;

import Quiz1.Couleur;
import Quiz1.TypeTriangle;

public class Triangle extends Forme {

    public Triangle(int coteA, int coteB, int coteC, Couleur couleur) {
        super(NOM,couleur);
        this.coteA = coteA;
        this.coteB = coteB;
        this.coteC = coteC;

    }

    private int coteA;
    private int coteB;
    private int coteC;
    public final static String NOM = "Triangle";

    public boolean coteEstValide(int cote){
        return true;
    }

    public boolean estIsometrique() {
        return true;
    }
    public boolean estRectangle(){
        return true;
    }
    public boolean estTriangle(){
        return true;
    }

    @Override
    public int calculerPerimetre() {
        return 0;
    }
    @Override
    public int calculerSurface() {
        return 0;
    }

    public int getCoteA() {
        return coteA;
    }

    public int getCoteB() {
        return coteB;
    }

    public int getCoteC() {
        return coteC;
    }
    public TypeTriangle getType(){
        return TypeTriangle.RECTANGLE;
    }



}
