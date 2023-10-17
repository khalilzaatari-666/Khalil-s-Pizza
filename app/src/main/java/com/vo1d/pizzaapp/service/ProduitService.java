package com.vo1d.pizzaapp.service;

import com.vo1d.pizzaapp.dao.IDao;
import com.vo1d.pizzaapp.beans.Produit;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {
    private List<Produit> produits;

    public ProduitService() {
        produits = new ArrayList<>();
    }

    @Override
    public boolean create(Produit produit) {
        return produits.add(produit);
    }

    @Override
    public boolean update(Produit produit) {
        for (int i = 0; i < produits.size(); i++) {
            if (produits.get(i).getId() == produit.getId()) {
                produits.set(i, produit);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Produit produit) {
        return produits.remove(produit);
    }

    @Override
    public Produit findById(int id) {
        for (Produit produit : produits) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }
}
