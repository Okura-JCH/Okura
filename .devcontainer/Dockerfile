FROM mcr.microsoft.com/devcontainers/java:1-21-bullseye

ENV DEBCONF_NOWARNINGS yes

WORKDIR /opt

RUN apt-get update --quiet --yes \
    && apt-get autoremove --quiet --yes \
    && apt-get install --quiet --yes --no-install-recommends wget=1.21-1+deb11u1 \
    && apt-get install --quiet --yes --no-install-recommends unzip=6.0-26+deb11u1 \
    && rm -rf /var/lib/apt/lists/* && \
    wget --quiet --output-document=android-sdk.zip https://dl.google.com/android/repository/commandlinetools-linux-11076708_latest.zip && \
    unzip -q -d android-sdk-linux android-sdk.zip && \
    rm -rf android-sdk.zip

ENV ANDROID_SDK_ROOT /android-sdk-linux/cmdline-tools
ENV PATH $PATH:$ANDROID_SDK_ROOT/bin:$GRADLE_HOME/bin
ENV PATH $JAVA_HOME/bin:$PATH

COPY ./android-sdk-licenses $ANDROID_SDK_ROOT/licenses/

RUN chmod -R 777 $ANDROID_SDK_ROOT
