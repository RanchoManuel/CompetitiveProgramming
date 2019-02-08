CREATE TABLE chapter (
    id INTEGER PRIMARY KEY,
    text VARCHAR(300) NOT NULL
);

CREATE TABLE subchapter (
    id INTEGER PRIMARY KEY,
    chapter INTEGER,
    text VARCHAR(300) NOT NULL,
    FOREIGN KEY (chapter) REFERENCES chapter (id)
);

CREATE TABLE topic (
    id INTEGER PRIMARY KEY,
    subchapter INTEGER,
    text VARCHAR(300) NOT NULL,
    FOREIGN KEY (subchapter) REFERENCES subchapter (id)
);

CREATE TABLE exercise (
    id INTEGER PRIMARY KEY,
    chapter INTEGER,
    subchapter INTEGER,
    topic INTEGER,
    text VARCHAR(300) NOT NULL,
    FOREIGN KEY (chapter) REFERENCES chapter (id),
    FOREIGN KEY (subchapter) REFERENCES subchapter (id),
    FOREIGN KEY (topic) REFERENCES topic (id)
);
