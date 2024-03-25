import locale
import os

from pandas import DataFrame


def createtabular(result: DataFrame, packagename_count, packageversion_count):
    wd = os.getcwd()

    df = result.sum()
    fueberblick = open(wd + "/figuren/tabellen/tbueberblick.tex", "w")

    fueberblick.write("\\begin{tabular}{|l|c|c|}\n")
    fueberblick.write("" + " & " + "Anzahl der Librarys" + " & " + "Anzahl aller Jar Dateien" + "\\\\ \n")
    fueberblick.write("\\hline\n")
    fueberblick.write(
        "Auf Maven Central" + " & " + "$" +str(packagename_count) + "$" + " & " + "$" + str(packageversion_count) + "$" + "\\\\ \n")
    fueberblick.write("\\hline\n")
    fueberblick.write("Analysierte" + " & " + "$" + str(result["id"].count()) + "$" + " & " + "$" + str(int(df["jar_count"])) + "$" + "\\\\ \n")
    fueberblick.write("\\hline\n")
    fueberblick.write("\\hline\n")
    fueberblick.write(
        "Analysierte in \\% " + " & " + "$" + locale.localize(
            str(round(((result["id"].count() * 100) / packagename_count), 2))) + "$" + " & " + "$" +
        locale.localize(str(round(((df["jar_count"] * 100) / packageversion_count), 2))) + "$" + "\\\\ \n")

    fueberblick.write("\\hline\n")

    fueberblick.write("\\end{tabular}")
    fueberblick.close()


def createtabular_error_table(result_table: DataFrame, packagename_count):
    wd = os.getcwd()

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
    fueberblick = open(wd + "/figuren/tabellen/tberrorandsuccess.tex", "w")

    fueberblick.write("\\begin{tabular}{|c|c|c|c|c|}\n")
    fueberblick.write(
        "" + " & " + "Erfolgreiche Analysien  " + " & " + "Download Fehler" + "&" + "SemVer Fehler" + "&" + " OneJar Feheler" + "\\\\ \n")
    fueberblick.write("\\hline\n")
    fueberblick.write(
        "Anzahl" + " & " + "$" + locale.localize(str(successfull_result["id"].count())) + "$" + " & " + "$" + locale.localize(str(fail_download["id"].count())) + "$" + " & " + "$" +
        locale.localize(str(fail_semver["id"].count())) + "$" + "&" + "$" + str(fail_one_jar["id"].count()) + "$" + "\\\\ \n")
    fueberblick.write("\\hline\n")
    fueberblick.write("Werte in Prozent in abhängigkeit aller berechneten Librarys" + " & " + "$" +
                      locale.localize(str(round(((successfull_result["id"].count() * 100) / result_table["id"].count()),
                                                2))) + "$" + " & " + "$" +
                      locale.localize(
                          str(round(((fail_download["id"].count() * 100) / result_table["id"].count()), 2))) + "$" + "&" + "$" +
                      locale.localize(
                          str(round(((fail_semver["id"].count() * 100) / result_table["id"].count()), 2))) + "$" + "&" + "$" +
                      locale.localize(
                          str(round(((fail_one_jar["id"].count() * 100) / result_table["id"].count()), 2))) + "$" + "\\\\ \n")
    fueberblick.write("\\hline\n")
    fueberblick.write("Werte in Prozent in abhäbgigkeit aller Library auf Maven Central" + " & " + "$" +
                      locale.localize(
                          str(round(((successfull_result["id"].count() * 100) / packagename_count), 2))) + "$" + " & " + "$" +
                      locale.localize(str(round(((fail_download["id"].count() * 100) / packagename_count), 2))) + "$" + "&" + "$" +
                      locale.localize(str(round(((fail_semver["id"].count() * 100) / packagename_count), 2))) + "$" + "&" + "$" +
                      locale.localize(
                          str(round(((fail_one_jar["id"].count() * 100) / packagename_count), 2))) + "$" + "\\\\ \n")
    fueberblick.write("\\hline\n")
    fueberblick.write("\\end{tabular}")
    fueberblick.close()


