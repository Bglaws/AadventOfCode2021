let fs = require("fs");
// let node = require("node");

let arr = fs.readFile("./input1.txt", function(text){
    let textByLine = text.split("\n")
});

// let count = 0;

// for (let i = 0; i < arr.length - 1; i++) {
// 	if (arr[i+1] > arr[i]) {
// 		count++;
// 	}
// }
// console.log("count = ", count);

module.exports = (input) => {
	const measurements = input.split('\n').map((t) => +t);
  
	let previousMeasurement = measurements[0];
	let increasesCounter = 0;
  
	for (let i = 1; i < measurements.length; i++) {
	  if (measurements[i] > previousMeasurement) {
		increasesCounter++;
	  }
  
	  previousMeasurement = measurements[i];
	}
  
	return increasesCounter;
  };