package itshaala.com.util;

import itshaala.com.Constants.Constant;
import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainConn {
@Getter
   private static Connection con;

        static {
            try {
                con = DriverManager.getConnection(Constant.URl,Constant.User,Constant.Password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }



    }
}
