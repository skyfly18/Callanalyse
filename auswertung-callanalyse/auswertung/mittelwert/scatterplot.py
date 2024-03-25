import os

import matplotlib.pyplot as plt
from pandas import DataFrame


def scatter_methoden_mayor_jar_count(data: DataFrame):
    sucessful_true = data["numbers_of_mayor_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2, ax3) = plt.subplots(1, 3, figsize=(13, 5))

    data_no_null.plot.scatter(x='jar_count', y='mean_add_methode_mayor',
                              xlabel="Anzahl der Jar Dateien", ylabel="Anzahl der Methoden", ax=ax1, title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='jar_count', y='percent_mean_delete_class_mayor',
                              xlabel="Anzahl der Jar Dateien", ylabel="Anzahl der Methoden", ax=ax2, title="Gelöschte Methoden")

    data_no_null.plot.scatter(x='jar_count', y='percent_mean_modi_methode_mayor',
                              xlabel="Anzahl der Jar Dateien", ylabel="Anzahl der Methoden", ax=ax3, title="Veränderte Methoden")
    wd = os.getcwd()

    fig.suptitle("Scatter Diagramm: Hinzugefügte, Geänderte und Gelöschte Methoden über Anzahl der Jar Dateien  Major ")
    plt.savefig(wd + "/figuren/auswertung/mittelwert/scatter_methode_mean_major_jar_count.jpg")
    plt.close()


def scatter_methoden_minor_jar_count(data: DataFrame):
    sucessful_true = data["numbers_of_minor_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2, ax3) = plt.subplots(1, 3, figsize=(13, 5))

    data_no_null.plot.scatter(x='jar_count', y='mean_add_methode_minor',
                              xlabel="Anzahl der Jar Dateien", ylabel="Anzahl der Methoden", ax=ax1, title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='jar_count', y='mean_delete_class_minor',
                              xlabel="Anzahl der Jar Dateien", ylabel="Anzahl der Methoden", ax=ax2, title="Gelöschte Methoden")

    data_no_null.plot.scatter(x='jar_count', y='mean_modi_methode_minor',
                              xlabel="Anzahl der Jar Dateien", ylabel="Anzahl der Methoden", ax=ax3, title="Veränderte Methoden")
    wd = os.getcwd()
    plt.savefig(wd + "/figuren/auswertung/mittelwert/scatter_methode_mean_minor_jar_count.jpg")
    plt.close()


def scatter_methoden_patch_jar_count(data: DataFrame):
    sucessful_true = data["numbers_of_patch_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2, ax3) = plt.subplots(1, 3, figsize=(13, 5))

    data_no_null.plot.scatter(x='jar_count', y='mean_add_methode_patch',
                              xlabel="Anzahl der Jar Dateien", ylabel="Anzahl der Methoden", ax=ax1, title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='jar_count', y='mean_delete_class_patch',
                              xlabel="Anzahl der Jar Dateien", ylabel="Anzahl der Methoden", ax=ax2, title="Gelöschte Methoden")

    data_no_null.plot.scatter(x='jar_count', y='mean_modi_methode_patch',
                              xlabel="Anzahl der Jar Dateien", ylabel="Anzahl der Methoden", ax=ax3, title="Veränderte Methoden")
    wd = os.getcwd()
    plt.savefig(wd + "/figuren/auswertung/mittelwert/scatter_methode_mean_patch_jar_count.jpg")
    plt.close()


def scatter_methoden_mayor(data: DataFrame):
    sucessful_true = data["numbers_of_mayor_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2, ax3) = plt.subplots(1, 3, figsize=(13, 5))

    data_no_null.plot.scatter(x='numbers_of_mayor_updates', y='mean_add_methode_mayor',
                              xlabel="Anzahl der Updates der Art Major", ylabel="Anzahl der Methoden", ax=ax1, title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='numbers_of_mayor_updates', y='mean_delete_class_mayor',
                              xlabel="Anzahl der Updates der Art Major", ylabel="Anzahl der Methoden", ax=ax2, title="Gelöschte Methoden")

    data_no_null.plot.scatter(x='numbers_of_mayor_updates', y='mean_modi_methode_mayor',
                              xlabel="Anzahl der Updates der Art Major", ylabel="Anzahl der Methoden", ax=ax3, title="Veränderte Methoden")

    fig.suptitle("Scatter Diagramm: Hinzugefügte, Geänderte und Gelöschte Methoden über die Anzahl an Major Updates")

    wd = os.getcwd()
    plt.savefig(wd + "/figuren/auswertung/mittelwert/scatter_methode_mean_major.jpg")
    plt.close()


def scatter_methoden_minor(data: DataFrame):
    sucessful_true = data["numbers_of_minor_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2, ax3) = plt.subplots(1, 3, figsize=(13, 5))

    data_no_null.plot.scatter(x='numbers_of_minor_updates', y='mean_add_methode_minor',
                              xlabel="Anzahl der Updates der Art Minor", ylabel="Anzahl der Methoden", ax=ax1, title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='numbers_of_minor_updates', y='mean_delete_class_minor',
                              xlabel="Anzahl der Updates der Art Minor", ylabel="Anzahl der Methoden", ax=ax2, title="Gelöschte Methoden")

    data_no_null.plot.scatter(x='numbers_of_minor_updates', y='mean_modi_methode_minor',
                              xlabel="Anzahl der Updates der Art Minor", ylabel="Anzahl der Methoden", ax=ax3, title="Veränderte Methoden")
    wd = os.getcwd()
    plt.savefig(wd + "/figuren/auswertung/mittelwert/scatter_methode_mean_minor.jpg")
    plt.close()


def scatter_methoden_patch(data: DataFrame):
    sucessful_true = data["numbers_of_patch_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2, ax3) = plt.subplots(1, 3, figsize=(13, 5))
    fig.suptitle("")
    data_no_null.plot.scatter(x='numbers_of_patch_updates', y='mean_add_methode_patch',
                              xlabel="Anzahl der Updates der Art Patch", ylabel="Anzahl der Methoden", ax=ax1, title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='numbers_of_patch_updates', y='mean_delete_class_patch',
                              xlabel="Anzahl der Updates der Art Patch", ylabel="Anzahl der Methoden", ax=ax2, title="Gelöschte Methoden")

    data_no_null.plot.scatter(x='numbers_of_patch_updates', y='mean_modi_methode_patch',
                              xlabel="Anzahl der Updates der Art Patch", ylabel="Anzahl der Methoden", ax=ax3, title="Veränderte Methoden")
    wd = os.getcwd()
    plt.savefig(wd + "/figuren/auswertung/mittelwert/scatter_methode_mean_patch.jpg")
    plt.close()