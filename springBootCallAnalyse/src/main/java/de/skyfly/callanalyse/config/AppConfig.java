package de.skyfly.callanalyse.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "api")
public class AppConfig {
    /**
     * Maximum number of threads to use when running the application.
     */
    private int maxAnzahlThread = 100;

    /**
     * Download path for saving all files.
     */
    private String downloadOrdnerPath;

    /**
     * Flag to determine whether to build index or not.
     */
    private Boolean buildIndex;

    /**
     * Core pool size of the thread pool.
     */
    private int corePoolSize = 12;

    /**
     * Maximum number of threads in the thread pool.
     */
    private int corePoolSizeMax = 110;

    /**
     * Capacity of the queue for threads
     */
    private int queueCapacitySize = 300;

    /** Index URL to use for building index. */
    private String indexurl;

    public int getMaxAnzahlThread() {
        return maxAnzahlThread;
    }

    public void setMaxAnzahlThread(int maxAnzahlThread) {
        this.maxAnzahlThread = maxAnzahlThread;
    }


    /** Download path for saving all files.
     * @return the downloadOrdnerPath
     */
    public String getDownloadOrdnerPath() {
        return downloadOrdnerPath;
    }

    public void setDownloadOrdnerPath(String downloadOrdnerPath) {
        this.downloadOrdnerPath = downloadOrdnerPath;
    }


    /** Flag to determine whether to build index or not.
     * @return the buildIndex
     */
    public Boolean getBuildIndex() {
        return buildIndex;
    }

    /**
     * Sets the build index property.
     * @param buildIndex the build index value
     */
    public void setBuildIndex(Boolean buildIndex) {
        this.buildIndex = buildIndex;
    }

    /**
     * Returns the index URL to use for building index.
     * @return the indexurl
     */
    public String getIndexurl() {
        return indexurl;
    }

    /**
     * Sets the index URL to use for building index.
     * @param indexurl the index url value
     */
    public void setIndexurl(String indexurl) {
        this.indexurl = indexurl;
    }

    /**
     * Returns the core pool size of the thread pool.
     * @return the corePoolSize
     */
    public int getCorePoolSize() {
        return corePoolSize;
    }

    /**
     * Sets the core pool size of the thread pool.
     * @param corePoolSize the core pool size value
     */
    public void setCorePoolSize(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    /**
     * Returns the maximum size of the core pool.
     * @return the corePoolSizeMax
     */
    public int getCorePoolSizeMax() {
        return corePoolSizeMax;
    }

    /**
     * Sets the maximum size of the core pool.
     * @param corePoolSizeMax the maximum size value
     */
    public void setCorePoolSizeMax(int corePoolSizeMax) {
        this.corePoolSizeMax = corePoolSizeMax;
    }

    /**
     * Returns the queue capacity size of the thread pool.
     * @return the queueCapacitySize
     */
    public int getQueueCapacitySize() {
        return queueCapacitySize;
    }

    /**
     * Sets the queue capacity size of the thread pool.
     * @param queueCapacitySize the queue capacity size value
     */
    public void setQueueCapacitySize(int queueCapacitySize) {
        this.queueCapacitySize = queueCapacitySize;
    }
}
