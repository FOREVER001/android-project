package client.com.http.handlereult;

/**
 * Created on 2018/1/31 10:48.
 *
 * @author pan
 * @version 1.0
 */

public class HttpResult<T> {

    /**
     * Code : 0
     * IsSuccess : true
     * Msg : 处理成功
     * Result :
     * ResultDate : 2018-08-03 11:15
     * SePageModel : {"HasMore":false,"PageSize":10,"PageStart":0,"TotalCount":0}
     */

    private int Code;
    private boolean IsSuccess;
    private String Msg;
    private T  Result;
    private String ResultDate;
    /**
     * HasMore : false
     * PageSize : 10
     * PageStart : 0
     * TotalCount : 0
     */

    private SePageModelBean SePageModel;

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public boolean isIsSuccess() {
        return IsSuccess;
    }

    public void setIsSuccess(boolean IsSuccess) {
        this.IsSuccess = IsSuccess;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    public boolean isSuccess() {
        return IsSuccess;
    }

    public void setSuccess(boolean success) {
        IsSuccess = success;
    }

    public T getResult() {
        return Result;
    }

    public void setResult(T result) {
        Result = result;
    }

    public String getResultDate() {
        return ResultDate;
    }

    public void setResultDate(String ResultDate) {
        this.ResultDate = ResultDate;
    }

    public SePageModelBean getSePageModel() {
        return SePageModel;
    }

    public void setSePageModel(SePageModelBean SePageModel) {
        this.SePageModel = SePageModel;
    }

    public static class SePageModelBean {
        private boolean HasMore;
        private int     PageSize;
        private int     PageStart;
        private int     TotalCount;

        public boolean isHasMore() {
            return HasMore;
        }

        public void setHasMore(boolean HasMore) {
            this.HasMore = HasMore;
        }

        public int getPageSize() {
            return PageSize;
        }

        public void setPageSize(int PageSize) {
            this.PageSize = PageSize;
        }

        public int getPageStart() {
            return PageStart;
        }

        public void setPageStart(int PageStart) {
            this.PageStart = PageStart;
        }

        public int getTotalCount() {
            return TotalCount;
        }

        public void setTotalCount(int TotalCount) {
            this.TotalCount = TotalCount;
        }
    }
}
