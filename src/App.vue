<template>
  <div id="app">
    <router-view></router-view>
    <Tabbar></Tabbar>
  </div>
</template>

<script>
import Tabbar from '@/components/common/tabbar'
export default {
  name: "app",
  components:{
    Tabbar
  }
};
</script>

<style>
</style>
