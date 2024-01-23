package de.skyfly.callanalyse.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "api")
public class AppConfig {
    private String indexurl;
    private String downloadOrdnerPath;

    private int maxAnzahlThread = 100;

    private Boolean buildIndex;

    private int corePoolSize = 12;

    private  int corePoolSizeMax = 110;

    private  int queueCapacitySize = 300;

    public int getMaxAnzahlThread() {
        return maxAnzahlThread;
    }

    public void setMaxAnzahlThread(int maxAnzahlThread) {
        this.maxAnzahlThread = maxAnzahlThread;
    }




    public String getDownloadOrdnerPath() {
        return downloadOrdnerPath;
    }

    public void setDownloadOrdnerPath(String downloadOrdnerPath) {
        this.downloadOrdnerPath = downloadOrdnerPath;
    }



    public Boolean getBuildIndex() {
        return buildIndex;
    }

    public void setBuildIndex(Boolean buildIndex) {
        this.buildIndex = buildIndex;
    }


    public String getIndexurl() {
        return indexurl;
    }

    public void setIndexurl(String indexurl) {
        this.indexurl = indexurl;
    }

    public int getCorePoolSize() {
        return corePoolSize;
    }

    public void setCorePoolSize(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public int getCorePoolSizeMax() {
        return corePoolSizeMax;
    }

    public void setCorePoolSizeMax(int corePoolSizeMax) {
        this.corePoolSizeMax = corePoolSizeMax;
    }

    public int getQueueCapacitySize() {
        return queueCapacitySize;
    }

    public void setQueueCapacitySize(int queueCapacitySize) {
        this.queueCapacitySize = queueCapacitySize;
    }
}
