const dataURL = "https://striveschool-api.herokuapp.com/api/product/";
const API_KEY =
  "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhYzc0ODJkN2IxMTAwMTkwZTZkYjIiLCJpYXQiOjE3MDk4ODUyNTYsImV4cCI6MTcxMTA5NDg1Nn0.RlI2MCxsPxTZQUFCq-wly-B5EoLI2SvZiHrFhUfruNU";
const inputNome = document.getElementById("inputNome");
const inputBrand = document.getElementById("inputBrand");
const inputPrezzo = document.getElementById("inputPrezzo");
const inputImmagine = document.getElementById("inputImmagine");
const inputDescrizione = document.getElementById("inputDescrizione");
const btnReset = document.getElementById("btnReset");
const btnSave = document.getElementById("btnSave");
const btnDelete = document.getElementById("btnDelete");
const campoVuoto = document.getElementById("campoVuoto");

window.addEventListener("load", init);

function init() {
  caricaDati();
}

const caricaDati = async () => {
  try {
    let response = await fetch(dataURL, {
      headers: {
        Authorization: "Bearer " + API_KEY,
      },
    });
    let data = await response.json();
    console.log(data);
  } catch (error) {
    console.log(error);
  }
};

btnSave.addEventListener("click", async function (e) {
  e.preventDefault();

  let nome = inputNome.value;
  let brand = inputBrand.value;
  let prezzo = inputPrezzo.value;
  let immagine = inputImmagine.value;
  let descrizione = inputDescrizione.value;

  try {
    let response = await fetch(dataURL, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
        Authorization: "Bearer " + API_KEY,
      },
      body: JSON.stringify({
        name: nome,
        brand: brand,
        price: prezzo,
        imageUrl: immagine,
        description: descrizione,
      }),
    });

    if (response.ok) {
      console.log("Dati salvati ");
    } else {
        campoVuoto.innerText="INSERISCI TUTTI I CAMPI"
      console.error("Errore",response.statusText);
    }
  } catch (error) {
    console.error("Errore ", error);
  }
  let conferma= confirm('sei sicuro?');
  if(conferma){
    window.location.href = "index.html";
  }else{
    return;
  }

});

btnReset.addEventListener("click", function (e) {
  e.preventDefault();
  inputNome.value = "";
  inputBrand.value = "";
  inputPrezzo.value = "";
  inputImmagine.value = "";
  inputDescrizione.value = "";
});

