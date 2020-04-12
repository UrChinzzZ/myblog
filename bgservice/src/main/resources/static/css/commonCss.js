//导入semantic-ui  css样式
document.write('<link rel="stylesheet" href="https://cdn.jsdelivr.net/semantic-ui/2.2.4/semantic.min.css">')
//        自定义  css样式
document.write('<link rel="stylesheet"  th:href="@{/css/index.css}">')
//引入markdown css
document.write('<link rel="stylesheet"  th:href="@{/lib/editormd/css/editormd.css}" >')
//        typo  css样式
document.write('<link rel="stylesheet"  th:href="@{/css/typo.css}">')
//        animate css样式
document.write('<link rel="stylesheet"  th:href="@{/css/animate.css}">')
//引入prism css
document.write('<link rel="stylesheet"  th:href="@{/lib/prismjs/prism.css}">')
//引入tocbot.css  目录生成
document.write('<link rel="stylesheet"  th:href="@{/lib/tocbot/tocbot.css}">')