def createtabuar_groups(result: DataFrame):
    for up in ["mayor", "minor", "patch"]:
        wd = os.getcwd()

        fgroup = open(wd + "/figuren/tabellen/tbgroup_" + up + ".tex", "w")
        fgroup.write("\\begin{tabular}{|l|c|c|c|c|c|c|}\n")
        fgroup.write("\\hline\n")
        fgroup.write(
            "Gruppen" + " & " + "Hinzugefügte Methoden" + " & " + "Gelöschte Methoden" + "&" + "Geänderte Methoden" +
            " & " + "Alle Änderungen an Methoden" + "&" + "Hinzugefügte Klassen" + "&" + "Gelöschte Klassen" + "\\\\ \n")
        fgroup.write("\\hline\n")

        group1_class_delete = result[("percent_mean_delete_class_" + up)] == 0
        group2_class_delete = result.eval(
            'percent_mean_delete_class_' + up + ' > 0.0 and percent_mean_delete_class_' + up + ' <= 20.0')
        group3_class_delete = result.eval(
            'percent_mean_delete_class_' + up + ' > 20.0 and percent_mean_delete_class_' + up + ' <= 50.0')
        group4_class_delete = result.eval(
            'percent_mean_delete_class_' + up + ' > 50.0 and percent_mean_delete_class_' + up + ' <= 80.0')
        group5_class_delete = result.eval(
            'percent_mean_delete_class_' + up + ' > 80.0 and percent_mean_delete_class_' + up + ' <= 100.0')
        group6_class_delete = result[("percent_mean_delete_class_" + up)] > 100.0

        group1_class_add = result[("percent_mean_add_class_" + up)] == 0
        group2_class_add = result.eval(
            'percent_mean_add_class_' + up + ' > 0.0 and percent_mean_add_class_' + up + ' <= 20.0')
        group3_class_add = result.eval(
            'percent_mean_add_class_' + up + ' > 20.0 and percent_mean_add_class_' + up + ' <= 50.0')
        group4_class_add = result.eval(
            'percent_mean_add_class_' + up + ' > 50.0 and percent_mean_add_class_' + up + ' <= 80.0')
        group5_class_add = result.eval(
            'percent_mean_add_class_' + up + ' > 80.0 and percent_mean_add_class_' + up + ' <= 100.0')
        group6_class_add = result[("percent_mean_add_class_" + up)] > 100.0

        group1_meth_delete = result[("percent_mean_delete_methode_" + up)] == 0
        group2_meth_delete = result.eval(
            'percent_mean_delete_methode_' + up + ' > 0.0 and percent_mean_delete_methode_' + up + ' <= 20.0')
        group3_meth_delete = result.eval(
            'percent_mean_delete_methode_' + up + ' > 20.0 and percent_mean_delete_methode_' + up + ' <= 50.0')
        group4_meth_delete = result.eval(
            'percent_mean_delete_methode_' + up + ' > 50.0 and percent_mean_delete_methode_' + up + ' <= 80.0')
        group5_meth_delete = result.eval(
            'percent_mean_delete_methode_' + up + ' > 80.0 and percent_mean_delete_methode_' + up + ' <= 100.0')
        group6_meth_delete = result[("percent_mean_delete_methode_" + up)] > 100

        group1_meth_add = result[("percent_mean_add_methode_" + up)] == 0
        group2_meth_add = result.eval(
            'percent_mean_add_methode_' + up + ' > 0.0 and percent_mean_add_methode_' + up + ' <= 20.0')
        group3_meth_add = result.eval(
            'percent_mean_add_methode_' + up + ' > 20.0 and percent_mean_add_methode_' + up + ' <= 50.0')
        group4_meth_add = result.eval(
            'percent_mean_add_methode_' + up + ' > 50.0 and percent_mean_add_methode_' + up + ' <= 80.0')
        group5_meth_add = result.eval(
            'percent_mean_add_methode_' + up + ' > 80.0 and percent_mean_add_methode_' + up + ' <= 100.0')
        group6_meth_add = result[("percent_mean_add_methode_" + up)] > 100.0

        group1_meth_modi = result[("percent_mean_modi_methode_" + up)] == 0
        group2_meth_modi = result.eval(
            'percent_mean_modi_methode_' + up + ' > 0.0 and percent_mean_modi_methode_' + up + ' <= 20.0')
        group3_meth_modi = result.eval(
            'percent_mean_modi_methode_' + up + ' > 20.0 and percent_mean_modi_methode_' + up + ' <= 50.0')
        group4_meth_modi = result.eval(
            'percent_mean_modi_methode_' + up + ' > 50.0 and percent_mean_modi_methode_' + up + ' <= 80.0')
        group5_meth_modi = result.eval(
            'percent_mean_modi_methode_' + up + ' > 80.0 and percent_mean_modi_methode_' + up + ' <= 100.0')
        group6_meth_modi = result[("percent_mean_modi_methode_" + up)] > 100.0

        group1_meth_modi_all = result[("percent_mean_all_change_methode_" + up)] == 0
        group2_meth_modi_all = result.eval(
            'percent_mean_all_change_methode_' + up + ' > 0.0 and percent_mean_all_change_methode_' + up + ' <= 20.0')
        group3_meth_modi_all = result.eval(
            'percent_mean_all_change_methode_' + up + ' > 20.0 and percent_mean_all_change_methode_' + up + ' <= 50.0')
        group4_meth_modi_all = result.eval(
            'percent_mean_all_change_methode_' + up + ' > 50.0 and percent_mean_all_change_methode_' + up + ' <= 80.0')
        group5_meth_modi_all = result.eval(
            'percent_mean_all_change_methode_' + up + ' > 80.0 and percent_mean_all_change_methode_' + up + ' <= 100.0')
        group6_meth_modi_all = result[("percent_mean_all_change_methode_" + up)] > 100.0

        group1_class_delete_erg = result[group1_class_delete]
        group2_class_delete_erg = result[group2_class_delete]
        group3_class_delete_erg = result[group3_class_delete]
        group4_class_delete_erg = result[group4_class_delete]
        group5_class_delete_erg = result[group5_class_delete]
        group6_class_delete_erg = result[group6_class_delete]

        group1_class_add_erg = result[group1_class_add]
        group2_class_add_erg = result[group2_class_add]
        group3_class_add_erg = result[group3_class_add]
        group4_class_add_erg = result[group4_class_add]
        group5_class_add_erg = result[group5_class_add]
        group6_class_add_erg = result[group6_class_add]

        group1_meth_delete_erg = result[group1_meth_delete]
        group2_meth_delete_erg = result[group2_meth_delete]
        group3_meth_delete_erg = result[group3_meth_delete]
        group4_meth_delete_erg = result[group4_meth_delete]
        group5_meth_delete_erg = result[group5_meth_delete]
        group6_meth_delete_erg = result[group6_meth_delete]

        group1_meth_add_erg = result[group1_meth_add]
        group2_meth_add_erg = result[group2_meth_add]
        group3_meth_add_erg = result[group3_meth_add]
        group4_meth_add_erg = result[group4_meth_add]
        group5_meth_add_erg = result[group5_meth_add]
        group6_meth_add_erg = result[group6_meth_add]

        group1_meth_modi_erg = result[group1_meth_modi]
        group2_meth_modi_erg = result[group2_meth_modi]
        group3_meth_modi_erg = result[group3_meth_modi]
        group4_meth_modi_erg = result[group4_meth_modi]
        group5_meth_modi_erg = result[group5_meth_modi]
        group6_meth_modi_erg = result[group6_meth_modi]

        group1_meth_modi_all_erg = result[group1_meth_modi_all]
        group2_meth_modi_all_erg = result[group2_meth_modi_all]
        group3_meth_modi_all_erg = result[group3_meth_modi_all]
        group4_meth_modi_all_erg = result[group4_meth_modi_all]
        group5_meth_modi_all_erg = result[group5_meth_modi_all]
        group6_meth_modi_all_erg = result[group6_meth_modi_all]

        fgroup.write("\\hline\n")
        fgroup.write(
            "Unverändert" + " & " + "$" + str(group1_meth_add_erg["id"].count()) +  "$" + " & " + "$" + str(
                group1_meth_delete_erg["id"].count()) + "$" +
            "&" + "$" + str(group1_meth_modi_erg["id"].count()) + "$" +
            "&" + "$" + str(group1_meth_modi_all_erg["id"].count()) + "$" + "&" + "$" + str(group1_class_add_erg["id"].count()) + "$" + "&"
            + "$" + str(group1_class_delete_erg["id"].count()) + "$" + "\\\\ \n")
        fgroup.write("\\hline\n")

        fgroup.write("Leichte Änderungen" + " & " + "$" + str(group2_meth_add_erg["id"].count()) +  "$" + " & " + "$" + str(
            group2_meth_delete_erg["id"].count()) + "$" +
                     "&" + "$" + str(group2_meth_modi_erg["id"].count()) + "$" +
                     "&" + "$" + str(group2_meth_modi_all_erg["id"].count())  + "$" + "&" + "$" + str(
            group2_class_add_erg["id"].count()) +"$" + "&"
                     + "$" + str(group2_class_delete_erg["id"].count()) + "$" + "\\\\ \n")
        fgroup.write("\\hline\n")
        fgroup.write("Mittlere Änderungen" + "&" + "$" + str(group3_meth_add_erg["id"].count()) + "$" + " & " + "$" + str(
            group3_meth_delete_erg["id"].count()) + "$" +
                     "&" + "$" + str(group3_meth_modi_erg["id"].count()) + "$" +
                     "&" + "$" + str(group3_meth_modi_all_erg["id"].count()) + "$" + "&" + "$" + str(
            group3_class_add_erg["id"].count()) + "$" + "&"
                     + "$" + str(group3_class_delete_erg["id"].count()) + "$" + "\\\\ \n")
        fgroup.write("\\hline\n")
        fgroup.write("Starke Änderungen" + " & " + "$" + str(group4_meth_add_erg["id"].count()) + "$" + " & " + "$" + str(
            group4_meth_delete_erg["id"].count()) + "$" +
                     "&" + "$" + str(group4_meth_modi_erg["id"].count()) + "$" +
                     "&" + "$" + str(group4_meth_modi_all_erg["id"].count()) + "$" + "&" + "$" + str(
            group4_class_add_erg["id"].count()) + "$" + "&"
                     + "$" +str(group4_class_delete_erg["id"].count()) + "$" + "\\\\ \n")
        fgroup.write("\\hline\n")
        fgroup.write("Sehr starke Änderungen" + " & " + "$" + str(group5_meth_add_erg["id"].count()) + "$" + " & " + "$" + str(
            group5_meth_delete_erg["id"].count()) + "$" +
                     "&" + "$" + str(group5_meth_modi_erg["id"].count()) + "$" +
                     "&" + "$" + str(group5_meth_modi_all_erg["id"].count()) + "$" + "&" + "$" + str(
            group5_class_add_erg["id"].count()) + "$" + "&"
                     + "$" + str(group5_class_delete_erg["id"].count()) + "$" + "\\\\ \n")
        fgroup.write("\\hline\n")
        fgroup.write("Vollständige Änderung" + " & " + "$" + str(group6_meth_add_erg["id"].count()) + "$" + " & " + "$" + str(
            group6_meth_delete_erg["id"].count()) + "$" +
                     "&" + "$" + str(group6_meth_modi_erg["id"].count()) + "$" +
                     "&" + "$" + str(group6_meth_modi_all_erg["id"].count()) + "$" + "&" + "$" + str(
            group6_class_add_erg["id"].count()) + "$" + "&"
                     + "$" + str(group6_class_delete_erg["id"].count()) + "$" + "\\\\ \n")
        fgroup.write("\\hline\n")
        fgroup.write("\\end{tabular}")
        fgroup.close()


