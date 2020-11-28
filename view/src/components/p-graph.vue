<template>
  <vue-chartist :data="data" :options="options" type="Line" :listener="listener"></vue-chartist>
</template>


<script>
import vueChartist from 'v-chartist'
import Chartist from 'chartist'
export default {
  data () {
    return {
      data: {
        series: [[-4, 2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                2, -3, 20, -3, -2, 3, -2, -2, -2, -2,
                0, 0, 0, 0, 0]]
      },
      options: {
        height: '400px',
        high: 50,
        low: -50,
        fullWidth: true,
        showPoint: false,
        chartPadding: {
          left: -20,
          bottom: -20
        }
      },
      listener: {
        draw (data) {
          if(data.type === 'line') {
            data.element.animate({
              d: {
                begin: 0,
                dur: 2000,
                from: data.path.clone().scale(1, 0).translate(0, data.chartRect.height()).stringify(),
                to: data.path.clone().stringify(),
                easing: Chartist.Svg.Easing.easeOutQuint
              }
            })
          }
        }
      }
    }
	},
  components: {
    vueChartist
  }
}
</script>

<style lang="stylus">
@require '../styles/chartist.min.css'

.ct-line
  stroke-width 1px

.ct-label
  display none !important
</style>
