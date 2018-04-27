let ConCanvas = document.querySelector(".ConcentricCircles");
let conctx = ConCanvas.getContext("2d");

//Loop that moves the next circle and creates it, making it smaller than the last so you can see them all.
for (let i = 10; i > 0; i--)    {
    conctx.beginPath();

    //for a little fun making the circles a random colour
    let randomColor = 'hsl(' + 360 * Math.random() + ', 100%, 50%, 100%)';  //hsl = hue, saturation, lightness. This picks a random colour.
    conctx.fillStyle = randomColor;

    conctx.arc(ConCanvas.width/2, ConCanvas.height/2, (10*i)+5, 0 , 2*Math.PI);
    conctx.fill();
    conctx.stroke();
    conctx.closePath();
}