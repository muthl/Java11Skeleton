let RanCanvas = document.querySelector(".RandomCircles");
let Rantx = RanCanvas.getContext("2d");

//loop for 10 circles

for (let i = 0; i < 10; i++)    {
    Rantx.beginPath();
    let x = Math.floor((Math.random() * 360) + 20);     // math.random picks a random number between the values assigned; 360 and 20
    let y = Math.floor((Math.random() * 360) + 20);

    let randomColor = 'hsl(' + 360 * Math.random() + ', '+ (Math.floor(Math.random() * 100) + 80) + '%, 50%, 100%)';  //hsl = hue, saturation, lightness. This picks a random colour.

    Rantx.fillStyle = randomColor;
    Rantx.arc( x, y , 19, 0 , 2*Math.PI);
    Rantx.fill();
    Rantx.stroke();
    Rantx.closePath();
}