<%@ taglib uri="jakarta.tags.core"      prefix="c"   %>
<%@ taglib uri="jakarta.tags.fmt"       prefix="fmt" %>
<%@ taglib uri="jakarta.tags.xml"       prefix="x"   %>
<%@ taglib uri="jakarta.tags.sql"       prefix="sql" %>
<%@ taglib uri="jakarta.tags.functions" prefix="fn"  %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="title" scope="request" value="Index page title"/>

<h3><c:out value="${someVariable}" /></h3>


<c:forEach var="li" items="${someList}">
        <p><c:out value="${li}" /></p>
</c:forEach>  