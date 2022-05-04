import axios from 'axios';

const api = axios.create({
    baseURL: "http://44.194.61.39:8080/" //alterar para a sua API
});

export default api;
