package Metier;

import dao.Dao;
import dao.Idao;

@Component("metier")
public class Metier implements  Imetier{
    private Idao dao = new Dao() ;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        return tmp*540/Math.cos(tmp*Math.PI);
    }
    public void setDao(Idao dao) {
        this.dao=dao;
    }
}
