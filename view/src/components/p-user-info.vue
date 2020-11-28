<template>
  <transition name="slide" appear>
  <div class="user-info-layout">
    <h2 class="label">{{data.fio}}</h2>

    <div v-for="field in fields"
        :key="field.name"
        class="field">
        <h4>{{field.label}} <span>{{data[field.name] || field.placeholder}}</span></h4>
    </div>

  </div>
  </transition>
</template>

<script>
export default {
  props: {
		data: Object
	},
  data () {
    return {
      fields: [
        { name: 'data_rozhdeniya', label:'Дата рождения' },
        { name: 'vozrast', label: 'Возраст'},
        { name: 'snils', label: 'СНИЛС', placeholder: '555-555-555 55' },
        { name: 'pass', label: 'Паспорт', placeholder: '5555 555555' },
        { name: 'phone', label: 'Телефон', placeholder: '+ 7 (999) 999 99 99' },
        { name: 'factAddr', label: 'Фактический адрес', placeholder: 'г. Чита, ул. Полины Осипенко 38, 7' },
        { name: 'textAddr', label: 'Адрес прописки', placeholder: 'г. Балашиха, ул. Заречая 4а, 131' }
      ]
    }
  }
}
</script>

<style lang="stylus" scoped>
.user-info-layout
  display flex
  flex-direction column
  flex 1
  border 2px solid #C8D8FF
  border-radius 20px
  padding 30px
  margin auto 50px
  height 380px
  .label
    margin 0
    margin-bottom 20px
    font-weight 500

  .field
    h4
      font-weight 500
      margin 10px 0
    span
      margin-left 30px

.slide-enter-active
  transition transform .5s ease

.slide-enter
  transform translateX(100%)
</style>