<template>
  <div class="radio-field">
    <input  hidden
            :id="_uid"
            type="radio"
            :value="value"
            @click="$emit('change', value)"
        />
    <label :for="_uid" class="box" :class="{'checked': picked == value}"/>
    <label :for="_uid" class="label"> {{label}} </label>
  </div>
</template>


<script>
export default {
  props: {
    value: [String, Number],
    label: String,
    picked : [String, Number, Boolean]
  },
  model: {
    prop: 'picked',
    event: 'change'
  }
}
</script>

<style lang="stylus">
.radio-field
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
    border-radius 50%
    border 1px solid #21212130
    &.checked
      border 6px solid #008390
  
  .label
    padding-left 10px

</style>
