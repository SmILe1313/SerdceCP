<template>
  <transition name="fade">
  <div class="overlay" v-if="show">
    <!-- <b-icon-circle-fill animation="throb" font-scale="4"/> -->
    <heart/>
  </div>
  </transition>
</template>

<script>
import heart from '@/icons/heart'
export default {
  props: {
    show: Boolean
  },
  components: {
    heart
  }
}
</script>

<style lang="stylus" scoped>
.overlay
  position absolute
  top 0
  left 0
  right 0
  bottom 0
  display flex
  justify-content center
  align-items center
  background-color #ffffff
  // для круга
  // svg
  //   fill #008390
  svg
    animation throb infinite 1s

@keyframes throb
  0%
    transform scale(.5)
  50%
    transform scale(1)
  100%
    transform scale(.5)


.fade-enter-active,
.fade-leave-active
	transition opacity .5s ease

.fade-enter,
.fade-leave-to
	opacity 0
</style>