def createtabuar_groups_abschluss(result: DataFrame):
    wd = os.getcwd()
    fgroup = open(wd + "/figuren/tabellen/tbgroup_abschluss.tex", "w")
    fgroup.write("\\begin{tabular}{|l|c|c|c|}\n")
    fgroup.write("\\hline\n")
    fgroup.write(
        "Gruppen" + " & " + "Alle Änderungen an Methoden" + " & " +
        "Alle Änderungen an Methoden ohne die Änderungen durch die Klassen" + "&" + "Alle Änderungen an Klassen ohne Methoden" + "\\\\ \n")
    fgroup.write("\\hline\n")
    new_result = result.copy()
    new_result["result_all"] = ((result["percent_mean_all_change_methode_mayor"] +
                                 result["percent_mean_all_change_methode_minor"] +
                                 result["percent_mean_all_change_methode_patch"]) / 3)

    new_result["result_no_class"] = ((result["percent_mean_all_change_methode_no_class_mayor"] +
                                      result["percent_mean_all_change_methode_no_class_minor"] +
                                      result["percent_mean_all_change_methode_no_class_patch"]) / 3)

    new_result["result_add_class"] = ((result["percent_mean_add_class_mayor"] +
                                       result["percent_mean_add_class_minor"] +
                                       result["percent_mean_add_class_patch"] +
                                       result["percent_mean_delete_class_mayor"] +
                                       result["percent_mean_delete_class_minor"] +
                                       result["percent_mean_delete_class_patch"]) / 6)

    group1_result_all = new_result[new_result["result_all"] == 0]
    group2_result_all = new_result[new_result.eval('result_all > 0.0 and result_all <= 20.0')]
    group3_result_all = new_result[new_result.eval(' result_all > 20.0 and result_all <= 50.0')]
    group4_result_all = new_result[new_result.eval('result_all > 50.0 and result_all <= 80.0')]
    group5_result_all = new_result[new_result.eval(' result_all > 80.0 and result_all <= 100.0')]
    group6_result_all = new_result[new_result["result_all"] > 100.0]

    group1_result_no_class = new_result[new_result["result_no_class"] == 0]
    group2_result_no_class = new_result[new_result.eval('result_no_class > 0.0 and result_no_class <= 20.0')]
    group3_result_no_class = new_result[new_result.eval(' result_no_class > 20.0 and result_no_class <= 50.0')]
    group4_result_no_class = new_result[new_result.eval('result_no_class > 50.0 and result_no_class <= 80.0')]
    group5_result_no_class = new_result[new_result.eval(' result_no_class > 80.0 and result_no_class <= 100.0')]
    group6_result_no_class = new_result[new_result["result_no_class"] > 100.0]

    group1_result_add_class = new_result[new_result["result_add_class"] == 0]
    group2_result_add_class = new_result[new_result.eval('result_add_class > 0.0 and result_add_class <= 20.0')]
    group3_result_add_class = new_result[new_result.eval(' result_add_class > 20.0 and result_add_class <= 50.0')]
    group4_result_add_class = new_result[new_result.eval('result_add_class > 50.0 and result_add_class <= 80.0')]
    group5_result_add_class = new_result[new_result.eval(' result_add_class > 80.0 and result_add_class <= 100.0')]
    group6_result_add_class = new_result[new_result["result_add_class"] > 100.0]

    fgroup.write(
        "Unverändert" + " & " + "$" + str(group1_result_all["id"].count()) + "$" + " & " + "$" + str(
            group1_result_no_class["id"].count()) + "$" +
        "&" + "$" + str(group1_result_add_class["id"].count()) + "$" + "\\\\ \n")
    fgroup.write("\\hline\n")

    fgroup.write("Leichte Änderungen" + " & " + "$" + str(group2_result_all["id"].count()) + "$" + " & " + "$" + str(
        group2_result_no_class["id"].count()) + "$" +
                 "&" + "$" + str(group2_result_add_class["id"].count()) + "$" + "\\\\ \n")
    fgroup.write("\\hline\n")
    fgroup.write("Mittlere Änderungen" + "&" + "$" + str(group3_result_all["id"].count()) + "$" + " & " + "$" + str(
        group3_result_no_class["id"].count()) + "$" +
                 "&" + "$" + str(group3_result_add_class["id"].count()) + "$" + "\\\\ \n")
    fgroup.write("\\hline\n")
    fgroup.write("Starke Änderungen" + " & " + "$" + str(group4_result_all["id"].count()) + "$" + " & " + "$" + str(
        group4_result_no_class["id"].count()) + "$" +
                 "&" + "$" + str(group4_result_add_class["id"].count()) + "$" + "\\\\ \n")
    fgroup.write("\\hline\n")
    fgroup.write("Sehr starke Änderungen" + " & " + "$" + str(group5_result_all["id"].count()) + "$" + " & " + "$" + str(
        group5_result_no_class["id"].count()) + "$" +
                 "&" + "$" + str(group5_result_add_class["id"].count()) + "$" + "\\\\ \n")
    fgroup.write("\\hline\n")
    fgroup.write("Vollständige Änderung" + " & " + "$" + str(group6_result_all["id"].count()) + "$" + " & " + "$" + str(
        group6_result_no_class["id"].count()) + "$" +
                 "&" + "$" + str(group6_result_add_class["id"].count()) + "$" + "\\\\ \n")
    fgroup.write("\\hline\n")

    fgroup.write("\\end{tabular}")
    fgroup.close()


