/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/

/* ESERCIZIO 1
    Dato il seguente array, scrivi del codice per stampare ogni elemento dell'array in console.
*/
const pets = ["dog", "cat", "hamster", "redfish"];
function stampa() {
  for (let i = 0; i < pets.length; i++) {
    console.log(pets[i]);
  }
}
stampa(pets);
/* ESERCIZIO 2
    Scrivi del codice per ordinare alfabeticamente gli elementi dell'array "pets".
*/
function ordineAlfabetico(stringaOrdinata) {
  stringaOrdinata = pets.slice().sort(); //slice crea una copia delle string cosi la stringa originale non viene modificata
  console.log(stringaOrdinata);
}
ordineAlfabetico(pets);
/* ESERCIZIO 3
    Scrivi del codice per stampare nuovamente in console gli elementi dell'array "pets", questa volta in ordine invertito.
*/
function ordineInvertito(stringaInvertito) {
  stringaInvertito = pets.slice().reverse();
  console.log(stringaInvertito);
}
ordineInvertito(pets);

/* ESERCIZIO 4
    Scrivi del codice per spostare il primo elemento dall'array "pets" in ultima posizione.
*/
function spostamento(primaStringa) {
  primaStringa = pets.shift(); // shift() è un metodo che si  utilizza per rimuovere il primo elemento da un array
  pets.push(primaStringa);
  console.log(pets);
}
spostamento(pets);
/* ESERCIZIO 5
    Dato il seguente array di oggetti, scrivi del codice per aggiungere ad ognuno di essi una proprietà "licensePlate" con valore a tua scelta.
*/
const cars = [
  {
    brand: "Ford",
    model: "Fiesta",
    color: "red",
    trims: ["titanium", "st", "active"],
  },
  {
    brand: "Peugeot",
    model: "208",
    color: "blue",
    trims: ["allure", "GT"],
  },
  {
    brand: "Volkswagen",
    model: "Polo",
    color: "black",
    trims: ["life", "style", "r-line"],
  },
];
function addLicensePlate() {
  for (let i = 0; i < cars.length; i++) {
    cars[i].licensePlate = "AA000AA";
  }
  return cars;
}
addLicensePlate(cars);
console.log(cars);
/* ESERCIZIO 6
    Scrivi del codice per aggiungere un nuovo oggetto in ultima posizione nell'array "cars", rispettando la struttura degli altri elementi.
    Successivamente, rimuovi l'ultimo elemento della proprietà "trims" da ogni auto.
*/
nuovoCars = {
  brand: "Nissan",
  model: "Micra",
  color: "Gray",
  trims: ["Visia Limited Edition", "Vibe", "Acenta"],
};
cars.push(nuovoCars);
addLicensePlate(cars);
console.log(cars);
/* ESERCIZIO 7
    Scrivi del codice per salvare il primo elemento della proprietà "trims" di ogni auto nel nuovo array "justTrims", sotto definito.
*/
const justTrims = [];
function salvaElementoJustTrims() {
  for (let i = 0; i < cars.length; i++) {
    justTrims.push(cars[i].trims[0]);
  }
}
salvaElementoJustTrims(cars);
console.log(justTrims);
/* ESERCIZIO 8
    Cicla l'array "cars" e costruisci un if/else statament per mostrare due diversi messaggi in console. Se la prima lettera della proprietà
    "color" ha valore "b", mostra in console "Fizz". Altrimenti, mostra in console "Buzz".
*/
function cicloColor() {
  for (let i = 0; i < cars.length; i++) {
    const colore = cars[i].color; 
    if (colore.indexOf("b") === 0) {
      console.log("Fizz");
    } else {
      console.log("Buzz");
    }
  }
}
cicloColor();
/* ESERCIZIO 9
    Utilizza un ciclo while per stampare in console i valori del seguente array numerico fino al raggiungimento del numero 32.
*/
const numericArray = [
  6, 90, 45, 75, 84, 98, 35, 74, 31, 2, 8, 23, 100, 32, 66, 313, 321, 105,
];
function cicloWhile() {
  let i = 0;
  while (numericArray[i] !== 32) {
    console.log(numericArray[i]);
    i++;
  }
}
cicloWhile();
//console.log(numericArray);
/* ESERCIZIO 10
    Partendo dall'array fornito e utilizzando un costrutto switch, genera un nuovo array composto dalle posizioni di ogni carattere all'interno
    dell'alfabeto italiano.
    es. [f, b, e] --> [6, 2, 5]
*/
const charactersArray = ["g", "n", "u", "z", "d"];

function converssioneDaLetteraANumero(charactersArray) {
  const risultato = [];
  for (let i = 0; i < charactersArray.length; i++) {
    switch (charactersArray[i]) {
      case "a":
        risultato.push(1);
        break;
      case "b":
        risultato.push(2);
        break;
      case "c":
        risultato.push(3);
        break;
      case "d":
        risultato.push(4);
        break;
      case "e":
        risultato.push(5);
        break;
      case "f":
        risultato.push(6);
        break;
      case "g":
        risultato.push(7);
        break;
      case "h":
        risultato.push(8);
        break;
      case "i":
        risultato.push(9);
        break;
      case "l":
        risultato.push(10);
        break;
      case "m":
        risultato.push(11);
        break;
      case "n":
        risultato.push(12);
        break;
      case "o":
        risultato.push(13);
        break;
      case "p":
        risultato.push(14);
        break;
      case "q":
        risultato.push(15);
        break;
      case "r":
        risultato.push(16);
        break;
      case "s":
        risultato.push(17);
        break;
      case "t":
        risultato.push(18);
        break;
      case "u":
        risultato.push(19);
        break;
      case "v":
        risultato.push(20);
        break;
      case "z":
        risultato.push(21);
        break;
      default:
        risultato.push(0);
        break;
    }
  }
  console.log(risultato)
  return risultato;
}
converssioneDaLetteraANumero(charactersArray);

