window.addEventListener("DOMContentLoaded",function(e){
setTimeout(() => {
    var n = document.createElement("p");
    n.innerHTML = "Ta atento, seu nabo!";
    e.target.children[0].children[1].append(n);
}, 1000);
});
