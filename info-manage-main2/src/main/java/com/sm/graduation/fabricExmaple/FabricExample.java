package com.sm.graduation.fabricExmaple;

/**
 * @Author HelenZhang
 * @Date 2024/2/28 16:42
 * @Description
 */
import org.hyperledger.fabric.sdk.*;
import java.util.Collection;

public class FabricExample {
    public static void main(String[] args) throws Exception {
        // 设置Fabric网络参数
        String channelName = "mychannel";
        String chaincodeId = "mychaincode";

        // 初始化HFClient对象
        HFClient client = HFClient.createNewInstance();

        // 获取Peer节点信息
//        Peer peer = new Peer("peer0", "grpc://localhost:7051");

        // 构造Channel对象
//        Channel channel = constructChannel(client, channelName);

        // 调用ChainCode函数
//        Collection<ProposalResponse> responses = invokeChainCodeFunction(channel, chaincodeId, "invoke", "arg1", "arg2");

        // 处理返回结果
//        for (ProposalResponse response : responses) {
//            if (!response.isVerified()) {
//                System.out.println("Failed to verify transaction proposal.");
//            } else {
//                System.out.println("Transaction proposal verified successfully!");
//            }
//
//            byte[] payloadBytes = response.getChaincodeActionResponsePayload().toByteArray();
//            String result = new String(payloadBytes);
//            System.out.println("Result from Chain Code: " + result);
//        }
    }
}