package ma.projet.bean;

import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;

/**
 * Reel
 */
public class Reel implements IAffichage, IOperation {

   double x;

   public Reel(double x) {
      this.x = x;
   }

   @Override
   public Object plus(Object object) {
      // TODO Auto-generated method stub
      if(object instanceof Reel){
         return new Reel(this.x + ((Reel) object).x);
      } 
      return null;
   }

   @Override
   public Object moins(Object object) {
      // TODO Auto-generated method stub
      if(object instanceof Reel){
         return new Reel(this.x - ((Reel) object).x);
      } 
      return null;
   }

   @Override
   public String afficher() {
      // TODO Auto-generated method stub
      String val = "\nx : "+x;
      System.out.println(val);
      return val;
   }


}