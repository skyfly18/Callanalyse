from pandas import DataFrame
from .boxplot.jarCounts import jar_box
from .balkenplot.errorAndSuccesful import error_plot, error_and_successfull
from .boxplot import  boxupdates as bxplt
from .scatter import scatter

def ueberblick(result_table: DataFrame):
    one_jar_true = result_table["only_one_jar"] == True
    fail_one_jar = result_table[one_jar_true]
    download_exeption = result_table["download_exception"] == True
    fail_download = result_table[download_exeption]

    not_semver = result_table["not_semver"] == True
    fail_semver = result_table[not_semver]
    no_sucessful = result_table["successfull"] == False
    fail_sucessfull = result_table[no_sucessful]
    sucessful_true = result_table["successfull"] == True
    successfull_result = result_table[sucessful_true]

    error_plot(fail_semver["id"].count(), fail_download["id"].count(), fail_one_jar["id"].count())
    error_and_successfull(fail_sucessfull["id"].count(), successfull_result["id"].count())

    jar_box(successfull_result)
    bxplt.box_updates_mayor(successfull_result)
    bxplt.box_updates_minor(successfull_result)
    bxplt.box_updates_patch(successfull_result)
    scatter.scatter_mayor_updates(successfull_result)
    scatter.scatter_minor_updates(successfull_result)
    scatter.scatter_patch_updates(successfull_result)
