let RanCanvas = document.querySelector(".RandomCircles");
let Rantx = RanCanvas.getContext("2d");

//loop for 10 circles
for (let i = 0; i < 10; i++)    {
    Rantx.beginPath();
    let x = Math.floor((Math.random() * 360) + 20);     // math.random picks a random number between the values assigned; 360 and 20
    let y = Math.floor((Math.random() * 360) + 20);
    Rantx.fillStyle = "red";
    Rantx.arc( x, y , 19, 0 , 2*Math.PI);
    Rantx.fill();
    Rantx.stroke();
    Rantx.closePath();
}