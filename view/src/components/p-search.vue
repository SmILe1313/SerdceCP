<template>
  <div class="search-layout">
		<p-input v-model="filter.fio" label="Поиск" icon="search" :tool="toolComputed" @toolcall="toggleFilter"/>

    <accordion>
    <div class="filters" v-if="showFilter">
      <div class="filter-group">
        <div class="filter-item">
          <p-checkbox v-model="filter.requiresAttention" label="Требует внимания"/>
        </div>
        <div class="filter-item">
          <p-checkbox v-model="filter.hasDiagnostic" label="Есть диагноз"/>
        </div>
      </div>
      <div class="filter-group">
        <div class="filter-item">
          <p-radio v-model="filter.status" value="На лечении" label="На лечении"/>
        </div>
        <div class="filter-item">
          <p-radio v-model="filter.status" value="Обследуется" label="Обследуется"/>
        </div>
      </div>
      <div class="filter-group">
        <div class="filter-item">
          <p-radio v-model="filter.gender" value="Мужчина" label="Мужчина"/>
        </div>
        <div class="filter-item">
          <p-radio v-model="filter.gender" value="Женщина" label="Женщина"/>
        </div>
      </div>
    </div>
    </accordion>
	</div>
</template>

<script>
import accordion from './accordion'
import pInput from './p-input'
import pCheckbox from './p-checkbox'
import pRadio from './p-radio'
export default {
	props: {
    active: String,
    filter: Object
    
	},
  data () {
    return {
      showFilter: false
		}
  },
	methods: {
		toggleFilter () {
      this.showFilter = !this.showFilter
    }
  },
  computed: {
    toolComputed () {
      return this.filter.fio ? 'funnel-fill' : 'funnel'
    }
  },
	components: {
    accordion,
    pInput,
    pCheckbox,
    pRadio
	}
}
</script>

<style lang="stylus" scoped>
.search-layout
  padding 30px 10px 10px 50px

.filter-group
  border 1px solid #C8D8FF
  border-radius 10px
  margin 15px 0
  padding 10px
  width 100%

  .filter-item
    &:not(:last-child)
      margin-bottom 10px
</style>