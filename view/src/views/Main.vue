<template>
  <div class="main-layout">
    <h1> Жми и смотри нетворк </h1>

    <button type="button" @click="getPatients"> <b-icon-person-lines-fill/> Получить пациентов </button>
    <button type="button" @click="getFields"> <b-icon-card-text/> Получить поля </button>
    <button type="button" @click="getDataAsync"> <b-icon-box/> Получить любые данные </button>
    <button type="button" @click="createEntity"> <b-icon-plus-square/> Создать объект </button>
    <button type="button" @click="updateEntity"> <b-icon-pencil-square/> Обновить объект </button>
    <button type="button" @click="deleteAsync"> <b-icon-trash/> Удалить объект </button>
    
  </div>
</template>
<script>
export default {
  data () {
    return {
      entity: {
        id: + new Date(),
        name: 'John',
        lastName: 'Doe'
      }
    }
  },
  methods: {
    getPatients () {
      this.$bs.getPatients()
    },
    getFields () {
      this.$bs.getFields()
    },
    getDataAsync () {
      this.$bs.getDataAsync('anyEntityName')
    },
    createEntity () {
      const entityName = 'User'
      this.$bs.createAsync(entityName, this.entity)
    },
    updateEntity () {
      const entityName = 'User'
      const newEntity = { ...this.entity, 'age': 20 }
      this.$bs.updateAsync(entityName, newEntity)
    },
    deleteAsync () {
      const { id } = this.entity
      const entityName = 'User'
      this.$bs.deleteAsync(entityName, id)
    }
  },
  computed: {
  },
  components: {
	}
}
</script>
<style lang="stylus">
.main-layout
  display flex
  flex-direction column
  align-items flex-start
button 
  margin 10px
  padding 10px
</style>
