import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        //String host = "localhost";
        String host = "netology.homework";
        int port = 8089;

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new
                     InputStreamReader(clientSocket.getInputStream()))) {
            //User
            String resp = in.readLine();
            System.out.println(resp);
            out.println("Ратмир Баязитов");

            //ProgramType
            resp = in.readLine();
            System.out.println(resp);
            out.println("1");

            //Result
            resp = in.readLine();
            System.out.println(resp);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
