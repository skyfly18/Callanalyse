import pandas as pd
import sqlalchemy
import locale
from sqlalchemy import create_engine
from ueberblick import ueberblick

from auswertung import auswerten

from latextabular import createtabular

alchemyEngine = create_engine(
    'username',
    pool_recycle=1456)
locale.setlocale(locale.LC_ALL, 'de_DE.UTF-8')
dbConnection = alchemyEngine.connect()
result_table = pd.read_sql_table('calculated_result', dbConnection)
print(result_table)

ueberblick.ueberblick(result_table)

sucessful_true = result_table["successfull"] == True
successfull_result = result_table[sucessful_true]

auswerten.work_auswerten_prozent(successfull_result)
auswerten.work_auswertung_mean(successfull_result)

meta_data = sqlalchemy.MetaData(bind=alchemyEngine)
sqlalchemy.MetaData.reflect(meta_data)


package_version_table = meta_data.tables['package_version']
package_version_result = sqlalchemy.select([sqlalchemy.func.count()]).select_from(package_version_table).scalar()

package_name_table = meta_data.tables['package_name']
package_name_result = sqlalchemy.select([sqlalchemy.func.count()]).select_from(package_name_table).scalar()


createtabular.createtabular(result_table, package_name_result, package_version_result)
createtabular.createtabuar_groups(successfull_result)
createtabular.createtabular_error_table(result_table, package_name_result)
createtabular.createtabuar_groups_abschluss(successfull_result)
createtabular.createtabular_numbers_updates(successfull_result)


dbConnection.close()

