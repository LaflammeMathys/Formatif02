package formatif01;

import java.io.*;
import java.util.ArrayList;

public class listeEtudiant {
    public listeEtudiant(){

    }
    private static final char FILE_SEPARATOR = File.separatorChar;
    private static final String PATH_DEFAUT = System.getProperty("user.dir") + FILE_SEPARATOR + "_fichier" + FILE_SEPARATOR;
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    private ArrayList<etudiant> listeEtudiant;
    private String EtudiantString;
    private String[] listEtudiantString;

public String lireEtudiants(String nomFichier) {
    String contenuFichier = ""; //Devrait être un StringBuilder
    String ligne;

    try {
        BufferedReader entree = new BufferedReader(new FileReader(PATH_DEFAUT + nomFichier)); //Ouverture de fichier
        ligne = entree.readLine(); //lecture d'une ligne (vaut null si fin de fichier)
        while (ligne != null) { //Est-ce que je ne suis pas à la fin du fichier ?
            contenuFichier += ligne + "\n";
            ligne = entree.readLine(); //lecture d'une ligne
        }

    } catch (FileNotFoundException fileNotFoundException) {
        System.out.println(fileNotFoundException.getMessage());
    } catch (IOException ioException) {
        System.out.println(ioException.getMessage());
    }
    //System.out.println(contenuFichier);
    EtudiantString = contenuFichier;

    return contenuFichier;
}
    public void trier(){
        listEtudiantString = EtudiantString.split("[;\n]" );
        String listeValide = "";
        for (int i = 0; i < listEtudiantString.length - 3; i += 3) {
            try {
                etudiant e = new etudiant(listEtudiantString[i],listEtudiantString[i +1],Float.parseFloat(listEtudiantString[i + 2]));
                listeValide = e.toString();
            } catch (RuntimeException exception) {
                System.out.println("ligne invalide"+ " " +listEtudiantString[i]+ " " +listEtudiantString[i +1]+" " +(listEtudiantString[i + 2]));
            }
            try {
                PrintWriter sortie = new PrintWriter(new FileWriter(PATH_DEFAUT + "etudiantsIn.csv")); // ouverture du fichier
                sortie.println(listeValide); //écrire le texte
                sortie.close(); //fermer le fichier
            } catch (IOException ioException) {
                System.out.println(ioException.getMessage());
            }

        }
}
}
