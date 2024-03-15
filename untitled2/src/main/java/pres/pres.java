package pres;

import Metier.Imetier;
import dao.Idao;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        Idao dao =(Idao) cDao.newInstance();


        String metierClassName=scanner.nextLine();
        Class cmetier=Class.forName(metierClassName);
        Imetier metier =(Imetier) cmetier.newInstance();

        Method method=cmetier.getMethod("setDao", Idao.class);
        method.invoke(metier,dao);

        System.out.println(metier.calcul());
    }
}
