<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link rel="stylesheet" href="../statics/news.css">
</head>
<body>

<tag:navigator/>
<tag:header/>

<div class="fetch_body">

    <div class="news_body">
        <%--<form action="${pageContext.request.contextPath}/users" method="post">--%>
        <form action="${pageContext.request.contextPath}/users" method="post">
            <%--<input type="hidden" name="id" ${sessionScope.news[param.index-1].getId()}>--%>
            <div class="img_container">
                <label class="imgs">
                    <c:forEach var="url" items="${sessionScope.selectedNews.urls}">
                        <div class="img-wrapper">
                            <img src="${pageContext.request.contextPath}/${url}">
                        </div>
                    </c:forEach>
                </label>
            </div>
            <div>
                <label>
                    <textarea class="id" name="id" hidden>${sessionScope.selectedNews.id}</textarea>
                </label>
                <input type="hidden" name="command" value="news_update_command"/>

                <label>
                <textarea class="title" name="title" id="title" contenteditable="true" aria-multiline="false"
                          autocomplete="off" readonly
                          rows="1">${sessionScope.selectedNews.title}</textarea>
                </label>
                <%--<div class="title">--%>
                <%--${sessionScope.news[param.index-1].title}--%>
                <%--</div>--%>
                <label>
                 <textarea class="short_text" name="short_text" id="short_text" contenteditable="true"
                           autocomplete="off" readonly
                           rows="1">${sessionScope.selectedNews.shortText}</textarea>
                </label>
                <%--<div class="short_text">--%>
                <%--${sessionScope.news[param.index-1].shortText}--%>
                <%--</div>--%>
                <label>
                 <textarea class="full_text" name="full_text" id="full_text" contenteditable="true" autocomplete="off"
                           readonly
                 >${sessionScope.selectedNews.fullText}</textarea>
                </label>
                <%--<div class="full_text">--%>
                <%--${sessionScope.news[param.index-1].fullText}--%>
                <%--</div>--%>
                <div class="sub_section">
                    <div class="left">
                        <label>
                         <textarea class="published_in" name="published_in" id="published_in" contenteditable="true"
                                   autocomplete="off" readonly
                                   rows="1"
                         >${sessionScope.selectedNews.publishedIn}</textarea>
                        </label>
                        <%--<div class="published_in">--%>
                        <%--${sessionScope.news[param.index-1].publishedIn}--%>
                        <%--</div>--%>
                        <label>
                         <textarea class="author" name="author" id="author" contenteditable="true" autocomplete="off"
                                   rows="1" readonly>
                             ${sessionScope.selectedNews.author.name} ${sessionScope.selectedNews.author.lastName}</textarea>
                        </label>
                        <%--<div class="author">--%>
                        <%--${sessionScope.news[param.index-1].author.name} ${sessionScope.news[param.index-1].author.lastName}--%>
                        <%--</div>--%>
                    </div>
                    <label style="margin-left: auto;">
                    <textarea class="created_in" name="created_in" id="created_in" contenteditable="true"
                              autocomplete="off" rows="1" readonly
                    >${sessionScope.selectedNews.createdIn}</textarea>
                    </label>
                    <%--<div class="created_in">--%>
                    <%--${sessionScope.news[param.index-1].createdIn}--%>
                    <%--</div>--%>
                </div>
                <div class="my-buttonss">
                    <div class="edit-button">
                        <input type="button" id="edit_button" name="edit" value="Edit"/>
                        <script>
                            document.getElementById('edit_button').onclick = function () {
                                document.getElementById('title').removeAttribute('readonly');
                                document.getElementById('short_text').removeAttribute('readonly');
                                document.getElementById('full_text').removeAttribute('readonly');
                                document.getElementById('full_text').removeAttribute('readonly');
                                document.getElementById('published_in').removeAttribute('readonly');
                                document.getElementById('author').removeAttribute('readonly');
                                document.getElementById('created_in').removeAttribute('readonly');
                            };
                        </script>
                    </div>
                    <div class="save-button">
                        <input type="button" id="save-button" name="save" value="Save">
                        <script>
                            document.getElementById('save-button').onclick = function () {
                                document.getElementById('title').getAttribute('readonly');
                                document.getElementById('short_text').getAttribute('readonly');
                                document.getElementById('full_text').getAttribute('readonly');
                                document.getElementById('full_text').getAttribute('readonly');
                                document.getElementById('published_in').getAttribute('readonly');
                                document.getElementById('author').getAttribute('readonly');
                                document.getElementById('created_in').getAttribute('readonly');
                            }
                        </script>
                    </div>
                </div>
            </div>
            <%--<div class="myButtons">--%>
            <%----%>
            <%--</div>--%>
        </form>
        <%--</form>--%>
    </div>

</div>
<tag:fotter/>
</body>
</html>