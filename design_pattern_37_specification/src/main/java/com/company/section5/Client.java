package com.company.section5;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all.
 */
public class Client {
    
    public static void main(String[] args) {
        // ���ȳ�ʼ��һ���û�
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("�չ���", 23));
        userList.add(new User("����ţ", 82));
        userList.add(new User("�Ź�����", 10));
        userList.add(new User("����", 10));
        
        // ����һ���û���ѯ��
        IUserProvider userProvider = new UserProvider(userList);
        
        // ��ӡ�������Թ��쿪ͷ����Ա
        System.out.println("===�����Թ��쿪ͷ����Ա===");
        // ����һ�����
        IUserSpecification spec = new UserByAgeThan(25);
        IUserSpecification spec2 = new UserByNameLike("%����%");
        for (User u : userProvider.findUser(spec.and(spec2))) {
            System.out.println(u);
        }
    }
}