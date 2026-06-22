import java.io.*;
import java.net.*;
public class Server {
    public static void listen() throws Exception {
        ServerSocket server = new ServerSocket(1000);
        System.out.println("Server pornit...");
        Socket socket = server.accept();
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
        String mesaj = reader.readLine();
        System.out.println("Mesaj primit: " + mesaj);
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        writer.println("Salut de la server!");
        socket.close();
        server.close();
    }
}
