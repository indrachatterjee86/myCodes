const express = require('express');
const Controller = require('./Controller');

const webApp = express();
const SERVER_PORT = 8080;

webApp.listen(() => {
  console.log('WebServer Listening on port :', SERVER_PORT);
}, SERVER_PORT);

webApp.get('/', (request, response) => {
  console.log('resource request :', request.url);
  response.send({ hello: 'world' });
});
const mainApp = () => {
  console.log('SMS Decided Program');
  console.log('In this console log statement I am testing the print width settings of prettier code formatter');

  const controller = new Controller();
  /**
   * This line of code does not provide any error indication while
   * writing the code and hence is not detectable until production
   * if not unit tested
   */
  controller.display();
  controller.name = 'Hey Hello';
  controller.display();
};

mainApp();
