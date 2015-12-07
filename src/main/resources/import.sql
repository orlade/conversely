--
-- Sample dataset for development testing.
--

insert into dictionary(id, name) values (1, 'Sinhala');
insert into dictionary(id, name) values (2, 'German');

-- Sinhala phrases.
insert into phrase(id, text) values (4, 'kohomada');
insert into phrase(id, text) values (5, 'How are you?');

-- Sinhala dictionary.
insert into entry(id, dictionary_id, source_id, target_id) values (3, 1, 4, 5);

