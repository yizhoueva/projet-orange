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
        <script type="text/javascript" src="jqplot.dateAxisRenderer.min.js"></script>
        <link rel="stylesheet" type="text/css" href="jquery.jqplot.css" />



        <jsp:useBean id="Coeur" scope="session" class="Application.Coeur" />

        <jsp:useBean id="coeur" scope="session" class="Application.Coeur" />
        <jsp:useBean id="physiologie" scope="session" class="Application.Physiologie" />
        
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $("#datepicker").datepicker({
            onSelect: function(){
            var currentDate = $( ".selector" ).datepicker( "getDate" );
            }        
                });
                $("#datepickerActivite").datepicker();
                $("#datepickerPhysiologie").datepicker();
                $("#datepickerCoeur").datepicker();
                $("#datepickerSommeil").datepicker();
                $("#datepickerGenetique").datepicker();
            });
        </script>
        <script>
            $(function () {

                //graphique Coeur jour 
                var dataSetCoeurJour = {
                    data1: ${Coeur.hrPlot},
                    data2: ${Coeur.bpPlot}
                };
                var optionsCoeur = {
                    series: [{lineWidth: 4, markerOptions: {style: 'square'}}],
                    axes: {xaxis: {renderer: $.jqplot.DateAxisRenderer}}
                };

                var plotCoeurJour = $.jqplot('CoeurJour', [dataSetCoeurJour.data1], optionsCoeur);
                $("input[type=radio][name=dataSeries]").attr("checked", false);
                $("input[type=radio][name=dataSeries][value=data1]").attr("checked", true);
                $("input[type=radio][name=dataSeries]").change(function () {
                    var valCoeurJour = $(this).val();
                    plotCoeurJour.series[0].data = dataSet[valCoeurJour];
                    plotCoeurJour.replot();
                });

                // Graphiques Coeur Semaine
                var dataSetCoeurSemaine = {
                    data1: [[1, 1], [6, 4]],
                    data2: [[1, 3], [5, 5], [6, 7]]
                };
                var optionsCoeurSemaine = {
                    seriesDefaults: {
                        showMarker: false
                    },
                    title: 'Semaine',
                    axes: {
                        xaxis: {},
                        yaxis: {
                            min: 0,
                            max: 12
                        }
                    }
                };

                var plotCoeurSemaine = $.jqplot('CoeurSemaine', [dataSetCoeurSemaine.data1], optionsCoeur);
                $("input[type=radio][name=dataSeries]").attr("checked", false);
                $("input[type=radio][name=dataSeries][value=data1]").attr("checked", true);
                $("input[type=radio][name=dataSeries]").change(function () {
                    var valCoeurSemaine = $(this).val();
                    plotCoeurSemaine.series[0].data = dataSet[valCoeurSemaine];
                    plotCoeurSemaine.replot();
                });


                // Graphiques Coeur Mois
                var dataSetCoeurMois = {
                    data1: [[1, 1], [6, 4]]
                };
                var optionsCoeurMois = {
                    seriesDefaults: {
                        showMarker: false
                    },
                    title: 'Mois',
                    axes: {
                        xaxis: {},
                        yaxis: {
                            min: 0,
                            max: 12
                        }
                    }
                };
                var plotCoeurMois = $.jqplot('CoeurMois', [dataSetCoeurMois.data1], optionsCoeur);
                $("input[type=radio][name=dataSeries]").attr("checked", false);
                $("input[type=radio][name=dataSeries][value=data1]").attr("checked", true);
                $("input[type=radio][name=dataSeries]").change(function () {
                    var valCoeurMois = $(this).val();
                    plotCoeurMois.series[0].data = dataSet[valCoeurMois];
                    plotCoeurMois.replot();
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

// graphiques activites - MOIS
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


                // Graphiques activités - SEMAINE
                var dataSetS = {
                    data1: [[1, 1], [6, 4]],
                    data2: [[1, 3], [5, 5], [6, 7]],
                    data3: [[1, 5], [4, 9], [5, 7], [6, 9]],
                    data4: [[1, 7], [5, 10], [6, 11]]
                };
                var optionsS = {
                    seriesDefaults: {
                        showMarker: false
                    },
                    title: 'Semaine',
                    axes: {
                        xaxis: {},
                        yaxis: {
                            min: 0,
                            max: 12
                        }
                    }
                };

                var plotS = $.jqplot('myChartSemaine', [dataSetS.data1], optionsS);
                $("input[type=radio][name=dataSeries]").attr("checked", false);
                $("input[type=radio][name=dataSeries][value=data1]").attr("checked", true);
                $("input[type=radio][name=dataSeries]").change(function () {
                    var valS = $(this).val();
                    plotS.series[0].data = dataSet[valS];
                    plotS.replot();
                });


                // Graphiques activités  - JOUR
                var dataSetJ = {
                    data1: [[1, 1], [2, 2], [3, 3], [4, 2], [5, 3], [6, 4]],
                    data2: [[1, 3], [2, 4], [3, 5], [4, 6], [5, 5], [6, 7]],
                    data3: [[1, 5], [6, 9]],
                    data4: [[1, 7], [2, 8], [3, 9], [4, 11], [5, 10], [6, 11]]
                };
                var optionsJ = {
                    seriesDefaults: {
                        showMarker: false
                    },
                    title: 'Jour',
                    axes: {
                        xaxis: {},
                        yaxis: {
                            min: 0,
                            max: 12
                        }
                    }
                };

                var plotJ = $.jqplot('myChartJour', [dataSetJ.data1], optionsJ);
                $("input[type=radio][name=dataSeries]").attr("checked", false);
                $("input[type=radio][name=dataSeries][value=data1]").attr("checked", true);
                $("input[type=radio][name=dataSeries]").change(function () {
                    var valJ = $(this).val();
                    plotJ.series[0].data = dataSet[valJ];
                    plotJ.replot();
                });


                //Graphiques Physiologie - Jour

                var dataSetPJ = {
                    data1: ${physiologie.glycemiePlot(1)},
                    data2: [[1, 3], [2, 4], [3, 5], [4, 6], [5, 5], [6, 7]],
                    data3: [[1, 5], [6, 9]],
                    data4: [[1, 7], [2, 8], [3, 9], [4, 11], [5, 10], [6, 11]]
                };
                var optionsPJ = {
                    seriesDefaults: {
                        showMarker: false
                    },
                    title: 'Jour',
                    axes: {
                        xaxis: {},
                        yaxis: {
                            min: 0,
                            max: 12
                        }
                    }
                };
                var plotPJ = $.jqplot('myChartPJour', [dataSetPJ.data1], optionsPJ);
                $("input[type=radio][name=dataSeriesP]").attr("checked", false);
                $("input[type=radio][name=dataSeriesP][value=data1]").attr("checked", true);
                $("input[type=radio][name=dataSeriesP]").change(function () {
                    var valPJ = $(this).val();
                    plotPJ.series[0].data = dataSet[valPJ];
                    plotPJ.replot();
                });
                //Graphiques Physiologie - Semaine
                var dataSetPS = {
                    data1: ${physiologie.glycemiePlot(1)},
                    data2: [[1, 3], [2, 4], [3, 5], [4, 6], [5, 5], [6, 7]],
                    data3: [[1, 5], [6, 9]],
                    data4: [[1, 7], [2, 8], [3, 9], [4, 11], [5, 10], [6, 11]]
                };
                var optionsPS = {
                    seriesDefaults: {
                        showMarker: false
                    },
                    title: 'Semaine',
                    axes: {
                        xaxis: {},
                        yaxis: {
                            min: 0,
                            max: 12
                        }
                    }
                };
                var plotPS = $.jqplot('myChartPSemaine', [dataSetPS.data1], optionsPS);
                $("input[type=radio][name=dataSeriesP]").attr("checked", false);
                $("input[type=radio][name=dataSeriesP][value=data1]").attr("checked", true);
                $("input[type=radio][name=dataSeriesP]").change(function () {
                    var valPS = $(this).val();
                    plotPS.series[0].data = dataSet[valPS];
                    plotPS.replot();
                });
                //graphiques physiologie - Mois

                $("#tabs").tabs();
                $("#table").tabs();
                $("#onglet1").tabs();
                $("#table4").tabs();
                $("#tableSommeil").tabs();
            });</script>
        <script>
            $(document).tooltip();</script>


    </head>



    

    <body>
        <jsp:useBean id="profil" scope="session" class="Application.Profil" />
        <jsp:useBean id="date" scope="session" class="Application.Dates" />


        <table width="800" cellpadding="20" align="middle" border="0"><tr><td>
                    <h2>Bienvenue </h2>
                    <p>
                </td>
                <td>
                    Dernière synchronisation le <jsp:setProperty name="date" property="date" value="now" />${date.date}
                </td>
                <td align="right">
                    <input type="button" onClick="javascript:window.history.go(0)" value="Rafraichir" />
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
                            <img src = "<%=request.getContextPath()%>/images/profil_p.png" align="middle" /> email : <br>
                            <img src = "<%=request.getContextPath()%>/images/balance_p.png" align="middle" title="Poids" /> <br>
                            <img src = "<%=request.getContextPath()%>/images/taille_p.png" align="middle" title="Taille" /> <br>
                            <img src = "<%=request.getContextPath()%>/images/silhouette_p.png" align="middle" title="IMC" /><br>
                            <img src = "<%=request.getContextPath()%>/images/coeur_p.png" align="middle" title="Frequence cardiaque" /> <br>
                            <img src = "<%=request.getContextPath()%>/images/pression_p.png" align="middle" title="Tension" /> <br>
                            <img src = "<%=request.getContextPath()%>/images/oxygene_p.png" align="middle" title="Saturation O2" /> <br>
                            <img src = "<%=request.getContextPath()%>/images/sucre_p.png" align="middle" title="Glycemie" /> <br>
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
                            <input type="text" id="datepicker" name="datechoisie">
                            Date selectionnee : ${test}
                        </td>
                    </tr>
                </table>

            </div>
            <div id="tabs-2">
                <table cellpadding="15">
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
                            <br>
                            Selectionnez une date :<br>
                            <input type="text" id="datepickerActivite">
                            <br>
                            <br>
                            Selectionnez une activité :
                            <br>
                            <jsp:useBean id="act" scope="session" class="Application.Activites" />
                            <select name="selectionActivite">
                                <option>${act.act.get(1)}</option>
                                <option>${act.act.get(2)}</option>
                                <option>${act.act.get(3)}</option>
                                <option>${act.act.get(4)}</option>
                                <option>${act.act.get(5)}</option>
                                <option>${act.act.get(6)}</option>
                                <option>${act.act.get(7)}</option>
                                <option>${act.act.get(8)}</option>
                                <option>${act.act.get(9)}</option>
                                <option>${act.act.get(10)}</option>
                            </select>
                           
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
                        </td>



                        <td valign="top"><div id="table" >
                                <ul>

                                    <li><a href="#table-1">Aujourd'hui</a></li>
                                    <li><a href="#table-2">Semaine</a></li>
                                    <li><a href="#table-3">Mois</a></li></ul>
                                <div id="table-1">


                                    <table><tr>
                                            <td>

                                                <div id="myChartJour" style="height:100%;width:100%; display: inline-block"></div>
                                            </td></tr></table></div>
                                <div id="table-2">
                                    <table><tr>
                                            <td>

                                                <div id="myChartSemaine" style="height:100%;width:100%; display: inline-block"></div>
                                            </td></tr></table></div>
                                <div id="table-3">
                                    <table><tr>
                                            <td>

                                                <div id="myChart" style="height: 300px; width: 500px;"></div>
                                            </td></tr></table></div>

                            </div>
                        </td>
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
                            <ul style="list-style-type:none ; display: inline-block">
                                <FORM>
                                    <img src = "<%=request.getContextPath()%>/images/coeur_p.png" align="middle" title="Frequence cardiaque" /><INPUT name="dataSeries" value="data1" type="radio" checked>Frequence cardiaque<br>

                                    <img src = "<%=request.getContextPath()%>/images/pression_p.png" align="middle" title="Tension" /><INPUT name="dataSeries" value="data2" type="radio" >Tension

                                </FORM>
                            </ul>
                        </td>
                        <td valign="top">
                            <div id="onglet1" >
                                <ul>
                                    <li><a href="#onglet-1">1 jour</a></li>
                                    <li><a href="#onglet-2">1 Semaine</a></li>
                                    <li><a href="#onglet-3">1 Mois</a></li>
                                </ul>
                                <div id="onglet-1">
                                    Selectionner une date :<br>
                                    <input type="text" id="datepickerCoeur">
                                    <table><tr>
                                            <td>
                                                <div id="CoeurJour" style="height:300px;width:800px; display: inline-block"></div>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                                <div id="onglet-2">
                                    <table><tr>
                                            <td>
                                                <div id="CoeurSemaine" style="height:300px;width:800px; display: inline-block"></div>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                                <div id="onglet-3">
                                    <table><tr>
                                            <td>
                                                <div id="CoeurMois" style="height:300px;width:800px; display: inline-block"></div>
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
                                    <li><INPUT name="dataSeriesP" value="data1" type="radio"   CHECKED>Glycémie :</li>
                                    <li><INPUT name="dataSeriesP" value="data3" type="radio">Saturation O² : </li>
                                    <li><INPUT name="dataSeriesP" value="data2" type="radio">IMC :</li>
                                    <li><INPUT name="dataSeriesP" value="data1" type="radio">Poids :</li>
                                    <li><INPUT name="dataSeriesP" value="data2" type="radio">Taille :</li>
                                    <li><INPUT name="dataSeriesP" value="data1" type="radio">Masse graisseuse :</li>
                                </FORM>
                            </ul>
                            <br>
                            Selectionner une date :<br>
                            <input type="text" id="datepickerPhysiologie">

                        </td>
                        <td valign="top"><div id="table4" >
                                <ul><li><a href="#table4-1">Aujourd'hui</a></li>
                                    <li><a href="#table4-2">Semaine</a></li>
                                    <li><a href="#table4-3">Mois</a></li></ul>

                                <div id="table4-1">
                                    <table><tr>
                                            <td>

                                                <div id="myChartPJour" style="height: 300px; width: 500px;"></div>
                                            </td></tr></table></div>
                                <div id="table4-2">
                                    <table><tr>
                                            <td>

                                                <div id="myChartPSemaine" style="height: 300px; width: 500px;"></div>
                                            </td></tr></table></div>
                                <div id="table4-3">
                                    <table><tr>
                                            <td>

                                                <div id="chart0" style="height: 300px; width: 500px;"></div>
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
                            Selectionner un trait de caractère :<br>
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