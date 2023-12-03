package org.example;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        Log log = new Log("Logg");
        String msg = "Hello World!";
        log.logger.fine(msg + " is cleared");
        System.out.println( msg );
    }
}
