package formatif01;

public class etudiant {

    public etudiant(String DA, String PrenomNom, Float Note){
        setDA(DA);
        setNote(Note);
        setPrenomNom(PrenomNom);
    }
    private String DA;
    private Float Note;
    private String PrenomNom;

    public String getDA() {
        return DA;
    }

    public void setDA(String DA) {
        if (valideDA(DA)){
            this.DA = DA;
        }

    }

    public boolean valideDA(String DA) {
        boolean b;
        b = DA.length() == 7;
            if (!b){
                throw new RuntimeException("Donné invalide");
            }
        Integer.parseInt(DA);


        return b;
    }
    public void setNote(Float Note){
        if (valideNote(Note)){
            this.Note=  Note;

        }
    }

    private boolean valideNote(Float note) {
        boolean b;
        b= 0 <= note && note <= 100;
        if (!b){
            throw new RuntimeException("Donné invalide");
        }
        return b;
    }
    public void setPrenomNom(String PrenomNom){
        if (validePrenomNom(PrenomNom)){
            this.PrenomNom = PrenomNom;

        }
    }

    private boolean validePrenomNom(String prenomNom) {
        boolean b ;
        for (int i = 0; i < prenomNom.length(); i++) {
            if (Character.isDigit(prenomNom.charAt(i))){
                throw new RuntimeException("Donné invalide");
            }
        }
        b = prenomNom.isEmpty();
        if (b){
            throw new RuntimeException("Donné invalide");
        }
        return b;

    }

    public String getPrenomNom() {
        return PrenomNom;
    }

    public Float getNote() {
        return Note;
    }

    @Override
    public String toString() {
        return DA + ';' + PrenomNom + ';' + Note + '\n';
    }
}
