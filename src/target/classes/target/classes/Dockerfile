
FROM openjdk:21 AS build

WORKDIR /app


COPY . .

RUN javac -d . src/app/Main.java src/logic/NoteManager.java src/utils/FileWriter.java

FROM openjdk:21

WORKDIR /app

COPY --from=build /app .

CMD ["java", "app.Main"]
