
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="main.css" type="text/css"/>
</head>
<body>
    <h1>SURVEY</h1>
    <p><strong>Here is the information that you entered:</strong></p>
    <label>Email:</label>
    <span>${user.email}</span> <br>
    <label>First Name:</label>
    <span>${user.firstName}</span> <br>
    <label>Last Name:</label>
    <span>${user.lastName}</span> <br>
    <label>Date Of Birth:</label>
    <span>${user.date}</span> <br>
    <p><strong>How did you hear about us?</strong></p>
    <span>${user.radio}</span> <br>
    <p><strong>Announcements and Special Offers Preferences:</strong></p>
    <span>${user.checkBox}</span> <br>
    <p><strong>Please contact me by:</strong></p>
    <span>${user.comBoBox}</span> <br>
    <p>To enter another email address, click on the Back
        button in your browser or the Return button shown
        below .</p>
    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</body>
</html>