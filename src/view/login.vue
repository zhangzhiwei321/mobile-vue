<template>
  <div>
    <h1 @click="go">ლ(′◉❥◉｀ლ)</h1>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },
  methods: {
    go() {
      this.$router.replace({
        name: "index",
        params: { id: Math.floor(Math.random() * 1000) }
      });
    }
  }
};
</script>

<style>
</style>
