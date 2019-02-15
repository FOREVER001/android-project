package client.com.http;


/**
 * Created on 2018/1/31 14:23.
 *
 * @author pan
 * @version 1.0
 */

public class HttpUtil {
    /**
     * 构造方法私有
     */
    private HttpUtil() {
    }

    /**
     * 在访问HttpUtil时创建单例
     */
    private static class SingletonHolder {
        private static final HttpUtil INSTANCE = new HttpUtil();
    }

    /**
     * 获取单例
     */
    public static HttpUtil getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //添加线程管理并订阅
//    public void toSubscribe(Observable ob, final ProgressSubscriber subscriber, final ActivityLifeCycleEvent event, final PublishSubject<ActivityLifeCycleEvent> lifecycleSubject) {
//        //数据预处理
//        Observable.Transformer<HttpResult<Object>, Object> result = RxHelper.handleResult(event,lifecycleSubject);
//        //重用操作符
//        Observable observable = ob.compose(result)
//                .doOnSubscribe(new Action0() {
//                    @Override
//                    public void call() {
//                        //显示Dialog和一些其他操作
//                        subscriber.showProgressDialog();
//                    }
//                });
//
//        observable.subscribe(subscriber);
//
//
//    }
}

