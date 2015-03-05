<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demonstrateur</title>

        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.2/jquery.min.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.12/jquery-ui.min.js"></script>
        <link rel="stylesheet" type="text/css" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.12/themes/smoothness/jquery-ui.css" />


        <script type="text/javascript">

            jQuery(document).ready(function ($) {
                $("#datepicker").datepicker();
            });
        </script>
        <script>
            $(function () {
                $("#tabs").tabs();
            });
        </script>
    </head>

    <body>
        <h1>Bienvenue</h1>

        <div id="tabs">
            <ul>
                <li><a href="#tabs-1">Profil</a></li>
                <li><a href="#tabs-2">Fitness</a></li>
                <li><a href="#tabs-3">Routine</a></li>
            </ul>
            <div id="tabs-1">
                <div>
                <p><img src = "<%=request.getContextPath()%>/images/profil_p.png" alt="" /> Jean Dupond</p>
                <p><img src = "<%=request.getContextPath()%>/images/balance_p.png" alt="" /> 80 Kg</p>
                <p><img src = "<%=request.getContextPath()%>/images/taille_p.png" alt="" /> 180 cm</p>
                <p><img src = "<%=request.getContextPath()%>/images/silhouette_p.png" alt="" /> 24.7</p>
                <p><img src = "<%=request.getContextPath()%>/images/coeur_p.png" alt="" /> 70 bpm</p>
                <p><img src = "<%=request.getContextPath()%>/images/pression_p.png" alt="" /> 12 / 9 cmHg</p>
                <p><img src = "<%=request.getContextPath()%>/images/oxygene_p.png" alt="" /> 95%</p>
                <p><img src = "<%=request.getContextPath()%>/images/sucre_p.png" alt="" /> 0.83 g/L</p>
                <p><img src = "<%=request.getContextPath()%>/images/activité_p.png" alt="" /></p>
                <p><img src = "<%=request.getContextPath()%>/images/sommeil_p.png" alt="" /></p>
                </div>
                <div>
                    <h1>Bijour</h1>
                </div>
            </div>
            <div id="tabs-2">
                <p>Onglet Fitness</p>
                <input type="text" id="datepicker"></div>

            <div id="tabs-3">
                <p>C'est la routine</p></div>
        </div>
    </body>
</html>
