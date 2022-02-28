package com.homework_;

import java.util.ArrayList;

/**
 * @author wanghao
 * @version 1.0
 */
public class HomeWork14 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new News("我真的是好人，我真的是好人，我真的是好人"));
        list.add(new News("我真的是坏人，我真的是坏人，我真的是坏人"));
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.println(list.get(i));
            News news = (News)list.get(i);
            System.out.println(subVoid(news.getTitle()));
        }
    }

    public static String subVoid(String string){
        if(string==null){
            return "";
        }
        if(string.length() > 15){
            return string.substring(0,15)+"...";
        }
        return string;
    }

}


class News{
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}
