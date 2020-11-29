<template>
	<div class="home-layout">
		<p-modal v-show="showDetailed" @close="showDetailed = false" :user="userData" :status="statusComputed"/>
		<p-header-tabs @toggle="toggleTab" :active="tabActive"/>

		<div class="side" v-if="users.length">
			<p-search :filter="filter" @update="updateFilter"/>
			<p-user-list @select="selectUser" :users="users" :activeId="userActiveId" :search="filter.fio"/>
		</div>

		<div class="content">
			<div class="detailed-card" v-if="showCardComputed">

				<div class="detailed-card-top">
					<p-circle-tabs @toggle="toggleTab" @show-predict="showPredict" :active="tabActive" :avatar="avatarComputed" :status="statusComputed"/>
					<p-user-info :data="userData"/>
				</div>

				<p-tab-info v-if="showTabComputed" :data="userData" :fields="fields" :label="tabActive"  @save="updateInfo" @predictall="getPredict"/>
			</div>
			<p-preloader :show="loadingCard"/>
		</div>

  </div>
</template>

<script>
import accordion from '@/components/accordion'
import pUserList from '@/components/p-user-list'
import pCircleTabs from '@/components/p-circle-tabs'
import pHeaderTabs from '@/components/p-header-tabs'
import pTabInfo from '@/components/p-tab-info'
import pUserInfo from '@/components/p-user-info'
import pSearch from '@/components/p-search'
import pPreloader from '@/components/p-preloader'
import pModal from '@/components/p-modal'
export default {
	props: {
		userid: String
	},
  data () {
    return {
			tabActive: 'Данные',
			userActiveId: this.userid,
			userData: {},
			users: [],
			fields: [],
			showDetailed: false,
			loadingCard: false,
			loadingTab: false,
			filter: {
				fio: '',
				requiresAttention: false,
				hasDiagnostic: false,
				status: '',
				gender: ''
			},
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
		userActiveId (id) {
			this.fetchUser(id)
			this.$router.push('/user/' + id)
		},
		tabActive () {
			this.fetchFields()
		}
	},
	created () {
		this.fetchFields()
		this.fetchPatients()
		if (this.userActiveId) {
			this.fetchUser(this.userActiveId)
		}
	},
  methods: {
		getPredict () {
			this.$bs.getPredictAsync(this.users)
				.then(data => {
					console.log(data)
				})
		},
		showPredict () {
			this.showDetailed = !this.showDetailed
		},
		fetchPatients () {
			this.$bs.getPatients()
				.then(data => {
					this.users = data
				})
		},
		// Получить данные по пользователю
		fetchUser (id) {
			this.loadingCard = true
			this.userData = {}
			this.$bs.getPatient(id)
				.then(data => {
					this.userData = data
					setTimeout(() => { this.loadingCard = false }, 1500)
				})
		},

		// Получить набор полей вкладки
		fetchFields () {
			this.loadingTab = true
			this.$bs.getFields(this.tabName)
				.then(fields => {
					this.fields = fields
					setTimeout(() => { this.loadingTab = false }, 1000)
				})
		},

		// Обновляем запись
		updateInfo () {
			this.$bs.updateAsync('patients', this.userData)
				.then(_ => this.fetchUser(this.userActiveId))
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
			return this.userActiveId && !this.loadingCard
		},
		showTabComputed () {
			return !this.loadingTab
		},
		tabName () {
      return this.tabs[this.tabActive]
		},
		avatarComputed () {
			const avatarMatrix = {
				'Ж': 'userw',
				'М': 'userm'
			}
			return avatarMatrix[this.userData.pol || 'М']
		},
		statusComputed () {
			const statusMatrix = {
				'Обследуется/На лечении': 'yellow',
				'Болен': 'red',
				'Не болен': 'blue'
			}
			return statusMatrix[this.userData.isSick]
		}
	},
	components: {
		accordion,
		pUserList,
		pCircleTabs,
		pHeaderTabs,
		pUserInfo,
		pTabInfo,
		pSearch,
		pPreloader,
		pModal
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
		overflow-y auto

	.content
		padding-bottom 50px

		.detailed-card-top
			display flex
</style>
