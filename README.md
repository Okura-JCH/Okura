# Okura

Okura は、最新の Android 開発ツールと実践を使用して構築された Kotlin 製の Android アプリケーションです。AndroidX、Material Design 3、Jetpack Compos の力を活用して、シームレスで直感的なユーザーエクスペリエンスを提供します。プロジェクトは Gradle で構成されており、継続的インテグレーションとデリバリーのために GitHub Actions を利用しています。

## 特徴

- **モダンアーキテクチャ:** 関心の分離とメンテナンスの容易さを実現するための MVVM アーキテクチャーを利用。
- **Jetpack Compose:** より少ないコードと強力なツールでネイティブ UI を構築。
- **Material Design 3:** 最新の Material Design ガイドラインに沿ったモダンなルックアンドフィールを確保。
- **AndroidX:** 後方互換性と新機能のための最新の AndroidX ライブラリを利用。
- **Kotlin Coroutines:** よりシンプルなコードと改善されたパフォーマンスでバックグラウンドタスクを管理。

## はじめに

Okura を始めるには、リポジトリーをローカルマシンにクローンしてください：

```bash
git clone https://github.com/yourusername/Okura.git
```


Gradle ビルドと Kotlin コードベースを扱うために、最新バージョンの Android Studio がインストールされていることを確認してください。

## プロジェクトのビルド

プロジェクトを Android Studio で開き、Gradle ファイルと同期させます。同期が完了したら、次のナビゲーションでプロジェクトをビルドできます：

```
Build > Build Bundle(s) / APK(s) > Build APK(s)
```


## テストの実行

アプリケーションのユニットテストを実行するには、次の Gradle コマンドを使用します：

```bash
./gradlew test
```

インストルメントテストを実行するには、エミュレーターが実行中であるか、デバイスが接続されていることを確認し、次を実行します：

```bash
./gradlew connectedAndroidTest
```
