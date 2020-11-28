<template>
  <div class="selectbox-field">
    <p-input v-model="value" :label="label"
            tool="caret-down-fill" :toolFill="true" @toolcall="showOptions = !showOptions"/>
    <ul v-show="showOptions">
      <li v-for="option in options" :key="option" @click="select(option)">{{option}}</li>
    </ul>
  </div>
</template>


<script>
import pInput from './p-input'
export default {
  props: {
    value: [String, Number],
    label: String,
    field: Object
  },
  model: {
    prop: 'value',
    event: 'input'
  },
  data () {
    return {
			showOptions: false,
    }
  },
  methods: {
    select (option) {
      this.$emit('input', option)
      this.showOptions = false
    }
  },
  computed: {
    options () {
      return this.field.config.options
    }
  },
  components: {
    pInput
  }
}
</script>

<style lang="stylus" scoped>
.selectbox-field
  display flex
  flex-direction column
  position relative
  ul
    position absolute
    z-index 10
    top calc(100% + 10px)
    width 100%
    margin 0
    padding 3px
    border-radius 10px
    border 1px solid #C8D8FF
    background-color white
    max-height 200px
    overflow-y auto
    li
      padding 7px
      border-radius 8px
      cursor pointer
      &:hover
        background-color #E6EDFF
</style>
