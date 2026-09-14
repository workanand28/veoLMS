CREATE TABLE courses (
                         id BIGSERIAL PRIMARY KEY,
                         title VARCHAR(255) NOT NULL,
                         description TEXT,
                         price NUMERIC(10, 2) NOT NULL DEFAULT 0,
                         creator_id BIGINT NOT NULL,
                         created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

                         CONSTRAINT fk_course_creator
                             FOREIGN KEY (creator_id)
                                 REFERENCES users(id)
);