import java.io.*;

public class String_Builder{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, "); sb.append("mortals!");
        String k = sb.toString();
        System.out.println(k);
    }
}