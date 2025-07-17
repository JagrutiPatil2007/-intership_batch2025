let firstname = "Darshan";
let age = 22;

if(firstname[0]=== "D" && age>18){
     console.log("Name starts with D and above 18");
}else{
    console.log("not qualified");
}

let tempInDegree = 30;
if(tempInDegree < 0){
 console.log("extremely cold outside");
}
else if(tempInDegree < 16){
console.log("It is cold outside");
}else if(tempInDegree < 25){
console.log("wheather is okay ");
}else if(tempInDegree < 35){
console.log("Lets go for swim");
}else if(tempInDegree< 45){
console.log("turn on AC");
}else{
console.log("too hot!!");
}


let day =5;
switch(day){
    case 0:
    console.log("Sunday");
    break;

    case 1:
    console.log("Monday");
    break;

    case 2:
    console.log("Tuesday");
    break;
   
    case 3:   
    console.log("Wednesday");
    break;
   
    case 4:  
    console.log("Thrusday");
    break;

    case 5:   
    console.log("Friday");
    break;

    case 6:
    console.log("Saturday");
    break;
   
    default:
    
  
    
    console.log("Invalid Day");
}

let aage = 15;
let drink ;

if(aage>=5){
    drink="coffee";
}else{
    drink="milk";

}

console.log(drink);

let age1= 22;
let drinkit = age1 >= 20 ? "Coffee" : "Milk";

console.log(drinkit);