/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato.
*/
let l1=3;
let l2=2;
function area(l1,l2){
    console.log(l1*l2);
}
area(l1,l2);

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/
let n1=2;
let n2=2;

function crazySum(somma,moltiplicazione){
    somma=n1+n2;
    if(n1===n2){
        moltiplicazione=somma*3;
        console.log("la moltiplicazione e' "+moltiplicazione+' e i valori  sono uguali');
        return;
    }else{
        console.log("la somma e' "+somma+' e i valori non sono uguali');
    }
}
crazySum();
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/
let p=20;

function crazyDiff(differenza){
    differenza=p-19;
    if(p>19){
        console.log(differenza*3);
    }else{
        console.log(differenza);
    }
}
crazyDiff();

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/
let n=30;

function boundary(){
    if(n>=20 && n<=100 || n===400){
        return console.log(true);
    }else{
        console.log(false);
    }

}
boundary();
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/
let stringa="ciao";
function epify(aggiungi){
    aggiungi = "EPICODE "+ stringa;
    if(stringa=="EPICODE"){
        console.log(stringa);
        return ;
    }
        console.log(aggiungi);

    return aggiungi;
}

epify();


/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro. La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo)
*/
let num=2;
function check3and7(){
    if(num>=0){
        if(num %3===0 || num %7===0 ) {
            console.log("numero multiplo di 3 o di 7");
            return;
        }else{console.log("numero");}
    }else{
        console.log("numero negativo");
    }
}

check3and7();

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/
let string="EPICODE";

function reverseString(test){
    test=string.split('').reverse().join('');
    console.log(test);
    return ;
    
}
reverseString();

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/
let striing="ciao mi chiamo mishel";
function upperFirst(upper){
    upper=striing.toLocaleUpperCase();
    console.log(upper);
}
upperFirst();
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro un numero n e ritorna un'array contenente n numeri casuali inclusi tra 0 e 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
