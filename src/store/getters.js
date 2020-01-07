export default {
    countTimes: state => {
        return state.count * 1000
    },
    countTime: (state, getters) => time => {
        return state.count.toString() + '+' + getters.countTimes.toString() + '+' + time.toString()
    }
}