from pandas import DataFrame
from .prozent import boxplot
from .prozent import scatterplot
from .mittelwert import boxplot as boxmean
from .mittelwert import scatterplot as scattermean


def work_auswerten_prozent(data: DataFrame):
    boxplot.box_methode_mayor(data)
    boxplot.box_methode_minor(data)
    boxplot.box_methode_patch(data)

    boxplot.box_class_mayor(data)
    boxplot.box_class_minor(data)
    boxplot.box_class_patch(data)

    scatterplot.scatter_methoden_mayor(data)
    scatterplot.scatter_methoden_minor(data)
    scatterplot.scatter_methoden_patch(data)

    scatterplot.scatter_methoden_mayor_jar_count(data)
    scatterplot.scatter_methoden_minor_jar_count(data)
    scatterplot.scatter_methoden_patch_jar_count(data)

    scatterplot.scatter_methoden_mayor_of_sum_methode(data)
    scatterplot.scatter_methoden_minor_of_sum_methode(data)
    scatterplot.scatter_methoden_patch_of_sum_methode(data)


def work_auswertung_mean(data: DataFrame):
    boxmean.box_methode_mayor(data)
    boxmean.box_methode_minor(data)
    boxmean.box_methode_patch(data)

    scattermean.scatter_methoden_mayor(data)
    scattermean.scatter_methoden_minor(data)
    scattermean.scatter_methoden_patch(data)

    scattermean.scatter_methoden_mayor_jar_count(data)
    scattermean.scatter_methoden_minor_jar_count(data)
    scattermean.scatter_methoden_patch_jar_count(data)
