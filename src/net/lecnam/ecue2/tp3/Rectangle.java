package net.lecnam.ecue2.tp3;

public class Rectangle {

    double longueur, largeur, x, y; //Exercice 2

    public Rectangle(Point p, double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
        this.x = p.longitude;
        this.y = p.latitude;
    }

    public Rectangle(double x, double y, double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
        this.x = x;
        this.y = y;
    }

}
