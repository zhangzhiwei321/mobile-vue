export default {
    // namespaced: true,
    state: {
        childrenBCount: 2,
    },
    getters: {
        childrenBCountDouble(state, getters, rootState) {
            return rootState.count * state.childrenBCount
            console.log(getters)
        }
    },
    mutations: {
        childrenBIncrement(state, playload) {
            state.childrenBCount = playload || state.childrenBCount
        }
    },
    actions: {
        childrenBIncrement({ state, commit, rootState }, playload) {
            setTimeout(() => {
                commit('childrenBIncrement',playload)
            }, 1000);
        }
    }
}