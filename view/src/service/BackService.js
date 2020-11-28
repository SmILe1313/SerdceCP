import axios from 'axios'

const HTTP = axios.create({
  headers: {
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': '*'
  },
  xsrfHeaderName: 'Csrf-Token',
  // withCredentials: true,
  maxContentLength: 50000000,
  timeout: 150000
})

const backLink = 'http://192.169.6.6:9000/'
const add = 'add/'
const upd = 'update/'
const del = 'delete/'
const login = 'login'
const bs = {

  // Получить данные
  getDataAsync (entityName) {
    return HTTP.get(backLink + entityName)
      .then(({ data }) => {
        if (data) {
          return Promise.resolve(data)
        } else {
          return Promise.reject(new Error('getting error'))
        }
      })
      .catch(e => {
        console.log(e)
      })
  },

  // Создать объект
  createAsync (entityName, entity) {
    return HTTP.post(backLink + add + entityName, entity)
      .then(({ data }) => {
        if (data) {
          return Promise.resolve(data)
        } else {
          return Promise.reject(new Error('getting error'))
        }
      })
      .catch(e => {
        console.log(e)
      })
  },

  // Обновить объект
  updateAsync (entityName, entity) {
    return HTTP.put(backLink + upd + entityName, entity)
      .then(({ data }) => {
        if (data) {
          return Promise.resolve(data)
        } else {
          return Promise.reject(new Error('getting error'))
        }
      })
      .catch(e => {
        console.log(e)
      })
  },

  // Удалить объект
  deleteAsync (entityName, id) {
    return HTTP.delete(backLink + del + entityName + '/' + id)
      .then(({ data }) => {
        if (data) {
          return Promise.resolve(data)
        } else {
          return Promise.reject(new Error('getting error'))
        }
      })
      .catch(e => {
        console.log(e)
      })
  },

  // Данные по конкретному пациенту
  getPatient (id) {
    return this.getDataAsync('patients/' + id)
  },

  // Все пациенты
  getPatients () {
    return this.getDataAsync('patients')
  },

  // Получить все поля вкладки
  getFields (category) {
    return this.getDataAsync('fields/' + category)
  },

  // Логинимся. В ответ придет user
  doLogin(formData) {
    return HTTP.post(backLink + login, formData)
      .then(({ data }) => {
        if (data) {
          return Promise.resolve(data)
        } else {
          return Promise.reject(new Error('getting error'))
        }
      })
      .catch(e => {
        console.log(e)
      })
  }
}
export default bs
