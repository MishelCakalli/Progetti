var User = /** @class */ (function () {
    function User(nome, cognome) {
        this.credito = 0;
        this.numeroChiamate = 0;
        this.nome = nome;
        this.cognome = cognome;
    }
    User.prototype.ricarica = function (ammontare) {
        this.credito += ammontare;
    };
    User.prototype.chiamata = function (minuti) {
        var costoChiamata = minuti * 0.20;
        if (this.credito >= costoChiamata) {
            this.credito -= costoChiamata;
            this.numeroChiamate += minuti;
        }
        else {
            console.log("Credito insufficiente per effettuare la chiamata.");
        }
    };
    User.prototype.chiama404 = function () {
        return this.credito;
    };
    User.prototype.getNumeroChiamate = function () {
        return this.numeroChiamate;
    };
    User.prototype.azzeraChiamate = function () {
        this.numeroChiamate = 0;
    };
    return User;
}());
var utente1 = new User("Mario", "Rossi");
utente1.ricarica(10);
utente1.chiamata(5);
utente1.azzeraChiamate();
console.log("Numero di chiamate dopo azzeramento:", utente1.getNumeroChiamate(), "Numero di chiamate:", utente1.getNumeroChiamate(), "Credito residuo:", utente1.chiama404());
