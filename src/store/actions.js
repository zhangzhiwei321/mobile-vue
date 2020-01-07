export default {
    increment(context, playload) {
        return new Promise(resolve => {
            setTimeout(() => {
                context.commit('increment', playload)
                resolve(context.state.count)
            }, 10000);
        })
    }
}