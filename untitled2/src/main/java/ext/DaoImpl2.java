package ext;

import dao.Idao;

public class DaoImpl2 implements Idao {

    @Override
    public Double getData() {

        System.out.println("Version 2");
        return  (double) 80.0;
    }
}
