package app;

import java.text.SimpleDateFormat;
import java.util.Date;

import ma.projet.bean.Personne;
import ma.projet.bean.Profile;

/**
 * Test1
 */
public class Test1 {

   public static void main(String[] args) throws Exception {
      Personne p1 = new Personne(1, "SAIMI", "Karim", Test1.convertDate(1970, 6, 2), 20000, new Profile(1, 1, "directeur"));
      Personne p2 = new Personne(1, "Bourass", "Hamza", Test1.convertDate(1990, 1, 1), 2000, new Profile(2, 2, "employé"));
      p1.afficher();
      p2.afficher();
      System.out.println(p1.calculerSalaire());
      System.out.println(p2.calculerSalaire());
   }

   public static Date convertDate(int year, int month, int day) throws Exception {
      // throw new ParseException();
      SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
      String dateString = month+"/"+day+"/"+year;
      Date date = sdf.parse(dateString);
      return date;
   }
}