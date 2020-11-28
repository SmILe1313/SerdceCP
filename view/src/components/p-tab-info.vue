<template>
  <div class="info-layout">
    <h2 class="label">{{label}}</h2>

    <div v-for="field in fields"
        :key="field.name"
        class="field"
        :class="field.type">
        <component :is="getWidget(field.widget)" v-model="data[field.fieldName]" :label="field.fieldLabel" :field="field"/>
    </div>
  </div>
</template>

<script>
// input/date/select/checkbox/textarea/graph
import pInput from './p-input'
import pCheckbox from './p-checkbox'
import pRadio from './p-radio'
import pTextarea from './p-textarea'
import pSelectbox from './p-selectbox'
export default {
  props: {
    label: String,
    fields: Array,
		data: Object
	},
  methods: {
    getWidget (widget) {
      return 'p-' + widget
    }
  },
  computed: {
  },
  components: {
    pInput,
    pCheckbox,
    pRadio,
    pTextarea,
    pSelectbox
  }
}
</script>

<style lang="stylus" scoped>
.info-layout
  display grid
  grid-template-columns repeat(auto-fill, minmax(250px, 1fr))
  grid-gap 40px
  border 2px solid #C8D8FF
  border-radius 20px
  padding 50px
  margin 50px
  position relative
  .label
    position absolute
    top -22px
    left 30px
    margin 0
    padding 5px 15px
    background-color white
    font-weight 500

</style>