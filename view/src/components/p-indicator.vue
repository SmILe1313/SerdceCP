<template>
  <div class="indicator-field">
    <label class="indicator-field-label">{{label}}</label>
    <div class="scale"><div class="thumb" :style="styleComputed"/></div>
  </div>
</template>


<script>
export default {
  props: {
    field: Object,
    label: String
  },
  computed: {
    styleComputed () {
      return {
        'background-color': this.color,
        'width': this.value + '%'
      }
    },
    value () {
      const [value] = this.field.config.options
      return parseInt(value)
    },
    color () {
      const value = parseInt(this.value)
      const green ='#aed581'
      const yellow = '#ffe082'
      const red = '#e57373'
      if (value < 35) {
        return green
      }
      if (value < 65) {
        return yellow
      }
      return red
    }
  }
}
</script>

<style lang="stylus" scoped>
.indicator-field
  position relative
  display flex
  flex 1
  align-items center
  background-color #FFFFFF
  border-radius 10px
  border 1px solid #C8D8FF
  padding 10px

  .indicator-field-label
    position absolute
    top -10px
    left 15px
    white-space nowrap
    max-width 99%
    overflow hidden
    text-overflow ellipsis
    padding 0 10px
    pointer-events none
    background-color inherit

.scale
  flex 1
  height 15px
  border 1px solid #e0e0e0
  border-radius 7px
  .thumb
    background-color #FFF9C8
    height 100%
    width 10%
    border-radius 7px
</style>
