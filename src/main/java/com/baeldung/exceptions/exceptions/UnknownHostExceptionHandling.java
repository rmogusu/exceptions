package com.baeldung.exceptions.exceptions;
import java.io.IOException;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

public class UnknownHostExceptionHandling {
    public static int getResponseCode(String hostname)throws  IOException{
        URL url = new URL(hostname.trim());
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        int resCode = -1;
        //handle exception
        try{
            resCode = con.getResponseCode();
        }catch (UnknownHostException e){
            con.disconnect();

        }
        return  resCode;

    }
    //unhandled exception
    public  static int getResponseCodeUnhandled(String hostname) throws  IOException{
        URL url = new URL(hostname.trim());
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        int rescode = con.getResponseCode();
        return rescode;
    }
}
