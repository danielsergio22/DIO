function validaArray(arr,num){
    try{
        if (!arr && !num) throw new ReferenceError("Envie os parâmetros");

        if (typeof(arr) != Object) 
        throw new TypeError("Array precisa ser do tipo object");
        
        if (typeof(num) != Number) 
        throw new TypeError("Num precisa ser do tipo number");
        
        if(arr.length !== num) throw new RangeError("Tamanho inválido!");

        return arr;
    } catch(e){
        if (e instanceof ReferenceError) {
            console.log("Este erro é ReferenceError!");
            console.log(e.message);
        } else if (e instanceof TypeError) {
            console.log("Este erro é TypeError!");
            console.log(e.message);
        } else if (e instanceof RangeError) {
            console.log("Este erro é RangeError!");
            console.log(e.message);
        } else {
            console.log("Tipo de erro não esperado:" + e);
        }
        
    } finally{
        console.log(`os dados recebidos foram: ${arr} | ${num}`);
    }
}
console.log(validaArray([1,2,3],3));