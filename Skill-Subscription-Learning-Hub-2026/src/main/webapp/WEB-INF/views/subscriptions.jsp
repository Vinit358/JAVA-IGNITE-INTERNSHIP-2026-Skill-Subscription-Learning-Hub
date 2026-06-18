<!--
	Why it is used:

	This page handles the final step: enrolling or purchasing a pack.

	What it does:
	Shows selected plan details
	Takes confirmation (and maybe payment info)
	Subscribes user to a course/package
	Stores subscription in DB
	Why it is needed:

	This is the core transaction page:

	Links user + course/package
	Activates access after selection
	Simple flow:

	User selects pack - comes here - confirms - subscription saved
-->

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>My Subscriptions</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<div class="header">
    <img src="/images/logo.png">
    <h2>My Subscriptions</h2>
</div>

<div class="container">

    <h2>My Subscriptions</h2>

    <!-- show message if no subscriptions -->
    <c:if test="${empty subs}">
        <p>You have not subscribed to any pack yet.</p>
    </c:if>

    <!-- show subscriptions table -->
    <c:if test="${not empty subs}">
        <table border="1">

            <tr>
                <th>Skill Pack</th>
                <th>Start Date</th>
                <th>End Date</th>
                <th>Status</th>
            </tr>

            <c:forEach var="s" items="${subs}">
                <tr>
                    <td>${s.skillPack.title}</td>
                    <td>${s.startDate}</td>
                    <td>${s.endDate}</td>
                    <td>${s.status}</td>
                </tr>
            </c:forEach>

        </table>
    </c:if>

</div>

</body>
</html>