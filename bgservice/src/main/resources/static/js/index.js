$('.menu.toggle').click(function(){
    // 点击.menu.toggle 拿到所有的导航栏值
    $('.m-item').toggleClass('m-moblie-hide');
})

$('#payButton').popup({
    popup:$('.payQR.popup'),
    on:'click',
    position:'bottom center'
})
// 弹出QQ号码
$('.qq').popup()
//弹出微信二维码
$('#wechat').popup({
    popup:$('#wechat-qr'),
    on:'hover',
    position:'bottom center'
})
//后台管理点击事件
$('.ui.dropdown')
  .dropdown()
;
//form表单验证
$('.ui.form').form({
    fields:{
        title:{
            //name值必须和表单内部属性值一致
            indetifier:"title",
            rules:[{
                type:'empty',
                prompt:"标题:请输入标题"
            }]
        }
    }
})
//markdown编辑器
var contentEditor;
$(function() {
    contentEditor = editormd("md-content", {
        width   : "100%",
        height  : 640,
        syncScrolling : "single",
        path    : "../lib/editormd/lib/"
    });
    
    /*
    // or
    testEditor = editormd({
        id      : "test-editormd",
        width   : "90%",
        height  : 640,
        path    : "../lib/"
    });
    */
});