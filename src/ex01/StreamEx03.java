package ex01;

import java.io.*;
import java.util.Scanner;

/**
 * Socket - 소켓으로 데이터가 흘러가야 하는 길 (Byte Stream)
 */
public class StreamEx03 {
    public static void main(String[] args) {
        OutputStream out = System.out; // 모니터
        OutputStreamWriter ow = new OutputStreamWriter(out);
        BufferedWriter bw = new BufferedWriter(ow);

        try {
            bw.write("안녕하세요");
            bw.flush();
        } catch (Exception e) {

        }
    }
}
