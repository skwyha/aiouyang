package one.aiouyang.community.mapper;

import one.aiouyang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> find();

    @Insert("insert into user(account_id, name,token, gmt_create, gmt_modified) values (#{account_id}, #{name}, #{token}, #{gmt_create}, #{gmt_modified})")
    void insert(User user);
}
