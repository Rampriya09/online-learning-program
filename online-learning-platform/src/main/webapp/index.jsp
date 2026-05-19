<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<body>
    <h1>Welcome to the Online Learning Platform</h1>
    <h3>Available Courses:</h3>
    <table border="1">
        <tr>
            <th>Title</th>
            <th>Description</th>
        </tr>
        <c:forEach var="course" items="${courses}">
            <tr>
                <td>${course.title}</td>
                <td>${course.description}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>