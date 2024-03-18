créateur:LIU xiaoman
binôme: DING zichen




Q1.
Création de tables : pour chaque classe déclarée comme @Entity, une table correspondante est créée dans la base de données. 
Par exemple, la classe ClassTestJPA peut correspondre à la table class_testjpa.

Génération de colonnes : chaque propriété de la classe devient une colonne dans la table. 
Dans la table class_testjpa, nous pouvons voir des colonnes telles que my_id_test, jpa_seed, power_type, saved_at, etc. qui correspondent aux attributs de la classe ClassTestJPA.

Mappage de la clé primaire : si des propriétés de la classe sont étiquetées avec @Id, 
elles seront utilisées comme clé primaire de la table dans la base de données. 
Par exemple, la colonne my_id_test est une telle colonne de clé primaire.



