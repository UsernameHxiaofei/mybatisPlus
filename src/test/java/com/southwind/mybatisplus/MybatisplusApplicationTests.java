package com.southwind.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.southwind.mybatisplus.entity.Dome;
import com.southwind.mybatisplus.enums.RuleTypeEnnum;
import com.southwind.mybatisplus.test.entity.User;
import com.southwind.mybatisplus.test.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired
    private UserMapper userMapper;



    @Test
    void test() {

    }

    @Test
    void test1 () {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::print);
    }

    @Test
    void test2 () {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
//        userQueryWrapper.eq("name","zs");
//        LambdaQueryWrapper<User> lambda = userQueryWrapper.lambda();
//        userQueryWrapper.eq("age",18).eq("name","zs");
//        userQueryWrapper.like("name","z");
//        userQueryWrapper.likeLeft("name","z");
//        userQueryWrapper.likeRight("name","z");

//        Map<String, Object> map = new HashMap<>();
//        map.put("name","zs");
//        map.put("age",19);
//        userQueryWrapper.allEq(map);
       // userQueryWrapper.eq("name","zs");
//        userQueryWrapper.orderByDesc("age");
        //userQueryWrapper.groupBy("age").having("avg(age) > 18").orderByDesc("age");
//        userQueryWrapper.gt("age",18);
        userQueryWrapper.select("id","name").inSql("age","select age from test_user where age > 18");
        userMapper.selectList(userQueryWrapper).forEach(System.out::print);
    }

    @Test
    void test3 () {

        List<User> users = new ArrayList<>();
        List<List<User>> users1 = new ArrayList<>();
        users.add(new User(1L,"zs1",18,1));
        users.add(new User(2L,"zs2",19,1));
        users.add(new User(3L,"zs3",20,2));
        users.add(new User(4L,"zs4",21,1));
        users.add(new User(5L,"zs5",19,3));
        users.add(new User(6L,"zs6",19,1));
        users.add(new User(7L,"zs7",19,2));
        users.add(new User(8L,"zs8",19,3));
        users = users.stream().sorted(Comparator.comparing(User::getType)).collect(Collectors.toList());
        users.stream().collect(Collectors.groupingBy(User::getType)).forEach((type,list)->{
            users1.add(list);
        });
        users1.forEach(list -> {
            System.out.println("list = " + list);
        });


    }


    @Test
    void test4 () {

        List<String> sysUserList = Arrays.asList("hjf","sjx","wry");
        String userIds = ""; //"UserID1|UserID2|UserID3"
        for (int i = 0; i < sysUserList.size(); i++) {
            if (Objects.equals(i,sysUserList.size() -1)) {
                userIds += sysUserList.get(i);
            } else {
                userIds += sysUserList.get(i) + "|";
            }
        }

        System.out.println(userIds);







//        System.out.println(RuleTypeEnnum.get());


//        Integer code = RuleTypeEnnum.ADD.getCode();
//        System.out.println("code = " + code);
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println("now = " + now);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String format = simpleDateFormat.format(now);
//        System.out.println("format = " + format);
//        User user = null;
////        user.setUserName("ww");
////        user.setUserId(1395260743686053890L);
//        Optional.ofNullable(user).ifPresent( (item)->{
//            System.out.println("user = " + item);
//        });


    }

}
