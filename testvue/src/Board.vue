<template>
  <MemberBoard :BoardList="boardList"/>
</template>

<script>
import MemberBoard from './components/MemberBoard.vue'
import $ from "jquery";
let boardList = [];
export default {
  name: 'Board',
  data() {
    return{
      boardList : []
    }
  },
  components: {
    MemberBoard
  },
  methods: {
    getList () {
      $.ajax({
        type : "GET",
        url : "/board",
        success : function (result) {
          this.vue.boardList = result;
        }
      });
    }
  }
}

</script>

<style>
</style>
