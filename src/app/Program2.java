package app;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departamentDao = DaoFactory.createDepartamentDao();

        sc.close();
    }
}
