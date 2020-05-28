<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<!-- a?b:c aの場合はb、a以外はcを行う -->
${Math.random() < 0.5 ? "あたり" : "はずれ"}

<%@include file="../footer.html" %>
