/*First Graph: Stock Trend*/
const labels = [
    '01/12/2021',
    '02/12/2021',
    '03/12/2021',
    '04/12/2021',
    '05/12/2021',
    '06/12/2021',
    '07/12/2021',
    '08/12/2021',
    '09/12/2021',
    '10/12/2021',
    '11/12/2021',
    '12/12/2021',
    '13/12/2021',
    '14/12/2021',
    '15/12/2021',
    '16/12/2021',
    '17/12/2021',
    '18/12/2021',
    '19/12/2021',
    '20/12/2021',
    '21/12/2021',
    '22/12/2021',
    '23/12/2021',
    '24/12/2021',
    '25/12/2021',
    '26/12/2021',
    '27/12/2021',
    '28/12/2021',
    '29/12/2021',
    '30/12/2021',
    '31/12/2021',
  ];

  const dataStockMarketTrend = {
    labels: labels,
    datasets: [{
        label: 'Present Value',
        backgroundColor: [
            'rgb(229,229,229)',
        ],                
        borderColor: 'rgb(164,22,34)',
        data: [1, 1, 8, 1, 3, 7, 6, 7, 6, 1, 6, 8, 1, 8, 7, 1, 1, 9, 8,	9, 5, 10, 4, 3, 5, 2, 9, 3, 8, 3, 6],
    }]
  };

  const configStockMarketTrend = {
    type: 'line',
    data: dataStockMarketTrend,
    options: {}
  };

  const stockMarketTrend = new Chart(
    document.getElementById('stockMarketTrend'),
    configStockMarketTrend
  );


/*Late Graph: Histogram*/
const dataHistogram = {
    labels: labels,
    datasets: [{
        label: 'My First Dataset',
        data: [1, 1, 8, 1, 3, 7, 6, 7, 6, 1, 6, 8, 1, 8, 7, 1, 1, 9, 8,	9, 5, 10, 4, 3, 5, 2, 9, 3, 8, 3, 6],
        backgroundColor: [
            'rgba(255, 99, 132, 0.2)',
            'rgba(255, 159, 64, 0.2)',
            'rgba(255, 205, 86, 0.2)',
            'rgba(75, 192, 192, 0.2)',
            'rgba(54, 162, 235, 0.2)',
            'rgba(153, 102, 255, 0.2)',
            'rgba(201, 203, 207, 0.2)'
        ],
        borderColor: [
            'rgb(255, 99, 132)',
            'rgb(255, 159, 64)',
            'rgb(255, 205, 86)',
            'rgb(75, 192, 192)',
            'rgb(54, 162, 235)',
            'rgb(153, 102, 255)',
            'rgb(201, 203, 207)'
        ],
        borderWidth: 1
    }]
};

const configHistogram = {
    type: 'bar',
    data: dataHistogram,
    options: {}
};

const histogram = new Chart(
    document.getElementById('histogram'),
    configHistogram
);