package com.example.devanshu.sql;

/**
 * Created by devanshu on 22/6/17.
 */

public class Product {

    private int _id;
    private String _productname;

    public Product(){

    }

    public Product(String productname) {
        this._productname = productname;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_productname(String _productname) {
        this._productname = _productname;
    }

    public int get_id() {
        return _id;
    }

    public String get_productname() {
        return _productname;
    }
}
