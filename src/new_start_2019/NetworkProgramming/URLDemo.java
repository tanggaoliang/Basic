/*
 * @author:tang gao liang
 * @time:2019/3/6 19:22:12
 * @qq:1440535574
 */
package new_start_2019.NetworkProgramming;
//          URL（Uniform Resource Locator）中文名为统一资源定位符，有时也被俗称为网页地址。表示为互联网上的资源，如网页或者FTP地址。
//
//        本章节我们将介绍Java是如处理URL的。URL可以分为如下几个部分。
//
//        protocol://host:port/path?query#fragment
//        protocol(协议)可以是 HTTP、HTTPS、FTP 和 File，port 为端口号，path为文件路径及文件名。
//
//        HTTP 协议的 URL 实例如下:
//
//        http://www.runoob.com/index.html?language=cn#j2se
//        URL 解析：
//
//        协议为(protocol)：http
//        主机为(host:port)：www.runoob.com
//        端口号为(port): 80 ，以上URL实例并未指定端口，因为 HTTP 协议默认的端口号为 80。
//        文件路径为(path)：/index.html
//        请求参数(query)：language=cn
//        定位位置(fragment)：j2se，定位到网页中 id 属性为 j2se 的 HTML 元素位置 。

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

    public static void main(String[] args) throws MalformedURLException {
        URLDemo urlDemo = new URLDemo();
//        urlDemo.fun1();
        urlDemo.fun2();


    }

    private void fun2() {
        try {
            URL url = new URL("http://www.runoob.com");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = null;
            if (urlConnection instanceof HttpURLConnection) {
                connection = (HttpURLConnection) urlConnection;
            } else {
                System.out.println("please input the right url address.");
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String urlString = "";
            String current;
            while ((current = bufferedReader.readLine()) != null) {
                urlString += current;
            }
            System.out.println(urlString);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void fun1() {
        URL url = null;
        try {
            url = new URL("http://www.runoob.com/index.html?language=cn#j2se");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println("URL 为：" + url.toString());
        System.out.println("协议为：" + url.getProtocol());
        System.out.println("验证信息：" + url.getAuthority());
        System.out.println("文件名及请求参数：" + url.getFile());
        System.out.println("主机名：" + url.getHost());
        System.out.println("路径：" + url.getPath());
        System.out.println("端口：" + url.getPort());
        System.out.println("默认端口：" + url.getDefaultPort());
        System.out.println("请求参数：" + url.getQuery());
        System.out.println("定位位置：" + url.getRef());
    }
}
