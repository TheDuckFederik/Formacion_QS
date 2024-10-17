const http = require("http");

http
  .createServer((request, response) => {
    console.log(request.url);
    if (request.url === "/") {
      response.write("Welcome to the server");
      return response.end();
    }
    if (request.url === "/about") {
      response.write("acerca de");
      return response.end();
    }
    response.write("Hola Kevin ");
    response.end();
  })
  .listen(3000);

console.log("Servidor escuchando en el puerto 3000");
