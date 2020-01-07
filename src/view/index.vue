<template>
  <div>
    <h2 @click="go()">(๑′ᴗ‵๑)Ｉ Lᵒᵛᵉᵧₒᵤ❤</h2>
    <i>
      {{count}}
      <br />
      {{countTimes}}
      <br />
      {{countTime(9)}}
      <br />
      {{obj}}
      <br />
      {{childrenACount}}
      <br />
      {{childrenB.childrenBCount}}
    </i>
    <children-a></children-a>
    <Button>777</Button>
    <Table>666</Table>
  </div>
</template>

<script>
import { mapState, mapGetters, mapMutations, mapActions } from "vuex";
import childrenA from "@/components/index/childrenA.vue";
import { Button, Table } from "view-design";

export default {
  data() {
    return {
      localCount: 1000
    };
  },
  components: {
    childrenA,
    Button,
    Table
  },
  methods: {
    go() {
      this.$router.push({
        name: "index",
        params: { id: Math.floor(Math.random() * 1000) }
      });
    },
    ...mapMutations(["objSet"]),
    ...mapActions(["increment", "childrenBIncrement"]),
    ...mapActions("childrenA", {
      childrenAIncrement: "increment"
    })
  },
  watch: {
    $route() {}
  },
  computed: {
    ...mapState(["count", "obj", "childrenB"]),
    ...mapGetters(["countTimes", "countTime"]),
    ...mapState("childrenA", ["childrenACount"])
  },
  created() {
    this.childrenBIncrement(8);
    this.objSet(this);
    setInterval(() => {
      this.increment(10);
    }, 1000);
    this.childrenAIncrement(9);
  }
};
</script>

<style>
</style>
