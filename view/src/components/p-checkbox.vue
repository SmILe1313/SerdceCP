<template>
  <div class="checkbox-field">
    <input  hidden
            :id="_uid"
            type="checkbox"
            :value="value"
            @change="$emit('change', !value)"
        />
    <label :for="_uid" class="box" :class="{'checked': value}"/>
    <label :for="_uid" class="label"> {{label}} </label>
  </div>
</template>


<script>
export default {
  props: {
    value: Boolean,
    label: String
  },
  model: {
    prop: 'value',
    event: 'change'
  }
}
</script>

<style lang="stylus">
.checkbox-field
  display flex
  flex 1
  align-items center
  background-color #FFFFFF
  cursor pointer
  label
    cursor pointer

  .box
    width 20px
    height 20px
    flex-shrink 0
    border-radius 4px
    border 1px solid #008390
    &.checked
      background-color #008390
  
  .label
    padding-left 10px

</style>