def createtabular_numbers_updates(result: DataFrame):
    wd = os.getcwd()
    fueberblick = open(wd + "/figuren/tabellen/tbueberblick-updates.tex", "w")
    result_patch = result[result["numbers_of_patch_updates"] > 0]
    result_minor = result[result["numbers_of_minor_updates"] > 0]
    result_mayor = result[result["numbers_of_mayor_updates"] > 0]

    fueberblick.write("\\begin{tabular}{|l|c|c|c|}\n")
    fueberblick.write("" + " & " + "Major" + " & " + "Minor" + "&" + "Patch" + "\\\\ \n")
    fueberblick.write("\\hline\n")
    fueberblick.write(
        "Anzahl:" + " & " + "$" + str(result_mayor["numbers_of_mayor_updates"].count()) + "$" + " & " + "$" +
        str(result_minor["numbers_of_minor_updates"].count()) + "$" + "&" + "$" +
        locale.delocalize(str(result_patch["numbers_of_patch_updates"].count()) + "$" + "\\\\ \n"))
    fueberblick.write("\\hline\n")
    fueberblick.write("In Prozent von:" + "$" + str(result["id"].count()) + "$" + " & " +
                      "$" + locale.localize(str(round(((result_mayor["id"].count() * 100) / result["id"].count()), 2))) + "$" +
                      " & " + "$" + locale.localize(
        str(round(((result_minor["id"].count() * 100) / result["id"].count()), 2))) + "$" +
                      " & " + "$" +locale.localize(
        str(round(((result_patch["id"].count() * 100) / result["id"].count()), 2)))
                      + "$" + "\\\\ \n")
    fueberblick.write("\\hline\n")
    fueberblick.write("\\end{tabular}")
    fueberblick.close()
