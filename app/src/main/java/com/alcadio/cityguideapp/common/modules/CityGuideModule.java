package com.alcadio.cityguideapp.common.modules;

public class CityGuideModule {

    public interface View{
        void onError(Exception e);
    }

    public interface BaseCallback{
        void onError(Exception e);
    }

    public interface Callback<T> extends BaseCallback{
        void onSuccess(T result);
    }

    public interface CallbackOnCloud<T> extends  Callback<T>{
        void onSuccessFromCloud(T value);
        void onState(String state);
    }


    public interface SimpleCallback extends BaseCallback {
        void onSuccess();
    }

    public interface DoneCallback {
        void onDone();
    }

    public interface DoneParamCallback<T> {
        void onDone(T result);
    }

}
