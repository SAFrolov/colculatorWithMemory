<%-- 
    Document   : resultCal
    Created on : 09.02.2018, 15:54:15
    Author     : s.frolov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CalcCss.css">
    </head>
    <body>
        <table class ="tdata">
            <tr>
                <th width ="1%"> Первое значение </th>
                <th> Знак </th>
                <th> Второе значение </th>
                <th> Результат </th>
            </tr>
            
                <tr>
                    <td width="1%">${CalculatorBean.v1}</td>
                    <td>${CalculatorBean.mark}</td>
                    <td>${CalculatorBean.v2}</td>
                    <td>${CalculatorBean.result}</td>

                </tr>
        </table>
                
            <h1>
                <a href="/calculatorEE5withInterface/form.jsp"> Назад </a>
            </h1>
    </body>
</html>
