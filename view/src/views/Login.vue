<template>
	<div>
		<input placeholder="login" v-model="form.login"/>
		<input placeholder ="password" type="password" v-model="form.password"/>
    <button type="button" @click="login"> LOGIN </button>
  </div>
</template>

<script>
export default {
  data () {
    return {
			form: {
				login: '',
				password: ''
			}
    }
  },
  methods: {
		login () {
			this.$bs.doLogin(this.form)
				.then(() => {
					this.$router.push('/')
				})
		}
	},
	components: {
	}
}
</script>

<style lang="stylus" scoped>
</style>
