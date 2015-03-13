<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demonstrateur</title>

        <!-- Importation JQuery et JQuery UI -->
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/jquery-ui.min.js"></script>
        <link rel="stylesheet" type="text/css" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/themes/smoothness/jquery-ui.css" />


        <script language="javascript" type="text/javascript" src="jquery.min.js"></script>
        <script language="javascript" type="text/javascript" src="jquery.jqplot.min.js"></script>
        <link rel="stylesheet" type="text/css" href="jquery.jqplot.css" />

        <script type="text/javascript">

            jQuery(document).ready(function ($) {
                $("#datepicker").datepicker();
            });</script>
        <script>
            $(function () {

                var plot1 = $.jqplot('chartdiv', [[[1, 2], [3, 5.12], [5, 13.1], [7, 33.6], [9, 85.9], [11, 219.9]]], {title: 'Exponential Line',
                    axes: {yaxis: {min: -10, max: 240}},
                    series: [{color: '#5FAB78'}]
                });

                $("#tabs").tabs();
            });</script>
        <script>
            $(document).tooltip();</script>

        <style>
            td {
                border-right: 1px dotted coral;

            }
        </style>


        <script type="text/javascript">
        </script>


    </head>

    <body>
        <jsp:useBean id="test" scope="session" class="noyaufonctionnel.Utilisateur" />

        <table width="800" cellpadding="20" align="middle" border="0"><tr><td>
                    <h1>Bienvenue Chachou </h1>
                    <p>

                </td>
                <td>
                    Dernière synchronisation le 10/03/2015 à 9h05
                </td>
                <td align="right">
                    <button id="button">Rafraichir</button>
                </td></tr></table>

        <div id="tabs">
            <ul>
                <li><a href="#tabs-1">Profil</a></li>
                <li><a href="#tabs-2">Activités</a></li>
                <li><a href="#tabs-3">Coeur</a></li>
                <li><a href="#tabs-4">Physiologie</a></li>
                <li><a href="#tabs-5">Génétique</a></li>
                <li><a href="#tabs-6">Sommeil</a></li>
            </ul>
            <div id="tabs-1">
                <table cellpadding="15">
                    <tr>
                        <td>
                            <img src = "<%=request.getContextPath()%>/images/profil_p.png" align="middle" /> email : <jsp:getProperty name="test" property="email" /><br>
                            <img src = "<%=request.getContextPath()%>/images/balance_p.png" align="middle" title="Poids" /> 80 Kg<br>
                            <img src = "<%=request.getContextPath()%>/images/taille_p.png" align="middle" title="Taille" /> 180 cm<br>
                            <img src = "<%=request.getContextPath()%>/images/silhouette_p.png" align="middle" title="IMC" /> 24.7<br>
                            <img src = "<%=request.getContextPath()%>/images/coeur_p.png" align="middle" title="Frequence cardiaque" /> 70 bpm<br>
                            <img src = "<%=request.getContextPath()%>/images/pression_p.png" align="middle" title="Tension" /> 12 / 9 cmHg<br>
                            <img src = "<%=request.getContextPath()%>/images/oxygene_p.png" align="middle" title="Saturation O2" /> 95%<br>
                            <img src = "<%=request.getContextPath()%>/images/sucre_p.png" align="middle" title="Glycemie" /> 0.83 g/L<br>
                            <img src = "<%=request.getContextPath()%>/images/activité_p.png" align="middle" title="Activité sportive" /><br>
                            <img src = "<%=request.getContextPath()%>/images/sommeil_p.png" align="middle" title="Sommeil" /><br>
                        </td>
                        <td valign="top">
                            Montrer les données de :
                            <ul style="list-style-type:none">
                                <FORM>
                                    <li><INPUT type="checkbox" name="choix1" value="1">FitBit</li>
                                    <li><INPUT type="checkbox" name="choix2" value="2">RunKeeper</li>
                                    <li><INPUT type="checkbox" name="choix3" value="3">Garmin Connect</li>
                                </FORM>
                            </ul>
                            <br>
                            Selectionner une date :<br>
                            <input type="text" id="datepicker">


                        </td>
                    </tr>
                </table>

            </div>
            <div id="tabs-2">
                <table>
                    <tr>
                        <td>
                            <div id="chartdiv" style="height:100%;width:100%; "></div>
                        </td>
                    </tr>
                </table>
                

            </div>

            <div id="tabs-3">


            </div>


            <div id="tabs-4"></div>
            <div id="tabs-5"></div>
            <div id="tabs-6"></div>
        </div>




    </body>
</html>