<template>
  <div id="app">
    <router-view/>
  </div>
</template>
<script>
export default {
  data () {
    return {
    }
  },
  methods: {
  },
  computed: {
  }
}
</script>
<style lang="stylus">
@import url('fonts/stylesheet.css')
*
  font-family 'SF Pro Display', Helvetica, Arial
  box-sizing border-box
  &::-webkit-scrollbar 
    width 4px
    height 4px
  &::-webkit-scrollbar-thumb
    background-color #bdbdbd
  &::-webkit-scrollbar-track
    background-color #eceff1

body, html
  padding 0
  margin 0
</style>
