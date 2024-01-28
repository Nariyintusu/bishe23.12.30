<template>
    <div>
      <div style="margin-bottom: 15px">
        <el-input v-model="input" style="width: 200px" placeholder="请输入内容"></el-input>
        <el-button type="warning" style="margin-left: 10px">查询</el-button>
        <el-button type="primary" style="margin-left: 10px">新增</el-button>
      </div>
      <div>
        <el-table :data="tableData" style="width: 100%">
          <el-table-column prop="date" label="日期"></el-table-column>
          <el-table-column prop="name" label="姓名"></el-table-column>
          <el-table-column prop="address" label="地址"></el-table-column>
          <el-table-column label="操作">
            <el-button type="primary">编辑</el-button>
            <el-button type="danger">删除</el-button>
          </el-table-column>
        </el-table>
      </div>
      <div style="margin-top: 10px">
        <el-pagination
            @size-change="handleSizeChange"
            @current-change="handleCurrentChange"
            :current-page="currentPage4"
            :page-sizes="[10]"
            :page-size="20"
            layout="total, sizes, prev, pager, next"
            :total="30">
        </el-pagination>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        input: '',
        tableData: [{
          date: 1,
          name: 'a',
          address: 'qwe'
        }, {
          date: 2,
          name: 'b',
          address: 'ads'}]
      }
    }
  }
  </script>
  