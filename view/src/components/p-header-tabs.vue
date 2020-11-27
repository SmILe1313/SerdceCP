<template>
  <div class="header-layout">
		<div class="header-logo">
			<logo/>
		</div>

		<div class="header-tabs">
		<div v-for="name in tabs"
					:key="name"
					class="header-tab" 
				 	:class="{'active': active === name }"
					@click="toggle(name)">
			{{name}}
		</div>
		</div>

		<div class="header-user">
			<doc-profile/>
		</div>
	</div>
</template>

<script>
import logo from '@/icons/logo'
import docProfile from '@/icons/doc-profile'
export default {
	props: {
		active: String
	},
  data () {
    return {
			tabs: ['Данные', 'Анамнез жизни', 'Анамнез заболевания',
						'Лабораторное обследование',
						'Инструментальное обследование',
						'Диагноз', 'Лечение']
		}
	},
	methods: {
		toggle (name) {
			this.$emit('toggle', name)
		}
	},
	components: {
		logo,
		docProfile
	}
}
</script>

<style lang="stylus" scoped>
.header-layout
	display flex
	width 100%
	min-width 100%
	height 50px
	justify-content space-between
	align-items center
	background #FFFFFF
	box-shadow 0px 1px 15px rgba(0, 0, 0, 0.15)

	.header-logo,
	.header-user
		display flex
		flex 1
		justify-content center
		cursor pointer

	.header-tabs
		display flex
		justify-content space-evenly
		flex 5

		.header-tab
			padding 0 20px
			white-space nowrap
			cursor pointer
			&.active
				color #008390
				font-weight bold

</style>