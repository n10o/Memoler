package com.memoler.logic;

import javax.annotation.Resource;
import javax.xml.bind.DatatypeConverter;

import com.memoler.dbflute.cbean.MemberCB;
import com.memoler.dbflute.exbhv.MemberBhv;
import com.memoler.dbflute.exentity.Member;
import com.memoler.web.MemberForm;

public class UserControlLogic {

    @Resource
    private MemberBhv memberBhv;

    private String key = "SockS3af3";

    public boolean doSignin(MemberForm memberForm) {
        MemberCB cb = new MemberCB();
        cb.query().setName_Equal(memberForm.name);
        Member entity = memberBhv.selectEntity(cb);
        if (entity != null) {
            byte[] inputEncryptPassword = null;
            try {
                inputEncryptPassword = CipherLogic.encrypt(key, memberForm.password);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("DB" + entity.getPassword());
            System.out.println("input" + inputEncryptPassword);

            if (entity.getPassword().equals(hexalize(inputEncryptPassword))) {
                return true;
            }
        }

        return false;
    }

    public Boolean doSignup(MemberForm memberForm) {
        Member member = new Member();
        member.setName(memberForm.name);

        byte[] encryptedPassword = null;
        try {
            encryptedPassword = CipherLogic.encrypt(key, memberForm.password);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        member.setPassword(hexalize(encryptedPassword));
        memberBhv.insert(member);

        return true;
    }

    public String hexalizeFailed(byte[] input) {
        StringBuilder sb = null;
        System.out.println("abc");

        for (byte b : input) {
            System.out.println(b);
            sb.append(String.format("%02x", b));
        }
        return new String(sb);
    }

    public String hexalize(byte[] input) {
        return DatatypeConverter.printHexBinary(input);
    }
}
