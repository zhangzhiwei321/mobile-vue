import Vue from 'vue'
import VueRouter from 'vue-router';

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'index',
        component: () => import('@/view/index.vue')
    },
    {
        path: '/login',
        name: 'login',
        component: () => import('@/view/login.vue')
    },
    {
        path: '/404',
        name: '404',
        component: () => import('@/view/notFound.vue')
    },
    {
        path: '*',
        name: '*',
        redirect: '/404'
    }
]

export default new VueRouter({
    mode: 'history',
    routes
})