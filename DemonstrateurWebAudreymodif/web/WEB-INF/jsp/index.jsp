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
                var plot0 = $.jqplot('chart0', [[[1, 2], [3, 5.12], [5, 13.1], [7, 33.6], [9, 85.9], [11, 219.9]]], {title: 'Exponential Line',
                    axes: {yaxis: {min: -10, max: 240}},
                    series: [{color: '#5FAB78'}]
                });
                var plot1 = $.jqplot('chart1', [[[1, 2], [3, 5.12], [5, 13.1], [7, 33.6], [9, 85.9], [11, 219.9]]], {title: 'Exponential Line',
                    axes: {yaxis: {min: -10, max: 240}},
                    series: [{color: '#5FAB78'}]
                });
                var plot2 = $.jqplot('chart2', [[[1, 4], [3, 8], [5, 1], [7, 33.6], [9, 85.9], [11, 219.9]]], {title: 'Exponential Line',
                    axes: {yaxis: {min: -10, max: 240}},
                    series: [{color: '#5FAB78'}]
                });
                var plot3 = $.jqplot('chart3', [[[1, 27], [3, 5.12], [5, 2], [7, 33.6], [9, 85.9], [11, 219.9]]], {title: 'Exponential Line',
                    axes: {yaxis: {min: -10, max: 240}},
                    series: [{color: '#5FAB78'}]
                });
                var plot4 = $.jqplot('chart4', [[[1, 2], [3, 5.12], [5, 13.1], [7, 33.6], [9, 85.9], [11, 219.9]]], {title: 'Exponential Line',
                    axes: {yaxis: {min: -10, max: 240}},
                    series: [{color: '#5FAB78'}]
                });
                var plot5 = $.jqplot('chart5', [[[1, 4], [3, 8], [5, 1], [7, 33.6], [9, 85.9], [11, 219.9]]], {title: 'Exponential Line',
                    axes: {yaxis: {min: -10, max: 240}},
                    series: [{color: '#5FAB78'}]
                });
                var plot6 = $.jqplot('chart6', [[[1, 27], [3, 5.12], [5, 2], [7, 33.6], [9, 85.9], [11, 219.9]]], {title: 'Exponential Line',
                    axes: {yaxis: {min: -10, max: 240}},
                    series: [{color: '#5FAB78'}]
                });

                $("#tabs").tabs();
                $("#table").tabs();
                $("#onglet1").tabs();
                $("#onglet2").tabs();
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
        <jsp:useBean id="test" scope="session" class="noyaufonctionnel.Utilisateur"/> 
        <jsp:useBean id="onglet2" scope="session" class="noyaufonctionnel.Activités"/>
        <jsp:useBean id="onglet4" scope="session" class="noyaufonctionnel.Physiologie"/>
        <jsp:useBean id="coeur" scope="session" class="noyaufonctionnel.Coeur"/>
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

        <div id="tabs" >
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
                        <td valign="top">
                            Montrer les données de :
                            <ul style="list-style-type:none">
                                <FORM>
                                    <li><INPUT type="checkbox" name="buttonSource1" value="1">FitBit</li>
                                    <li><INPUT type="checkbox" name="buttonSource2" value="2">RunKeeper</li>
                                    <li><INPUT type="checkbox" name="buttonSource3" value="3">Garmin Connect</li>
                                </FORM>
                            </ul>
                            <ul style="list-style-type:none">
                                <FORM>Type d'activités :
                                    <li><INPUT type="radio" name="buttonActivite" value="1" CHECKED="CHECKED">Repos</li>
                                    <li><INPUT type="radio" name="buttonActivite" value="2">Course</li>
                                    <li><INPUT type="radio" name="buttonActivite" value="3">Marche</li>
                                    <li><INPUT type="radio" name="buttonActivite" value="4">Vélo</li>
                                    <li><INPUT type="radio" name="buttonActivite" value="5">Nage</li>
                                    <li><INPUT type="radio" name="buttonActivite" value="6">Autre</li>
                                </FORM>
                            </ul></td>
                        <td valign="top">
                            <ul style="list-style-type:none ; display: inline-block">
                                <FORM>
                                    <li><INPUT type="radio" name="buttonDonnee" value="1" CHECKED="CHECKED">Durée</li>
                                    <li><INPUT type="radio" name="buttonDonnee" value="2">Calories</li>
                                    <li><INPUT type="radio" name="buttonDonnee" value="3">Distance</li>
                                    <li><INPUT type="radio" name="buttonDonnee" value="4">Pas</li>
                                </FORM>
                            </ul>


                            <ul style="list-style-type:none ">
                                <FORM>
                                    <li><INPUT type="radio" name="buttonDatee" value="1" CHECKED="CHECKED">Aujourd'hui</li>
                                    <li><INPUT type="radio" name="buttonDatee" value="2">Semaine</li>
                                    <li><INPUT type="radio" name="buttonDatee" value="3">Mois</li>
                                </FORM>
                            </ul></td>
                        <td valign="top"><div id="table" >
                                <ul>

                                    <li><a href="#table-1">Durée</a></li>
                                    <li><a href="#table-2">Calories</a></li>
                                    <li><a href="#table-3">Distance</a></li>
                                    <li><a href="#table-4">Pas</a></li>
                                </ul>
                                <div id="table-1">
                                    <table><tr>
                                            <td>

                                                <div id="chart0" style="height:100%;width:100%; display: inline-block"></div>
                                            </td></tr></table></div>
                            </div> </td>
                    </tr>
                </table>


            </div>

            <div id="tabs-3">

                <table cellpadding="15">
                    <tr>
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
                        <td valign="top">
                            <img src = "<%=request.getContextPath()%>/images/coeur_p.png" align="middle" title="Frequence cardiaque" /> <jsp:getProperty name="coeur" property="freqcardio" /> bpm<br>
                            <div id="onglet1" >
                                <ul>
                                    <li><a href="#onglet-1">Aujourd'hui</a></li>
                                    <li><a href="#onglet-2">Semaine</a></li>
                                    <li><a href="#onglet-3">Mois</a></li>
                                </ul>
                                <div id="onglet-1">
                                    <table><tr>
                                            <td>
                                                <div id="chart1" style="height:100%;width:100%; display: inline-block"></div>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                                <div id="onglet-2">
                                    <table><tr>
                                            <td>
                                                <div id="chart2" style="height:100%;width:100%; display: inline-block"></div>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                                <div id="onglet-3">
                                    <table><tr>
                                            <td>
                                                <div id="chart3" style="height:100%;width:100%; display: inline-block"></div>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                            </div>

                        </td>
                        <td valign="top">
                            <img src = "<%=request.getContextPath()%>/images/pression_p.png" align="middle" title="Tension" /><jsp:getProperty name="coeur" property="systolic" />/<jsp:getProperty name="coeur" property="diastolic" />cmHg<br> 
                            <div id="onglet2" >
                                <ul>
                                    <li><a href="#onglet-1">Aujourd'hui</a></li>
                                    <li><a href="#onglet-2">Semaine</a></li>
                                    <li><a href="#onglet-3">Mois</a></li>
                                </ul>
                                <div id="onglet-1">
                                    <table><tr>
                                            <td>
                                                <div id="chart4" style="height:100%;width:100%; display: inline-block"></div>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                                <div id="onglet-2">
                                    <table><tr>
                                            <td>
                                                <div id="chart5" style="height:100%;width:100%; display: inline-block"></div>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                                <div id="onglet-3">
                                    <table><tr>
                                            <td>
                                                <div id="chart6" style="height:100%;width:100%; display: inline-block"></div>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                            </div> 
                        </td>
                    </tr>
                </table>

            </div>


            <div id="tabs-4">
                <table>
                    <tr>
                        <td valign="top">
                            <ul style="list-style-type:none">
                                <FORM>
                                    <li><INPUT type="checkbox" name="choix1" value="1">Glycémie : <jsp:getProperty name="onglet4" property="glycemie" /> g/L</li>
                                    <li><INPUT type="checkbox" name="choix2" value="2">Saturation O² : <jsp:getProperty name="onglet4" property="sat" />%</li>
                                    <li><INPUT type="checkbox" name="choix3" value="3">Tension : <jsp:getProperty name="onglet4" property="tensionS" />/<jsp:getProperty name="onglet4" property="tensionD" />cm/Hg</li>
                                    <li><INPUT type="checkbox" name="choix4" value="3">IMC : <jsp:getProperty name="onglet4" property="imc" /> kg/cm²</li>
                                    <li><INPUT type="checkbox" name="choix5" value="3">Poids : <jsp:getProperty name="onglet4" property="poids" /> kg</li>
                                    <li><INPUT type="checkbox" name="choix6" value="3">Taille : <jsp:getProperty name="onglet4" property="taille" /> mm</li>
                                    <li><INPUT type="checkbox" name="choix7" value="3">Masse graisseuse : <jsp:getProperty name="onglet4" property="graisse" />%</li>
                                </FORM>
                            </ul>
                        </td>

                    </tr>
                </table>
            </div>
            <div id="tabs-5">




            </div>

            <div id="tabs-6" class="tabcontent">

                <div id="table" >
                    <ul>
                        <li><a href="#table-1">test1</a></li>
                        <li><a href="#table-2">test2</a></li>
                        <li><a href="#table-3">test3</a></li>
                    </ul></div>

            </div>

        </div>





    </body>
</html>