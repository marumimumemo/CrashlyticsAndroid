package com.example.crashlyticsandroid;

enum AnalyticsLogEnum {
    delete_image("delete_image"),
    tapped_like("tapped_like"),
    send_mail("send_email"),
    tapped_unlike("tapped_unlike"),
    edit_card("edit_card");

    String text;
    AnalyticsLogEnum(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
    }

}
