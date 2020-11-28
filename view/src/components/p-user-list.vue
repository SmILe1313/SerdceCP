<template>
  <transition-group name="list" class="list" tag="ul" mode="out-in">
    <li v-for="user in usersFiltered"
				:key="user.id"
				class="list-item"
				:class="{ 'selected': user.id == activeId }"
				@click="select(user)">

			<h4 class="description-label"> {{ user.fio }} </h4>

    </li>
		<div class="bot-border" key="bot"/>
  </transition-group>
</template>
<script>
export default {
	props: {
		activeId: [Number, String],
		search: String,
		users: Array
	},
  methods: {
		select (user) {
			this.$emit('select', user)
		}
  },
  computed: {
		usersFiltered () {
			return this.users.filter(user => user.fio.toLowerCase().includes(this.search.toLowerCase()))
		}
  },
}
</script>
<style lang="stylus" scoped>
.list
	display flex
	flex-direction column
	padding 0 10px 0 0
	margin 0 0 50px 0
	max-height calc(100% - 50px)
	overflow-y auto
	overflow-x hidden
	direction rtl
	position relative

	.bot-border
		position sticky
		width 85%
		right 0
		bottom 0
		border-bottom 1px solid #C8D8FF

	.list-item
		display flex
		padding-left 52px
		transition all .2s ease
		cursor pointer
		direction ltr
		&.selected
			background-color #E6EDFF
			color #008390
			border-radius 0px 10px 10px 0px
			margin-right 20px
		&:not(:last-child)
			margin-bottom 10px

		.description-label
			padding 10px
			margin 0
			width 100%
			font-weight normal
			white-space nowrap
			text-align left
			text-overflow ellipsis
			overflow hidden

.list-move,
.list-enter-active,
.list-leave-active
	transition all .5s ease


.list-enter,
.list-leave-to
	opacity 0
	transform scale(1, .5)
</style>
