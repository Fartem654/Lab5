 <p><strong>Автор</strong>: Фадеев Артём ИТ-12<br>
   <strong>Вариант</strong>: 1<br>
 </p>

<hr>

<h2>Оглавление</h2>
<ul>
 <li>
  <a href="#алгоритм">Описание и решение заданий</a>
  <ul>
   <li>
    <a href="#задание11">Задание 1.1</a>
   </li>
     <li>
    <a href="#задание21">Задание 2.1</a>
   </li>
   <li>
    <a href="#задание33">Задание 3.3</a>
   </li>
   <li>
    <a href="#задание43">Задание 4.3</a>
   </li>
   <li>
    <a href="#задание57">Задание 5.7</a>
   </li>
    <li>
    <a href="#задание62">Задание 6.2</a>
   </li>
    <li>
    <a href="#задание71">Задание 7.1</a>
   </li>
    <li>
    <a href="#задание72">Задание 7.2</a>
   </li>
  </ul>
 </li>
 <li><a href="#структура-проекта">Структура проекта</a></li>
 <li><a href="#как-запустить">Как запустить</a></li>
</ul>

 <h2 id="алгоритм">Алгоритмы выполнения</h2>

<h3 id="задание11">Задание 1.1</h3>
<p><strong>Текст задачи:</strong><br></p>
    <p>В класс <code>Дробь</code> добавить интерфейс на два метода:</p> 
    <ul>
      <li>получение вещественного значения,</li>
      <li>установка числителя и установка знаменателя.</li>
    </ul>
    Сгенерировать такую версию дроби, которая будет <strong>кэшировать вычисление вещественного значения</strong>.<br>
    Если ранее в вашем варианте не было <code>Дроби</code>, то создайте сущность <code>Дробь</code> со следующими особенностями:
    <ul>
      <li>Имеет <strong>числитель</strong>: целое число;</li>
      <li>Имеет <strong>знаменатель</strong>: целое число;</li>
      <li>Дробь может быть создана с указанием числителя и знаменателя;</li>
      <li>Может вернуть строковое представление вида <code>“числитель/знаменатель”</code>;</li>
      <li>Необходимо корректно обрабатывать отрицательные значения. Учтите, что <strong>знаменатель не может быть отрицательным</strong>;</li>
      <li>Переопределите метод сравнения объектов по состоянию таким образом, чтобы две дроби считались одинаковыми тогда, когда у них одинаковые значения числителя и знаменателя.</li>
    </ul>

<p><strong>Описание выполнения задания:</strong><br>
 <ul> 
  <li><code></code></li>
</ul>

<h4>Тесты</h4>
<hr>

<h3 id="задание21">Задание 2.1</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>
  Необходимо воспользоваться классом <code>Кот</code> и методом, принимающим всех мяукающих из задачи 2.5.4.<br>
    Необходимо таким образом передать кота в указанный метод, чтобы после окончания его работы узнать, <strong>сколько раз мяукал кот</strong> за время его работы.<br>
    <em>Кота изменять нельзя.</em><br>
    Если ранее в вашем варианте не было <code>Кота</code>, то создайте сущность <code>Кот</code>, которая описывается следующим образом:
    <ul>
      <li>Имеет <strong>Имя</strong> (строка);</li>
      <li>Для создания необходимо указать имя кота;</li>
      <li>Может быть приведён к текстовой форме вида: <code>“кот: Имя”</code>;</li>
      <li>Может помяукать, что приводит к выводу на экран следующего текста: <code>“Имя: мяу!”</code>, вызвать мяуканье можно без параметров.</li>
    </ul>
  </li>
  <li>
    <strong>Интерфейс <code>Мяуканье</code></strong>:<br>
    Разработайте метод, который принимает набор объектов, способных мяукать, и вызывает мяуканье у каждого объекта.<br>
    Мяукающие объекты должны иметь метод со следующей сигнатурой:<br>
    <code>public void meow();</code>
</p>

<p><strong>Описание выполнения задания:</strong><br>
 <ul> 
  <li><code></code></li>
</ul>

<h4>Тесты</h4>
<hr>

<h3 id="задание33">Задание 3.3</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>
  Составить программу, которая <strong>вставляет элементы списка L2 в список L1, не нарушая его упорядоченности</strong>.
</p>

<p><strong>Описание выполнения задания:</strong><br>
 <ul> 
  <li><code></code></li>
</ul>

<h4>Тесты</h4>
<hr>

<h3 id="задание43">Задание 4.3</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>
  На вход программы подаются сведения о результатах соревнований по школьному многоборью.<br>
  Многоборье состоит из соревнований по <strong>четырём видам спорта</strong>, участие в каждом из которых оценивается баллами от <code>0</code> до <code>10</code> (<code>0</code> баллов получает ученик, не принимавший участия в соревнованиях по данному виду спорта). Победители определяются по <strong>наибольшей сумме набранных баллов</strong>. Известно, что общее количество участников соревнований не превосходит <code>100</code>.
</p>
<p>
  В первой строке вводится количество учеников, принимавших участие в соревнованиях, <code>N</code>. Далее следуют <code>N</code> строк, имеющих следующий формат:<br>
  <code><Фамилия> <Имя> <Баллы></code><br>
  Здесь <code><Фамилия></code> — строка, состоящая не более чем из <code>20</code> символов;<br>
  <code><Имя></code> — строка, состоящая не более чем из <code>15</code> символов;<br>
  <code><Баллы></code> — строка, содержащая <strong>четыре целых числа</strong>, разделённых пробелом, соответствующих баллам, полученным на соревнованиях по каждому из четырёх видов спорта.<br>
  При этом <code><Фамилия></code> и <code><Имя></code>, <code><Имя></code> и <code><Баллы></code> разделены одним пробелом.<br>
  Примеры входных строк:<br>
  <code>Иванова Мария 5 8 6 3</code><br>
  <code>Петров Сергей 9 9 5 7</code>
