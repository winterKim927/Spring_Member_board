<template>
  <RowTest v-for="i in 10" :key="i"/>
</template>

<script>
//import MemberBoard from './components/MemberBoard.vue'
import RowTest from './components/RowTest.vue'

export default {
  name: 'App',
  components: {
    RowTest
  }
}
</script>

<style>
</style>
