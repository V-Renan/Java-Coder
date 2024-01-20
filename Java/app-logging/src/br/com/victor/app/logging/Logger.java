package br.com.victor.app.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Victor$
 * @date 20/01/2024$
 * Description:
 */
public class Logger {

    public static void info(String msg) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("[INFO] " + sdf.format(new Date())  + " " + msg);
    }


}