</p>
<p>
  Требуется написать программу, которая будет выводить на экран <strong>фамилии и имена трёх лучших участников многоборья</strong>.<br>
  Если среди остальных участников есть ученики, набравшие то же количество баллов, что и один из трёх лучших, то их фамилии и имена также следует вывести.<br>
  При этом имена и фамилии можно выводить в произвольном порядке.
</p>

<p><strong>Описание выполнения задания:</strong><br>
 <ul> 
  <li><code></code></li>
</ul>

<h4>Тесты</h4>
<hr>

<h3 id="задание57">Задание 5.7</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>
  Файл содержит текст на <strong>русском языке</strong>.<br>
  <strong>Сколько разных букв встречается в тексте?</strong>
</p>

<p><strong>Описание выполнения задания:</strong><br>
 <ul> 
  <li><code></code></li>
</ul>

<h4>Тесты</h4>
<hr>

<h3 id="задание62">Задание 6.2</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>
  По списку <code>L</code> построить очередь (например, по списку из элементов <code>1, 2, 3</code> требуется построить очередь из элементов <code>1, 2, 3, 3, 2, 1</code>).
</p>

<p><strong>Описание выполнения задания:</strong><br>
 <ul> 
  <li><code></code></li>
</ul>

<h4>Тесты</h4>
<hr>

<h3 id="задание71">Задание 7.1</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>
  Необходимо написать <strong>стрим</strong>:<br>
    Дан набор объектов типа <code>Point</code>, необходимо:
    <ul>
      <li>взять все <code>Point</code> в разных координатах,</li>
      <li>убрать с одинаковыми <code>X</code>, <code>Y</code>,</li>
      <li>отсортировать по <code>X</code>,</li>
      <li>отрицательные <code>Y</code> сделать положительными,</li>
      <li>собрать это всё в ломаную (объект типа <code>Polyline</code>).</li>
    </ul>
</p>

<p><strong>Описание выполнения задания:</strong><br>
 <ul> 
  <li><code></code></li>
</ul>

<h4>Тесты</h4>
<hr>

<h3 id="задание72">Задание 7.2</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>
  Дан текстовый файл со строками, содержащими имя человека и его номер в следующей форме:<br>
    <code>Вася:5 <br>Петя:3 <br>Аня:5 </code><br>
    Номера людей могут повторяться. У каких-то людей может не быть номера.<br><br>
    Необходимо написать <strong>стрим</strong>, выполняющий следующее:
    <ul>
      <li>читаются все люди из файла,</li>
      <li>все имена приводятся к нижнему регистру, но с первой буквой в верхнем регистре,</li>
      <li>убираем из перечня всех людей без номеров,</li>
      <li>имена оставшихся группируются по их номеру:</li>
    </ul>
    Пример результата:<br>
    <code>[5: [Вася, Аня], 3: [Петя]]</code>
</p>

<p><strong>Описание выполнения задания:</strong><br>
 <ul> 
  <li><code></code></li>
</ul>

<h4>Тесты</h4>
<hr>

<h2 id="структура-проекта">Структура проекта</h2>
<pre>
src
├── ru.fadeev
│   ├── Animal
│   │   ├── Interface
│   │   │   └── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Animal/Interface/Meowable.java">Meowable.java</a>
│   │   ├── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Animal/Cat.java">Cat.java</a>
│   │   ├── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Animal/ExtrMeow.java">ExtrMeow.java</a>
│   │   └── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Animal/MeowCount.java">MeowCount.java</a>
│   ├── Competition
│   │   ├── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Competition/AnalyzeFile.java">AnalyzeFile.java</a>
│   │   ├── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Competition/Participant.java">Participant.java</a>
│   │   └── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Competition/Score.txt">Score.txt</a>
│   ├── Lists
│   │   └── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Lists/MergeList.java">MergeList.java</a>
│   ├── Mathem
│   │   ├── Interfaces
│   │   │   └── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Mathem/Interfaces/FractionOnInterface.java">FractionOnInterface.java</a>
│   │   ├── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Mathem/CacheFraction.java">CacheFraction.java</a>
│   │   └── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Mathem/Fraction.java">Fraction.java</a>
│   ├── Queue
│   │   └── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Queue/QueueElem.java">QueueElem.java</a>
│   ├── Stream
│   │   ├── geometry
│   │   │   ├── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Stream/geometry/InputPoint.java">InputPoint.java</a>
│   │   │   ├── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Stream/geometry/Line.java">Line.java</a>
│   │   │   ├── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Stream/geometry/Point.java">Point.java</a>
│   │   │   └── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Stream/geometry/Polyline.java">Polyline.java</a>
│   │   ├── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Stream/people.txt">people.txt</a>
│   │   └── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Stream/Stream.java">Stream.java</a>
│   ├── Text
│   │   ├── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Text/CountLetter.java">CountLetter.java</a>
│   │   └── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Text/text.txt">text.txt</a>
│   └── UserPanel
│       ├── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/UserPanel/CheckInput.java">CheckInput.java</a>
│       └── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/UserPanel/UserPanel.java">UserPanel.java</a>
└── <a href="https://github.com/Fartem654/Lab5/blob/master/src/ru/fadeev/Main.java">Main.java</a>
</pre>

<h2 id="как-запустить">Как запустить</h2>
<ol>
 <li>Убедитесь, что установлен JDK.</li>
 <li>
   Скачайте архив с проектом.
 </li>
 <li>
   Откройте в консоли каталог "src".
 </li>
 <li>
   Введите в консоль:
   <pre>java master.java</pre>
 </li>
</ol>
