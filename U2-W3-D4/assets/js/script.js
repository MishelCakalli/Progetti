const baseURL = "https://api.pexels.com/v1/search?query=";
const headers = {
  Authorization: "TXAl4tsq0AH939vI13rKvpyMo7xSgfkSwtTUiEnLKjjvEI0zqABAVoL5",
};
const btnLoadImages = document.getElementById("btnLoadImages");
const btnLoadSecondaryImages = document.getElementById(
  "btnLoadSecondaryImages"
);
const aggiornaFotoTutto = document.querySelectorAll(".aggiornaFotoTutto");
let lista = [];

window.addEventListener("load", init);

function init() {
  btnLoadImages.addEventListener("click", function (e) {
    e.preventDefault();
    const query = "mountain";
    readList(query);
  });
}
async function readList(query) {
  try {
    let read = await fetch(baseURL + query, {
      headers: {
        authorization: headers,
      },
    });
    let response = await read.json();
    lista = response;
    console.log(lista);
  } catch (error) {
    console.log(error);
  }
}
function aggiornaFoto() {
  aggiornaFotoTutto.forEach((elemento, index) => {
    elemento.src = lista.photos[index].src.medium;
  });
}
