package net.lecnam.ecue2.tp3;

public class Dessin {

    Rectangle[] tableau;
    int nbRec;

    public Dessin(){
        this.tableau = new Rectangle[10];
        this.nbRec = 0;
    } //Exercice 7

    public void ajout(Rectangle r){
        this.tableau[this.nbRec] = r;
        nbRec += 1;
    } //Exercice 8

    public double retourneSurface(){
        double surfaceTot = 0;
        for (int i = 0; i < nbRec; i++){
            surfaceTot += this.tableau[i].retourneSurface();
        }
        return surfaceTot;
    }

    public void translate(double x, double y){
        for (int i = 0; i < nbRec; i++){
            this.tableau[i].translate(x, y);
        }
    } //Exercice 9

}
