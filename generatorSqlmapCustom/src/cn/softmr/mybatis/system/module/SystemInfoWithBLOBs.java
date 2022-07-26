package cn.softmr.mybatis.system.module;

public class SystemInfoWithBLOBs extends SystemInfo {
    private String preUpdate;

    private String updated;

    public String getPreUpdate() {
        return preUpdate;
    }

    public void setPreUpdate(String preUpdate) {
        this.preUpdate = preUpdate == null ? null : preUpdate.trim();
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated == null ? null : updated.trim();
    }
}