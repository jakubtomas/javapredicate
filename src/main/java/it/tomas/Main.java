package it.tomas;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import sun.security.util.IOUtils;

import javax.print.DocFlavor;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) throws IOException {

        String sovyServer="http://itsovy.sk:5000/data";

        // URLConnection request=url.openConnection();
        //request.connect();


        URL url=new URL(sovyServer);
        URLConnection request=url.openConnection();
        request.connect();


       // JSONObject data=new JSONObject(IOUtils.toString(url, StandardCharsets.UTF_8));
      //  JSONArray arr=data.getJSONArray("world_x");


    }
}
