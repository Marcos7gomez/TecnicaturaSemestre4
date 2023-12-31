
function Hola(nombre, miCallback){
    setTimeout(function() {
        console.log('Hola '+nombre);
        miCallback(nombre);
    }, 1000);
    
}

function hablar(callbackHablar){
    setTimeout(function()  {
        console.log('bla bla bla')
        callbackHablar();
    }, 1000);
}

function adios(nombre, otroCallback){
    setTimeout(function()  {
    console.log('Adios '+nombre)
    otroCallback();    
    }, 1500);
}
// Función recursiva
function conversacion(nombre, veces, callback){
    if (veces > 0){
        hablar(function(){
            conversacion(nombre, --veces, callback); //"--" es igual a -1 resta valores de la funcion
        });        
    } else {
        callback(nombre, callback);
    }
    
}
// Proceso principal
console.log('Iniciando el proceso...')
Hola('Ariel', function(nombre){
    conversacion(nombre, 1, function(){
        console.log('Terminando el proceso')
    }); 
    
});
//Hola('Carlos', function(nombre) {
//    hablar(function(){
//        hablar(function(){
//            hablar(function(){
//                hablar(function(){
//                    adios(nombre, function(){
//                        console.log('Terminando el proceso')
//                    });
//                });
//            });     
//        });
//    });
//});