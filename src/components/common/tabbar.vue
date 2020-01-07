<template>
  <div>
    <Tabs value="name1">
      <TabPane label="标签一" name="name1"></TabPane>
      <TabPane label="标签二" name="name2"></TabPane>
      <TabPane label="标签三" name="name3"></TabPane>
    </Tabs>
  </div>
</template>
<script>
import { Tabs, TabPane } from "view-design";
export default {
  name: "tabbar",
  components: {
    Tabs,
    TabPane
  }
};
</script>
<style lang="scss" scoped>
</style>