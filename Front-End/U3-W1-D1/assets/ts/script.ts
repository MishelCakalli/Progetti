interface Smartphone {
    credito: number;
    numeroChiamate: number;
    ricarica(ammontare: number): void;
    chiamata(minuti: number): void;
    chiama404(): number;
    getNumeroChiamate(): number;
    azzeraChiamate(): void;
}

class User implements Smartphone {
    nome: string;
    cognome: string;
    credito: number = 0;
    numeroChiamate: number = 0;

    constructor(nome: string, cognome: string) {
        this.nome = nome;
        this.cognome = cognome;
    }

    ricarica(ammontare: number): void {
        this.credito += ammontare;
    }

    chiamata(minuti: number): void {
        const costoChiamata = minuti * 0.20;
        if (this.credito >= costoChiamata) {
            this.credito -= costoChiamata;
            this.numeroChiamate += minuti;
        } else {
            console.log("Credito insufficiente per effettuare la chiamata.");
        }
    }

    chiama404(): number {
        return this.credito;
    }

    getNumeroChiamate(): number {
        return this.numeroChiamate;
    }

    azzeraChiamate(): void {
        this.numeroChiamate = 0;
    }
}

const utente1 = new User("Mario", "Rossi");
utente1.ricarica(10);
utente1.chiamata(5);
utente1.azzeraChiamate(); 
console.log("Numero di chiamate dopo azzeramento:", utente1.getNumeroChiamate(),"Numero di chiamate:", utente1.getNumeroChiamate(),"Credito residuo:", utente1.chiama404());
