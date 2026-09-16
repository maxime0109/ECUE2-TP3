package net.lecnam.ecue2.tp3;

public class Rectangle {

    double longueur, largeur;
    Point p = new Point(0, 0);
    double longitude = p.longitude;
    double latitude = p.latitude;//Exercice 2

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

    public boolean contient(Point p){
        return (p.longitude >= this.longitude && this.longitude + this.longueur >= p.longitude) && (p.latitude >= this.latitude && this.latitude + this.largeur >= p.latitude);
    }//Exercice 5

}
