/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/

/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
          I principali datatype di JS sono stringhe,numeri,booleani, Null e undefined:
          Stringhe -> si rappresentano con "" o '' e all'interno alle virgolete puoi scrivere tutti caratteri possibili es let name='ciao Mondo';
          Numeri -> per dichiarare un numero su JS basta scrivere la variabile e poi il numero senza definire che tipo di numero e' es n1=12;
          Booleani -> Puo avere solamente valori true o false es cons veroOFalso=false  
          Null -> Quando vogliamo che una variabile non abbia valore perche anche il 0 ha un valore 
          undefined -> Quando non abbiamo specificato nessun valore alla variabile
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 2
 Crea una variable chiamata "myName" e assegna ad essa il tuo nome, sotto forma di stringa.
 
*/
let name = 'Mishel';
  console.log(name);
/* SCRIVI QUI LA TUA RISPOSTA
 
*/

/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.

*/
 let numero1=12;
  let numero2=20;
  let numero_risultato=null;
  numero_risultato=numero1+numero2;
  console.log(numero_risultato);
/* SCRIVI QUI LA TUA RISPOSTA 
 
*/

/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
 
*/
 let x=12;
/* SCRIVI QUI LA TUA RISPOSTA 
 
*/

/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "myName" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
  
*/
const myName='Mishel';
  //myName='Cakalli';
  console.log(myName);
/* SCRIVI QUI LA TUA RISPOSTA

*/

/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

/* SCRIVI QUI LA TUA RISPOSTA */

let a = 4;
//let x = 12;
console.log(a - x);
/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/
let name1 = 'john';
let name2 = 'John';
  
  console.log(name1===name2 ?'SI':'NO');
  

//let name1 = "john";
//let name2 = "John";
if (name1 !== name2) {
  let name2Lowercase = name2.toLowerCase();
  console.log(name1 + "  " + name2Lowercase);
  document.getElementById('test').innerHTML = 'lowercase effettuato con successo : '+name1+' - '+name2Lowercase; // operazione 2
}

/* SCRIVI QUI LA TUA RISPOSTA 
1


2

*/
