package com.vo1d.pizzaapp.beans;

import java.io.Serializable;

public class Produit  implements Serializable {
    private static int lastId = 0;

    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String duree;
    private String detailsIngred;
    private String Description;
    private String Preparation;
    private String comp;

    public Produit(String nom, int nbrIngredients, int photo, String duree, String detailsIngred, String Description, String Preparation, String comp) {
        this.id = ++lastId;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detailsIngred = detailsIngred;
        this.Description = Description;
        this.Preparation = Preparation;
        this.comp = comp;
    }
    public Produit(String nom, int nbrIngredients, int photo, String duree, String detailsIngred, String Description, String Preparation) {
        this.id = ++lastId;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detailsIngred = detailsIngred;
        this.Description = Description;
        this.Preparation = Preparation;

    }

    public Produit() {
        this.id = ++lastId;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDetailsIngred() {
        return detailsIngred;
    }

    public void setDetailsIngred(String detailsIngred) {
        this.detailsIngred = detailsIngred;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getPreparation() {
        return Preparation;
    }

    public void setPreparation(String Preparation) {
        this.Preparation = Preparation;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    @Override
    public String toString() {
        return "Produit [id=" + id + ", nom=" + nom + ", nbrIngredients=" + nbrIngredients + ", photo=" + photo
                + ", duree=" + duree + ", detailsIngred=" + detailsIngred + ", Description=" + Description
                + ", Preparation=" + Preparation + ", comp=" + comp + "]";
    }
}
