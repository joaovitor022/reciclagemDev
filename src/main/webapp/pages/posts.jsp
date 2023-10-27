<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Posts</title>
</head>
<body>
  <div>
    <h1>Posts</h1>
    <table>
        <tr>
            <th>Material</th>
            <th>Peso</th>
            <th>Descrição</th>
        </tr>
        <c:forEach var="car" items="${posts}">
            <tr>
                <td></td>
                <td>${car.material}</td>
                <td>${car.peso}</td>
                <td>${car.descricao}</td>
            </tr>
        </c:forEach>
    </table>
  </div>
</body>
</html>