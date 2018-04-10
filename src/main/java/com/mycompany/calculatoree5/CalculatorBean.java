 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculatoree5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Singleton;
import javax.sql.DataSource;

/**
 *
 * @author s.frolov
 */
@Singleton
public class CalculatorBean {
    @Resource(lookup="jibc/PosgretDS")
    DataSource ds; 

    private double v1;
    private double v2;
    private double result;
    private String mark;
    private Long id;
    private String date_here;

   



    
    public void setV1(double v1) {
        this.v1 = v1;
    }
    public void setV2(double v2) {
        this.v2 = v2;
    }
    public double getV1() {
        return v1;
    }
    public double getV2() {
        return v2;
    }
    public double getResult() {
        return result;
    }
    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public void setResult(double result) {
        this.result = result;
    }
    public Long getId() {
        return id;
    }
    public DataSource getDs() {
        return ds;
    }

    public CalculatorBean(Long id, double v1, String mark, double v2, double result , String date_here) {
        this.v1 = v1;
        this.v2 = v2;
        this.result = result;
        this.mark = mark;
        this.id = id;
        this.date_here = date_here;
    }
    
    public CalculatorBean() {
    }

    public CalculatorBean(double v1, double v2, double result, String mark, String date_here) {
        this.v1 = v1;
        this.v2 = v2;
        this.result = result;
        this.mark = mark;
        this.date_here = date_here;
    }    
    
    
    public CalculatorBean(double v1, double v2, String mark) {
        this.v1 = v1;
        this.v2 = v2;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "CalculatorBean{" + "ds=" + ds + ", v1=" + v1 + ", v2=" + v2 + ", result=" + result + ", mark=" + mark + ", id=" + id + ", date_here=" + date_here + '}';
    }

    
    
    @PreDestroy
    public void shutDown(){
        System.out.println("You shuted downt the server!");
    }
    
}
