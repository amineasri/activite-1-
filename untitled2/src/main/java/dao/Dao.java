package dao;

@Component("dao")
public class Dao implements Idao {

    @Override
    public Double getData() {
        return Math.random()*10;
    }
}
