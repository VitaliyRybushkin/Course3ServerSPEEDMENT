CREATE TABLE "student"(
    "id" INTEGER NOT NULL,
    "login" VARCHAR(255) NOT NULL,
    "password" VARCHAR(255) NOT NULL,
    "info" TEXT NOT NULL,
    "fullname" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "student" ADD PRIMARY KEY("id");
CREATE TABLE "task"(
    "id" INTEGER NOT NULL,
    "info" TEXT NOT NULL,
    "answer" TEXT NOT NULL
);
ALTER TABLE
    "task" ADD PRIMARY KEY("id");
CREATE TABLE "variant"(
    "id" INTEGER NOT NULL,
    "info" TEXT NOT NULL
);
ALTER TABLE
    "variant" ADD PRIMARY KEY("id");
CREATE TABLE "task_array"(
    "id" INTEGER NOT NULL,
    "variant_id" INTEGER NOT NULL,
    "task_id" INTEGER NOT NULL
);
ALTER TABLE
    "task_array" ADD PRIMARY KEY("id");
ALTER TABLE
    "task_array" ADD CONSTRAINT "task_array_variant_id_foreign" FOREIGN KEY("variant_id") REFERENCES "variant"("id");
ALTER TABLE
    "task_array" ADD CONSTRAINT "task_array_task_id_foreign" FOREIGN KEY("task_id") REFERENCES "task"("id");