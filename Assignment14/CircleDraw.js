let CircleDrawCanvas = document.querySelector(".CircleDraw")
let context = CircleDrawCanvas.getContext("2d")


//creates a yellow circle
context.beginPath();
context.arc(CircleDrawCanvas.width/2, CircleDrawCanvas.height/2, 60, 0, 2*Math.PI);
context.fillStyle = "yellow";
context.fill();
context.stroke();
context.closePath();

//adds text to the circle
context.fillStyle = "black";
context.textAlign = "center";
context.textBaseline = "middle";
context.font = "20px Arial";
context.fillText("Liam", CircleDrawCanvas.width/2, CircleDrawCanvas.height/2);

