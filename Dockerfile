FROM eclipse-temurin:17-jdk

ENV DEBIAN_FRONTEND=noninteractive

# Instala dependências + Firefox
RUN apt-get update && \
    apt-get install -y \
        wget \
        curl \
        unzip \
        firefox \
        libgtk-3-0 \
        libdbus-glib-1-2 \
        libasound2t64 \
        libx11-xcb1 \
        libxtst6 \
        libnss3 \
        libxss1 \
        libgl1 \
        libxrandr2 \
        libgbm1 \
        fonts-liberation \
        libu2f-udev \
        xdg-utils \
        --no-install-recommends && \
    rm -rf /var/lib/apt/lists/*


# Instalar GeckoDriver
ENV GECKO_VERSION=v0.36.0

RUN wget -q "https://github.com/mozilla/geckodriver/releases/download/${GECKO_VERSION}/geckodriver-${GECKO_VERSION}-linux64.tar.gz" -O geckodriver.tar.gz && \
    tar -xzf geckodriver.tar.gz -C /usr/local/bin && \
    chmod +x /usr/local/bin/geckodriver && \
    rm geckodriver.tar.gz


WORKDIR /app

COPY target/ogamex-accounts-criator-ms.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]
