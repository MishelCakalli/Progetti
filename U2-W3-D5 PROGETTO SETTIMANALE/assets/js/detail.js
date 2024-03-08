const imgContainer = document.getElementById("imgContainer");
const contenutoContainer = document.getElementById("contenutoContainer");
const dataURL = "https://striveschool-api.herokuapp.com/api/product/";
const API_KEY =
  "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhYzc0ODJkN2IxMTAwMTkwZTZkYjIiLCJpYXQiOjE3MDk4ODUyNTYsImV4cCI6MTcxMTA5NDg1Nn0.RlI2MCxsPxTZQUFCq-wly-B5EoLI2SvZiHrFhUfruNU";

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
    stampaImg(dati);
    stampaContenuto(dati);
  } catch (error) {
    console.log(error);
  }
};
function stampaImg(dati) {
  const row = document.createElement("div");
  row.classList.add("row");

  dati.forEach((dati) => {
    const card = document.createElement("div");
    card.classList.add("col-lg-3", "mb-3", "mx-1", "w-100");
    const contenutoCards = `
                <img src="${dati.imageUrl}" class="card-img-top container-fluid w-100" alt="">
                
            `;
    card.innerHTML = contenutoCards;

    row.appendChild(card);
  });

  imgContainer.appendChild(row);
}
function stampaContenuto(dati) {
    const row = document.createElement("div");
    row.classList.add("row");
  
    dati.forEach((item) => {
      const card = document.createElement("div");
      card.classList.add("col-lg-3", "mb-3", "mx-1", "border", "w-100");
      const contenutoCards = `
                 
                  <div class="card-body">
                      <p class="card-text">${item.brand}</p>
                      <h5 class="card-title">${item.name}</h5>
                      <p class="card-text btn btn-dark text-warning">${item.price}</p>
                      <p class="card-text">${item.description}</p>
                  </div>
              `;
      card.innerHTML = contenutoCards;
  
      row.appendChild(card);
    });
  
    contenutoContainer.appendChild(row);
  }
