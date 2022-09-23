$(document).ready(function () {
    cargarUsuarios();
    $('#products').html();

})

async function cargarUsuarios(){
    const request = await fetch('product/', {
       method: 'GET',
       headers: {
           'Accept': 'application/json',
           'Content-Type': 'application/json'
       }
    });
    const products = await request.json();

    let listadoHtml = '';

    for (let product of products) {

        let usuarioHtml = '<div class="card">\n' +
            '                    <div class="img-container">\n' +
            '                       <a href="A-Half-Face.html"><img loading="lazy" src="./A%20Half%20Face.jpg" alt="A Half Face" title="A Half Face"></a>\n' +
            '                    </div>\n' +
            '                    <div class="card-body">\n' +
            '                        <span class="card-title">'+product.name+'</span>\n' +
            '                        </br>\n' +
            '                        <span class="old-price">$'+product.price +'</span>\n' +
            '                        <h5 class="card-price">$' +product.price+'</h5>\n' +
            '                    </div>\n' +
            '                </div>'
        listadoHtml += usuarioHtml;
    }
    document.querySelector('#products .card2').outerHTML = listadoHtml;;

}




