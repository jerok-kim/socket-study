package webserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public MyServer() throws Exception {
        // 1. 서버 대기중
        ServerSocket serverSocket = new ServerSocket(10000);

        while (true) {
            Socket socket = serverSocket.accept(); // 1번 메인쓰레드 대기 4번 메인쓰레드가 여기서 대기
            System.out.println("클라이언트가 연결되었습니다"); // 2번 출력

            new Thread(() -> { // 3번 새로운 쓰레드 실행 5번 새로운 쓰레드 실행
                try {
                    // 2. 서버 요청 받음
                    BufferedReader request = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
                    String msg = request.readLine();
                    System.out.println("클라이언트에게서 요청이 왔습니다 : " + msg);

                    // 3. 테스트를 위해 5초 대기
                    Thread.sleep(10000);

                    // 4. 서버 응답 (반이중)
                    PrintWriter response = new PrintWriter(socket.getOutputStream(), true);
                    response.println("<html><h1>Hello</h1></html>"); // flush, \n
                    System.out.println("클라이언트에게 응답합니다.");
                    System.out.println("=========================================================");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    public static void main(String[] args) {
        try {
            new MyServer();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
