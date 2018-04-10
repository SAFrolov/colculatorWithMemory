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
import javax.annotation.Resource;
import javax.inject.Singleton;
import javax.sql.DataSource;

/**
 *
 * @author s.frolov
 */
@Singleton
public class WorkWithDataBase {
    
    @Resource(lookup="jibc/PosgretDS")
    DataSource ds;   
    
    
public void setToDataBase (CalculatorBean cal){    
        final String q="insert into public.calculator_table (first, mark, second, result) values('"
                                    + cal.getV1() + "','" + cal.getMark() + "','" + cal.getV2() + "',' " + cal.getResult() + "')";
        try (
            Connection c = ds.getConnection();
            PreparedStatement st = c.prepareStatement(q)){
            st.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public CalculatorBean calculater(String v1s, String v2s, String mark){
        CalculatorBean clcIn=new CalculatorBean(Double.parseDouble(v1s), Double.parseDouble(v2s), mark);
        if (clcIn.getMark().equals("*"))  clcIn.setResult(clcIn.getV1()*clcIn.getV2()); else
        if (clcIn.getMark().equals("/")) clcIn.setResult(clcIn.getV1()/clcIn.getV2()); else
        if (clcIn.getMark().equals("+")) clcIn.setResult(clcIn.getV1()+clcIn.getV2()); else 
        if (clcIn.getMark().equals("-")) clcIn.setResult(clcIn.getV1()-clcIn.getV2()); else
            System.out.println("Not correct mark!");
        return clcIn;
    }
    
        public List<CalculatorBean> getTenVolues(){
        final List<CalculatorBean> listOfValues= new ArrayList<>();
        final String q="SELECT * FROM public.calculator_table ORDER BY id DESC";
        int counter=0;
        try (
            Connection c = ds.getConnection();
            PreparedStatement st= c.prepareStatement(q);
            ResultSet rs = st.executeQuery()){
        while((rs.next())&&(counter<10)){
            counter++;
                Date dt = rs.getTimestamp(6);
                SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd hh:mm:ss");
                listOfValues.add(new CalculatorBean(rs.getLong(1), Double.parseDouble(rs.getString(2)), rs.getString(3),
                        Double.parseDouble(rs.getString(4)), Double.parseDouble(rs.getString(5)), formatForDateNow.format(dt))); 
            }
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return listOfValues;
    }
}
