import { createApp } from 'vue'
import Board from './Board.vue'
import BootstrapVue3 from 'bootstrap-vue-3'

// Optional, since every component import their Bootstrap functionality
// the following line is not necessary
// import 'bootstrap'

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue-3/dist/bootstrap-vue-3.css'


const board = createApp(Board)
board.use(BootstrapVue3)
board.mount('#app')