package itshaala.com.Controller;

import itshaala.com.Dao.Dao;
import itshaala.com.Service.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Controller {

Service service = new Service();

    public void reserveRoom(Connection connection, Scanner scanner) throws SQLException {
        service.reserveRoom(connection,scanner);
    }

    public void viewReservations(Connection connection) throws SQLException {
        service.viewReservations(connection);

    }

    public void getRoomNumber(Connection connection, Scanner scanner) {
        service.getRoomNumber(connection,scanner);

    }

    public void updateReservation(Connection connection, Scanner scanner) {
        service.updateReservation(connection,scanner);

    }

    public void deleteReservation(Connection connection, Scanner scanner) {
        service.deleteReservation(connection,scanner);

    }

    public void exit() throws InterruptedException {
        service.exit();

    }
}
