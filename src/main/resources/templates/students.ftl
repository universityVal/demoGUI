<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        .c {
            border: 1px solid #333; /* Рамка */
            display: inline-block;
            padding: 5px 15px; /* Поля */
            text-decoration: none; /* Убираем подчёркивание */
            color: #000; /* Цвет текста */
        }
        .c:hover {
            box-shadow: 0 0 5px rgba(0,0,0,0.3); /* Тень */
            background: linear-gradient(to bottom, #fcfff4, #e9e9ce); /* Градиент */
            color: #a00;
        }
    </style>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<table border="1.5" class="table table-dark">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Mark</th>
        <th>Delete</th>


    </tr>

<#list students as students>
    <tr>
        <td>${students.id}</td>
        <td>${students.name}</td>
        <td>${students.mark}</td>
        <td><a href="/student/delete/${students.id}">Delete</a></td>

    </tr>
</#list>

</table>
<div>

    <br>
    <br>
    <fieldset>
        <legend>Add student</legend>
        <form name="student" action="" method="POST">
            <label>Name:</label>
            <input type="text">
            <br>
            <label>Mark:</label>
            <input type="text">
            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>