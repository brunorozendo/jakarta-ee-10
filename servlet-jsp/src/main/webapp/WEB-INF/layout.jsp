<%@ taglib uri="jakarta.tags.core"      prefix="c"   %>
<%@ taglib uri="jakarta.tags.fmt"       prefix="fmt" %>
<%@ taglib uri="jakarta.tags.xml"       prefix="x"   %>
<%@ taglib uri="jakarta.tags.sql"       prefix="sql" %>
<%@ taglib uri="jakarta.tags.functions" prefix="fn"  %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:import url="${page}" var="importedPage" />
<!doctype html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><c:out value="${title}" /></title>
</head>
<body>
${importedPage}
</body>
</html>