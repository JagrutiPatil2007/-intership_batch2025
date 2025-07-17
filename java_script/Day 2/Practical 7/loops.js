
let total = 0; //1+2
let num = 2;

let i=1;
do{
  total= total + i;
  i++; 
}
while(i<=num)

console.log(total);


for(let j=0;j<=9;j++){
    if(j==5){
        break; 
    }
    console.log(j);
}


for(let j=0;j<=9;j++){
    if(j==5){
        continue; 
    }
    console.log(j);
}


 


while( i<=10){

  total= total + i;
 i++;
}
console.log(total);