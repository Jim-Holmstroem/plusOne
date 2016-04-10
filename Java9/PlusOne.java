import java.io.*;
import java.net.*;

class PlusOne {
    public static void main(String argv[]) throws Exception {
        String clientSentence;
        Integer x, y;
        ServerSocket socket = new ServerSocket(5000);

        while(true) {
            Socket connectionSocket = socket.accept();
            BufferedReader input = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream output = new DataOutputStream(connectionSocket.getOutputStream());
            x = Integer.parseInt(input.readLine());
            y = x + 1;
            System.out.println(x + " => " + y);
            output.writeBytes(y + "\n");
        }
    }
}
