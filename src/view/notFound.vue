<template>
  <div class="page">
    <h1>404</h1>
    <router-link to="/" replace>返回首页</router-link>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },
  methods: {},
  watch: {
    $route(to, from) {
      console.log(to, from);
    }
  }
};
</script>

<style scoped>
.page {
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}
</style>
