<template>
  <div class="textarea-field">
    <textarea  class="textarea-field_input"
            :class="{ 'textarea-field_input_filled': value }"
            :value="value"
            v-bind="$attrs"
            v-on="listenersComputed"
        />
    <label class="textarea-field_label_floating">
      {{label}}
    </label>
  </div>
</template>


<script>
export default {
  props: {
    value: [String, Number],
    label: String
  },
  model: {
    prop: 'value',
    event: 'input'
  },
  methods: {
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

.textarea-field
  display flex
  flex 1
  align-items center
  position relative
  background-color #FFFFFF
  border-radius 10px
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
    
    &:hover
      ~ label
        color #616161

    &:focus
      border-color #008390
      ~ label
        color #3d8e88
        top -10px
        left 20px
        transform scale(.9)

    &_filled
      ~ label
        color #9e9e9e
        top -10px
        left 20px
        transform scale(.9)

  &_label_floating
    white-space nowrap
    max-width 99%
    overflow hidden
    text-overflow ellipsis
    padding 0 10px
    margin-left 1px
    pointer-events none
    position absolute
    top calc(50% - 10px)
    left 5px
    font-size inherit
    transition all .2s ease

</style>
