let SnowmanCanvas = document.querySelector(".Snowman");
let ctx = SnowmanCanvas.getContext("2d");

//Draw Horizon
ctx.beginPath();
ctx.fillStyle = "lightblue";
ctx.fillRect(0, SnowmanCanvas.height/2+20, SnowmanCanvas.width, 5);
ctx.closePath();

//Snoman Body
ctx.beginPath();
ctx.fillStyle = "grey";
ctx.arc(SnowmanCanvas.width/2, 250, 40, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

//Snowman Middle
ctx.beginPath();
ctx.fillStyle = "grey";
ctx.arc(SnowmanCanvas.width/2, 200, 35, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

//Snowman Head
ctx.beginPath();
ctx.fillStyle = "grey";
ctx.arc(SnowmanCanvas.width/2, 155, 25, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

//Snowman Button 1
ctx.beginPath();
ctx.fillStyle = "black";
ctx.arc(SnowmanCanvas.width/2, 205, 5, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

//Snowman Button 2
ctx.beginPath();
ctx.fillStyle = "black";
ctx.arc(SnowmanCanvas.width/2, 190, 5, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

//Snowman eye 1
ctx.beginPath();
ctx.fillStyle = "black";
ctx.arc(SnowmanCanvas.width/2-10, 153, 4, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

//Snowman eye 2
ctx.beginPath();
ctx.fillStyle = "black";
ctx.arc(SnowmanCanvas.width/2+10, 153, 4, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

//Snowman nose (just for fun)
ctx.beginPath();
ctx.fillStyle = "orange";
ctx.arc(SnowmanCanvas.width/2, 160, 3, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();