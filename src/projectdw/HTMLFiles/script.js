let JSONData='{"elaborations":{"results":[{"c":164.77,"h":170.3,"l":164.53,"o":167.48,"t":1638334800000},{"c":163.76,"h":164.2,"l":157.8,"o":158.735,"t":1638421200000},{"c":161.84,"h":164.96,"l":159.72,"o":164.02,"t":1638507600000},{"c":165.32,"h":167.8799,"l":164.28,"o":164.29,"t":1638766800000},{"c":171.18,"h":171.58,"l":168.34,"o":169.08,"t":1638853200000},{"c":175.08,"h":175.96,"l":170.7,"o":172.125,"t":1638939600000},{"c":174.56,"h":176.75,"l":173.92,"o":174.91,"t":1639026000000},{"c":179.45,"h":179.63,"l":174.69,"o":175.205,"t":1639112400000},{"c":175.74,"h":182.13,"l":175.53,"o":181.115,"t":1639371600000},{"c":174.33,"h":177.74,"l":172.21,"o":175.25,"t":1639458000000},{"c":179.3,"h":179.5,"l":172.3108,"o":175.11,"t":1639544400000},{"c":172.26,"h":181.14,"l":170.75,"o":179.28,"t":1639630800000},{"c":171.14,"h":173.47,"l":169.69,"o":169.93,"t":1639717200000},{"c":169.75,"h":170.58,"l":167.46,"o":168.28,"t":1639976400000},{"c":172.99,"h":173.2,"l":169.12,"o":171.555,"t":1640062800000},{"c":175.64,"h":175.86,"l":172.15,"o":173.04,"t":1640149200000},{"c":176.28,"h":176.8499,"l":175.27,"o":175.85,"t":1640235600000},{"c":180.33,"h":180.42,"l":177.07,"o":177.085,"t":1640581200000},{"c":179.29,"h":181.33,"l":178.53,"o":180.16,"t":1640667600000},{"c":179.38,"h":180.63,"l":178.14,"o":179.33,"t":1640754000000},{"c":178.2,"h":180.57,"l":178.09,"o":179.47,"t":1640840400000},{"c":177.57,"h":179.23,"l":177.26,"o":178.085,"t":1640926800000}],"theoricalMaximum":85,"howMuch":10,"percentage":0.0,"frequentValues":{"164":1,"167":1,"168":1,"169":1,"171":1,"172":1,"173":1,"174":1,"175":1,"177":1,"178":1,"179":1,"180":1,"181":1,"158":1}},"infoStock":{"symbol":"AAPL","exchange":"Nasdaq Global Select","name":"Apple Inc.","hq_address":"1 Infinite Loop Cupertino CA, 95014","description":"Apple Inc is designs, manufactures and markets mobile communication and media devices and personal computers, and sells a variety of related software, services, accessories, networking solutions and third-party digital content and applications."}}'
/*First Graph: Stock Trend*/
const obj=JSON.parse(JSONData);
document.getElementById('howMuch').innerHTML=obj.elaborations.howMuch;
document.getElementById('percentage').innerHTML=obj.elaborations.percentage;
document.getElementById('theoricalMaximum').innerHTML=obj.elaborations.theoricalMaximum;
document.getElementById('name').innerHTML=obj.infoStock.name;
document.getElementById('description').innerHTML=obj.infoStock.description;
document.getElementById('symbol').innerHTML=obj.infoStock.symbol;
document.getElementById('hq_address').innerHTML=obj.infoStock.hq_address;
document.getElementById('exchange').innerHTML=obj.infoStock.exchange;

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

const data = {
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


const data2 = {
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

const config = {
    type: 'line',
    data: data,
    options: {}
};

const config2 = {
    type: 'bar',
    data: data2,
    options: {}
};

const myChart = new Chart(
    document.getElementById('myChart'),
    config
);

const myChart2 = new Chart(
    document.getElementById('myChart2'),
    config2
);


