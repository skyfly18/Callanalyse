import os

import matplotlib.pyplot as plt
import pandas as pd
from pandas import DataFrame


def box_updates_mayor(data: DataFrame):
    wd = os.getcwd()
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(8, 7))
    sucessful_true = data["numbers_of_mayor_updates"] > 0
    data_no_null = data[sucessful_true]
    var = data_no_null.boxplot(column=["numbers_of_mayor_updates"], ax=ax1, xlabel="Anzahl der Major Updates")
    var2 = data.boxplot(column=["numbers_of_mayor_updates"], ax=ax2, xlabel="Anzahl der Major Updates")
    ax1.set_ylim(-1, 7)
    ax1.set_xticklabels("")
    ax2.set_ylim(-1, 7)
    ax2.set_xticklabels("")
    ax1.set_title("Ohne die Librarys wo Major Update 0 war  ")
    ax2.set_title("Mit den Librarys wo Major Update 0 war  ")
    var.plot()
    var2.plot()
    plt.savefig(wd + "/figuren/ueberblick/boxupdatemayor.jpg")
    plt.close()


def box_updates_minor(data: DataFrame):
    wd = os.getcwd()
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(8, 7))
    sucessful_true = data["numbers_of_minor_updates"] > 0
    data_no_null = data[sucessful_true]
    var = data_no_null.boxplot(column=["numbers_of_minor_updates"], ax=ax1, xlabel="Anzahl der Minor Updates")
    var2 = data.boxplot(column=["numbers_of_minor_updates"], ax=ax2, xlabel="Anzahl der Minor Updates")
    ax1.set_ylim(-1, 40)
    ax1.set_xticklabels("")
    ax2.set_ylim(-1, 40)
    ax2.set_xticklabels("")
    ax1.set_title("Ohne die Librarys wo Minor Update 0 war  ")
    ax2.set_title("Mit den Librarys wo Minor Update 0 war  ")


    var.plot()
    var2.plot()
    plt.savefig(wd + "/figuren/ueberblick/boxupdateminor.jpg")
    plt.close()


def box_updates_patch(data: DataFrame):
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(8, 7))
    sucessful_true = data["numbers_of_patch_updates"] > 0
    data_no_null = data[sucessful_true]
    var = data_no_null.boxplot(column=["numbers_of_patch_updates"], ax=ax1, xlabel="Anzahl der Patch Updates")
    var2 = data.boxplot(column=["numbers_of_patch_updates"], ax=ax2, xlabel="Anzahl der Patch Updates")
    ax1.set_ylim(-1, 40)
    ax1.set_xticklabels("")
    ax2.set_ylim(-1, 40)
    ax1.set_xticklabels("")
    ax1.set_title("Ohne die Librarys wo Patch Update 0 war  ")
    ax2.set_title("Mit den Librarys wo Patch Update 0 war  ")
    var.plot()
    var2.plot()
    wd = os.getcwd()
    plt.savefig(wd + "/figuren/ueberblick/boxupdatepatch.jpg")
    plt.close()
