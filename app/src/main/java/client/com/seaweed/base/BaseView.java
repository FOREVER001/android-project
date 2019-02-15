package client.com.seaweed.base;


/**
 * Created on 2018/2/10 17:18.
 *
 * @author pan
 * @version 1.0
 */

public interface BaseView<T> {
    void setPresenter(T presenter);
//    PublishSubject<ActivityLifeCycleEvent> getLifeCycleSubject();
}
