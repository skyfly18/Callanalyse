English Version Below:

# Callanalyse

Dieses Repositorie enthält das Projekt Callanalyse. Dieses Projekt wurde im Rahmen der Bachlor These "Auswertung des
Potentials von inkrementeller Callgraph-Analyse auf Ökosystem-Ebene" erstellt.

## Aufbau

Der Code im Package indesreader wurde von der [SSE Gruppe](https://github.com/sse-labs) bereit gestellt.

Im Package analysetool stammt der Code im Ordner fromopalmetricsframework vom dem Projeckt
[fachproject-metrics-framework](https://github.com/sse-labs/fachproject-metrics-framework).

## Voraussetzungen

Das Programm benötigt JVM 17 und eine Postgresql Datenbank.
Der Rechner sollte mindestens 16GB Ram haben.

## Einstellungen



| Property                                   | Values  |           Default Value           | Description                                                       |
|:-------------------------------------------|:--------|:---------------------------------:|:------------------------------------------------------------------|
| `spring.datasource.username`               | Strings |            `username`             | Username Postgresql                                               |
| `spring.datasource.password`               | Strings |            `password`             | Password for connecting to Postgresql                             |
| `spring.datasource.url`                    | URL     |          `URL postgres`           | Url zum Postgresql Datenbank                                      |
| `api.indexurl`                             | URL     | `https://repo1.maven.org/maven2/` | URL zum Jar Repositorie                                           |
| `api.download-ordner-path`                 | Path    |              `/tmp`               | Pfad zum Ort wo die jar runtergeladen und gespeichert werden soll |
| `api.build-index`                          | Boolean |              `true`               | Einstellung ob der index erstellt werden soll                     |




# Callanalyse

This repository contains the Callanalyse project. This project was created as part of the Bachlor thesis "Evaluating 
the potential of incremental call graph analysis at ecosystem level".

## Structure

The code in the indesreader package was provided by the [SSE Group](https://github.com/sse-labs).

In the package analyzetool, the code in the folder fromopalmetricsframework comes from the project 
[fachproject-metrics-framework](https://github.com/sse-labs/fachproject-metrics-framework).


## Requirements

The program requires JVM 17 and a Postgresql database.
The computer should have at least 16GB Ram.

## Settings

| Property                                   | Values  |           Default Value           | Description                                                      |
|:-------------------------------------------|:--------|:---------------------------------:|:-----------------------------------------------------------------|
| `spring.datasource.username`               | Strings |            `username`             | Username Postgresql                                              |
| `spring.datasource.password`               | Strings |            `password`             | Password for connecting to Postgresql                            |
| `spring.datasource.url`                    | URL     |          `URL postgres`           | Url to Postgresql Database                                       |
| `api.indexurl`                             | URL     | `https://repo1.maven.org/maven2/` | URL to the Jar repository                                        |
| `api.download-ordner-path`                 | Path    |              `/tmp`               | Path to the location where the jar is to be downloaded and saved |
| `api.build-index`                          | Boolean |              `true`               | Setting whether the index should be created                      |