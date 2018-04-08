<html>
<head>
    <title>Chef</title>
    <style>
        .form-checker {
            display: block;
            float: right;
        }

        .toCreationSalad {
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h2>Chef<hr></h2>
    <div>
        If you ready, let's get it started!
    </div>
    <div class="form-check form-checker">
        <input class="form-check-input" type="radio" name="lang" id="langRu" value="option2">
        <label class="form-check-label" for="langRu">
            Rus
        </label>
    </div>
    <div class="form-check form-checker">
        <input class="form-check-input" type="radio" name="lang" id="langUa" value="option2">
        <label class="form-check-label" for="langUa">
            Ukr
        </label>
    </div>
    <div class="form-checker">
        <input class="form-check-input" type="radio" name="lang" id="langEn" value="en" checked>
        <label class="form-check-label" for="langEn">
            Eng
        </label>
    </div>
    <div class="toCreationSalad">
        <a href="${pageContext.request.contextPath}/create-salad">Create Salad</a>
    </div>

</body>
</html>
