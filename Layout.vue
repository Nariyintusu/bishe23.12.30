<template>
  <div>
    <el-container>
      <el-header style="background-color: #4c535a">
        <img src="@/assets/222.png" alt="" style="width: 40px; position: relative; top: 10px;">
        <span style="font-size: 20px; margin-left: 15px; color: white">课程教学达成度分析系统</span>
      </el-header>
    </el-container>

    <el-container>
      <el-aside style="overflow: hidden; min-height: 100vh; background-color: #545c64; width: 250px">
        <el-menu :default-active="$route.path" router background-color="#545c64" text-color="#fff" active-text-color="#ffd04b">
          <el-menu-item index="/">
            <i class="el-icon-s-home"></i>
            <span slot="title">系统首页</span>
          </el-menu-item>
          <el-submenu index="2">
            <template slot="title">
              <i class="el-icon-location"></i><span>信息管理</span>
            </template>
            <el-menu-item-group>
              <el-menu-item index="/admin">超级管理员信息管理</el-menu-item>
              <el-menu-item index="/teacher">教师信息管理</el-menu-item>
              <el-menu-item index="/course">课程信息管理</el-menu-item>
              <el-menu-item index="/class">班级信息管理</el-menu-item>
              <el-menu-item index="/import">选课信息导入功能</el-menu-item>
            </el-menu-item-group>
          </el-submenu>
          <el-submenu index="3">
            <template slot="title">
              <i class="el-icon-location"></i><span>数据分析</span>
            </template>
            <el-menu-item-group>
              <el-menu-item index="3-1">毕业要求达成度分析</el-menu-item>
              <el-menu-item index="3-2">课程达成度数据可视化与分析</el-menu-item>

            </el-menu-item-group>
          </el-submenu>
        </el-menu>
      </el-aside>
      <el-main>
        <router-view/>
      </el-main>
    </el-container>
  </div>
</template>

<script>
export default {
  name: "Layout"
}
</script>

<style>
.el-menu{
  border-right: none !important;
}
</style>