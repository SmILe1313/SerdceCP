<template>
	<div class="home-layout">
		<p-header-tabs @toggle="toggleTab" :active="tabActive"/>

		<div class="side">
			<p-search :filter="filter" @update="updateFilter"/>
			<p-user-list :users="users" @select="selectUser" :activeId="userActiveId" :search="filter.fio"/>
		</div>

		<div class="content">
			<div class="detailed-card" v-if="showCardComputed">
				<p-circle-tabs @toggle="toggleTab" :active="tabActive"/>
				<p-tab-info :data="tabInfo" v-if="showTabComputed"/>
			</div>
			<p-preloader :show="loadingCard"/>
		</div>

  </div>
</template>

<script>
import pUserList from '@/components/p-user-list'
import pCircleTabs from '@/components/p-circle-tabs'
import pHeaderTabs from '@/components/p-header-tabs'
import pTabInfo from '@/components/p-tab-info'
import pSearch from '@/components/p-search'
import pPreloader from '@/components/p-preloader'
export default {
	props: {
		userid: String
	},
  data () {
    return {
			tabActive: 'Данные',
			userActiveId: this.userid,
			users: [],
			loadingCard: false,
			loadingTab: false,
			filter: {
				fio: '',
				requiresAttention: false,
				hasDiagnostic: false,
				status: '',
				gender: ''
			},
			tabInfo: {},
			tabs: {
        'Данные': 'data',
        'Анамнез жизни': 'life',
        'Анамнез заболевания': 'disease',
				'Лабораторное обследование': 'laboratory',
				'Инструментальное обследование': 'instrumental',
        'Диагноз': 'diagnosis',
        'Лечение': 'therapy'
      },
			// Справочные данные
			filterStatusmatrix: {
				'На лечении': 'onTreatment',
				'Обследуется': 'examined'
			},
			genderMatrix: {
				'Мужчина': 'male',
				'Женщина': 'female'
			}
    }
	},
	watch: {
		filter: {
			handler (to) {
				this.fetchUsers(to)
			},
			deep: true
		},
		userActiveId (id) {
			this.fetchUser(id)
			this.$router.push('/user/' + id)
		},
		tabActive () {
			this.fetchFields()
		}
	},
	created () {
		if (this.userActiveId) {
			this.fetchUser(this.userActiveId)
		}
		this.fetchUsers(this.filter)
		this.fetchFields()
	},
  methods: {

		// Получить данные по пользователю
		fetchUser (id) {
			this.loadingCard = true
			this.$bs.getPatient(id)
			setTimeout(() => {
				this.loadingCard = false
			}, 1000)
		},

		// Получить набор полей вкладки
		fetchFields () {
			this.loadingTab = true
			this.$bs.getFields(this.tabName).then(resp => {
				this.loadingTab = false
			})
		},

		// Получить список пользователей
		fetchUsers (filters) {
			const fields = Object.keys(filters).filter(key => filters[key])
			let requestParams = fields.reduce((acc, key) => ({ ...acc, [key]: filters[key] }), {})
			const { status, gender } = requestParams
			if (status) {
				requestParams.status = this.filterStatusmatrix[status]
			}
			if (gender) {
				requestParams.gender = this.genderMatrix[gender]
			}
			this.$bs.getPatients(requestParams)
		},
		toggleTab (name) {
			this.tabActive = name
		},
		selectUser (user) {
			this.userActiveId = user.id
		},
		updateFilter (filter) {
			this.filter = filter
		}
	},
	computed: {
		showCardComputed () {
			return this.userActiveId && !this.loading
		},
		showTabComputed () {
			return !this.loadingTab
		},
		tabName () {
      return this.tabs[this.tabActive]
    }
	},
	components: {
		pUserList,
		pCircleTabs,
		pHeaderTabs,
		pTabInfo,
		pSearch,
		pPreloader
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
		width 15%
		min-width 350px

	.content,
	.detailed-card
		position relative
		display flex
		flex-direction column
		flex 1
		height 100%
	.detailed-card	
		overflow-y auto
</style>
