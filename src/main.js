import Vue from 'vue';
import App from './App.vue';

import router from '@/router';
import store from '@/store';
import '@/utils/rem.js'
import api from '@/api'
console.log(api.api())
import 'view-design/dist/styles/iview.css';

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')