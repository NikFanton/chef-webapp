<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Create salad</title>
    <style>
        .header {
            display: block;
            margin: 20px 0;
        }
        .container h2 {
            float: left;
            width: 35%;

        }
        .submit {
            float: left;
            width: 65%;
        }
        .btn-submit {
            float: right;
            bottom: 30px;
        }

        .sort-by {
            display: block;
            float: none;
            padding-top: 10px;
        }
    </style>
</head>
<body>
    <form method="get" action="${pageContext.request.contextPath}/create-salad/preview">
        <div class="container">
            <div class="header">
                <h2>Create salad</h2>
                <div class="submit">
                    <div class="sort-by">
                        <fieldset class="form-group submit">
                            <div class="row">
                                <legend class="col-form-label col-sm-2 pt-0">Sort&nbsp;by:</legend>
                                <div class="col-sm-10">
                                    <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="sortBy" id="gridRadios1" value="name" checked>
                                        <label class="form-check-label" for="gridRadios1">
                                            Name
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="sortBy" id="gridRadios2" value="calories">
                                        <label class="form-check-label" for="gridRadios2">
                                            Calories
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="sortBy" id="gridRadios3" value="weight">
                                        <label class="form-check-label" for="gridRadios3">
                                            Weight
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </fieldset>
                    </div>
                    <button type="submit" class="btn btn-primary btn-submit">Show salad</button>
                </div>
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
                    <c:forEach var="vegetable" items="${requestScope.vegetables}" varStatus="loop">
                        <tr>
                            <th><c:out value = "${vegetable.name}"/></th>
                            <th><c:out value = "${vegetable.calories}"/></th>
                            <th>
                                <input type="number" class="form-control form-control-sm" name="w${loop.index}" min="0">

                            </th>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </form>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
