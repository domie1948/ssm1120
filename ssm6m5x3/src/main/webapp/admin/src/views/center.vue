<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                              <el-col :span="12">
        <el-form-item   v-if="flag=='yihurenyuan'"  label="医护工号" prop="yihugonghao">
          <el-input v-model="ruleForm.yihugonghao" readonly              placeholder="医护工号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='yihurenyuan'"  label="医护姓名" prop="yihuxingming">
          <el-input v-model="ruleForm.yihuxingming"               placeholder="医护姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='yihurenyuan'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in yihurenyuanxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='yihurenyuan'"  label="职位" prop="zhiwei">
          <el-select v-model="ruleForm.zhiwei" placeholder="请选择职位">
            <el-option
                v-for="(item,index) in yihurenyuanzhiweiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='yihurenyuan'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="yihurenyuanzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='yihurenyuan'"  label="科室" prop="keshi">
          <el-select v-model="ruleForm.keshi" placeholder="请选择科室">
            <el-option
                v-for="(item,index) in yihurenyuankeshiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yihurenyuan'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua"               placeholder="联系电话" clearable></el-input>
        </el-form-item>
      </el-col>
                                                                              <el-col :span="12">
        <el-form-item   v-if="flag=='bingren'"  label="手机号" prop="shoujihao">
          <el-input v-model="ruleForm.shoujihao" readonly              placeholder="手机号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='bingren'"  label="病人姓名" prop="bingrenxingming">
          <el-input v-model="ruleForm.bingrenxingming"               placeholder="病人姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='bingren'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in bingrenxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='bingren'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='bingren'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="bingrenzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                                                                                                                                                                              <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
                                                                  yihurenyuanxingbieOptions: [],
                        yihurenyuanzhiweiOptions: [],
                                    yihurenyuankeshiOptions: [],
                                                                                                                        bingrenxingbieOptions: [],
                                                                                                                                                                                                    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                            this.yihurenyuanxingbieOptions = "男,女".split(',')
                this.yihurenyuanzhiweiOptions = "医生,护士".split(',')
                        this.$http({
      url: `option/keshi/keshi`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.yihurenyuankeshiOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                                                                this.bingrenxingbieOptions = "男,女".split(',')
                                                                                                                                  },
  methods: {
                                                                                                                                                                                                                                                                                                                                yihurenyuanzhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
                                                                                                        bingrenzhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
                                                                                                                    onUpdateHandler() {
                              if((!this.ruleForm.yihugonghao)&& 'yihurenyuan'==this.flag){
        this.$message.error('医护工号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'yihurenyuan'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                  if((!this.ruleForm.yihuxingming)&& 'yihurenyuan'==this.flag){
        this.$message.error('医护姓名不能为空');
        return
      }
                                                                                                                                                                                                                                                                                                                  if( 'yihurenyuan' ==this.flag && this.ruleForm.lianxidianhua&&(!isMobile(this.ruleForm.lianxidianhua))){
        this.$message.error(`联系电话应输入手机格式`);
        return
      }
                                                                                                                                    if((!this.ruleForm.shoujihao)&& 'bingren'==this.flag){
        this.$message.error('手机号不能为空');
        return
      }
                                    if( 'bingren' ==this.flag && this.ruleForm.shoujihao&&(!isMobile(this.ruleForm.shoujihao))){
        this.$message.error(`手机号应输入手机格式`);
        return
      }
                                          if((!this.ruleForm.mima)&& 'bingren'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                                                                                                                                    if( 'bingren' ==this.flag && this.ruleForm.nianling&&(!isIntNumer(this.ruleForm.nianling))){
       this.$message.error(`年龄应输入整数`);
        return
      }
                                                                                                                                                                                                                                                                        this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
