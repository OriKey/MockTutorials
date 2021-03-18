package Biz;

import Client.FileIOClient;
import Req.FileRequest;
import Res.FileResponse;

import javax.annotation.Resource;

/**
 * @Author:TieJiang
 * @Date: 2021/1/19 7:59 下午
 * 人一能之，己十之，人十能之，己百之，果能此道矣，虽愚必明，虽柔必强。
 */
public class FileIOBiz {
    @Resource
    FileIOClient fileIOClient;

    public FileResponse GetFile(FileRequest request){
        FileResponse response = new FileResponse();
        response.setValue(BuildFile(request));
        return response;
    }
    public String BuildFile(FileRequest request){
        int integer = fileIOClient.FileRead(request);
        int integer1 = fileIOClient.FileWrite(request);
        StringBuffer result  = new StringBuffer();
        result.append(integer);
        result.append(" ");
        result.append(integer1);
        return result.toString();
    }
}
