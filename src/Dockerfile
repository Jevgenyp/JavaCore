# Используйте JDK 21 как базовый образ
FROM openjdk:21 AS build

# Установите рабочую директорию в контейнере
WORKDIR /app

# Скопируйте исходный код в контейнер
COPY . .

# Скомпилируйте Java-приложение
RUN javac -d . src/app/Main.java src/logic/NoteManager.java src/utils/FileWriter.java

# Установите базовый образ для выполнения приложения
FROM openjdk:21

# Установите рабочую директорию в контейнере
WORKDIR /app

# Скопируйте скомпилированные классы из стадии сборки
COPY --from=build /app .

# Запустите Java-приложение
CMD ["java", "app.Main"]
