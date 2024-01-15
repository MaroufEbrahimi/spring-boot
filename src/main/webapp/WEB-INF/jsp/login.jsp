<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>First Web Application</title>
    <link rel="stylesheet" href="../../css/style.css">
</head>
<body>

<div class="login-container">
    <form class="login-form" method="post">
        <h2>Login</h2>
        <input type="text" name="name" placeholder="Username">
        <input type="password" name="password" placeholder="Password">
        <p style="color: red; margin: 0; padding: 0; font-size: 12px">${errorMessage}</p>
        <button type="submit">Login</button>
    </form>
</div>
</body>
</html>