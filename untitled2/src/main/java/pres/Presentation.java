package pres;

import Metier.Metier;
import dao.Dao;
import dao.Idao;
import ext.DaoImpl2;

public class Presentation {
    public static void main(String[] args) {
        Dao dao=new Dao();
        DaoImpl2 daoImpl2=new DaoImpl2();
        Metier metier = new Metier();
        metier.setDao(daoImpl2);
        System.out.println("resultat :"+ metier.calcul());
    }
}
