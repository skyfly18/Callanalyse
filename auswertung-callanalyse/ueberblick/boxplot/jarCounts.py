import os

import matplotlib.pyplot as plt
from pandas import DataFrame


def jar_box(data: DataFrame):
    fig, ax = plt.subplots()
    var = data.boxplot(column=["jar_count"], xlabel="Anzahl der Jar Dateien", ax=ax)
    plt.ylim(0, 50)
    var.plot()
    wd = os.getcwd()
    fig.suptitle("Boxplot zur Anzahl von Jar Dateien bei einer Library")
    plt.savefig(wd + "/figuren/ueberblick/jarboxplot.jpg")
    plt.close()


