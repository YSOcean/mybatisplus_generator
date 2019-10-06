package com.ys.mybatisplus_generator.service.impl;

import com.ys.mybatisplus_generator.bean.Person;
import com.ys.mybatisplus_generator.mapper.PersonMapper;
import com.ys.mybatisplus_generator.service.PersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shuaiyu
 * @since 2019-10-06
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {

}
