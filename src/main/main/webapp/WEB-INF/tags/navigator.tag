<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="u" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="khgkjgkjhgkjhgkj">
    <title>Home</title>
    <link rel="stylesheet" href="<c:url value="/statics/tags/navigator.css"/>">
</head>
<body>
<header class="">
    <div class="sticky_nav_bar">
        <div class="navigator">
            <div class="logo_divider">
                <a id="logo" href="">BIG WANGERS NEWS</a>
            </div>
            <ul>
                <li>
                    <a class="item" href="../../pages/home.jsp">HOME</a>
                </li>
                <li>
                    <a class="item" href="../../pages/search.jsp">SEARCH</a>
                </li>
                <li>
                    <a class="item" href="../../pages/about.jsp">ABOUT</a>
                </li>
                <li>
                    <a class="item" href="../../pages/profile.jsp">PROFILE</a>
                </li>
                <%--<li>--%>
                <%--<a class="item">CUSTOMIZATION</a>--%>
                <%--</li>--%>
            </ul>
            <form action="${pageContext.request.contextPath}/users" method="post">
                <div class="logout-btn">
                    <%--<a class="logout" href="">LOGOUT</a>--%>
                    <button type="submit" name="logout" value="Logout">LOGOUT</button>
                    <%--<input type="submit" name="logout" value="Logout">--%>
                </div>
                <input type="hidden" name="command" value="command_logout">
            </form>
        </div>
    </div>
</header>
</body>
</html>
