package ma.projet.bean;

/**
 * PRofile
 */
public class Profile {

   int id,code;
   String libelle;

   public Profile(int id, int code,String libelle) {
      this.id = id;
      this.code = code;
      this.libelle = libelle;
   }
}