import os

import matplotlib.pyplot as plt
from pandas import DataFrame


def scatter_mayor_updates(data: DataFrame):
    plt.title = "Anzahl der Major Updates über die Anzahl der Jar Dateien"
    data.plot.scatter(y='jar_count', x='numbers_of_mayor_updates',
                      ylabel="Anzahl der Jar Dateien", xlabel="Anzahl der Major Updates")
    wd = os.getcwd()
    plt.savefig(wd + "/figuren/ueberblick/scatterupdatemayor.jpg")
    plt.close()


def scatter_minor_updates(data: DataFrame):
    plt.title = "Anzahl der Minor Updates über die Anzahl der Jar Dateien"

    data.plot.scatter(y='jar_count', x='numbers_of_minor_updates',
                      ylabel="Anzahl der Jar Dateien", xlabel="Anzahl der Minor Updates")
    wd = os.getcwd()
    plt.savefig(wd + "/figuren/ueberblick/scatterupdateminor.jpg")
    plt.close()


def scatter_patch_updates(data: DataFrame):
    plt.title = "Anzahl der Patch Updates über die Anzahl der Jar Dateien"

    data.plot.scatter(y='jar_count', x='numbers_of_patch_updates',
                      ylabel="Anzahl der Jar Dateien", xlabel="Anzahl der Patch Updates")
    wd = os.getcwd()
    plt.savefig(wd + "/figuren/ueberblick/scatterupdatepatch.jpg")
    plt.close()
