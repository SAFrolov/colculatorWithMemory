<%-- 
    Document   : allvalues
    Created on : 10.02.2018, 0:18:36
    Author     : s.frolov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CalcCss.css">
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
    </head>
    <body>
        <table class ="tdata">
            <tr>
                <th width ="1%"> ID </th>
                <th> Первое значение </th>
                <th> Знак </th>
                <th> Второе значение </th>
                <th> Результат </th>
                <th> Дата создания</th>
            </tr>

            <c:forEach var = "value" items="${values}">            
                <tr>
                    <td width="1%">${value.id}</td>
                    <td>${value.v1}</td>
                    <td>${value.mark}</td>
                    <td>${value.v2}</td>
                    <td>${value.result}</td>
                </tr>
             </c:forEach>                
        </table>

            <h1>
                <a href="/calculatorEE5withInterface/form.jsp"> Назад </a>
            </h1>
    </body>
</html>
