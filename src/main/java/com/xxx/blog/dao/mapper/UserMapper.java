package com.xxx.blog.dao.mapper;

import com.xxx.blog.dao.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface UserMapper {

    /**
     * 通过id查询用户
     * @param id 用户id，主键
     * @return User对象
     */
    User findById(@Param("id") int id);

    /**
     * 查询所有用户
     * @return 包含用户对象的数组
     */

    /**
     * 查询该用户名的用户，无返回null
     * @param name
     * @return
     */
    User findByName(@Param("name") String name);

    List<User> findUsers();

    /**
     * 新增用户
     * @param name 用户名字
     * @param password 用户密码，密文存储
     * @param salt  配合password的密文存储的字段
     * @param type  用户类型，普通/管理员
     * @param status   用户状态， 正常/封禁/注销
     * @param email    邮箱，可为空，默认""
     * @param createdDate   创建时间
     * @param deletedDate   更新时间
     * @return      返回插入成功与否，成功返回true，反之false
     */
    boolean insert(@Param("name") String name,
                   @Param("password") String password,
                   @Param("salt") String salt,
                   @Param("type") int type,
                   @Param("status") int status,
                   @Param("email") String email,
                   @Param("created_date") Date createdDate,
                   @Param("updated_date") Date deletedDate);

    /**
     * 通过用户ID，更新密码
     * @param id
     * @param password
     * @param salt
     * @return
     */
    boolean updatePasswordById(@Param("id") int id,
                               @Param("password") String password,
                               @Param("salt") String salt);

    /**
     * 软删除用户，实际改用户状态，变为DELETED（3）
     * @param id
     * @return
     */
    boolean deleteById(@Param("id") int id);
}
