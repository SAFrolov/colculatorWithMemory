<%-- 
    Document   : form
    Created on : 20.01.2018, 16:52:38
    Author     : s.frolov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Calculator Form</p>

        <form action="CalcServlet" method="post">
        <table class ="tdata">
        
            <tr>
                <td width ="1%"> Первое значение   </td>
                <td><input type="text" name="theFirst"/> </td>
            </tr>
            
            <tr>
                <td width ="1%"> знак   </td>
                <td><input type="text" name="mark"/></td>
            </tr>
          
            <tr>
                <td width ="1%"> Второе значение   </td>
                <td><input type="text" name="theSecond"/> </td>
            </tr>          
        </table>
   
            
            <button type="submit" value="OK">OK</button>
        </form>
        
        <h1>
                <a href="/calculatorEE5withInterface/allvaluesout"> Посмотреть старые значения </a>
        </h1>
    </body>
</html>
