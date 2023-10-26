
function Hola(nombre, miCallback){
    setTimeout(function() {
        console.log('Hola '+nombre);
        miCallback(nombre);
    }, 1000);
    
}

function adios(nombre, otroCallback){
    setTimeout(function()  {
    console.log('Adios '+nombre)
    otroCallback();    
    }, 1500);
}

console.log('Iniciando el proceso...')
Hola('Carlos', function(nombre) {
    adios(nombre, function(){
        console.log('Terminando el proceso')
    });
});

//Hola('Carlos', function(){});
//adios('Carlos', function(){});
