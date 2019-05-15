package peru.proj1;

import android.os.Handler;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by mustafa on 29/5/18.
 */

class MyServer implements Runnable{
    static String answer;
    ServerSocket ss;
    Socket mysocket;
    DataInputStream dis;
    BufferedReader bufferedReader;
    Handler handler= new Handler();
    @Override
    public void run(){
        try{
            ss= new ServerSocket(8881);
            while(true){
                mysocket= ss.accept();
                dis = new DataInputStream(mysocket.getInputStream());
                answer = dis.readUTF();


            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
