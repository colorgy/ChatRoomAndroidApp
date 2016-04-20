package io.colorgy.colorgychatapp.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by erwai on 4/15/16.
 */
public class ColorgySocket {
    private final String SERVER_HOST = "http://chat.colorgy.io";
    private final int SERVER_PORT = 80;

    private Thread thread;
    private Socket socket;
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                socket = new Socket(SERVER_HOST, SERVER_PORT);
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };

}
