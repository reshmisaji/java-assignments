package com.step.assignments.Polymorphism;

public class WebPage implements Displayable {
    public WebPage() {
    }

    public String getContent() {
        return "contents of the webpage";
    }

    public void click(){
        System.out.println("clicked");
    }

    public void display(String content){
        System.out.println(content);
    }
}
