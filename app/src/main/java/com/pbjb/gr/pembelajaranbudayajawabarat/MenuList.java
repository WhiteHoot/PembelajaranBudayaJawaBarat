package com.pbjb.gr.pembelajaranbudayajawabarat;

public class MenuList {

    private int menu_img, menu_icn, btn_txt_clr;
    private String menu_title, menu_dsc;

    public MenuList(int menu_img, int menu_icn, int btn_txt_clr, String menu_title, String menu_dsc) {
        this.menu_img = menu_img;
        this.menu_icn = menu_icn;
        this.menu_title = menu_title;
        this.menu_dsc = menu_dsc;
        this.btn_txt_clr = btn_txt_clr;
    }

    public int getMenu_img() {
        return menu_img;
    }

    public void setMenu_img(int menu_img) {
        this.menu_img = menu_img;
    }

    public int getMenu_icn() {
        return menu_icn;
    }

    public void setMenu_icn(int menu_icn) {
        this.menu_icn = menu_icn;
    }

    public String getMenu_title() {
        return menu_title;
    }

    public void setMenu_title(String menu_title) {
        this.menu_title = menu_title;
    }

    public String getMenu_dsc() {
        return menu_dsc;
    }

    public void setMenu_dsc(String menu_dsc) {
        this.menu_dsc = menu_dsc;
    }

    public int getBtn_txt_clr() {
        return btn_txt_clr;
    }

    public void setBtn_txt_clr(int btn_txt_clr) {
        this.btn_txt_clr = btn_txt_clr;
    }
}
