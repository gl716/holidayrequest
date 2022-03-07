package org.flowable;

import org.flowable.common.engine.api.delegate.event.FlowableEngineEventType;
import org.flowable.common.engine.api.delegate.event.FlowableEvent;
import org.flowable.common.engine.api.delegate.event.FlowableEventListener;

public class MyEventListener implements FlowableEventListener {
    @Override
    public void onEvent(FlowableEvent flowableEvent) {
        if (flowableEvent.getType() == FlowableEngineEventType.JOB_EXECUTION_SUCCESS){
            System.out.println("A job well done!");
        }else if (flowableEvent.getType() == FlowableEngineEventType.JOB_EXECUTION_FAILURE){
            System.out.println("A job failed...");
        }else if (flowableEvent.getType() == FlowableEngineEventType.ACTIVITY_COMPLETED){
            System.out.println("activity completed");
        }
        else{
            System.out.println("Event received: " + flowableEvent.getType());
        }
    }

    @Override
    public boolean isFailOnException() {
        return false;
    }

    @Override
    public boolean isFireOnTransactionLifecycleEvent() {
        return false;
    }

    @Override
    public String getOnTransaction() {
        return null;
    }
}
