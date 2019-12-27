let baseUrl = "";
switch (
  process.env.VUE_APP_ENV //注意变量名是自定义的
) {
  case "dev":
    baseUrl = "http://localhost:8088/"; //开发环境url
    console.log(baseUrl);
    break;
  case "serve":
    baseUrl = "http://localhost:8089/"; //生产环境url
    console.log(baseUrl);
    break;
  case "urchin":
    baseUrl = "http://localhost:8085/"; //自定义环境
    console.log(baseUrl);
    break;
  case "test":
    baseUrl = "http://localhost:8084/"; // 测试环境
    console.log(baseUrl);
    break;
}

export default baseUrl;
