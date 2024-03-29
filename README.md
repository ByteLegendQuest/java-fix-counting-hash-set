# [ByteLegend](https://bytelegend.com) Challenge of JavaIsland: OOP, Inheritance

<details open='true'>
<summary>English</summary>

## Fix the Bug in `CountingHashSet` Implementation

> Credit: This example is from the book _Effective Java_ **Item 16: Favour composition over inheritance** by Joshua Bloch.

We want to build a `HashSet`, which can count the number of elements added since the creation of the instance,
but the current implementation [src/main/java/com/bytelegend/CountingHashSet.java](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/src/main/java/com/bytelegend/CountingHashSet.java) has a bug, please understand and fix it.

`CountingHashSet` is a `HashSet` with all the features of `HashSet` plus the ability to count the number of elements added since the creation of the instance.


- You can accomplish this challenge via any way below:
  - Recommended for beginners: run `git clone https://github.com/ByteLegendQuest/java-fix-counting-hash-set` to download the code,
    finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
    - If you don't know how, you can click [import project into IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import.md)/[import project into VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import-vscode.md).
    - Before submitting your code, you'd better run `mvn verify` locally to save time. Don't know how? See [verify locally in IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-idea.md)/[verify locally in VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-vscode.md).
  - Very unrecommended: you can [click here to download zipped code](https://codeload.github.com/ByteLegendQuest/java-fix-counting-hash-set/zip/refs/heads/main) if you don't like `git` operations.
  - Or: if you are confident enough to write code in web editor directly, go ahead.
  - Or: if you are familiar with GitHub, you can fork [the repo](https://github.com/ByteLegendQuest/java-fix-counting-hash-set), finish the challenge and create a pull request.
- The bot will check your PR and tell you if you accomplish the challenge.
- Go back to [ByteLegend](https://bytelegend.com) and continue your hero journey.

Good luck!

If you need any help, feel free to join the [Discord Community](https://discord.gg/35RreUUGWt) or contact us via [contact@bytelegend.com](mailto:contact@bytelegend.com).

**Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:**

- `src/main/java/com/bytelegend/CountingHashSet.java`

</details>

<details>
<summary>简体中文</summary>

## 修复`CountingHashSet`实现中的Bug

> 鸣谢：这个例子来源于《Effective Java》的<ruby>组合优于继承<rt>Favour composition over inheritance</rt></ruby>一节，作者是Joshua Bloch。

我们希望创建一个`HashSet`，能够统计"有史以来"添加的元素数量，但是现在的实现[src/main/java/com/bytelegend/CountingHashSet.java](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/src/main/java/com/bytelegend/CountingHashSet.java)有明显的Bug，请思考并修复之。

`CountingHashSet`拥有`HashSet`的全部功能，此外，它还可以统计"有史以来"添加过的元素的个数。


- 你可以使用以下任意一种方法完成挑战：
  - 初学者推荐：运行`git clone https://git.bytelegend.com/ByteLegendQuest/java-fix-counting-hash-set`将代码下载到本地，在本地使用IDE调试完成后复制到网页编辑器里提交。
    - 如果你不知道怎么做，可以点击[导入IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/zh_hans/clone-and-import.md)/[导入VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/zh_hans/clone-and-import-vscode.md)。
    - 在提交之前，你最好先在本地运行`mvn verify`验证一下答案，以节约时间。不知道如何做？请查看[在IDEA中本地验证](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/zh_hans/run-mvn-verify-idea.md)/[在VSCode中本地验证](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/zh_hans/run-mvn-verify-vscode.md)。
  - 非常不推荐：如果你实在不喜欢`git`命令行操作，你可以[点击这里直接下载打包好的代码](https://ghcodeload.bytelegend.com/ByteLegendQuest/java-fix-counting-hash-set/zip/refs/heads/main)。
  - 或者：如果你非常自信不需要下载代码到本地调试，可以使用网页编辑器直接提交。
  - 或者：如果你对GitHub非常熟悉，你可以fork[这个仓库](https://github.com/ByteLegendQuest/java-fix-counting-hash-set)、完成挑战后，创建一个Pull Request。
- 机器人将会检查你的答案，告诉你你是否通过了挑战。
- 回到[字节传说](https://bytelegend.com)，然后继续你的英雄旅程。

祝你好运！

如果你需要任何帮助，欢迎加入官方玩家QQ群（在[首页](https://bytelegend.com)右下角的`联系 & 关于`菜单里可以找到入群方式）或者[Discord社区](https://discord.gg/PvmqK3hF)，或email至[contact@bytelegend.com](mailto:contact@bytelegend.com)。

**注意：我们只允许您修改以下文件，任何对其他文件的修改都会被拒绝：**

- `src/main/java/com/bytelegend/CountingHashSet.java`

</details>

<details>
<summary>繁體中文</summary>

修復`CountingHashSet`實現中的Bug
--------------------------

> 來源：這個例子來自 Joshua Bloch 所著的《 _Effective Java_ **Item 16: Favor composition over inheritance** 》一書。

我們想構建一個`HashSet` ，它可以統計自創建實例以來添加的元素數量，但是當前實現[src/main/java/com/bytelegend/CountingHashSet.java](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/src/main/java/com/bytelegend/CountingHashSet.java)有一個bug，請理解並修復。

`CountingHashSet`是一個`HashSet` ，它具有`HashSet`的所有特性，以及計算自創建實例以來添加的元素數量的能力。

-   您可以通過以下任何方式完成此挑戰：
    -   推薦給初學者：運行`git clone https://github.com/ByteLegendQuest/java-fix-counting-hash-set`下載代碼，在本地 IDE 中完成挑戰，然後在網頁編輯器中復制/粘貼/提交答案.
        -   如果你不知道怎麼做，你可以點擊[import project into IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import-vscode.md) 。
        -   在提交代碼之前，您最好在本地運行`mvn verify`以節省時間。不知道怎麼樣？請參閱[在 IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-idea.md) [中進行本地驗證/在 VSCode 中進行本地驗證](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-vscode.md)。
    -   非常不推薦：如果你不喜歡`git`操作，可以[點擊這裡下載壓縮代碼](https://codeload.github.com/ByteLegendQuest/java-fix-counting-hash-set/zip/refs/heads/main)。
    -   或者：如果您有足夠的信心直接在 Web 編輯器中編寫代碼，請繼續。
    -   或者：如果你熟悉 GitHub，你可以 fork[倉庫](https://github.com/ByteLegendQuest/java-fix-counting-hash-set)，完成挑戰並創建一個拉取請求。
-   機器人會檢查你的 PR 並告訴你是否完成了挑戰。
-   回到[ByteLegend](https://bytelegend.com)繼續你的英雄之旅。

祝你好運！

如果您需要任何幫助，請隨時加入[Discord 社區](https://discord.gg/35RreUUGWt)或通過[contact@bytelegend.com](mailto:contact@bytelegend.com)聯繫我們。

**注意：我們只允許您修改以下文件。對以下文件以外的文件的任何更改都將被拒絕：**

-   `src/main/java/com/bytelegend/CountingHashSet.java`
</details>

<details>
<summary>Español</summary>

Solucione el error en la implementación de `CountingHashSet`
------------------------------------------------------------

> Crédito: Este ejemplo es del libro Elemento 16 de _Java eficaz_ **: Favorecer la composición sobre la herencia** de Joshua Bloch.

Queremos construir un `HashSet` , que pueda contar la cantidad de elementos agregados desde la creación de la instancia, pero la implementación actual [src/main/java/com/bytelegend/CountingHashSet.java](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/src/main/java/com/bytelegend/CountingHashSet.java) tiene un error, entiéndalo y corríjalo.

`CountingHashSet` es un `HashSet` con todas las funciones de `HashSet` más la capacidad de contar la cantidad de elementos agregados desde la creación de la instancia.

-   Puede lograr este desafío de cualquier manera a continuación:
    -   Recomendado para principiantes: ejecute `git clone https://github.com/ByteLegendQuest/java-fix-counting-hash-set` para descargar el código, finalice el desafío en su IDE local, luego copie/pegue/envíe la respuesta en el editor web .
        -   Si no sabe cómo hacerlo, puede hacer clic en [importar proyecto a IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import.md) / [importar proyecto a VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Antes de enviar su código, es mejor que ejecute `mvn verify` localmente para ahorrar tiempo. ¿No sabes cómo? Ver [verificar localmente en IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-idea.md) / [verificar localmente en VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Muy poco recomendado: puede [hacer clic aquí para descargar el código comprimido](https://codeload.github.com/ByteLegendQuest/java-fix-counting-hash-set/zip/refs/heads/main) si no le gustan las operaciones de `git` .
    -   O: si tiene la confianza suficiente para escribir código en el editor web directamente, adelante.
    -   O: si está familiarizado con GitHub, puede bifurcar [el repositorio](https://github.com/ByteLegendQuest/java-fix-counting-hash-set) , finalizar el desafío y crear una solicitud de extracción.
-   El bot verificará tu PR y te dirá si logras el desafío.
-   Regrese a [ByteLegend](https://bytelegend.com) y continúe su viaje de héroe.

¡Buena suerte!

Si necesita ayuda, no dude en unirse a la [comunidad de Discord](https://discord.gg/35RreUUGWt) o contáctenos a través de [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: solo le permitimos modificar los siguientes archivos. Cualquier cambio en los archivos que no sean los siguientes archivos será rechazado:**

-   `src/main/java/com/bytelegend/CountingHashSet.java`
</details>

<details>
<summary>العربية</summary>

إصلاح الخلل في تنفيذ `CountingHashSet`
--------------------------------------

> الائتمان: هذا المثال مأخوذ من كتاب _Java Effective_ **Item 16: التأليف المفضل على الميراث** لـ Joshua Bloch.

نريد إنشاء `HashSet` ، والذي يمكنه حساب عدد العناصر المضافة منذ إنشاء المثيل ، لكن التنفيذ الحالي [src / main / java / com / bytelegend / CountingHashSet.java](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/src/main/java/com/bytelegend/CountingHashSet.java) به خطأ ، يرجى فهمه وإصلاحه.

`CountingHashSet` هو `HashSet` مع جميع ميزات `HashSet` بالإضافة إلى القدرة على حساب عدد العناصر المضافة منذ إنشاء المثيل.

-   يمكنك إنجاز هذا التحدي بأي طريقة أدناه:
    -   موصى به للمبتدئين: قم بتشغيل `git clone https://github.com/ByteLegendQuest/java-fix-counting-hash-set` لتنزيل الكود ، وإنهاء التحدي في IDE المحلي الخاص بك ، ثم نسخ / لصق / إرسال الإجابة في محرر الويب .
        -   إذا كنت لا تعرف كيف يمكنك النقر فوق [استيراد مشروع إلى IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import.md) / [استيراد مشروع إلى VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import-vscode.md) .
        -   قبل إرسال التعليمات البرمجية الخاصة بك ، من الأفضل تشغيل `mvn verify` محليًا لتوفير الوقت. لا أعرف كيف؟ انظر [التحقق محليًا في IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-idea.md) / [تحقق محليًا في VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   غير موصى به على الإطلاق: يمكنك [النقر هنا لتنزيل رمز مضغوط](https://codeload.github.com/ByteLegendQuest/java-fix-counting-hash-set/zip/refs/heads/main) إذا كنت لا تحب عمليات `git` .
    -   أو: إذا كنت واثقًا بدرجة كافية لكتابة التعليمات البرمجية في محرر الويب مباشرةً ، فابدأ.
    -   أو: إذا كنت معتادًا على GitHub ، فيمكنك تفرع [الريبو](https://github.com/ByteLegendQuest/java-fix-counting-hash-set) وإنهاء التحدي وإنشاء طلب سحب.
-   سيتحقق الروبوت من العلاقات العامة الخاصة بك ويخبرك إذا أنجزت التحدي.
-   ارجع إلى [ByteLegend وتابع](https://bytelegend.com) رحلة بطلك.

حظا طيبا وفقك الله!

إذا كنت بحاجة إلى أي مساعدة ، فلا تتردد في الانضمام إلى [مجتمع Discord](https://discord.gg/35RreUUGWt) أو الاتصال بنا عبر [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**ملاحظة: نسمح لك فقط بتعديل الملفات التالية. سيتم رفض أي تغييرات يتم إجراؤها على الملفات بخلاف الملفات التالية:**

-   `src/main/java/com/bytelegend/CountingHashSet.java`
</details>

<details>
<summary>Português</summary>

Corrija o bug na implementação do `CountingHashSet`
---------------------------------------------------

> Crédito: Este exemplo é do livro _Effective Java_ **Item 16: Favor composição sobre herança** por Joshua Bloch.

Queremos construir um `HashSet` , que pode contar o número de elementos adicionados desde a criação da instância, mas a implementação atual [src/main/java/com/bytelegend/CountingHashSet.java](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/src/main/java/com/bytelegend/CountingHashSet.java) tem um bug, por favor entenda e corrija.

`CountingHashSet` é um `HashSet` com todos os recursos do `HashSet` mais a capacidade de contar o número de elementos adicionados desde a criação da instância.

-   Você pode realizar este desafio de qualquer maneira abaixo:
    -   Recomendado para iniciantes: execute `git clone https://github.com/ByteLegendQuest/java-fix-counting-hash-set` para baixar o código, termine o desafio em seu IDE local e copie/cole/envie a resposta no editor da web .
        -   Se você não sabe como, você pode clicar em [import project into IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Antes de enviar seu código, é melhor você executar `mvn verify` localmente para economizar tempo. Não sei como? Consulte [verificar localmente em IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-idea.md) / [verificar localmente em VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Muito não recomendado: você pode [clicar aqui para baixar o código zipado](https://codeload.github.com/ByteLegendQuest/java-fix-counting-hash-set/zip/refs/heads/main) se não gostar das operações do `git` .
    -   Ou: se você estiver confiante o suficiente para escrever código diretamente no editor da web, vá em frente.
    -   Ou: se você estiver familiarizado com o GitHub, você pode bifurcar [o repo](https://github.com/ByteLegendQuest/java-fix-counting-hash-set) , finalizar o desafio e criar um pull request.
-   O bot verificará seu PR e informará se você cumprir o desafio.
-   Volte para [ByteLegend](https://bytelegend.com) e continue sua jornada de herói.

Boa sorte!

Se precisar de ajuda, sinta-se à vontade para se juntar à [Comunidade Discord](https://discord.gg/35RreUUGWt) ou entre em contato conosco via [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: só permitimos que você modifique os seguintes arquivos. Quaisquer alterações em arquivos que não sejam os arquivos a seguir serão rejeitadas:**

-   `src/main/java/com/bytelegend/CountingHashSet.java`
</details>

<details>
<summary>Bahasa Indonesia</summary>

Perbaiki Bug dalam Implementasi `CountingHashSet`
-------------------------------------------------

> Kredit: Contoh ini dari buku _Efektif Java_ **Butir 16: Mendukung komposisi daripada warisan** oleh Joshua Bloch.

Kami ingin membangun `HashSet` , yang dapat menghitung jumlah elemen yang ditambahkan sejak pembuatan instance, tetapi implementasi saat ini [src/main/java/com/bytelegend/CountingHashSet.java](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/src/main/java/com/bytelegend/CountingHashSet.java) memiliki bug, harap dipahami dan diperbaiki.

`CountingHashSet` adalah `HashSet` dengan semua fitur `HashSet` ditambah kemampuan untuk menghitung jumlah elemen yang ditambahkan sejak pembuatan instance.

-   Anda dapat menyelesaikan tantangan ini melalui cara apa pun di bawah ini:
    -   Direkomendasikan untuk pemula: jalankan `git clone https://github.com/ByteLegendQuest/java-fix-counting-hash-set` untuk mengunduh kode, selesaikan tantangan di IDE lokal Anda, lalu salin/tempel/kirim jawabannya di editor web .
        -   Jika Anda tidak tahu caranya, Anda bisa mengklik [import project into IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Sebelum mengirimkan kode Anda, Anda sebaiknya menjalankan `mvn verify` secara lokal untuk menghemat waktu. Tidak tahu bagaimana? Lihat [verifikasi secara lokal di IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-idea.md) / [verifikasi secara lokal di VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Sangat tidak direkomendasikan: Anda dapat [mengklik di sini untuk mengunduh kode zip](https://codeload.github.com/ByteLegendQuest/java-fix-counting-hash-set/zip/refs/heads/main) jika Anda tidak menyukai operasi `git` .
    -   Atau: jika Anda cukup percaya diri untuk menulis kode di editor web secara langsung, silakan.
    -   Atau: jika Anda terbiasa dengan GitHub, Anda dapat melakukan fork [repo](https://github.com/ByteLegendQuest/java-fix-counting-hash-set) , menyelesaikan tantangan, dan membuat permintaan tarik.
-   Bot akan memeriksa PR Anda dan memberi tahu Anda jika Anda menyelesaikan tantangan.
-   Kembali ke [ByteLegend](https://bytelegend.com) dan lanjutkan perjalanan pahlawan Anda.

Semoga berhasil!

Jika Anda memerlukan bantuan, jangan ragu untuk bergabung dengan [Komunitas Discord](https://discord.gg/35RreUUGWt) atau hubungi kami melalui [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Catatan: kami hanya mengizinkan Anda untuk mengubah file berikut. Setiap perubahan pada file selain file berikut akan ditolak:**

-   `src/main/java/com/bytelegend/CountingHashSet.java`
</details>

<details>
<summary>Français</summary>

Correction du bogue dans l'implémentation de `CountingHashSet`
--------------------------------------------------------------

> Crédit : Cet exemple est tiré du livre _Effective Java_ **Item 16 : Favor composition over heritage** par Joshua Bloch.

Nous voulons construire un `HashSet` , qui peut compter le nombre d'éléments ajoutés depuis la création de l'instance, mais l'implémentation actuelle [src/main/java/com/bytelegend/CountingHashSet.java](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/src/main/java/com/bytelegend/CountingHashSet.java) a un bogue, veuillez le comprendre et le corriger.

`CountingHashSet` est un `HashSet` avec toutes les fonctionnalités de `HashSet` plus la possibilité de compter le nombre d'éléments ajoutés depuis la création de l'instance.

-   Vous pouvez accomplir ce défi de n'importe quelle manière ci-dessous:
    -   Recommandé pour les débutants : lancez `git clone https://github.com/ByteLegendQuest/java-fix-counting-hash-set` pour télécharger le code, terminez le défi dans votre IDE local, puis copiez/collez/soumettez la réponse dans l'éditeur Web .
        -   Si vous ne savez pas comment, vous pouvez cliquer sur [importer le projet dans IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import.md) / [importer le projet dans VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Avant de soumettre votre code, vous feriez mieux d'exécuter `mvn verify` localement pour gagner du temps. Vous ne savez pas comment ? Voir [vérifier localement dans IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-idea.md) / [vérifier localement dans VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Très déconseillé : vous pouvez [cliquer ici pour télécharger le code compressé](https://codeload.github.com/ByteLegendQuest/java-fix-counting-hash-set/zip/refs/heads/main) si vous n'aimez pas les opérations `git` .
    -   Ou : si vous êtes suffisamment confiant pour écrire du code directement dans l'éditeur Web, continuez.
    -   Ou : si vous êtes familier avec GitHub, vous pouvez forker [le dépôt](https://github.com/ByteLegendQuest/java-fix-counting-hash-set) , terminer le défi et créer une demande d'extraction.
-   Le bot vérifiera votre PR et vous dira si vous accomplissez le défi.
-   Retournez à [ByteLegend](https://bytelegend.com) et continuez votre voyage de héros.

Bonne chance!

Si vous avez besoin d'aide, n'hésitez pas à rejoindre la [communauté Discord](https://discord.gg/35RreUUGWt) ou à nous contacter via [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Remarque : nous vous autorisons uniquement à modifier les fichiers suivants. Toute modification de fichiers autres que les fichiers suivants sera rejetée :**

-   `src/main/java/com/bytelegend/CountingHashSet.java`
</details>

<details>
<summary>日本語</summary>

`CountingHashSet`実装のバグを修正
-------------------------

> クレジット：この例は、JoshuaBlochによる「 _EffectiveJavaItem_ **16：Favorcompositionoverinheritation** 」という本からのものです。

インスタンスの作成以降に追加された要素の数をカウントできる`HashSet`を構築したいのですが、現在の実装[src / main / java / com / bytelegend / CountingHashSet.java](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/src/main/java/com/bytelegend/CountingHashSet.java)にはバグがあります。理解して、修正してください。

`CountingHashSet`は、 `HashSet`のすべての機能に加えて、インスタンスの作成以降に追加された要素の数をカウントする機能を備えた`HashSet`です。

-   この課題は、以下のいずれかの方法で達成できます。
    -   初心者に推奨： `git clone https://github.com/ByteLegendQuest/java-fix-counting-hash-set`を実行してコードをダウンロードし、ローカルIDEでチャレンジを終了してから、Webエディターで回答をコピー/貼り付け/送信します。
        -   方法がわからない場合は、\[ [プロジェクトをIDEAにインポート](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import.md)\]/\[ [プロジェクトをVSCodeにインポート](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import-vscode.md)\]をクリックできます。
        -   コードを送信する前に、時間を節約するためにローカルで`mvn verify`実行することをお勧めします。方法がわかりませんか？ [IDEAでローカルに](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-idea.md)[検証する/VSCodeでローカルに](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-vscode.md)検証するを参照してください。
    -   非常に推奨されていません`git`操作が気に入らない場合は、 [ここをクリックしてzipコードをダウンロード](https://codeload.github.com/ByteLegendQuest/java-fix-counting-hash-set/zip/refs/heads/main)できます。
    -   または：Webエディターで直接コードを記述できる自信がある場合は、先に進んでください。
    -   または：GitHubに精通している場合は[、リポジトリ](https://github.com/ByteLegendQuest/java-fix-counting-hash-set)をフォークしてチャレンジを終了し、プルリクエストを作成できます。
-   ボットはPRをチェックし、チャレンジを達成したかどうかを通知します。
-   [ByteLegend](https://bytelegend.com)に戻り、ヒーローの旅を続けてください。

幸運を！

ヘルプが必要な場合は、 [Discordコミュニティ](https://discord.gg/35RreUUGWt)に参加するか、contact [@bytelegend.com](mailto:contact@bytelegend.com)からお問い合わせください。

**注：変更できるのは次のファイルのみです。次のファイル以外のファイルへの変更は拒否されます。**

-   `src/main/java/com/bytelegend/CountingHashSet.java`
</details>

<details>
<summary>Русский</summary>

Исправить ошибку в реализации `CountingHashSet`
-----------------------------------------------

> Предоставлено: этот пример взят из книги Джошуа Блоха « _Эффективная Java_ , **пункт 16: предпочтение композиции перед наследованием** ».

Мы хотим создать `HashSet` , который может подсчитывать количество элементов, добавленных с момента создания экземпляра, но в текущей реализации [src/main/java/com/bytelegend/CountingHashSet.java](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/src/main/java/com/bytelegend/CountingHashSet.java) есть ошибка, пожалуйста, поймите и исправьте ее.

`CountingHashSet` — это `HashSet` со всеми функциями `HashSet` , а также возможностью подсчета количества элементов, добавленных с момента создания экземпляра.

-   Вы можете выполнить эту задачу любым способом, указанным ниже:
    -   Рекомендуется для начинающих: запустите `git clone https://github.com/ByteLegendQuest/java-fix-counting-hash-set` , чтобы загрузить код, завершите задание в локальной среде IDE, затем скопируйте/вставьте/отправьте ответ в веб-редакторе. .
        -   Если вы не знаете как, вы можете нажать [импортировать проект в IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import.md) / [импортировать проект в VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Перед отправкой кода вам лучше запустить `mvn verify` локально, чтобы сэкономить время. Не знаете как? См. « [Проверить локально в IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-idea.md) / [проверить локально в VSCode»](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Крайне не рекомендуется: вы можете [нажать здесь, чтобы загрузить заархивированный код](https://codeload.github.com/ByteLegendQuest/java-fix-counting-hash-set/zip/refs/heads/main) , если вам не нравятся операции `git` .
    -   Или: если вы достаточно уверены, чтобы писать код напрямую в веб-редакторе, вперед.
    -   Или: если вы знакомы с GitHub, вы можете разветвить [репозиторий](https://github.com/ByteLegendQuest/java-fix-counting-hash-set) , выполнить задание и создать запрос на включение.
-   Бот проверит ваш PR и сообщит, выполнили ли вы задание.
-   Вернитесь в [ByteLegend](https://bytelegend.com) и продолжайте свое героическое путешествие.

Удачи!

Если вам нужна помощь, присоединяйтесь к [сообществу Discord](https://discord.gg/35RreUUGWt) или свяжитесь с нами по [адресу contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Примечание: мы разрешаем вам изменять только следующие файлы. Любые изменения в файлах, кроме следующих файлов, будут отклонены:**

-   `src/main/java/com/bytelegend/CountingHashSet.java`
</details>

<details>
<summary>Deutsch</summary>

Beheben Sie den Fehler in der `CountingHashSet` Implementierung
---------------------------------------------------------------

> Quelle: Dieses Beispiel stammt aus dem Buch „ _Effective Java_ **Item 16: Favor Composition Over Inheritance** “ von Joshua Bloch.

Wir möchten ein `HashSet` , das die Anzahl der seit der Erstellung der Instanz hinzugefügten Elemente zählen kann, aber die aktuelle Implementierung [src/main/java/com/bytelegend/CountingHashSet.java](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/src/main/java/com/bytelegend/CountingHashSet.java) hat einen Fehler, bitte verstehen und beheben Sie ihn.

`CountingHashSet` ist ein `HashSet` mit allen Funktionen von `HashSet` plus der Möglichkeit, die Anzahl der Elemente zu zählen, die seit der Erstellung der Instanz hinzugefügt wurden.

-   Sie können diese Herausforderung auf eine der folgenden Arten meistern:
    -   Empfohlen für Anfänger: Führen Sie `git clone https://github.com/ByteLegendQuest/java-fix-counting-hash-set` aus, um den Code herunterzuladen, beenden Sie die Herausforderung in Ihrer lokalen IDE und kopieren/fügen Sie dann die Antwort im Web-Editor ein/übermitteln Sie sie .
        -   Wenn Sie nicht wissen wie, können Sie auf [Projekt in IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import.md) [importieren / Projekt in VSCode importieren klicken](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Bevor Sie Ihren Code einreichen, sollten Sie `mvn verify` besser lokal ausführen, um Zeit zu sparen. Sie wissen nicht wie? Siehe [Lokal verifizieren in IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-idea.md) / [Lokal verifizieren in VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Sehr nicht zu empfehlen: Sie können [hier klicken, um den gezippten Code herunterzuladen,](https://codeload.github.com/ByteLegendQuest/java-fix-counting-hash-set/zip/refs/heads/main) wenn Sie `git` -Operationen nicht mögen.
    -   Oder: Wenn Sie sicher genug sind, Code direkt im Web-Editor zu schreiben, fahren Sie fort.
    -   Oder: Wenn Sie sich mit GitHub auskennen, können Sie [das Repo forken](https://github.com/ByteLegendQuest/java-fix-counting-hash-set) , die Challenge beenden und einen Pull-Request erstellen.
-   Der Bot überprüft Ihre PR und teilt Ihnen mit, ob Sie die Herausforderung meistern.
-   Gehen Sie zurück zu [ByteLegend](https://bytelegend.com) und setzen Sie Ihre Heldenreise fort.

Viel Glück!

Wenn Sie Hilfe benötigen, können Sie sich gerne der [Discord Community](https://discord.gg/35RreUUGWt) anschließen oder uns über [contact@bytelegend.com kontaktieren](mailto:contact@bytelegend.com) .

**Hinweis: Wir erlauben Ihnen nur, die folgenden Dateien zu ändern. Alle Änderungen an anderen Dateien als den folgenden Dateien werden abgelehnt:**

-   `src/main/java/com/bytelegend/CountingHashSet.java`
</details>

<details>
<summary>한국어</summary>

`CountingHashSet` 구현의 버그 수정
---------------------------

> 출처: 이 예는 Joshua Bloch의 책 _Effective Java_ **Item 16: Favor composition over 상속** 에서 발췌한 것입니다.

인스턴스 생성 이후 추가된 요소의 수를 셀 수 있는 `HashSet` 을 만들고 싶지만 현재 구현된 [src/main/java/com/bytelegend/CountingHashSet.java](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/src/main/java/com/bytelegend/CountingHashSet.java) 에는 버그가 있으므로 이해하고 수정하십시오.

`CountingHashSet` 은 `HashSet` 의 모든 기능과 인스턴스 생성 이후 추가된 요소 수를 계산하는 기능을 갖춘 `HashSet` 입니다.

-   아래 방법을 통해 이 챌린지를 완료할 수 있습니다.
    -   초보자에게 권장: `git clone https://github.com/ByteLegendQuest/java-fix-counting-hash-set` 을 실행하여 코드를 다운로드하고 로컬 IDE에서 챌린지를 완료한 다음 웹 편집기에서 답변을 복사/붙여넣기/제출합니다. .
        -   방법을 모르는 경우 [프로젝트를 IDEA로](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import.md) [가져오기 / 프로젝트를 VSCode로 가져](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import-vscode.md) 오기를 클릭할 수 있습니다.
        -   코드를 제출하기 전에 시간을 절약하기 위해 로컬에서 `mvn verify` 를 실행하는 것이 좋습니다. 방법을 모르십니까? [IDEA에서 로컬로](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-idea.md) [확인/VSCode에서 로컬로](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-vscode.md) 확인을 참조하세요.
    -   매우 권장하지 않음: `git` 작업이 마음에 들지 않으면 [여기를 클릭하여 압축 코드를 다운로드](https://codeload.github.com/ByteLegendQuest/java-fix-counting-hash-set/zip/refs/heads/main) 할 수 있습니다.
    -   또는 웹 편집기에서 직접 코드를 작성할 만큼 자신이 있다면 계속 진행하십시오.
    -   또는 GitHub에 익숙하다면 리포지토리를 분기 [하고](https://github.com/ByteLegendQuest/java-fix-counting-hash-set) 챌린지를 완료하고 풀 요청을 생성할 수 있습니다.
-   봇은 PR을 확인하고 도전 과제를 달성했는지 알려줍니다.
-   [ByteLegend](https://bytelegend.com) 로 돌아가 영웅 여정을 계속하세요.

행운을 빕니다!

도움이 필요하면 언제든지 [Discord 커뮤니티](https://discord.gg/35RreUUGWt) 에 가입하거나 [contact@bytelegend.com](mailto:contact@bytelegend.com) 을 통해 문의하세요.

**참고: 다음 파일만 수정할 수 있습니다. 다음 파일 이외의 파일에 대한 변경 사항은 거부됩니다.**

-   `src/main/java/com/bytelegend/CountingHashSet.java`
</details>

<details>
<summary>Italiano</summary>

Risolto il bug nell'implementazione di `CountingHashSet`
--------------------------------------------------------

> Credito: questo esempio è tratto dal libro _Efficace Java_ **Item 16: Favor composition over heritance** di Joshua Bloch.

Vogliamo creare un `HashSet` , che può contare il numero di elementi aggiunti dalla creazione dell'istanza, ma l'attuale implementazione [src/main/java/com/bytelegend/CountingHashSet.java](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/src/main/java/com/bytelegend/CountingHashSet.java) ha un bug, per favore comprendilo e correggilo.

`CountingHashSet` è un `HashSet` con tutte le funzionalità di `HashSet` più la possibilità di contare il numero di elementi aggiunti dalla creazione dell'istanza.

-   Puoi portare a termine questa sfida in qualsiasi modo di seguito:
    -   Consigliato per i principianti: esegui `git clone https://github.com/ByteLegendQuest/java-fix-counting-hash-set` per scaricare il codice, completa la sfida nel tuo IDE locale, quindi copia/incolla/invia la risposta nell'editor web .
        -   Se non sai come fare, puoi fare clic su [importa progetto in IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import.md) / [importa progetto in VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Prima di inviare il codice, è meglio eseguire `mvn verify` in locale per risparmiare tempo. Non sai come? Vedere [verifica in locale in IDEA](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-idea.md) / [verifica in locale in VSCode](https://github.com/ByteLegendQuest/java-fix-counting-hash-set/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Molto sconsigliato: puoi fare [clic qui per scaricare il codice zippato](https://codeload.github.com/ByteLegendQuest/java-fix-counting-hash-set/zip/refs/heads/main) se non ti piacciono le operazioni `git` .
    -   Oppure: se sei abbastanza sicuro da scrivere il codice direttamente nell'editor web, vai avanti.
    -   Oppure: se hai familiarità con GitHub, puoi eseguire il fork [del repository](https://github.com/ByteLegendQuest/java-fix-counting-hash-set) , completare la sfida e creare una richiesta pull.
-   Il bot controllerà il tuo PR e ti dirà se hai superato la sfida.
-   Torna a [ByteLegend](https://bytelegend.com) e continua il tuo viaggio da eroe.

In bocca al lupo!

Se hai bisogno di aiuto, non esitare a unirti alla [community di Discord](https://discord.gg/35RreUUGWt) o contattaci tramite [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: ti permettiamo solo di modificare i seguenti file. Eventuali modifiche ai file diversi dai seguenti file verranno rifiutate:**

-   `src/main/java/com/bytelegend/CountingHashSet.java`
</details>
