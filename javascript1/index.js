// intialize the count as 0
let counter = document.getElementById("counter")
let saveEl =document.getElementById("saveNum")

// console.log(counter)

let count = 0
let hour = 0
//listen to number of clicks
function increment() {
    count += 1
    counter.innerText = count 
    // console.log(count)
}

function decrement() {
    count -= 1
    if (count < 0) {
        count = 0
    }
    counter.innerText = count
    // console.log(count)
}
// increment the count variable when the button is clicked
// change the count-el in the HTML to reflect the new count



function save() {
    hour += 1
    let countStr ="Hour " + hour + ":" + count + "Drinks" + "  -  " 
    saveEl.textContent += countStr
    counter.innerText = 0
    count = 0
}

// let name = "Eduardo"
// let greeting = "Hello, my name is "

// let myGreeting = greeting + name;

// console.log(myGreeting)