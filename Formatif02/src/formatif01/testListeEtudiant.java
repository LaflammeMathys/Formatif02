package formatif01;

import java.io.*;
import java.util.ArrayList;

public class testListeEtudiant {
   public testListeEtudiant() {
       listeEtudiant listeEtudiant = new listeEtudiant();
//
          listeEtudiant.lireEtudiants( "etudiantsIn.csv"); //lit un fichier
        listeEtudiant.trier(); //trie les éléments de la structure par ligne ascendante
//        System.out.println(listeEtudiants.toString()); //affiche les données de la structure
//        listeEtudiant.ajouterANote(10); //ajoute la note passée en argument aux étudiants de la structure
//        listeEtudiant.ecrireEtudiants(GestionFichier.PATH_DEFAUT + "etudiantsOut+10.csv"); //écrit le fichier
//        listeEtudiant.ajouterANote(-20); //ajoute la note passée en argument aux étudiants de la structure
//        listeEtudiant.ecrireEtudiants(GestionFichier.PATH_DEFAUT + "etudiantsOut-10.csv"); //écrit le fichier
//
    }


    public static void main(String[] args) {
       new testListeEtudiant();

    }
}
