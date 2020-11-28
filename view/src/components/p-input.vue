<template>
  <div class="text-field">
    <input  class="text-field_input"
            :class="{ 'text-field_input_filled': value,
                    'fieldset_group_field--changed': isChanged }"
            :type="type"
            :value="value"
            v-bind="$attrs"
            v-on="listenersComputed"
        />
    <label class="text-field_label_floating">
      <span><component :is="iconNameComputed"/></span>
      {{label}}
    </label>
    <div v-if="tool"
         class="tool"
         :class="{'fill': toolFill}"
         @click="toolHandler">
      <component :is="toolNameComputed"/>
    </div>
  </div>
</template>


<script>
export default {
  props: {
    value: [String, Number],
    label: String,
    icon: String,
    tool: String,
    toolFill: [String, Boolean],
    isChanged: Boolean,
    type: {
      type: String,
      default: 'text'
    }
  },
  model: {
    prop: 'value',
    event: 'input'
  },
  methods: {
    toolHandler () {
      this.$emit('toolcall')
    }
  },
  computed: {
    listenersComputed () {
      return {
        ...this.$listeners,
        input: event => this.$emit('input', event.target.value),
        change: event => this.$emit('change', event.target.value),
      }
    },
    iconNameComputed () {
      return this.icon ? 'b-icon-' + this.icon : ''
    },
    toolNameComputed () {
      return this.tool ? 'b-icon-' + this.tool : ''
    }
  }
}
</script>

<style lang="stylus" scoped>
.tool
  position absolute
  display flex
  align-items center
  right 0
  height 100%
  width 30px
  cursor pointer
  svg
    fill #9e9e9e
  
  &.fill
    svg
      fill #008390
  &:hover
    svg
      fill #008390

.text-field
  display flex
  flex 1
  align-items center
  position relative
  background-color #FFFFFF
  border-radius 10px
  &.disabled
    background-color inherit
  &_input
    outline none
    width 100%
    padding 10px
    color black
    font-size inherit
    border-radius 10px
    border 1px solid #C8D8FF

    ~ label
        color #9e9e9e
        background-color inherit
        border-radius 3px
        span
          padding 0 5px
          transition all .15s ease

    &:disabled
      pointer-events none
    
    &:hover
      ~ label
        color #616161

    &:focus
      border-color #008390
      ~ label
        color #3d8e88
        transform translateY(calc(-1 * 101%)) scale(.9) translateX(15px)
        span
          padding 0
          opacity 0
          margin-left -20px

    &_filled
      ~ label
        color #9e9e9e
        transform translateY(calc(-1 * 101%)) scale(.9) translateX(15px)
        span
          padding 0
          opacity 0
          margin-left -20px

  &_label_floating
    white-space nowrap
    max-width 99%
    overflow hidden
    text-overflow ellipsis
    padding 0 10px
    margin-left 1px
    pointer-events none
    position absolute
    transform-origin 10% top
    font-size inherit
    transition transform .2s, color .2s

</style>
