package app;

import ma.projet.bean.Complexe;
import ma.projet.bean.Reel;

/**
 * Test2
 */
public class Test2 {

   public static void main(String[] args) {
      
      Complexe c1 = new Complexe(4,6);
      Complexe c2 = new Complexe(6,4);
      Complexe c3 = (Complexe) c2.plus(c1);
      Complexe c4 = (Complexe) c2.moins(c1);
      c1.afficher();
      c2.afficher();
      c3.afficher();
      c4.afficher();
      //
      Reel r1 = new Reel(4);
      Reel r2 = new Reel(16);
      Reel r3 = (Reel) r1.plus(r2);
      Reel r4 = (Reel) r1.moins(r2);
      r1.afficher();
      r2.afficher();
      r3.afficher();
      r4.afficher();
      //

   }
}