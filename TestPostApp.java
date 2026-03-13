
import java.io.*;

class TestPostApp{
    public static void main(){
        Post p1  = new Post("Alex Adam", "Help with JavaE", "Hi, could anyone help me I need to learn how to code in java!");
        System.out.println(p1.toString());

        try {
        p1.toTextFile(p1.toFormattedString(), "mypost.txt");
        } catch( IOException ex ) {
        System.out.println("File not saved.");
        ex.printStackTrace();
}

    }
}