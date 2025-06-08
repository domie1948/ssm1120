const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm6m5x3/",
            name: "ssm6m5x3",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm6m5x3/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "医院住院管理系统"
        } 
    }
}
export default base
