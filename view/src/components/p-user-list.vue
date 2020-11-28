<template>
  <transition-group name="list" class="list" tag="ul" mode="out-in">
    <li v-for="user in usersFiltered"
				:key="user.id"
				class="list-item"
				:class="{ 'selected': user.id == activeId }"
				@click="select(user)">

			<div class="item-info">
				<div class="item-desctiption">
					<h4 class="description-label"> {{ user.fullName }} </h4>
				</div>
			</div>

    </li>
  </transition-group>
</template>
<script>
export default {
	props: {
		activeId: [Number, String],
		search: String
	},
  data () {
    return {
			users: [
				{
					id: 123,
					fullName: 'Зимин А.В.',
					dob: '01.02.1990'
				},
				{
					id: 1234,
					fullName: 'Островский Д.Ю.',
					dob: '01.02.1990'
				},
				{
					id: 1235,
					fullName: 'Меркуль Е.Ю.',
					dob: '01.02.1990'
				},
				{
					id: 12354,
					fullName: 'Катаранчук С.А.',
					dob: '01.02.1990'
				},
				{
					id: 1239,
					fullName: 'Зимин А.В.',
					dob: '01.02.1990'
				},
				{
					id: 12357,
					fullName: 'Меркуль Е.Ю.',
					dob: '01.02.1990'
				},
				{
					id: 1235468,
					fullName: 'Катаранчук С.А.',
					dob: '01.02.1990'
				},
				{
					id: 12353,
					fullName: 'John Doe',
					dob: '01.02.1990'
				},
				{
					id: 12352,
					fullName: 'John Doe',
					dob: '01.02.1990'
				},
				{
					id: 1235133,
					fullName: 'John Doe',
					dob: '01.02.1990'
				},
				{
					id: 1235144,
					fullName: 'John Doe',
					dob: '01.02.1990'
				},
				{
					id: 1235155,
					fullName: 'John Doe',
					dob: '01.02.1990'
				},
				{
					id: 1235166,
					fullName: 'John Doe',
					dob: '01.02.1990'
				},
				{
					id: 12351661,
					fullName: 'John Doe',
					dob: '01.02.1990'
				},
				{
					id: 12351662,
					fullName: 'John Doe',
					dob: '01.02.1990'
				},
				{
					id: 123516613,
					fullName: 'John Doe',
					dob: '01.02.1990'
				}
			]
    }
	},
  created () {
		// this.$bs.getPatients()
		// 	.then(users => {
		// 		this.users = users
		// 	})
  },
  methods: {
		select (user) {
			this.$emit('select', user)
		}
  },
  computed: {
		usersFiltered () {
			return this.users.filter(user => user.fullName.toLowerCase().includes(this.search.toLowerCase()))
		}
  },
  components: {
	}
}
</script>
<style lang="stylus" scoped>
.list
	display flex
	flex-direction column
	padding 0 10px 0 0
	margin 0
	max-height 100%
	overflow-y auto
	direction rtl

	.list-item
		display flex
		padding-left 80px
		transition all .2s ease
		cursor pointer
		direction ltr
		&.selected
			background-color #E6EDFF
			color #008390
			border-radius 0px 10px 10px 0px
		&:not(:last-child)
			margin-bottom 10px

		.item-info
			display flex
			justify-content space-between
			flex 5
			padding 10px

			.item-desctiption
				display flex
				flex-direction column
				justify-content center
				flex 5

				.description-label,
				.description-dob
					padding 0
					margin 0
					font-weight normal
					white-space nowrap
					text-align left
				.description-dob
					font-size 14px

.list-move,
.list-enter-active,
.list-leave-active
	transition all .5s ease


.list-enter,
.list-leave-to
	opacity 0
	transform scale(1, .5)
</style>
