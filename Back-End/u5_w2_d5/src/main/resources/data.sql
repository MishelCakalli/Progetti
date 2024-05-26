INSERT INTO dipendente (username, nome, cognome, email, immagine_profilo) VALUES
('jdoe', 'John', 'Doe', 'jdoe@example.com', NULL),
('asmith', 'Anna', 'Smith', 'asmith@example.com', NULL),
('mjohnson', 'Michael', 'Johnson', 'mjohnson@example.com', NULL);

-- Inserimento di dispositivi di esempio
INSERT INTO dispositivo (tipo, stato, dipendente_id) VALUES
('Smartphone', 'Disponibile', NULL),
('Laptop', 'Disponibile', NULL),
('Tablet', 'Assegnato', 1),
('Laptop', 'In Manutenzione', NULL),
('Smartphone', 'Dismesso', NULL);