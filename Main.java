package Lesson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String str = getJson("C:\\Users\\Galinka\\Desktop\\mydoc\\99.txt");
        Gson gson = new GsonBuilder().create();
        Information info = (Information) gson.fromJson(str, Information.class);
        System.out.println(gson.toJson(info));

        try (PrintWriter pw = new PrintWriter(new File("C:\\Users\\Galinka\\Desktop\\mydoc\\88.txt"))) {
            pw.print(gson.toJson(info.name));


        } catch (IOException e) {

        }
    }
    public static String getJson (String url){
        File file = new File(url);
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String str;
            for (;(str= br.readLine())!=null;){
                sb.append(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }
}
