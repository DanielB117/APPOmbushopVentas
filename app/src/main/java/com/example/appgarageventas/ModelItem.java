package com.example.appgarageventas;

public class ModelItem {

    private String medtCodigo;
    private String mtvDescripcion;
    private String mtvStock;
    private String mtvActualizado;
    private String mimgProducto;

    public ModelItem() {
    }

    public ModelItem(String imgProducto, String edtCodigo, String tvDescripcion, String tvStock, String tvActualizado) {
        medtCodigo = edtCodigo;
        mtvDescripcion = tvDescripcion;
        mtvStock = tvStock;
        mtvActualizado = tvActualizado;
        mimgProducto = imgProducto;
    }


    public String getMedtCodigo() {
        return medtCodigo;
    }

    public String getMtvDescripcion() {
        return mtvDescripcion;


    }
    public  String getMtvStock  () {
        return mtvStock;
    }
    public  String  getMtvActualizado () {
        return mtvActualizado;
    }
    public  String getMimgProducto  () {
        return mimgProducto;
    }
}
