//La palabra async no es necesaria en las funciones porque ya son asincronas
//De todas formas proyectan una sincronia visual
async function Hola(nombre){
    return new Promise(function(resolve, reject){
        setTimeout(function() {
            console.log('Hola '+nombre);
            resolve(nombre);
        }, 1000);
    });
    
    
}

async function hablar(nombre){
    return new Promise((resolve, reject)=>{ //Usamos la sintaxis ES6
        setTimeout(function()  {
            console.log('bla bla bla')
            resolve(nombre);
            
        }, 1000);
    });
    
}

async function adios(nombre){
    return new Promise((resolve, reject)=> {
        setTimeout(function()  {
            console.log('Adios '+nombre)
            resolve(); 
            //reject('hay un error')   
            }, 1000);
    });
    
}

// await Hola('Ariel') Esto es una mala sintaxis
// await solo es válido dentro de una función asíncrona

async function main(){
    let nombre = await Hola('Ariel');
    await hablar();
    await hablar();
    await hablar();
    await hablar();
    await adios(nombre);
    console.log('Termina el proceso')
}
console.log('Empezamos el proceso...')
main();
console.log('Esta es la segunda instrucción')