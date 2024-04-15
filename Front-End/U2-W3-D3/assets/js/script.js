// async function test(){
//     await fetch ('https://striveschool-api.herokuapp.com/books')
//     .then(response=>{
//         return  response.json();
//     })
//     console.log(response);
// }
// test();
let arrayVuoto = [];

async function test() {
  try {
    const response = await fetch(
      "https://striveschool-api.herokuapp.com/books"
    );
    const data = await response.json();
    inserimento(data);
  } catch (error) {
    console.log("Errore nel recupero dei dati:", error);
  }
}
test();

function inserimento(data) {
  arrayVuoto = data;
  console.log(arrayVuoto);
}
