package ex01;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Socket - 소켓으로 데이터가 흘러가야 하는 길 (Byte Stream)
 */
public class StreamEx02 {
    public static void main(String[] args) {
        InputStream in = System.in; // 키보드에 연결된 스트림으로 정수를 받는다.
        InputStreamReader reader = new InputStreamReader(in); // 정수를 char로 인코딩(아스키코드를 바탕으로) 한다.

        try {
            char[] inData = new char[2]; // 4Byte 배열 (고정길이)
            reader.read(inData);
            System.out.println(inData);
        } catch (Exception e) {

        }
    }
}
