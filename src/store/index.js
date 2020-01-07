import Vue from 'vue';
import Vuex from 'vuex';

import getters from './getters';
import mutations from './mutations';
import actions from './actions';
import childrenA from './modules/childrenA';
import childrenB from './modules/childrenB';

Vue.use(Vuex);

export default new Vuex.Store({
    strict: process.env.NODE_ENV !== 'production',
    state: {
        count: 0,
        obj: {}
    },
    getters,
    mutations,
    actions,
    modules: {
        childrenA,
        childrenB
    }
})

