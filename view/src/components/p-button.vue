<template>
  <button type="button"
      class='p-button'
      v-bind="$attrs"
      v-on="$listeners"
  >{{label}}</button>
</template>


<script>
export default {
  props: {
    label: String
  }
}
</script>

<style lang="stylus" scoped>
.p-button
  border none
  outline none
  padding 12px 20px
  margin 0
  font-size 16px
  border-radius 10px
  background-color #E6EDFF
  color #008390
  cursor pointer
  &:hover
    box-shadow 0px 1px 5px #0000002e
</style>
