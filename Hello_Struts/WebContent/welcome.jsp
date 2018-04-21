<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'welcome.jsp' starting page</title>
 
 <meta http-equiv="pragma" content="no-cache">
 <meta http-equiv="cache-control" content="no-cache">
 <meta http-equiv="expires" content="0">    
 <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
 <meta http-equiv="description" content="This is my page">
  </head>
  <body>
   欢迎${username}！<br>
   <!-- 取session中的数要用#session -->
   使用struts2 <br>
   用struts标签： <s:property value="#session.sts"/><br>
   用EL表达式：${sessionScope.sts}<br>
   用EL表达式2：${sts3} ： ${sts[0].name}<br>
   用JSP代码：<%=session.getAttribute("sts")%><br>
   
   <br>
    <!-- ActionContext.getContext().getSession().put -->
    ActionContext.getContext().getSession().put:<br>
    <table border="2">
    <s:iterator value="#session.sts" var="result" status='st'>
       <tr>
       <td width="100"><s:property value='id'/></td>
       <td width="100"><s:property value='number'/></td>
       <td width="100"><s:property value='name'/></td>
       <td width="100"><s:property value='tel'/></td>
       <td width="100"><s:property value='address'/></td>
       </tr>
    </s:iterator>
    </table>
    <br>
    ActionContext.getContext().put context:<br>
    <!-- put context -->
    <s:iterator value="sts2" var="result" status='st'>
       <s:property value='name'/>
    </s:iterator>
    <br>
    原生ServletActionContext.getRequest().setAttribute:<br>
    <!-- getRequest().setAttribute -->
    <s:iterator value="#request.sts3" var="result" status='st'>
       <s:property value='name'/>
    </s:iterator>
    
   <%-- <s:iterator value="{'a','b','c'}" var='char' status='st'>    
    <s:if test="#st.Even">    
        现在的索引是奇数为:<s:property value='#st.index'/>    
    </s:if>    
    当前元素值： <s:property value='char'/>    
    </s:iterator> --%>
   
  </body>
</html>