const funcao = (arr,num) =>{
    try{
        
        if(typeof(arr) != Object || typeof(num) != Number) {
            console.log(TypeError);
        }
    } catch(e){
    } finally{
        console.log(`sua array e numero é: ${arr} ${num}`);
    }
}
funcao("",8);