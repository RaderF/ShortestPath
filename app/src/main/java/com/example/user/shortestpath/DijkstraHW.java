package com.example.user.shortestpath;
import android.util.Pair;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;


public class DijkstraHW {

    //Is an ArrayList<Pair> really the best data structure to use for this? >>probably not

    public void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\User\\Documents\\graph.txt");
        Scanner sc = new Scanner(file);
        ArrayList<Pair> edgelist = new ArrayList<>();
        while (sc.hasNextLine()){
            //Parse each line of graph.txt into a pair of (First_String, Last_String)
            //Add each pair into edglist
        }
        sc.close();
        writePath("Rader", "END");
    }

    public void writePath(String startpoint, String endpoint) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("results.txt", "UTF-8");
        //Run a Dijkstra's Algorithm from startpoint to endpoint
        //while nextvertex != "END"{
            writer.println("the next vertex");
        //}
        writer.println("END");
        writer.close();
    }

}
