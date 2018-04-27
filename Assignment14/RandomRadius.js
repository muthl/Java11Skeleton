let RancCanvas = document.querySelector(".RandomRadius");
let Ranctx = RancCanvas.getContext("2d");


//loop for 10 circles
for (let i = 0; i < 10; i++)    {
    Ranctx.beginPath();
    let x = Math.floor((Math.random() * 355) + 20);
    let y = Math.floor((Math.random() * 355) + 20);     //selects random number that will be used for position. between 20 and 355
    let d = Math.floor((Math.random() * 25) + 5);       //randomb diameter between 5 and 25 px
    let randomColor = 'hsl(' + 360 * Math.random() + ', 100%, 50%, 100%)';  //hsl = hue, saturation, lightness. This picks a random colour.
    Ranctx.fillStyle = randomColor;
    Ranctx.arc( x, y , d, 0 , 2*Math.PI);   //x, y, and d values have all been randomized
    Ranctx.fill();
    Ranctx.closePath();
}