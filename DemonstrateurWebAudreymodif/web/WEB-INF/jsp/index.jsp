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
        <script type="text/javascript" src="jqplot.barRenderer.min.js"></script>
        <script type="text/javascript" src="jqplot.categoryAxisRenderer.min.js"></script>
        <script type="text/javascript" src="jqplot.pointLabels.min.js"></script>
        <link rel="stylesheet" type="text/css" href="jquery.jqplot.css" />

        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $("#datepicker").datepicker();
                $("#datepickerCoeur").datepicker();
                $("#datepickerSommeil").datepicker();
                $("#datepickerGenetique").datepicker();
            });</script>
        <script>
            $(function () {
                var plot0 = $.jqplot('chart0', [[[0, 68], [1, 73], [2, 67], [3, 65], [4, 71], [5, 80], [6, 86], [7, 73], [8, 58], [9, 69], [10, 85], [11, 81], [12, 78], [13, 70], [14, 53]]], {title: 'Heart Rates',
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
                var plot7 = $.jqplot('chartSommeil1', [[[1, 6], [3, 7], [5, 8], [7, 5], [9, 9], [11, 10]]], {title: 'Hours Asleep Per Day',
                    axes: {yaxis: {min: -10, max: 20}},
                    seriesDefaults: {
                        renderer: $.jqplot.BarRenderer,
                        rendererOptions: {
                            // Put a 30 pixel margin between bars.
                            barMargin: 30,
                            // Highlight bars when mouse button pressed.
                            // Disables default highlighting on mouse over.
                            highlightMouseDown: true
                        },
                        pointLabels: {show: true}
                    }
                });
                var plot8 = $.jqplot('chartSommeil12', [[[1, 7], [3, 8], [5, 5], [7, 12], [9, 6], [11, 8]]], {title: 'Hours Asleep Per Day',
                    seriesDefaults: {
                        renderer: $.jqplot.BarRenderer,
                        rendererOptions: {
                            // Put a 30 pixel margin between bars.
                            barMargin: 30,
                            // Highlight bars when mouse button pressed.
                            // Disables default highlighting on mouse over.
                            highlightMouseDown: true
                        },
                        pointLabels: {show: true}
                    },
                    axes: {
                        xaxis: {
                            renderer: $.jqplot.CategoryAxisRenderer
                        },
                        yaxis: {
                            // Don't pad out the bottom of the data range.  By default,
                            // axes scaled as if data extended 10% above and below the
                            // actual range to prevent data points right on grid boundaries.
                            // Don't want to do that here.
                            padMin: 0
                        }
                    }
                });
                var plot9 = $.jqplot('chartSommeil13', [[[1, 27], [3, 5.12], [5, 2], [7, 33.6], [9, 85.9], [11, 219.9]]], {title: 'Hours Asleep Per Day',
                    axes: {yaxis: {min: -10, max: 240}},
                    seriesDefaults: {
                        renderer: $.jqplot.BarRenderer,
                        rendererOptions: {
                            // Put a 30 pixel margin between bars.
                            barMargin: 30,
                            // Highlight bars when mouse button pressed.
                            // Disables default highlighting on mouse over.
                            highlightMouseDown: true
                        },
                        pointLabels: {show: true}
                    }
                });


                var dataSet = {
                    data1: [[1, 1], [2, 2], [3, 3], [4, 2], [5, 3], [6, 4]],
                    data2: [[1, 3], [2, 4], [3, 5], [4, 6], [5, 5], [6, 7]],
                    data3: [[1, 5], [2, 6], [3, 8], [4, 9], [5, 7], [6, 9]],
                    data4: [[1, 7], [2, 8], [3, 9], [4, 11], [5, 10], [6, 11]]
                };
                var options = {
                    seriesDefaults: {
                        showMarker: false
                    },
                    title: 'Series selection',
                    axes: {
                        xaxis: {},
                        yaxis: {
                            min: 0,
                            max: 12
                        }
                    }
                };

                var plotB = $.jqplot('myChart', [dataSet.data1], options);
                $("input[type=radio][name=dataSeries]").attr("checked", false);
                $("input[type=radio][name=dataSeries][value=data1]").attr("checked", true);
                $("input[type=radio][name=dataSeries]").change(function () {
                    var val = $(this).val();
                    plotB.series[0].data = dataSet[val];
                    plotB.replot();
                });
                $("#tabs").tabs();
                $("#table").tabs();
                $("#onglet1").tabs();
                $("#onglet2").tabs();
                $("#table4").tabs();
                $("#tableSommeil").tabs();
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
        <jsp:useBean id="test" scope="session" class="Application.Utilisateur"/> 
        <jsp:useBean id="onglet4" scope="session" class="Application.Physiologie"/>
        <jsp:useBean id="coeur" scope="session" class="Application.Coeur"/>
        <jsp:useBean id="poids" scope="session" class="Application.Utilisateur" />
        <jsp:useBean id="unitPoids" scope="session" class="Application.Utilisateur" />
        <jsp:useBean id="taille" scope="session" class="Application.Utilisateur" />
        <jsp:useBean id="unitTaille" scope="session" class="Application.Utilisateur" />
        <jsp:useBean id="IMC" scope="session" class="Application.Utilisateur" />
        <jsp:useBean id="unitIMC" scope="session" class="Application.Utilisateur" />
        <jsp:useBean id="BPM" scope="session" class="Application.Utilisateur" />
        <jsp:useBean id="unitBPM" scope="session" class="Application.Utilisateur" />
        <jsp:useBean id="systolic" scope="session" class="Application.Utilisateur" />
        <jsp:useBean id="diastolic" scope="session" class="Application.Utilisateur" />
        <jsp:useBean id="tensionUnit" scope="session" class="Application.Utilisateur" />
        <jsp:useBean id="BO" scope="session" class="Application.Utilisateur" />
        <jsp:useBean id="unitBO" scope="session" class="Application.Utilisateur" />
        <jsp:useBean id="BG" scope="session" class="Application.Utilisateur" />
        <jsp:useBean id="unitBG" scope="session" class="Application.Utilisateur" />
        <table width="800" cellpadding="20" align="middle" border="0"><tr><td>
                    <h1>Bienvenue</h1>
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
                            <img src = "<%=request.getContextPath()%>/images/balance_p.png" align="middle" title="Poids" /> <jsp:getProperty name="poids" property="poids" /> <jsp:getProperty name="unitPoids" property="unitPoids" /><br>
                            <img src = "<%=request.getContextPath()%>/images/taille_p.png" align="middle" title="Taille" /> <jsp:getProperty name="taille" property="taille" /> <jsp:getProperty name="unitTaille" property="unitTaille" /><br>
                            <img src = "<%=request.getContextPath()%>/images/silhouette_p.png" align="middle" title="IMC" /> <jsp:getProperty name="IMC" property="IMC" /> <jsp:getProperty name="unitIMC" property="unitIMC" /><br>
                            <img src = "<%=request.getContextPath()%>/images/coeur_p.png" align="middle" title="Frequence cardiaque" /> <jsp:getProperty name="BPM" property="BPM" /> <jsp:getProperty name="unitBPM" property="unitBPM" /><br>
                            <img src = "<%=request.getContextPath()%>/images/pression_p.png" align="middle" title="Tension" /> <jsp:getProperty name="systolic" property="systolic" /> / <jsp:getProperty name="diastolic" property="diastolic" /> <jsp:getProperty name="tensionUnit" property="tensionUnit" /><br>
                            <img src = "<%=request.getContextPath()%>/images/oxygene_p.png" align="middle" title="Saturation O2" /><jsp:getProperty name="BO" property="BO" /> <jsp:getProperty name="unitBO" property="unitBO" /><br>
                            <img src = "<%=request.getContextPath()%>/images/sucre_p.png" align="middle" title="Glycemie" /> <jsp:getProperty name="BG" property="BG" /> <jsp:getProperty name="unitBG" property="unitBG" /><br>
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
                        </td>
                        <td valign="top">
                            <ul style="list-style-type:none ; display: inline-block">
                                <FORM>
                                    <li><INPUT name="dataSeries" value="data1" type="radio"   CHECKED>Durée</li>
                                    <li><INPUT name="dataSeries" value="data2" type="radio" >Calories</li>
                                    <li><INPUT name="dataSeries" value="data3" type="radio" >Distance</li>
                                    <li><INPUT name="dataSeries" value="data4" type="radio" >Pas</li>
                                </FORM>
                            </ul>



                        <td valign="top"><div id="table" >
                                <ul>

                                    <li><a href="#table-1">Aujourd'hui</a></li>
                                    <li><a href="#table-2">Semaine</a></li>
                                    <li><a href="#table-3">Mois</a></li></ul>
                                <div id="table-1">
                                    <table><tr>
                                            <td>

                                                <div id="chart0" style="height:100%;width:100%; display: inline-block"></div>
                                            </td></tr></table></div>
                                <div id="table-2">
                                    <table><tr>
                                            <td>

                                                <div id="chart0" style="height:100%;width:100%; display: inline-block"></div>
                                            </td></tr></table></div>
                                <div id="table-3">
                                    <table><tr>
                                            <td>

                                                <div id="myChart" style="height: 300px; width: 500px;"></div>
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
                            <img src = "<%=request.getContextPath()%>/images/coeur_p.png" align="middle" title="Frequence cardiaque" /> <jsp:getProperty name="coeur" property="freqcardio" /><jsp:getProperty name="coeur" property="unitHR" /><br>
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
                            <img src = "<%=request.getContextPath()%>/images/pression_p.png" align="middle" title="Tension" /><jsp:getProperty name="coeur" property="systolic" />/<jsp:getProperty name="coeur" property="diastolic" /><jsp:getProperty name="coeur" property="unitTen" /><br> 
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
                                    <li><INPUT type="radio" name="choix1" value="1">Glycémie : <jsp:getProperty name="onglet4" property="glycemie" /> g/L</li>
                                    <li><INPUT type="radio" name="choix1" value="2">Saturation O² : <jsp:getProperty name="onglet4" property="sat" />%</li>
                                    <li><INPUT type="radio" name="choix1" value="3">IMC : <jsp:getProperty name="onglet4" property="imc" /> kg/cm²</li>
                                    <li><INPUT type="radio" name="choix1" value="4">Poids : <jsp:getProperty name="onglet4" property="poids" /> kg</li>
                                    <li><INPUT type="radio" name="choix1" value="5">Taille : <jsp:getProperty name="onglet4" property="taille" /> mm</li>
                                    <li><INPUT type="radio" name="choix1" value="6">Masse graisseuse : <jsp:getProperty name="onglet4" property="graisse" />%</li>
                                </FORM>
                            </ul>
                        </td>
                        <td valign="top"><div id="table4" >
                                <ul><li><a href="#table4-1">Aujourd'hui</a></li>
                                    <li><a href="#table4-2">Semaine</a></li>
                                    <li><a href="#table4-3">Mois</a></li></ul>
                                <li><a href="#table4-1">Aujourd'hui</a></li>
                                <li><a href="#table4-2">Semaine</a></li>
                                <li><a href="#table4-3">Mois</a></li></ul>
                                <div id="table4-1">
                                    <table><tr>
                                            <td>

                                                <div id="chart0" style="height:100%;width:100%; display: inline-block"></div>
                                            </td></tr></table></div>
                                <div id="table4-2">
                                    <table><tr>
                                            <td>

                                                <div id="chart0" style="height:100%;width:100%; display: inline-block"></div>
                                            </td></tr></table></div>
                                <div id="table4-3">
                                    <table><tr>
                                            <td>

                                                <div id="chart0" style="height:100%;width:100%; display: inline-block"></div>
                                            </td></tr></table></div>

                            </div> </td>
                    </tr>
                </table>
            </div>
            <div id="tabs-5">
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
                            <input type="text" id="datepickerGenetique">
                        </td>
                        <td valign="top">
                            <img src = "<%=request.getContextPath()%>/images/Description.png" align="middle" title="Frequence cardiaque" /><br> 
                            <img src = "<%=request.getContextPath()%>/images/science25.png" align="middle" title="Frequence cardiaque" /><br> 
                            <img src = "<%=request.getContextPath()%>/images/list.png" align="middle" title="Frequence cardiaque" /><br> 
                        </td>
                    </tr>
                </table>
            </div>

            <div id="tabs-6" class="tabcontent">

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
                            <input type="text" id="datepickerSommeil">
                        </td>
                        <td valign="top">
                            <div id="tableSommeil" >
                                <ul>
                                    <li><a href="#onglet-1">Aujourd'hui</a></li>
                                    <li><a href="#onglet-2">Semaine</a></li>
                                    <li><a href="#onglet-3">Mois</a></li>
                                </ul>
                                <div id="onglet-1">
                                    <table><tr>
                                            <td>
                                                <div id="chartSommeil1" style="height:100%;width:100%; display: inline-block"></div>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                                <div id="onglet-2">
                                    <table><tr>
                                            <td>
                                                <div id="chartSommeil12" style="height:100%;width:100%; display: inline-block"></div>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                                <div id="onglet-3">
                                    <table><tr>
                                            <td>
                                                <div id="chartSommeil13" style="height:100%;width:100%; display: inline-block"></div>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                            </div>
                        </td>
                    </tr>
                </table>
            </div>

        </div>





    </body>
</html>