import Vue from "vue";
import App from "./App.vue";
import router from "./router"; //引入路由配置
import store from "./store";
import "./plugins/element.js";

Vue.config.productionTip = false;

new Vue({
  router, //引入路由器配置
  store,
  render: h => h(App)
}).$mount("#app");
