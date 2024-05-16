package itshaala.com.Service;

import itshaala.com.Dao.Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Service {
    Dao dao = new Dao();
    public void reserveRoom(Connection connection, Scanner scanner) throws SQLException {
        dao.reserveRoom(connection,scanner);
    }

    public void viewReservations(Connection connection) throws SQLException {
        dao.viewReservations(connection);

    }

    public void getRoomNumber(Connection connection, Scanner scanner) {
        dao.getRoomNumber(connection,scanner);

    }

    public void updateReservation(Connection connection, Scanner scanner) {
        dao.updateReservation(connection,scanner);

    }

    public void deleteReservation(Connection connection, Scanner scanner) {
        dao.deleteReservation(connection,scanner);

    }

    public void exit() throws InterruptedException {
        dao.exit();

    }
}
