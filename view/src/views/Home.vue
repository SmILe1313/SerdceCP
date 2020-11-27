<template>
	<div class="home-layout">
		<p-header-tabs @toggle="toggleTab" :active="tabActive"/>

		<div class="side">
			<div class="placeholder"></div>
			<p-user-list @select="selectUser" :activeId="userActiveId"/>
			<!-- <div class="placeholder"></div> -->
		</div>

		<div class="detailed-card">
			<p-circle-tabs @toggle="toggleTab" :active="tabActive"/>
			<div class="placeholder"></div>
			<div class="placeholder"></div>
		</div>

  </div>
</template>

<script>
import pUserList from '@/components/p-user-list'
import pCircleTabs from '@/components/p-circle-tabs'
import pHeaderTabs from '@/components/p-header-tabs'
export default {
  data () {
    return {
			tabActive: 'Данные',
			userActiveId: '1234'
    }
  },
  methods: {
		toggleTab (name) {
			this.tabActive = name
		},
		selectUser (user) {
			this.userActiveId = user.id
		}
	},
	components: {
		pUserList,
		pCircleTabs,
		pHeaderTabs
	}
}
</script>

<style lang="stylus" scoped>

.placeholder
	width calc(100% - 22px)
	height 150px
	border 1px solid #e0e0e0
	border-radius 10px
	flex-shrink 0
	margin 10px
	position relative
	&:after
		content 'placeholder'
		font-size 30px
		color #e0e0e0
		font-weight bold
		position absolute
		top 38%
		left calc(50% - 80px)

.home-layout
	display flex
	flex-wrap wrap
	height 100vh
	width 100vw
	overflow hidden

	.side
		display flex
		flex-direction column
		height calc(100% - 50px)
		width 10%
		min-width 250px

	.detailed-card
		display flex
		flex-direction column
		flex 1
		height 100%
		overflow-y auto
</style>
