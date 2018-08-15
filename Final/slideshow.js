 $(document).ready(function() {
var currentPosition = 0;
var slideWidth = 960;
var slides = $('.slide');
var numberOfSlides = slides.length;
var slideShowInterval;
var speed = 6000;
slideShowInterval = setInterval(changePosition, speed);
slides.wrapAll('<div id="slidesHolder"></div>');
slides.css({ 'float' : 'center' });
$('#slidesHolder').css('width', slideWidth * numberOfSlides);
function changePosition() {
if(currentPosition == numberOfSlides - 1) {
currentPosition = 0;
} else {
currentPosition++;
}
moveSlide();
}
function moveSlide() {
$('#slidesHolder').animate({'marginLeft' : slideWidth*(-currentPosition)});
}
});