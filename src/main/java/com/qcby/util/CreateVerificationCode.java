package com.qcby.util;

import java.util.Arrays;

public class CreateVerificationCode {
    /**
     * ��֤���Ѷȼ���
     */
    public enum SecurityCodeLevel {
        Simple,
        Medium,
        Hard
    }

    public static String getSecurityCode() {
        return (String) getSecurityCode(4, SecurityCodeLevel.Medium, false);
    }

    public static String getSecurityCode(int length, SecurityCodeLevel level, boolean isCanRepeat) {
        int len = length;
        //��ȥ���׻�����0��o��1��l
        char[] codes = {
                '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'm', 'n', 'p', 'q', 'r', 's', 't','u',
                'v', 'w', 'x', 'y', 'z','A','B','C','D','E',
                'F','G','H','J','K','L','M','N','P','Q','R','S',
                'T','U','V','W','X','Y','Z'};
        if(level==SecurityCodeLevel.Simple){
            codes= Arrays.copyOfRange(codes,0,9);
        }else if (level==SecurityCodeLevel.Medium){
            codes= Arrays.copyOfRange(codes,0,33);
        }
        int n=codes.length;
        //�׳�����ʱ�쳣
        if (len>n&&isCanRepeat==false){
            throw new RuntimeException(
                    String.format("����securitycode.getSecurityCode(%1$s,len,level,isCanRepeat,n)"));}
                    char[] result=new char[len];
        //�ж��ܷ�����ظ����ַ�
        if (isCanRepeat){
            for(int i=0;i<result.length;i++){
                //����0 and n-1
                int r=(int)(Math.random()*n);
                //��result�еĵ�i��Ԫ����Ϊcodes[r]��ŵ���ֵ
                result[i]=codes[r];
            }
        }else {
            for (int i=0;i<result.length;i++){
                int r=(int)(Math.random()*n);
                //��result�еĵ�i��Ԫ����Ϊcodes[r]��ŵ���ֵ
                result[i]=codes[r];
                codes[r]=codes[n-1];
                n--;
            }
        }
        return String.valueOf(result);
        }
}
