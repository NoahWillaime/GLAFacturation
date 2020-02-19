/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infos;

/**
 *
 * @author noahd
 */
public class Facturation {
    private long id_acheteur;
    private long id_article;
    private String nom_acheteur;
    private String nom_article;
    private double prix;

    public Facturation() {
    }

    public Facturation(long id_acheteur, long id_article, String nom_acheteur, String nom_article, double prix) {
        this.id_acheteur = id_acheteur;
        this.id_article = id_article;
        this.nom_acheteur = nom_acheteur;
        this.nom_article = nom_article;
        this.prix = prix;
    }

    public long getId_acheteur() {
        return id_acheteur;
    }

    public void setId_acheteur(long id_acheteur) {
        this.id_acheteur = id_acheteur;
    }

    public long getId_article() {
        return id_article;
    }

    public void setId_article(long id_article) {
        this.id_article = id_article;
    }

    public String getNom_acheteur() {
        return nom_acheteur;
    }

    public void setNom_acheteur(String nom_acheteur) {
        this.nom_acheteur = nom_acheteur;
    }

    public String getNom_article() {
        return nom_article;
    }

    public void setNom_article(String nom_article) {
        this.nom_article = nom_article;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
}
