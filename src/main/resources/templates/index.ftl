<#import "/spring.ftl" as spring />

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Keycloack App</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../static/css/override.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.1/js/bootstrap.min.js"></script>
    <script rel="script" type="text/javascript" src="../static/js/app.js"></script>
</head>
<body>
<#include "header.ftl">
<div class="container">
    <div class="row">
        <#include "endpoint.ftl">
        <#include "endpoint.ftl">
        <#include "endpoint.ftl">
        <#include "endpoint.ftl">
        <#include "endpoint.ftl">
    </div>
</div>
</body>
</html>