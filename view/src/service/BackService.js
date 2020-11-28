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

const backLink = 'http://192.169.6.10:9000/'
const add = 'add/'
const upd = 'update/'
const del = 'delete/'
const login = 'login'
const bs = {

  // Получить данные
  getDataAsync (entityName, body) {
    return HTTP.post(backLink + entityName, body)
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

  // Все пациенты
  getPatients (filter) {
    return this.getDataAsync('patients', filter)
  },

  // Получить все поля опросника
  getFields () {
    return this.getDataAsync('fields')
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
