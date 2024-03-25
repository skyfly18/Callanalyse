import os

import matplotlib.pyplot as plt
import pandas as pd
from pandas import DataFrame


def box_methode_mayor(data: DataFrame):
    wd = os.getcwd()
    fig, (ax1, ax2, ax3) = plt.subplots(1, 3, figsize=(8, 5))
    sucessful_true = data["numbers_of_mayor_updates"] > 0
    data_no_null = data[sucessful_true]
    var = data_no_null.boxplot(column=["percent_mean_add_methode_mayor"], ax=ax1, xlabel="Neue Hinzugefügte Methoden ")
    var2 = data_no_null.boxplot(column=["percent_mean_delete_methode_mayor"], ax=ax2, xlabel="Gelöschte Methoden")
    var3 = data_no_null.boxplot(column=["percent_mean_modi_methode_mayor"], ax=ax3, xlabel="Modizierte Methoden")
    ax1.set_xticklabels("")
    ax2.set_xticklabels("")
    ax3.set_xticklabels("")

    ax1.set_ylim(-1, 100)
    ax2.set_ylim(-1, 100)
    ax3.set_ylim(-1, 100)
    fig.suptitle("Boxplot zur Änderungen an Methoden Major")


    var.plot()
    var2.plot()
    var3.plot()
    plt.savefig(wd + "/figuren/auswertung/prozent/box_methode_prozent_mayor.jpg")
    plt.close()


def box_methode_minor(data: DataFrame):
    wd = os.getcwd()
    fig, (ax1, ax2, ax3) = plt.subplots(1, 3, figsize=(8, 5))
    sucessful_true = data["numbers_of_minor_updates"] > 0
    data_no_null = data[sucessful_true]
    var = data_no_null.boxplot(column=["percent_mean_add_methode_minor"], ax=ax1, xlabel="Neue Hinzugefügte Methoden ")
    var2 = data_no_null.boxplot(column=["percent_mean_delete_methode_minor"], ax=ax2, xlabel="Gelöschte Methoden")
    var3 = data_no_null.boxplot(column=["percent_mean_modi_methode_minor"], ax=ax3, xlabel="Modizierte Methoden")
    ax1.set_xticklabels("")
    ax2.set_xticklabels("")
    ax3.set_xticklabels("")

    ax1.set_ylim(-1, 100)
    ax2.set_ylim(-1, 100)
    ax3.set_ylim(-1, 100)
    fig.suptitle("Boxplot zur Änderungen an Methoden Minor")


    var.plot()
    var2.plot()
    var3.plot()
    plt.savefig(wd + "/figuren/auswertung/prozent/box_methode_prozent_minor.jpg")
    plt.close()


def box_methode_patch(data: DataFrame):
    wd = os.getcwd()
    fig, (ax1, ax2, ax3) = plt.subplots(1, 3, figsize=(8, 5))
    sucessful_true = data["numbers_of_patch_updates"] > 0
    data_no_null = data[sucessful_true]
    var = data_no_null.boxplot(column=["percent_mean_add_methode_patch"], ax=ax1, xlabel="Neue Hinzugefügte Methoden ")
    var2 = data_no_null.boxplot(column=["percent_mean_delete_methode_patch"], ax=ax2, xlabel="Gelöschte Methoden")
    var3 = data_no_null.boxplot(column=["percent_mean_modi_methode_patch"], ax=ax3, xlabel="Modizierte Methoden")
    ax1.set_xticklabels("")
    ax2.set_xticklabels("")
    ax3.set_xticklabels("")

    ax1.set_ylim(-1, 100)
    ax2.set_ylim(-1, 100)
    ax3.set_ylim(-1, 100)
    fig.suptitle("Boxplot zur Änderungen an Methoden Patch")


    var.plot()
    var2.plot()
    var3.plot()
    plt.savefig(wd + "/figuren/auswertung/prozent/box_methode_prozent_patch.jpg")
    plt.close()


def box_class_mayor(data: DataFrame):
    wd = os.getcwd()
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(8, 5))
    sucessful_true = data["numbers_of_mayor_updates"] > 0
    data_no_null = data[sucessful_true]
    var = data_no_null.boxplot(column=["percent_mean_add_class_mayor"], ax=ax1, xlabel="Neue Hinzugefügte Klassen ")
    var2 = data_no_null.boxplot(column=["percent_mean_delete_class_mayor"], ax=ax2, xlabel="Gelöschte Klassen")
    ax1.set_xticklabels("")
    ax2.set_xticklabels("")

    ax1.set_ylim(-1, 100)
    ax2.set_ylim(-1, 100)
    fig.suptitle("Boxplot zur Änderungen an Klassen Major")


    var.plot()
    var2.plot()
    plt.savefig(wd + "/figuren/auswertung/prozent/box_class_prozent_mayor.jpg")
    plt.close()


def box_class_minor(data: DataFrame):
    wd = os.getcwd()
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(8, 5))
    sucessful_true = data["numbers_of_minor_updates"] > 0
    data_no_null = data[sucessful_true]
    var = data_no_null.boxplot(column=["percent_mean_add_class_minor"], ax=ax1, xlabel="Neue Hinzugefügte Klassem")
    var2 = data_no_null.boxplot(column=["percent_mean_delete_class_minor"], ax=ax2, xlabel="Gelöschte Klassen")
    ax1.set_xticklabels("")
    ax2.set_xticklabels("")

    ax1.set_ylim(-1, 100)
    ax2.set_ylim(-1, 100)
    fig.suptitle("Boxplot zur Änderungen an Klassen Minor")

    var.plot()
    var2.plot()
    plt.savefig(wd + "/figuren/auswertung/prozent/box_class_prozent_minor.jpg")
    plt.close()


def box_class_patch(data: DataFrame):
    wd = os.getcwd()
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(8, 5))
    sucessful_true = data["numbers_of_patch_updates"] > 0
    data_no_null = data[sucessful_true]
    var = data_no_null.boxplot(column=["percent_mean_add_class_patch"], ax=ax1, xlabel="Neue Hinzugefügte Klassen ")
    var2 = data_no_null.boxplot(column=["percent_mean_delete_class_patch"], ax=ax2, xlabel="Gelöschte Klassen")
    ax1.set_xticklabels("")
    ax2.set_xticklabels("")

    ax1.set_ylim(-1, 100)
    ax2.set_ylim(-1, 100)
    fig.suptitle("Boxplot zur Änderungen an Klassen Patch")


    var.plot()
    var2.plot()
    plt.savefig(wd + "/figuren/auswertung/prozent/box_class_prozent_patch.jpg")
    plt.close()
