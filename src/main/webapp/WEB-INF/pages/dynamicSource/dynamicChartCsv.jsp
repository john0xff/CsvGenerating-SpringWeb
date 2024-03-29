<!DOCTYPE html>
<html lang="en">
<head>
    <title id='Description'>jqxChart Column Series Example</title>
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/res/chartjqx/chartTxt/jqx.base.css" type="text/css" />
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/chartjqx/chartTxt/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/chartjqx/chartTxt/jqxcore.js"></script>
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/chartjqx/chartTxt/jqxdraw.js"></script>
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/chartjqx/chartTxt/jqxchart.core.js"></script>
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/chartjqx/chartTxt/jqxdata.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            // prepare chart data as an array            
            var source =
            {
                datatype: "csv",
                datafields: [
                    { name: 'Country' },
                    { name: 'GDP' },
                    { name: 'DebtPercent' },
                    { name: 'Debt' }
                ],
                url: '${ pageContext.request.contextPath }/dynamicCsvDBFile'
            };

            var dataAdapter = new $.jqx.dataAdapter(source, { async: false, autoBind: true, loadError: function (xhr, status, error) { alert('Error loading "' + source.url + '" : ' + error);} });

            // prepare jqxChart settings
            var settings = {
                title: "Economic comparison",
                description: "GDP and Debt in 2010",
                showLegend: true,
                enableAnimations: true,
                padding: { left: 5, top: 5, right: 5, bottom: 5 },
                titlePadding: { left: 90, top: 0, right: 0, bottom: 10 },
                source: dataAdapter,
                xAxis:
                    {
                        dataField: 'Country',
                        showGridLines: true
                    },
                colorScheme: 'scheme04',
                seriesGroups:
                    [
                        {
                            type: 'column',
                            columnsGapPercent: 50,
                            valueAxis:
                            {
                                unitInterval: 5000,
                                displayValueAxis: true,
                                description: 'GDP & Debt per Capita($)'
                            },
                            series: [
                                    { dataField: 'GDP', displayText: 'GDP per Capita'},
                                    { dataField: 'Debt', displayText: 'Debt per Capita' }
                                ]
                        },
                        {
                            type: 'line',
                            valueAxis:
                            {
                                unitInterval: 10,
                                displayValueAxis: false,
                                description: 'Debt (% of GDP)'
                            },
                            series: [
                                    { dataField: 'DebtPercent', displayText: 'Debt (% of GDP)' }
                                ]
                        }

                    ]
            };

            // setup the chart
            $('#chartContainer').jqxChart(settings);

        });
    </script>
</head>
<body class='default'>
	<div id='chartContainer' style="width:850px; height:500px;">
	</div>
</body>
</html>
