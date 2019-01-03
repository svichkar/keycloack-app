<nav class="navbar navbar-fixed-left navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Keycloack App</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li>
                <a href="help"><span class="glyphicon glyphicon-question-sign"></span> Help</a>
            </li>
            <#if authenticated>
                <li>
                    <a><span class="glyphicon glyphicon-user"></span> ${IDToken.givenName}</a>
                </li>
                <li>
                    <a href="logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a>
                </li>
            <#else>
            <li>
                <a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a>
            </li>
            </#if>
        </ul>
    </div>
</nav>