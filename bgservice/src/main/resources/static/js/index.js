$('.menu.toggle').click(function(){
    // 点击.menu.toggle 拿到所有的导航栏值
    $('.m-item').toggleClass('m-moblie-hide');
})

$('#payButton').popup({
    popup:$('.payQR.popup'),
    on:'click',
    position:'bottom center'
})