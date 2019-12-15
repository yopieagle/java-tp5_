package ma.projet.bean;

import java.util.Date;

import ma.projet.inter.IPersonne;

/**
 * Personne
 */
public class Personne implements IPersonne {

   int id;
   String nom;
   String prenom;
   Date dateNais;
   double salaire;
   Profile profile;

   public Personne(int id, String nom, String prenom, Date dateNais, double salaire, Profile profile) {
      this.id = id;
      this.nom = nom;
      this.prenom = prenom;
      this.dateNais = dateNais;
      this.salaire = salaire;
      this.profile = profile;
   }

   @Override
   public void afficher() {
      // TODO Auto-generated method stub
      if(profile.libelle == "directeur") {
         String res = "je suis le directeur "+nom+" "+prenom+" né le "+dateNais.toString()+" mon salaire est "+calculerSalaire()+" Dhm";
         System.out.println(res);
      } else if(profile.libelle == "employé") {
         String res = "je suis l'employé "+nom+" "+prenom+" né le "+dateNais.toString()+" mon salaire est "+calculerSalaire()+" Dhm";
         System.out.println(res);
      }

   }

   @Override
   public double calculerSalaire() {
      // TODO Auto-generated method stub
      if(profile.code == 1) {
         //directeur
         salaire = salaire* 1.2;
         return salaire;
      } else {
         salaire = salaire* 1.1;
         return salaire;
      }
      
   }
}