package com.example.a40272.constellation.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkUtils {
    private NetworkUtils(){}

    /**
     * 根据网络地址，获取网络数据输入流
     * @param path 网络地址
     * @return 网络数据输入流
     */
    public static InputStream getNetInfo(String path){
        try{
                URL url = new URL(path);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.connect();
                InputStream in = connection.getInputStream();
                return  in;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
    }
    /**
     * 获取网络数据转换为字符串返回
     * @param path 网络地址
     * @return 网络地址
     */
    public static String getNetString(String path){
        StringBuilder builder = new StringBuilder();
        String line = null;
        try {
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            InputStream in = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            while ((line = reader.readLine())!=null){
                builder.append(line);
            }
            return builder.toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
