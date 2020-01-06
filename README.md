# Dataset Collection
Many of our works are based on analysis and evaluation of real-world datasets. We have created an automated framework to collect datasets, extract columns from them, organize, and persist the records for further analysis. The framework could accept various input formats including csv, txt, JSon and MS Excel files. It also supports recognition of column data type for unattended data collection. For further analysis purpose, the framework provides API enabling customized features to be extracted from the columns.

Using this framework, we have collected around 20000 columnar datasets from approximately 1200 tables with a total size of 500G data. These datasets are all from real-world data sources and cover a rich collection of data types (integer, date, price, address, etc.), with diverse data distributions. 

Here's a list of data sources the datasets are collected from. Please contact us if you need to download the datasets.
* Government Data Portals
  * [Open Government Data](https://www.data.gov/open-gov/)
  * [NYC](https://opendata.cityofnewyork.us/)
  * [Chicago](https://data.cityofchicago.org/)
  * [Baltimore](https://data.baltimorecity.gov/)
  * [Dallas](https://mydata.dallasisd.org/)
  * [Washington D.C.](https://dc.gov/page/open-data)
  * [LA](https://data.lacity.org/)
  * [Maryland](https://data.maryland.gov/)
  * [Lousiville](https://data.louisvilleky.gov/)
  * [Oakland](https://data.oaklandnet.com/)
* Server Logs
  * Argonne Server Logs [Requesting permission to publish]
* GIS data
  * [ArcGIS Open Data](http://hub.arcgis.com/pages/open-data)
  * [Esri Open Data](http://www.esri.com/software/open/open-data)
* Social Networks
  * [Bikeshare](https://www.bikeshare.com/)
  * [Yelp](https://www.yelp.com/dataset/challenge)
* Machine Learning Datasets
  * [UCI Repo](https://archive.ics.uci.edu/ml/)

# Synthetic Dataset

PIDS uses four synthesic datasets in the experiments
* **Phone Number**   Example: (123)456-7890
* **IPv6**           Example: 1234:5678:90AB:CDEF:3323:5678:90AB:CDEF
* **Timestamp**      Example: 2014-06-01 23:14:29 4249.12345
* **Address**        Example: 123 Maple Street,Suite P,Chicago,Cook County,IL,60012

For Phone Number and IPv6 datasets, the value for each field is randomly sampled from all available values.  
The Timestamp dataset is randomly sampled from a 10 year time span, 1970-01-01 to 2069-12-31.  
The Address dataset is randomly sampled from an dictionary with 800,000 records.  
This repository contains the source code for generating these datasets.   
