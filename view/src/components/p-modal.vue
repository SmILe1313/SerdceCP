<template>
  <transition name="fade">
  <div class="backdrop" @click.self="$emit('close')">
    <div class="modal">
      <div class="row">
        <h2>{{user.fio}} ({{user.vozrast}})</h2>
      </div>
      <div class="row">
        <h4>Состояние здоровья</h4>
      </div>
      <div class="row">
        <p-indicator :value="valueComputed" :color="colorComputed"/>
      </div>
      <div class="row">
        <h4>Рекомендации</h4>
      </div>
      <div class="row">
        <template v-if="user.recommends">
        {{user.recommends}}
        </template>
        <template v-else>
          <p>— Физическая активность. Это любой вид спорта, в старшем возрасте — в щадящем режиме, или 30-40 минут ходьбы, если вы никогда активно не занимались спортом.
            <br><br>
          — Правильное питание. Нельзя злоупотреблять красным мясом и гарнирами, чем меньше человек потребляет сладкого, соленного и мучного — тем лучше.
            <br><br>
          — Режим дня и здоровый сон. При этом сон должен быть не только полноценным в плане количества, но и в качественном отношении — постель должна быть жесткой, а подушку и матрац следует выбрать ортопедические.
            <br><br>
          — Внимательное отношение к самочувствию — если прислушиваться к своему организму, то получится заметить все тревожные сигналы вовремя и, соответственно, своевременно обратиться к врачу, тем самым предупредив заболевание.
          </p>
        </template>
      </div>
    </div>
  </div>
  </transition>
</template>


<script>
import pIndicator from './p-indicator'
export default {
  props: {
    user: Object,
    status: String
  },
  computed: {
    colorComputed () {
      const colorMatrix = {
        '30': '#aed581',
        '60': '#ffe082',
        '90': '#e57373'
      }
      return colorMatrix[this.valueComputed]
    },
    valueComputed () {
      const statusMatrix = {
				'yellow': 60,
				'red': 90,
				'blue': 30
			}
      return statusMatrix[this.status]
    }
  },
  components: {
    pIndicator
  }
}
</script>

<style lang="stylus" scoped>
.row
  display flex
  align-items center
  h2,
  h4
    margin 10px 0
    font-weight 500
    padding-right 50px

  p
    margin 0

.backdrop
  display flex
  width 100vw
  height 100vh
  position fixed
  z-index 5
  top 0
  left 0
  right 0
  bottom 0
  background-color #f5f5f5

  .modal
    width 600px
    heigth 400px
    padding 50px
    margin auto
    display flex
    flex-direction column
    background-color white
    border-radius 10px

.fade-enter-active,
.fade-leave-active
	transition opacity .5s ease

.fade-enter,
.fade-leave-to
	opacity 0
</style>
