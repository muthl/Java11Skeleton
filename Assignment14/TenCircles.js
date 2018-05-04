let TenCirclesCanvas = document.querySelector(".TenCircles");
let tenctx = TenCirclesCanvas.getContext("2d");

//Loop that moves the next circle and creates it
setInterval(() => {
for (let i = 0; i < 10; i++)    {
    tenctx.beginPath();
    let randomColor = 'hsl(' + 360 * Math.random() + ', '+ (Math.floor(Math.random() * 100) + 80) + '%, 50%, 100%)';  //hsl = hue, saturation, lightness. This picks a random colour.
    tenctx.fillStyle = randomColor;

    tenctx.arc(TenCirclesCanvas.width/2, (i * 40) + 20, 19, 0 , 2*Math.PI);
    tenctx.fill();
    tenctx.closePath();
}
}, 110);