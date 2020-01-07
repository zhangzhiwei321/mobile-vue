import CreateAxios from './createAxios';

const axios = new CreateAxios(process.env.VUE_APP_DOMAIN).create();

export default {
    api: function () {
        console.log(axios)
    }
}