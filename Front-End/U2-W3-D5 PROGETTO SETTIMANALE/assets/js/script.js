const dataURL = "https://striveschool-api.herokuapp.com/api/product/";
const API_KEY =
  "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhYzc0ODJkN2IxMTAwMTkwZTZkYjIiLCJpYXQiOjE3MDk4ODUyNTYsImV4cCI6MTcxMTA5NDg1Nn0.RlI2MCxsPxTZQUFCq-wly-B5EoLI2SvZiHrFhUfruNU";
const inputNome = document.getElementById("inputNome");
const inputBrand = document.getElementById("inputBrand");
const inputPrezzo = document.getElementById("inputPrezzo");
const inputImmagine = document.getElementById("inputImmagine");
const inputDescrizione = document.getElementById("inputDescrizione");

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
    let dati = await response.json();
    console.log(dati);
    stampaDati(dati);
  } catch (error) {
    console.log(error);
  }
};

function stampaDati(dati) {
  const container = document.getElementById("container");

  const row = document.createElement("div");
  row.classList.add("row");

  dati.forEach((item) => {
    const card = document.createElement("div");
    card.classList.add("card", "col-lg-3", "mb-3", "mx-1");
    const contenutoCards = `
            <img src="${item.imageUrl}" class="card-img-top container-fluid" alt="">
            <div class="card-body">
                <h5 class="card-title">${item.name}</h5>
                <p class="card-text">${item.description}</p>
                <a href="edit.html?id=${item.id}"" class="btn btn-warning">Modifica</a>
                <a href="detail.html?id=${item.id}" class="btn btn-primary mt-1">Scopri di più</a>
            </div>
        `;
    card.innerHTML = contenutoCards;
    row.appendChild(card);
  });

  container.appendChild(row);
}
