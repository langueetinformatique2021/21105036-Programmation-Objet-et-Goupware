package atelier07;


/** gestion de la couleur d'une forme g�om�trique
  */
public interface Coloriable {
    /** liste des couleurs autoris�es */    
    static String[] couleurs = {"rouge","orange","jaune","vert","bleu","violet"};

    /** modification de la couleur d'une forme g�om�trique
     * @param co nouvelle couleur
     */    
    public abstract void changerCouleur(String co);
}