<template>
  <div>
    <h4>
      * * * *
      * * * *
      * ★ * ★ *
      * ★ *
      >>>------I love you! ---->
      * *
      * ★ *
      * *
      * *
      *
    </h4>
    <em>{{childrenACount}}</em>
  </div>
</template>

<script>
import { createNamespacedHelpers } from "vuex";
const { mapState, mapActions } = createNamespacedHelpers("childrenA");
export default {
  name: "childrenA",
  computed: {
    ...mapState(["childrenACount"])
  },
  methods: {
    ...mapActions(["increment"])
  },
  created() {
    this.increment(10);
  }
};
</script>

<style>
</style>
