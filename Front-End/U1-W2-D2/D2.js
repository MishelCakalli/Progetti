/* ESERCIZIO 1
 Scrivi un algoritmo per trovare il più grande tra due numeri interi.
*/
let a,b;
a=12;
b=9;
if(a>b){
  console.log("il numero piu grande e': "+a);
}else{
  console.log("il numero piu grande e': "+b);
}

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 2
  Scrivi un algoritmo che mostri "not equal" in console se un numero intero fornito è diverso da 5.
*/
let number=12;
if(number !== 5){
console.log("not equal ≠");
}else{
  console.log("is equal =");
}
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 3
  Scrivi un algoritmo che mostri "divisibile per 5" in console se un numero fornito è perfettamente divisibile per 5 (suggerimento: usa l'operatore modulo)
*/
let nModulo=15;
if(nModulo %5== 0){
  console.log("divisibile per 5");
}else{
  console.log("NON e' divisibile per 5");
}
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 4
  Scrivi un algoritmo per verificare che, dati due numeri interi, il valore di uno di essi sia 8 oppure se la loro addizione/sottrazione sia uguale a 8.
*/
  let x,y;
  x=8;
  y=0;
  addizione=x+y;
  sottrazione=x-y;
  if((x==8 || y==8)&&(addizione== 8 || sottrazione==8 ) ) {
    console.log("Il risultato della sottrazione/addizione e' = 8 ");
  }else{
    console.log("Il risultato della sottrazione/addizione non e' = 8 ");
  }
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 5
  Stai lavorando su un sito di e-commerce. Stai salvando il saldo totale del carrello dell'utente in una variabile "totalShoppingCart".
  C'è una promozione in corso: se il totale del carrello supera 50, l'utente ha diritto alla spedizione gratuita (altrimenti la spedizione ha un costo fisso pari a 10).
  Crea un algoritmo che determini l'ammontare totale che deve essere addebitato all'utente per il checkout.
*/
  let totalShoppingCart=62;
  if(totalShoppingCart>=50){
    console.log("Hai la spedizione gratuita");
  }else{
    console.log("La spedizione costa 10 euro");
  }

/* SCRIVI QUI LA TUA RISPOSTA 

*/

/* ESERCIZIO 6
  Stai lavorando su un sito di e-commerce. Oggi è il Black Friday e viene applicato il 20% su ogni prodotto.
  Modifica la risposta precedente includendo questa nuova promozione nell'algoritmo, determinando come prima se le spedizioni sono gratuite oppure no e e calcolando il totale.
*/
sconto=(totalShoppingCart * 20) / 100 ;
totale=totalShoppingCart-sconto;
if(totale>=50){
  console.log("Hai la spedizione gratuita");
}else{
  console.log("La spedizione costa 10 euro");
}

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 7
  Crea tre variabili, e assegna un valore numerico a ciascuna di esse.
  Utilizzando un blocco condizionale, crea un algoritmo per ordinarle secondo il loro valore, dal più alto al più basso.
  Alla fine mostra il risultato in console.
*/
const num = [
  '20',
  '30',
  '12'
]
  num.sort();
  console.log(num)

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 8
  Crea un algoritmo per verificare che un valore fornito sia un numero oppure no (suggerimento: cerca su un motore di ricerca "typeof").
*/
test=0;
if(typeof x ===typeof test){
  console.log(x+" e' un numero");
}else{
  console.log(x+" NON e' un numero");
}

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 9
  Crea un algoritmo per controllare se un numero fornito sia pari o dispari (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/
nPari=22;
if(nPari %2 ===0){
  console.log(nPari+" e' pari");
}else{
  console.log(nPari+" e' dispari");
}

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 10
  Modifica la logica del seguente algoritmo in modo che mostri in console il messaggio corretto in ogni circostanza.
  
*/
let val = 7;
  if (val < 5) {
      console.log("Meno di 5");
    } else if (val < 10) {
      console.log("Meno di 10");
    } else {
      console.log("Uguale a 10 o maggiore");
    }
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 11
  Fornito il seguente oggetto, scrivi del codice per aggiungere una proprietà "city", il cui valore sarà "Toronto".
*/

const me = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],
}
me.city="Toronto";
console.log(me);
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 12
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere la proprietà "lastName".
*/
delete me.lastName;
console.log(me);
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 13
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere l'ultimo elemento della proprietà "skills".
*/

delete me.skills[2];
console.log(me);

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 14
  Scrivi del codice per creare un array inizialmente vuoto. Riempilo successivamente con i numeri da 1 a 10.
*/
let i;
const nome = [];
  nome[0]="1";
  nome[1]="2";
  nome[2]="3";
  nome[3]="4";
  nome[4]="5";
  nome[5]="6";
  nome[6]="7";
  nome[7]="8";
  nome[8]="9";
  nome[9]="10";
  console.log(nome);
 /* for(i=0; i<=10; i++){
      nome.push(i);
  }*/
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 15
  Scrivi del codice per sostituire l'ultimo elemento dell'array, ovvero il valore 10, con il valore 100.
*/
nome[9]='100';
console.log(nome);

/* SCRIVI QUI LA TUA RISPOSTA */
