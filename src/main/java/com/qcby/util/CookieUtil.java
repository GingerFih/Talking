package com.qcby.util;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class CookieUtil {
    /**
     * 添加cookie
     * @param response
     * @param name
     * @param value
     */

    @RequestMapping("/addCookie")

    public void addCookie(HttpServletResponse response, String name, String value){

        Cookie cookie = new Cookie(name.trim(), value.trim());//trim() 方法用于删除字符串的头尾空白符。

        cookie.setMaxAge(60*60*24);// 设置为24小时 60秒*60分*24小时

        cookie.setPath("/");//因此cookie.setPath("/");之后，可以在webapp文件夹下的所有应用共享cookie，而cookie.setPath("/webapp/")是指设置的cookie只能在webapp应用下的获得

        System.out.println("已添加cookie");

        response.addCookie(cookie);//最后用response的addCookie()添加设置的cookie

    }
    /**
     * 读取所有cookie
     * 注意二、从客户端读取Cookie时，包括maxAge在内的其他属性都是不可读的，也不会被提交。浏览器提交Cookie时只会提交name与value属性。maxAge属性只被浏览器用来判断Cookie是否过期
     * @param request
     * @param response
     */

    @RequestMapping("/getCookies")

    public void showCookies(HttpServletRequest request, HttpServletResponse response ){

        Cookie[] cookies = request.getCookies();//这样便可以获取一个cookie数组,获得全部cookie

        if(cookies==null) {

            System.out.println("没有cookie");

        }else{

            for(Cookie cookie : cookies){

                System.out.println("name:"+cookie.getName()+",value:"+ cookie.getValue());

                //通过getName()方法获取cookie的名字,通过getValue()获取cookie的值

            }

        }

    }

    /**
     * 修改cookie
     * @param request
     * @param response
     * @param name
     * @param value
     * 注意一、修改、删除Cookie时，新建的Cookie除value、maxAge之外的所有属性，例如name、path、domain等，都要与原Cookie完全一样。否则，浏览器将视为两个不同的Cookie不予覆盖，导致修改、删除失败。
     */


    @RequestMapping("/editCookie")

    public void editCookie(HttpServletRequest request,HttpServletResponse response,String name,String value){

        Cookie[] cookies = request.getCookies();

        if(cookies==null) {

            System.out.println("没有cookie");

        }else{

            for(Cookie cookie : cookies){

                if(cookie.getName().equals(name)){

                    System.out.println("原值为:"+cookie.getValue());

                    cookie.setValue(value);//这个赋的是方法的形参

                    cookie.setPath("/");

                    cookie.setMaxAge(60*60*24);// 设置为30min

                    System.out.println("被修改的cookie名字为:"+cookie.getName()+",新值为:"+cookie.getValue());

                    response.addCookie(cookie);

                    break;

                }

            }

        }

    }
    /**
     * 根据名字获取cookie

     * @param request

     * @param name cookie名字

     * @return

     */

    @RequestMapping("/getCookieByName")
    public Cookie getCookieByName(HttpServletRequest request,String name){

        Map<String,Cookie> cookieMap = ReadCookieMap(request);

        if(cookieMap.containsKey(name)){

            Cookie cookie = (Cookie)cookieMap.get(name);

            return cookie;

        }else{

            return null;

        }

    }
    /**
     * 将cookie封装到Map里面
     * @param request
     * @return
     */


    @RequestMapping("/ReadCookieMap")
    private Map<String,Cookie> ReadCookieMap(HttpServletRequest request){

        Map<String,Cookie> cookieMap = new HashMap<String,Cookie>();

        Cookie[] cookies = request.getCookies();

        if(null!=cookies){

            for(Cookie cookie : cookies){

                cookieMap.put(cookie.getName(), cookie);

            }

        }

        return cookieMap;

    }
}
