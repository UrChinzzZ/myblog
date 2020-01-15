$('.menu.toggle').click(function () {
    // 点击.menu.toggle 拿到所有的导航栏值
    $('.m-item').toggleClass('m-moblie-hide');
})

$('#payButton').popup({
    popup: $('.payQR.popup'),
    on: 'click',
    position: 'bottom center'
})
// 弹出QQ号码
$('.qq').popup()
//弹出微信二维码
$('#wechat').popup({
    popup: $('#wechat-qr'),
    on: 'hover',
    position: 'bottom center'
})

$('.wechat').popup({
    popup: $('#wechat-qr'),
    on: 'hover',
    position: 'left center'
})
//后台管理点击事件
$('.ui.dropdown')
    .dropdown()
    ;
//form表单验证
$('.ui.form').form({
    fields: {
        title: {
            //name值必须和表单内部属性值一致
            indetifier: "title",
            rules: [{
                type: 'empty',
                prompt: "标题:请输入标题"
            }]
        }
    }
})
// 点击生成的目录
$('.toc-button').popup({
    popup: $('.toc-container.popup'),
    on: 'click',
    position: 'left center'
})
// 初始化目录方法
tocbot.init({
    // Where to render the table of contents.
    tocSelector: '.js-toc',
    // Where to grab the headings to build the table of contents.
    contentSelector: '.js-toc-content',
    // Which headings to grab inside of the contentSelector element.
    headingSelector: 'h1, h2, h3',
    // For headings inside relative or absolute positioned containers within content.
    hasInnerContainers: true,
});
// //代码检测
// var waypoint = new Waypoint({
//     element: document.getElementById('new-operator'),
//     handler: function(direction) {
//         console.log(direction);
//     if(direction=='down'){
//         $('#toolbar').show();
//     }else{
//         $('#toolbar').hide(500);
//     }
//     }
//   })
  
  


