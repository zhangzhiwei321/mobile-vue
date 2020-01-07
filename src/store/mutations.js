// import Vue from 'vue';

export default {

    increment(state, playload) {
        console.log(playload)
        state.count += playload
    },
    objSet(state, vm) {
        vm.$set(state.obj, 'name', 'name')
    }

}