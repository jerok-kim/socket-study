package hdx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public MyServer() throws Exception {
        // 1. 서버 대기중
        ServerSocket serverSocket = new ServerSocket(10000);
        Socket socket = serverSocket.accept();
        System.out.println("클라이언트가 연결되었습니다");

        // 2. 서버 요청 받음
        BufferedReader request = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
        String msg = request.readLine();
        System.out.println("클라이언트에게서 요청이 왔습니다 : " + msg);

        // 3. 서버 응답 (반이중)
        // BufferedWriter, new OutputStreamWriter
        PrintWriter response = new PrintWriter(socket.getOutputStream(), true);
        if (msg.equals("html")) {

            response.println("<html><h1>Hello</h1></html>"); // flush, \n
        } else if (msg.equals("xml")) {
            response.println("<xml>hello</xml>");
        } else {
            response.println("잘못된 요청을 하였습니다.");
        }
        System.out.println("클라이언트에게 응답합니다.");
    }

    public static void main(String[] args) {
        try {
            new MyServer();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
