const campoTesto = document.getElementById("campoTesto");
const campoInput = document.getElementById("campoInput");
const btnSave = document.getElementById("btnSave");
const btnDelete = document.getElementById("btnDelete");
const campoTimer = document.getElementById("campoTimer");
let arrayVuoto = [];

btnSave.addEventListener("click", function (e) {
  e.preventDefault();
  let valoreInput = campoInput.value;
  arrayVuoto.push(valoreInput);
  localStorage.setItem("arraySalvato", JSON.stringify(arrayVuoto));
  campoTesto.textContent = arrayVuoto.join(" - ");
  console.log(arrayVuoto);
});

btnDelete.addEventListener("click", function (e) {
  e.preventDefault();
  let valoreInput = campoInput.value;
  arrayVuoto.splice(0, valoreInput.length);
  campoTesto.textContent = arrayVuoto.join(" - ");
  localStorage.removeItem("arraySalvato");
  console.log(arrayVuoto);
  rimuovi();
});

let contatore = 0;

let intervallo = setInterval(function () {
  contatore = sessionStorage.getItem("contatore");
  contatore++;
  sessionStorage.setItem("contatore", contatore);
  campoTimer.textContent = contatore;
}, 1000);
