package top.huic.tencent_im_plugin.message;

import com.tencent.imsdk.TIMConversation;
import com.tencent.imsdk.TIMElem;
import com.tencent.imsdk.TIMMessage;

import top.huic.tencent_im_plugin.ValueCallBack;
import top.huic.tencent_im_plugin.message.entity.OtherMessageEntity;
import top.huic.tencent_im_plugin.util.JsonUtil;

/**
 * 其它消息节点
 */
public class OtherMessageNode extends AbstractMessageNode<TIMElem, OtherMessageEntity> {
    @Override
    public void send(TIMConversation conversation, OtherMessageEntity entity, boolean ol, ValueCallBack<TIMMessage> onCallback) {
        throw new RuntimeException("This node does not support sending");
    }

    @Override
    public String getNote(TIMElem elem) {
        return "[其它消息]";
    }

    @Override
    public OtherMessageEntity analysis(TIMElem elem) {
        OtherMessageEntity entity = new OtherMessageEntity();
        entity.setParams(JsonUtil.toJSONString(elem));
        return entity;
    }

    @Override
    public Class<OtherMessageEntity> getEntityClass() {
        return OtherMessageEntity.class;
    }
}