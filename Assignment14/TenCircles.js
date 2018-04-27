let TenCirclesCanvas = document.querySelector(".TenCircles");
let tenctx = TenCirclesCanvas.getContext("2d");

//Loop that moves the next circle and creates it
for (let i = 0; i < 10; i++)    {
    tenctx.beginPath();
    tenctx.fillStyle = "purple";
    tenctx.arc(TenCirclesCanvas.width/2, (i * 40) + 20, 19, 0 , 2*Math.PI);
    tenctx.fill();
    tenctx.closePath();
}