<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Add Skill Pack</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<div class="header">
    <img src="/images/logo.png">
    <h2>Skill Subscription Hub</h2>
</div>

<div class="container">

    <h2>Add Skill Pack</h2>

    <form action="/add-pack" method="post">

        Title:       <input type="text" name="title"/>       <br><br>
        Description: <input type="text" name="description"/> <br><br>
        Price:       <input type="text" name="price"/>       <br><br>

        <button type="submit">Save</button>

    </form>

    <a href="/packs">Back</a>

</div>

</body>
</html>