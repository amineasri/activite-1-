package ext;

import dao.Idao;

public class DaoImpVWS implements Idao {

    @Override
    public Double getData() {
        System.out.println("Version Web service ");
        return 90.0;
    }
}
