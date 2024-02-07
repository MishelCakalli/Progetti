const tasks = [];
const bottoneCrea = document.getElementById("bottoneCrea");
const inserimento = document.getElementById("inserimento");
const lista = document.getElementById("lista");

bottoneCrea.addEventListener("click", function (e) {
  e.preventDefault();
  if(inserimento.value!==''){
  tasks.push(inserimento.value);
  console.log(tasks);
  test();

}else{
    document.getElementById('test').innerText='campo vuoto'
}
});

function test() {
  lista.innerHTML = "";
const bottoneCestino=document.getElementById('bottoneCestino');
    const bottoneCestino2 =bottoneCestino.style.display = 'block';
  tasks.forEach(function (elemento) {
    
    const lista = document.getElementById("lista");
    const listItem = document.createElement("li");
    listItem.textContent = elemento ;
    lista.appendChild(listItem); // Aggiungi l'elemento di lista alla lista
  });
}
function init() {
	const bottoneCestino=document.getElementById('bottoneCestino');
    bottoneCestino.style.display = 'none';
}
init();
function eliminaLista() {
    
}
