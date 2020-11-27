<template>
  <div class="tabs-layout">
		<div class="main-circle" ref="circle">
			<transition-group name="scale" appear>
			<div v-for="{ name, style, icon } in tabsComputed"
					:key="name"
					:style="style"
					class="tab-circle"
					:class="{'active': active === name }"
					@mouseover="removeDelay($event.target)"
					@mouseleave="returnDelay($event.target)"
					@click="toggle(name)">
						<component :is="icon" font-scale="1.5"/>
						<h5>{{name}}</h5>
			</div>
			</transition-group>

			<div class="profile-circle">
				<userm/>
			</div>

		</div>
	</div>
</template>
<script>
import userm from '@/icons/profiles/userm'
export default {
	props: {
		active: String
	},
  data () {
    return {
			tabs: ['Данные', 'Лечение', 'Диагноз',
						'Инструментальное обследование',
						'Лабораторное обследование',
						'Анамнез заболевания', 'Анамнез жизни'],
			icons: ['archive', 'graph-up', 'bell', 'tv', 'card-text', 'card-checklist', 'clock'],
			sizes () {
				let size = 360 / 7
				let radius = 252
				let circleOffset = 141.5
				let offsetToChildCenter = 40
				let totalOffset = radius - offsetToChildCenter
				let styles = []
				for (let i = 1; i <= 7; ++i) {
					styles.push({
						top: Math.sin((size * i - circleOffset) * (Math.PI / 180)) * radius + totalOffset + 'px',
						left: Math.cos((size * i - circleOffset) * (Math.PI / 180)) * radius + totalOffset + 'px',
						'transition-delay': i * 0.2 + 's'
					})
				}
				return styles
			}
		}
  },
  methods: {
		toggle (name) {
			this.$emit('toggle', name)
		},
		removeDelay (el) {
			el.$delay = el.style.transitionDelay
			el.style.transitionDelay = '0s'
		},
		returnDelay (el) {
			setTimeout(() => (el.style.transitionDelay = el.$delay), 1000)
		}
  },
  computed: {
		tabsComputed () {
			return this.tabs.map((tab, i) => {
				return {
					name: tab,
					icon: 'b-icon-' + this.icons[i],
					style: this.sizes()[i]
				}
			})
		}
  },
  components: {
	  userm
  }
}
</script>
<style lang="stylus" scoped>
.tabs-layout
	display flex
	flex-direction column
	align-items center
	justify-content center
	flex-shrink 0
	min-height 670px

	.main-circle
		width 500px
		height 500px
		border 2px solid #E6EDFF
		border-radius 50%
		position relative
		display flex
		justify-content center
		align-items center

		.tab-circle
			display flex
			justify-content center
			align-items center
			width 80px
			height 80px
			position absolute
			border-radius 50%
			background #FFFFFF
			box-shadow 0px 1px 15px rgba(0, 0, 0, 0.15)
			cursor pointer
			transition width .2s ease, margin .2s ease, transform .5s ease-in

			&.active
				background-color #E6EDFF
				box-shadow none
				h5
					color #008390
			
			&:hover
				box-shadow 0px 1px 15px #0083908a
			
			h5
				position absolute
				pointer-events none
				margin 10px 0
				padding 0
				top 100%
				width 100px
				text-align center
			svg
				fill #008390

		.profile-circle
			display flex
			justify-content center
			align-items center
			width 50%
			height 50%
			border-radius 50%
			background-color #E6EDFF
			svg 
				width 70%

.scale-enter-active,
.scale-leave-active
	transition transform .5s ease-in

.scale-enter,
.scale-leave-to
	transform scale(0)
</style>
