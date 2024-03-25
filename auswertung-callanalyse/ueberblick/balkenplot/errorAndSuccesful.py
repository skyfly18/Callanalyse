import os

import matplotlib.pyplot as plt


def error_plot(fail_smver_int: int, fail_download_int: int, fail_one_jar_int: int):
    wd = os.getcwd()
    fig, ax = plt.subplots(figsize=(10, 10))
    plt.title("Fehlgeschlagende Analysen nach Fehler")
    x = ["Nur eine Jar Datei", "Download nicht möglich", "Versionsnummer nicht im SemVer format"]
    y = [fail_one_jar_int, fail_download_int, fail_smver_int]
    for count in range(3):
        label = "Anzahl der Package: " + str(y[count])
        ax.bar(x[count], y[count], label = label )
    plt.ylabel("Anzahl der Packages")
    fig.legend(loc= "outside lower center")
    plt.savefig(wd + "/figuren/ueberblick/errorplot.jpg")
    plt.close()

def error_and_successfull(fail_successfull_int, successfull_int):
    wd = os.getcwd()
    fig, ax = plt.subplots(figsize=(8, 8))
    plt.title("Fehlgeschlagende und Erfolgreiche Analyse")
    x = ["Fehlgeschlagende Analyse", "Erfolgreiche Analyse"]
    y = [fail_successfull_int, successfull_int]
    for count in range(2):
        label = "Anzahl der Package: " + str(y[count])
        ax.bar(x[count], y[count], label=label)
    plt.ylabel("Anzahl der Packages")
    fig.legend(loc="lower center")
    plt.savefig(wd + "/figuren/ueberblick/errorandsucc.jpg")
    plt.close()
