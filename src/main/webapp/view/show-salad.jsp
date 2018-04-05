<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Salad</title>
    <style>
        .container h2 {
            display: block;
            float: left;
            margin: 20px 0;
        }

        .calories h2 {
            display: block;
            float: right;
        }

        .sort-by {
            display: block;
            float: left;
            margin: 5px 4px;
        }

        .sort-by-label {
            display: block;
            float: left;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Salad</h2>
        <div class="calories">
            <h2>Total calories: <c:out value="${calories}"/></h2>
        </div>
        <table class="table table-hover table-sm">
            <thead>
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Calories in 100g.</th>
                <th scope="col">Weight (g.)</th>

            </tr>
            </thead>
            <tbody>
            <%--<c:forEach var="vegetable" items="${vegetables}" varStatus="loop">--%>
                <%--<tr>--%>
                    <%--<th><c:out value = "${vegetable.name}"/></th>--%>
                    <%--<th><c:out value = "${vegetable.calories}"/></th>--%>
                    <%--<th><c:out value = "${vegetable.weight}"/></th>--%>
                <%--</tr>--%>
            <%--</c:forEach>--%>
            </tbody>
        </table>
        <div class="row">
            <label for="inputMinCalories" class="col-sm-4 col-form-label">Highlight diapason of calories</label>
            <div class="col-sm-4">
                <input type="number" class="form-control" id="inputMinCalories" placeholder="min" name="mincal" min="0">
            </div>
            <div class="col-sm-4">
                <input type="number" class="form-control" id="inputMaxCalories" placeholder="max" name="maxcal" min="0">
            </div>
            <button type="submit" class="btn btn-primary btn-submit" id="filter">Filter</button>
        </div>
    </div>
    <script>
        var min = 0;
        var max = Infinity;
        const data = [
            <c:forEach var="vegetable" items="${vegetables}" varStatus="loop">
            {
                name: '<c:out value = "${vegetable.name}"/>',
                calories: <c:out value = "${vegetable.calories}"/>,
                weight: <c:out value = "${vegetable.weight}"/>
            },
            </c:forEach>
        ];
        document.getElementById('inputMinCalories').addEventListener('change', function (e) {min = e.target.value;});
        document.getElementById('inputMaxCalories').addEventListener('change', function (e) {max = e.target.value;});

        data.forEach(function (item) {
            document.getElementsByTagName('tbody')[0].innerHTML += '<tr>' +
                            '<th>' + item.name + '</th>' +
                            '<th>' + item.calories + '</th>' +
                            '<th>' + item.weight + '</th>' +
                '</tr>';
        });

        document.getElementById('filter').addEventListener('click', function () {
            var tbody = document.getElementsByTagName('tbody')[0];
            tbody.innerHTML = '';
            console.log(min, max)
            for (var item of data) {
                if (item.calories >= min && item.calories <= max) {
                    tbody.innerHTML += '<tr>' +
                        '<th>' + item.name + '</th>' +
                        '<th>' + item.calories + '</th>' +
                        '<th>' + item.weight + '</th>' +
                        '</tr>';
                }
            }
        })
    </script>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script><!-- Optional JavaScript -->

</body>
</html>
