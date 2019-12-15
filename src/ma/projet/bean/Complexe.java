package ma.projet.bean;

import ma.projet.abstract2.Afficher;
import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;

/**
 * Complexe
 */
public class Complexe extends Afficher implements IOperation {

   double im;
   double re;

   public Complexe(double im, double re) {
      this.im = im;
      this.re = re;
   }

   @Override
   public Object plus(Object object) {
      if(object instanceof Complexe){
         double im = this.im + ((Complexe) object).im;
         double re = this.re + ((Complexe) object).re;
         return new Complexe(im, re);
      } 
      return null;
   }

   @Override
   public Object moins(Object object) {
      if(object instanceof Complexe){
         double im = this.im - ((Complexe) object).im;
         double re = this.re - ((Complexe) object).re;
         return new Complexe(im, re);
      } 
      return null;
   }

   @Override
   public String afficher() {
      String val = "\nre : "+re+"\n im : "+im;
      System.out.println(val);
      return val;
   }

}