import os

import matplotlib.pyplot as plt
from pandas import DataFrame


def scatter_methoden_mayor_jar_count(data: DataFrame):
    sucessful_true = data["numbers_of_mayor_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(10, 5))
    fig.suptitle("Scatter Diagramm: Hinzugefügte und Gelöschte Methoden über Anzahl der Jar Dateien  Major ")
    data_no_null.plot.scatter(x='jar_count', y='percent_mean_add_methode_mayor',
                              xlabel="Anzahl der Jar Dateien", ylabel="Prozent %", ax=ax1,
                              title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='jar_count', y='percent_mean_delete_methode_mayor',
                              xlabel="Anzahl der Jar Dateien", ylabel="Prozent %", ax=ax2, title="Gelöschte Methoden")

    wd = os.getcwd()
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_add_delete_methode_prozent_major_jar_count.jpg")
    plt.close()

    fig2, (ax3, ax4) = plt.subplots(1, 2, figsize=(12, 5))
    fig2.suptitle("Scatter Diagramm: Geänderte und Alle Änderungen an Methoden über Anzahl der Jar Dateien  Major ")

    data_no_null.plot.scatter(x='jar_count', y='percent_mean_modi_methode_mayor',
                              xlabel="Anzahl der Jar Dateien", ylabel="Prozent %", ax=ax3,
                              title="Veränderte Methoden")
    data_no_null.plot.scatter(x='jar_count', y='percent_mean_all_change_methode_mayor',
                              xlabel="Anzahl der Jar Dateien", ylabel="Prozent %", ax=ax4,
                              title="Alle Änderungen an denn Methoden")
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_modi_allchanges_methode_prozent_major_jar_count.jpg")
    plt.close()


def scatter_methoden_minor_jar_count(data: DataFrame):
    sucessful_true = data["numbers_of_minor_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(10, 5))
    fig.suptitle("Scatter Diagramm: Hinzugefügte und Gelöschte Methoden über Anzahl der Jar Dateien  Minor ")


    data_no_null.plot.scatter(x='jar_count', y='percent_mean_add_methode_minor',
                              xlabel="Anzahl der Jar Dateien", ylabel="Prozent %", ax=ax1,
                              title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='jar_count', y='percent_mean_delete_methode_minor',
                              xlabel="Anzahl der Jar Dateien", ylabel="Prozent %", ax=ax2, title="Gelöschte Methoden")


    wd = os.getcwd()
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_add_delete_methode_prozent_minor_jar_count.jpg")
    plt.close()

    fig2, (ax3, ax4) = plt.subplots(1, 2, figsize=(12, 5))
    fig2.suptitle("Scatter Diagramm: Geänderte und Alle Änderungen an Methoden über Anzahl der Jar Dateien  Minor ")

    data_no_null.plot.scatter(x='jar_count', y='percent_mean_modi_methode_minor',
                              xlabel="Anzahl der Jar Dateien", ylabel="Prozent %", ax=ax3,
                              title="Veränderte Methoden")
    data_no_null.plot.scatter(x='jar_count', y='percent_mean_all_change_methode_minor',
                              xlabel="Anzahl der Jar Dateien", ylabel="Prozent %", ax=ax4,
                              title="Alle Änderungen an denn Methoden")
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_modi_allchanges_methode_prozent_minor_jar_count.jpg")
    plt.close()


def scatter_methoden_patch_jar_count(data: DataFrame):
    sucessful_true = data["numbers_of_patch_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(10, 5))
    fig.suptitle("Scatter Diagramm: Hinzugefügte und Gelöschte Methoden über Anzahl der Jar Dateien Patch ")


    data_no_null.plot.scatter(x='jar_count', y='percent_mean_add_methode_patch',
                              xlabel="Anzahl der Jar Dateien", ylabel="Prozent %", ax=ax1,
                              title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='jar_count', y='percent_mean_delete_methode_patch',
                              xlabel="Anzahl der Jar Dateien", ylabel="Prozent %", ax=ax2, title="Gelöschte Methoden")


    wd = os.getcwd()
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_add_delete_methode_prozent_patch_jar_count.jpg")
    plt.close()

    fig2, (ax3, ax4) = plt.subplots(1, 2, figsize=(12, 5))
    fig2.suptitle("Scatter Diagramm: Geänderte und Alle Änderungen an Methoden über Anzahl der Jar Dateien  Patch ")

    data_no_null.plot.scatter(x='jar_count', y='percent_mean_modi_methode_patch',
                              xlabel="Anzahl der Jar Dateien", ylabel="Prozent %", ax=ax3,
                              title="Veränderte Methoden")
    data_no_null.plot.scatter(x='jar_count', y='percent_mean_all_change_methode_patch',
                              xlabel="Anzahl der Jar Dateien", ylabel="Prozent %", ax=ax4,
                              title="Alle Änderungen an denn Methoden")
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_modi_allchanges_methode_prozent_patch_jar_count.jpg")
    plt.close()


def scatter_methoden_mayor(data: DataFrame):
    sucessful_true = data["numbers_of_mayor_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(10, 5))
    fig.suptitle("Scatter Diagramm: Hinzugefügte und Gelöschte Methoden über die Anzahl an Major Updates")


    data_no_null.plot.scatter(x='numbers_of_mayor_updates', y='percent_mean_add_methode_mayor',
                              xlabel="Anzahl der Updates der Art Major", ylabel="Prozent %", ax=ax1,
                              title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='numbers_of_mayor_updates', y='percent_mean_delete_methode_mayor',
                              xlabel="Anzahl der Updates der Art Major", ylabel="Prozent %", ax=ax2,
                              title="Gelöschte Methoden")

    wd = os.getcwd()
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_add_delete_methode_prozent_major_numbers_of_updates.jpg")
    plt.close()

    fig2, (ax3, ax4) = plt.subplots(1, 2, figsize=(12, 5))
    fig2.suptitle("Scatter Diagramm: Geänderte und Alle Änderungen an Methoden über die Anzahl an Major Updates ")

    data_no_null.plot.scatter(x='numbers_of_mayor_updates', y='percent_mean_modi_methode_mayor',
                              xlabel="Anzahl der Updates der Art Major", ylabel="Prozent %", ax=ax3,
                              title="Veränderte Methoden")
    data_no_null.plot.scatter(x='numbers_of_mayor_updates', y='percent_mean_all_change_methode_mayor',
                              xlabel="Anzahl der Updates der Art Major", ylabel="Prozent %", ax=ax4,
                              title="Alle Änderungen an denn Methoden")
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_modi_allchanges_methode_prozent_major_numbers_of_updates.jpg")
    plt.close()


def scatter_methoden_minor(data: DataFrame):
    sucessful_true = data["numbers_of_minor_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(10, 5))
    fig.suptitle("Scatter Diagramm: Hinzugefügte und Gelöschte Methoden über die Anzahl an Minor Updates")

    data_no_null.plot.scatter(x='numbers_of_minor_updates', y='percent_mean_add_methode_minor',
                              xlabel="Anzahl der Updates der Art Minor", ylabel="Prozent %", ax=ax1,
                              title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='numbers_of_minor_updates', y='percent_mean_delete_methode_minor',
                              xlabel="Anzahl der Updates der Art Minor", ylabel="Prozent %", ax=ax2,
                              title="Gelöschte Methoden")

    wd = os.getcwd()
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_add_delete_methode_prozent_minor_numbers_of_updates.jpg")
    plt.close()

    fig2, (ax3, ax4) = plt.subplots(1, 2, figsize=(12, 5))
    fig2.suptitle("Scatter Diagramm: Geänderte und Alle Änderungen an Methoden über die Anzahl an Minor Updates ")

    data_no_null.plot.scatter(x='numbers_of_minor_updates', y='percent_mean_modi_methode_minor',
                              xlabel="Anzahl der Updates der Art Minor", ylabel="Prozent %", ax=ax3,
                              title="Veränderte Methoden")
    data_no_null.plot.scatter(x='numbers_of_minor_updates', y='percent_mean_all_change_methode_minor',
                              xlabel="Anzahl der Updates der Art Minor", ylabel="Prozent %", ax=ax4,
                              title="Alle Änderungen an denn Methoden")
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_modi_allchanges_methode_prozent_minor_numbers_of_updates.jpg")
    plt.close()


def scatter_methoden_patch(data: DataFrame):
    sucessful_true = data["numbers_of_patch_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(10, 5))
    fig.suptitle("Scatter Diagramm: Hinzugefügte und Gelöschte Methoden über die Anzahl an Patch Updates")

    data_no_null.plot.scatter(x='numbers_of_patch_updates', y='percent_mean_add_methode_patch',
                              xlabel="Anzahl der Updates der Art Patch", ylabel="Prozent %", ax=ax1,
                              title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='numbers_of_patch_updates', y='percent_mean_delete_methode_patch',
                              xlabel="Anzahl der Updates der Art Patch", ylabel="Prozent %", ax=ax2,
                              title="Gelöschte Methoden")


    wd = os.getcwd()
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_add_delete_methode_prozent_patch_numbers_of_updates.jpg")
    plt.close()

    fig2, (ax3, ax4) = plt.subplots(1, 2, figsize=(12, 5))
    fig2.suptitle("Scatter Diagramm: Geänderte und Alle Änderungen an Methoden über die Anzahl an Patch Updates ")

    data_no_null.plot.scatter(x='numbers_of_patch_updates', y='percent_mean_modi_methode_patch',
                              xlabel="Anzahl der Updates der Art Patch", ylabel="Prozent %", ax=ax3,
                              title="Veränderte Methoden")
    data_no_null.plot.scatter(x='numbers_of_patch_updates', y='percent_mean_all_change_methode_patch',
                              xlabel="Anzahl der Updates der Art Patch", ylabel="Prozent %", ax=ax4,
                              title="Alle Änderungen an denn Methoden")
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_modi_allchanges_methode_prozent_patch_numbers_of_updates.jpg")
    plt.close()


def scatter_methoden_mayor_of_sum_methode(data: DataFrame):
    sucessful_true = data["numbers_of_mayor_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(10, 5))
    fig.suptitle("Scatter Diagramm: Hinzugefügte und Gelöschte Methoden über der Anzahl an Methoden einer Library Major")

    data_no_null.plot.scatter(x='mean_sum_methode_mayor', y='percent_mean_add_methode_mayor',
                              xlabel="Mittelwert der gesammten Methoden einer Library", ylabel="Prozent %", ax=ax1,
                              title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='mean_sum_methode_mayor', y='percent_mean_delete_methode_mayor',
                              xlabel="Mittelwert der gesammten Methoden einer Library", ylabel="Prozent %", ax=ax2,
                              title="Gelöschte Methoden")


    wd = os.getcwd()
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_add_delete_methode_prozent_major_sum.jpg")
    plt.close()

    fig2, (ax3, ax4) = plt.subplots(1, 2, figsize=(12, 5))
    fig2.suptitle("Scatter Diagramm: Geänderte und Alle Änderungen an Methoden über der Anzahl an Methoden einer Library Major")

    data_no_null.plot.scatter(x='mean_sum_methode_mayor', y='percent_mean_modi_methode_mayor',
                              xlabel="Mittelwert der gesammten Methoden einer Library", ylabel="Prozent %", ax=ax3,
                              title="Veränderte Methoden")
    data_no_null.plot.scatter(x='mean_sum_methode_mayor', y='percent_mean_all_change_methode_mayor',
                              xlabel="Mittelwert der gesammten Methoden einer Library", ylabel="Prozent %", ax=ax4,
                              title="Alle Änderungen an denn Methoden")
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_modi_allchanges_methode_prozent_major_sum.jpg")
    plt.close()


def scatter_methoden_minor_of_sum_methode(data: DataFrame):
    sucessful_true = data["numbers_of_minor_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(10, 5))
    fig.suptitle("Scatter Diagramm: Hinzugefügte und Gelöschte Methoden über der Anzahl an Methoden einer Library Minor")

    data_no_null.plot.scatter(x='mean_sum_methode_minor', y='percent_mean_add_methode_minor',
                              xlabel="Mittelwert der gesammten Methoden einer Library", ylabel="Prozent %", ax=ax1,
                              title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='mean_sum_methode_minor', y='percent_mean_delete_methode_minor',
                              xlabel="Mittelwert der gesammten Methoden einer Library", ylabel="Prozent %", ax=ax2,
                              title="Gelöschte Methoden")


    wd = os.getcwd()
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_add_delete_methode_prozent_minor_sum.jpg")
    plt.close()

    fig2, (ax3, ax4) = plt.subplots(1, 2, figsize=(12, 5))
    fig2.suptitle("Scatter Diagramm: Geänderte und Alle Änderungen an Methoden über  der Anzahl an Methoden einer Library Minor")

    data_no_null.plot.scatter(x='mean_sum_methode_minor', y='percent_mean_modi_methode_minor',
                              xlabel="Mittelwert der gesammten Methoden einer Library", ylabel="Prozent %", ax=ax3,
                              title="Veränderte Methoden")
    data_no_null.plot.scatter(x='mean_sum_methode_minor', y='percent_mean_all_change_methode_minor',
                              xlabel="Mittelwert der gesammten Methoden einer Library", ylabel="Prozent %", ax=ax4,
                              title="Alle Änderungen an denn Methoden")
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_modi_allchanges_methode_prozent_minor_sum.jpg")
    plt.close()


def scatter_methoden_patch_of_sum_methode(data: DataFrame):
    sucessful_true = data["numbers_of_patch_updates"] > 0
    data_no_null = data[sucessful_true]
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(10, 5))
    fig.suptitle("Scatter Diagramm: Hinzugefügte und Gelöschte Methoden über der Anzahl an Methoden einer Library Patch")

    data_no_null.plot.scatter(x='mean_sum_methode_patch', y='percent_mean_add_methode_patch',
                              xlabel="Mittelwert der gesammten Methoden einer Library", ylabel="Prozent %", ax=ax1,
                              title="Hinzugeführte Methoden")

    data_no_null.plot.scatter(x='mean_sum_methode_patch', y='percent_mean_delete_methode_patch',
                              xlabel="Mittelwert der gesammten Methoden einer Library", ylabel="Prozent %", ax=ax2,
                              title="Gelöschte Methoden")


    wd = os.getcwd()
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_add_delete_methode_prozent_patch_sum.jpg")
    plt.close()

    fig2, (ax3, ax4) = plt.subplots(1, 2, figsize=(12, 5))
    fig2.suptitle("Scatter Diagramm: Geänderte und Alle Änderungen an Methoden über  der Anzahl an Methoden einer Library Patch")

    data_no_null.plot.scatter(x='mean_sum_methode_patch', y='percent_mean_modi_methode_patch',
                                  xlabel="Mittelwert der gesammten Methoden einer Library", ylabel="Prozent %", ax=ax3,
                                  title="Veränderte Methoden")
    data_no_null.plot.scatter(x='mean_sum_methode_patch', y='percent_mean_all_change_methode_patch',
                              xlabel="Mittelwert der gesammten Methoden einer Library", ylabel="Prozent %", ax=ax4,
                              title="Alle Änderungen an denn Methoden")
    plt.savefig(wd + "/figuren/auswertung/prozent/scatter_modi_allchanges_methode_prozent_patch_sum.jpg")
    plt.close()
