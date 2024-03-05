class User {
  constructor(_firstName, _lastName, _age, _location) {
    this.firstName = _firstName;
    this.lastName = _lastName;
    this.age = _age;
    this.location = _location;
  }
  confrontoEta(_age) {
    console.log(_age);
    if (this.age >= this._age) {
        
      console.log(`${utente1.age} e' piu vecchio di ${utente2.age} `);
    } else {
      console.log(`${utente2.age} e' piu vecchio di ${utente1.age} `);
    }
  }
}

const utente1 = new User("Andrea", "Rossi", 19, "Milano");
// console.log(utente1);
const utente2 = new User("Giorgio", "Verdi", 18, "Firenze");
utente1.confrontoEta(utente2); //cosa(utente2) confrontare con chi (utente2.age)

const animalNameIn = document.getElementById("nAnimale");
const ownerNameIn = document.getElementById("nPropietario");
const speciesNameIn = document.getElementById("sAnimale");
const breedNameIn = document.getElementById("rAnimale");
const arrayVuot=[];
class Pet {
  constructor(_petName, _ownerName, _species, _breed) {
    this.petName = _petName;
    this.ownerName = _ownerName;
    this.species = _species;
    this.breed = _breed;
  }
  confrontoEta() {
    if (this.ownerName === this.ownerNameInserito.value) {
      return true;
    }
  }
}
const Pet1 = new User("Bo", "Andrea", "cane", "labrador");
const Pet2 = new User("Bu", "Marco", "gatto", "soriano");
const Pet3 = new User("Ba", "Giorgio", "coniglio", "nano");
console.log(Pet3);

function stampa (){

}