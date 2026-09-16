package net.lecnam.ecue2.tp3;

public class Rectangle {

    double longueur, largeur, longitude, latitude; //Exercice 2

    public Rectangle(Point p, double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
        this.longitude = p.longitude;
        this.latitude = p.latitude;
    }

    public Rectangle(double x, double y, double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
        this.longitude = x;
        this.latitude = y;
    } // Exercice 3

    public double retourneSurface(){
        return this.longueur * this.largeur;
    }

    public void translate(double x, double y){
        this.longitude += x;
        this.latitude += y;
    } //Exercice 4

}
