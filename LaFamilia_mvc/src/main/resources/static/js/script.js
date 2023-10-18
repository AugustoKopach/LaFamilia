const API_URL = 'http://localhost:8080/0800LaMafilia';

// Realizar una solicitud GET a la API
fetch(API_URL)
  .then(response => {
    if (!response.ok) {
      throw new Error('No se pudo obtener la información de la API');
    }
    return response.json(); // Analizar la respuesta JSON
  })
  .then(data => {
    // Manipula los datos recibidos aquí
    console.log(data); // Imprime los datos en la consola, puedes hacer lo que necesites con ellos
  })
  .catch(error => {
    console.error(error); // Manejo de errores
  });