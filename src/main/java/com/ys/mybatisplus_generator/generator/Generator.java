package com.ys.mybatisplus_generator.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class Generator {

    public static void main(String[] args) {
        //1. 全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true) // 是否支持AR模式
                .setAuthor("shuaiyu") // 作者名称
                .setOutputDir("E:\\GitWorkspace\\mybatisplus_generator\\src\\main\\java") // 生成路径
                .setFileOverride(true)  // 是否覆盖已有文件
                .setIdType(IdType.AUTO) // 主键策略
                .setOpen(true)          //是否打开输出目录
                .setServiceName("%sService")  // 设置生成的service接口的名字的首字母是否为I
                .setSwagger2(true)
                // IEmployeeService
                .setBaseResultMap(true)
                .setBaseColumnList(true);

        //2. 数据源配置
        DataSourceConfig  dsConfig  = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL)  // 设置数据库类型【必须】
                .setDriverName("com.mysql.jdbc.Driver")     //驱动名称
                .setUrl("jdbc:mysql://localhost:3306/mybatisplus") //驱动连接的URL
                .setUsername("root")    //数据库连接用户名
                .setPassword("root123");    //数据库连接密码

        //3. 策略配置
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true) //大写命名
                .setNaming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略
                .setEntityLombokModel(true)     //为lombok模型
                .setEntityTableFieldAnnotationEnable(true)  //是否生成实体时，生成字段注解@TableField
                .setTablePrefix("tb_")      //表示以 tb_开头的表 生成文件时不纳入命名范围
                /*.setEntityBooleanColumnRemoveIsPrefix(true)*/     //Boolean类型字段是否移除is前缀（默认 false）
                /*.setExclude("tableA") */      // 需要排除的表名,与include二选一配置
                .setInclude("tb_person","tb_user");  // 需要生成的表名称数组,不添加此配置默认生成该数据库所有表


        //4. 包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.ys.mybatisplus_generator") //父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
                .setMapper("mapper")        //Entity包名,默认是mapper
                .setService("service")      //Service包名,默认是service
                .setServiceImpl("service.impl")       //Service Impl包名,默认是service.impl
                .setController("controller")        //Controller包名,默认是controller
                .setEntity("bean")      //Entity包名,默认是entity
                .setXml("mapper");      //Mapper XML包名,默认是mapper.xml

        //5. 整合配置
        AutoGenerator  ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);

        //6. 执行
        ag.execute();
    }
}
