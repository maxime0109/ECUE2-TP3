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

}
