package webserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient2 {

    // GET 요청 (자원을 주세요)
    public MyClient2() throws Exception {
        // 1. 서버 연결
        Socket socket = new Socket("localhost", 10000);

        // 2. 클라이언트가 요청함 (xml, html) - 두 가지를 요청할 수 있다는 것을 알아야 함.
        PrintWriter request = new PrintWriter(socket.getOutputStream(), true);
        request.println("클라이언트2의 요청 : html 페이지 주세요");

        // 3. 클라이언트가 응답을 받음 (반이중)
        BufferedReader response = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
        String msg = response.readLine(); // <html>코드 읽음
        System.out.println("서버에게서 응답이 왔습니다 : " + msg);
    }

    public static void main(String[] args) {
        try {
            new MyClient2();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
