package Client;

import Req.FileRequest;
import Service.FileService;
import Service.LogService;

import javax.annotation.Resource;

/**
 * @Author:TieJiang
 * @Date: 2021/1/19 8:00 下午
 * 人一能之，己十之，人十能之，己百之，果能此道矣，虽愚必明，虽柔必强。
 */
public class FileIOClient {
    @Resource
    FileService fileService;
    @Resource
    LogService logService;

    public Integer FileRead(FileRequest request){
        String result = fileService.fileRead(request.getName());
        logService.LogExec();
        return result.length();
    }

    public Integer FileWrite(FileRequest request) {
        String result = fileService.fileWrite(request.getName());
        logService.LogExec();
        return result.length();
    }
}
