CREATE TABLE Refuge(
   id INT AUTO_INCREMENT,
   nom VARCHAR(100) NOT NULL,
   localisation VARCHAR(50),
   numeroEtRue VARCHAR(150),
   complementAd VARCHAR(150),
   CP VARCHAR(5),
   ville VARCHAR(50),
   tel VARCHAR(10),
   description TEXT,
   PRIMARY KEY(id)
);

CREATE TABLE Adoptant(
   id INT,
   nom VARCHAR(50) NOT NULL,
   prenom VARCHAR(50) NOT NULL,
   dateNaiss DATE NOT NULL,
   numeroEtRue VARCHAR(50),
   complementAd VARCHAR(100) NOT NULL,
   CP VARCHAR(5) NOT NULL,
   Ville VARCHAR(50) NOT NULL,
   mail VARCHAR(50) NOT NULL,
   telMobile VARCHAR(10) NOT NULL,
   telFixe VARCHAR(10) NOT NULL,
   InfoComplementaires TEXT NOT NULL,
   PRIMARY KEY(id)
);

CREATE TABLE Espece(
   id INT AUTO_INCREMENT,
   libelle VARCHAR(50) NOT NULL,
   frais DECIMAL(19,4),
   PRIMARY KEY(id)
);

CREATE TABLE Caracteristique(
   id VARCHAR(50),
   libelle VARCHAR(50),
   PRIMARY KEY(id)
);

CREATE TABLE Race(
   Id INT AUTO_INCREMENT,
   Libelle VARCHAR(50),
   descriptif TEXT,
   prerequis VARCHAR(50),
   IdEspece INT NOT NULL,
   PRIMARY KEY(Id),
   FOREIGN KEY(IdEspece) REFERENCES Espece(id)
);

CREATE TABLE ElementComp(
   id INT AUTO_INCREMENT,
   libelle VARCHAR(50),
   PRIMARY KEY(id)
);

CREATE TABLE jourSemaine(
   id INT AUTO_INCREMENT,
   libelle VARCHAR(12),
   PRIMARY KEY(id)
);

CREATE TABLE Plage(
   id INT AUTO_INCREMENT,
   libelle VARCHAR(10),
   PRIMARY KEY(id)
);

CREATE TABLE Animal(
   id INT AUTO_INCREMENT,
   dNaissance DATE,
   sexe VARCHAR(50),
   nom VARCHAR(50),
   description VARCHAR(500),
   couleur VARCHAR(50),
   sos BOOLEAN,
   adopte BOOLEAN,
   frais DECIMAL(19,4),
   IdRace INT NOT NULL,
   idEspece INT NOT NULL,
   idRefuge INT NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(IdRace) REFERENCES Race(Id),
   FOREIGN KEY(idEspece) REFERENCES Espece(id),
   FOREIGN KEY(idRefuge) REFERENCES Refuge(id)
);

CREATE TABLE Adoption(
   id INT AUTO_INCREMENT,
   dateAdoption DATE,
   participation DECIMAL(19,4),
   idAnimal INT NOT NULL,
   idAdoptant INT NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(idAnimal) REFERENCES Animal(id),
   FOREIGN KEY(idAdoptant) REFERENCES Adoptant(id)
);

CREATE TABLE CaracteristiqueEspece(
   idEspece INT,
   idCaracteristique VARCHAR(50),
   PRIMARY KEY(idEspece, idCaracteristique),
   FOREIGN KEY(idEspece) REFERENCES Espece(id),
   FOREIGN KEY(idCaracteristique) REFERENCES Caracteristique(id)
);

CREATE TABLE Incompatible(
   idAnimal INT,
   idElement INT,
   PRIMARY KEY(idAnimal, idElement),
   FOREIGN KEY(idAnimal) REFERENCES Animal(id),
   FOREIGN KEY(idElement) REFERENCES ElementComp(id)
);

CREATE TABLE Horaire(
   idRefuge INT,
   idJour INT,
   idPlage INT,
   hDebut TIME,
   hFin TIME,
   PRIMARY KEY(idRefuge, idJour, idPlage),
   FOREIGN KEY(idRefuge) REFERENCES Refuge(id),
   FOREIGN KEY(idJour) REFERENCES jourSemaine(id),
   FOREIGN KEY(idPlage) REFERENCES Plage(id)
);

CREATE TABLE caracteristiqueRace(
   idCaracteristique VARCHAR(50),
   idRace INT,
   valeur VARCHAR(50),
   PRIMARY KEY(idCaracteristique, idRace),
   FOREIGN KEY(idCaracteristique) REFERENCES Caracteristique(id),
   FOREIGN KEY(idRace) REFERENCES Race(Id)
);