<template>
  <div class="scale">
    <div class="thumb" :style="{'background-color': color, width: value + '%'}">
      
    </div>
  </div>
</template>


<script>
export default {
  props: {
    value: [Number, String],
    color: String
  }
}
</script>

<style lang="stylus" scoped>
.scale
  min-width 200px
  height 15px
  border 1px solid #e0e0e0
  border-radius 7px
  .thumb
    background-color #FFF9C8
    height 100%
    width 10%
    border-radius 7px
</style>
