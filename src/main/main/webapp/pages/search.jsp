<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title> search </title>
    <link rel="stylesheet" href="../statics/search.css">
</head>
<body>

<tag:navigator/>

<form action="${pageContext.request.contextPath}/users" method="post">
    <div class="search_bar">
        <label class="bar">
            <input type="text" name="search-word" value="">
        </label>
        <div class="search-button">
            <input type="submit" name="search" value="Search">
        </div>
        <input type="hidden" name="command" value="search_command">
    </div>
    <input type="hidden" name="command" value="search_command">
    <c:forEach var="news" items="${sessionScope.news}" varStatus="i.<isindex>">
        <c:set var="count" value="${pageScope.count+1}"/>
        <a href="/pages/news.jsp?index=${count}">
            <div class="container-part-3">
                <div>
                    <div class="part-3">
                        <c:forEach var="url" items="${sessionScope.selectedNews.urls}">
                            <div class="img-wrapper">
                                <img src="${pageContext.request.contextPath}/${url}">
                            </div>
                        </c:forEach>
                    </div>
                    <div>
                        <h3>${sessionScope.selectedNews.title}</h3>
                    </div>
                    <div>
                        <p>${sessionScope.selectedNews.shortText}</p>
                    </div>
                    <div>
                        <p>${sessionScope.selectedNews.fullText}</p>
                    </div>
                </div>
            </div>
        </a>
    </c:forEach>
</form>

<tag:fotter/>

</body>
</html>