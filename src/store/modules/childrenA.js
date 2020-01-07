export default {
    namespaced: true,
    state: {
        childrenACount: 2,
    },
    getters: {
        childrenACountDouble(state, getters, rootState) {
            return rootState.count * states.childrenACount
            console.log(getters)
        }
    },
    mutations: {
        increment(state, playload) {
            state.childrenACount = playload || state.childrenACount
        }
    },
    actions: {
        increment({ state, commit, rootState }, playload) {
            setTimeout(() => {
                commit('increment', playload)
            }, 1000);
        }
    }
}