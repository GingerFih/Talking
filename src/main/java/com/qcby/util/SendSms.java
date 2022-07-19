package com.qcby.util;

import com.qcby.entity.Verification;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.sms.v20210111.SmsClient;
import com.tencentcloudapi.sms.v20210111.models.*;

import java.util.HashMap;
import java.util.Map;

public class SendSms
{
    public  static Map<String,Verification> map=new HashMap<>();
   public static int vCode=1 + (int)(Math.random() * ((999999 - 1) + 1));
   public static String teCode=String.valueOf(vCode);
    public static void sendCode(String phone) {
        try{
            // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey,此处还需注意密钥对的保密
            // 密钥可前往https://console.cloud.tencent.com/cam/capi网站进行获取
            Credential cred = new Credential("AKIDqUs0rRknZ6ML4XjeIfmcCUVFhtoSq30g", "Qax6zbxnOjpeCTUEhtoTryoOhjTxB8oD");
            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("sms.tencentcloudapi.com");
            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);
            // 实例化要请求产品的client对象,clientProfile是可选的
            SmsClient client = new SmsClient(cred, "ap-guangzhou", clientProfile);
            // 实例化一个请求对象,每个接口都会对应一个request对象
            SendSmsRequest req = new SendSmsRequest();
            String[] phoneNumberSet1 = {"86"+phone};
            req.setPhoneNumberSet(phoneNumberSet1);

            req.setSmsSdkAppId("1400700699");
            req.setSignName("蛋黄派个人网");
            req.setTemplateId("1458188");

            //设置hashmap中存放的实体
            Verification verifications=new Verification();
            verifications.setTime(System.nanoTime());
            verifications.setTestCode(teCode);
            sort(phone,verifications);
            //发送验证码
            String[] templateParamSet1 = {teCode};
            req.setTemplateParamSet(templateParamSet1);

            // 返回的resp是一个SendSmsResponse的实例，与请求对象对应
            SendSmsResponse resp = client.SendSms(req);
            // 输出json格式的字符串回包
            System.out.println(SendSmsResponse.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
   public static void sort(String key,Verification val){
       map.put(key,val);
   }


}
