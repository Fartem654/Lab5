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
 <p><strong><code>Fraction</code></strong></p>
    <ul>
      <li>Создается класс <code>Fraction</code> с <strong>приватными целочисленными полями</strong> <code>numerator</code> и <code>denominator</code>. Класс реализует интерфейс <code>FractionInterface</code>, имеющий два метода: <code>setNumDem</code> и <code>getDoubleValue</code>.</li>
      <li>Описываются <strong>геттеры</strong> для числителя и знаменателя, и один <strong>сеттер</strong> для этих значений — <code>setNumDem</code>, в сеттере выполняется <strong>проверка знаменателя на 0</strong>, а также, если знаменатель отрицательный, минус переходит в числитель.</li>
      <li>Также класс содержит метод <code>getDoubleValue()</code>, <strong>возрващающий</strong> значение дроби.</li>
      <li>Переопределяются методы <code>toString</code>, <code>equals</code>, <code>hashCode</code></li>
    </ul>
    <p><strong><code>CacheFraction</code></strong></p>
    <ul>
      <li>Создается класс <code>CacheFraction</code>, <strong>наследующий</strong> <code>Fraction</code>.</li>
      <li>Класс содержит поле <code>private Double cachedValue</code>, по <em>умолчание</em> равное <code>null</code>. Это поле будет <strong>хранить значение дроби</strong>.</li>
      <li>Определяется <code>setNumDem</code>, <strong>устанавливающий</strong> значения числителя и знаменателя, а также <strong>обнуляющий</strong> значение <code>cachedValue</code>.</li>
      <li>Также описывается реализация метода <code>getDoubleValue()</code>, который <strong>вычисляет значение дроби</strong> и записывает его в <code>cachedValue</code>, если оно <code>null</code>, иначе <strong>выводит</strong> <code>cachedValue</code>.</li>
    </ul>

<h4>Тесты</h4>
<img width="503" height="237" alt="image" src="https://github.com/user-attachments/assets/9407b6c0-d8ee-4f72-ae01-6b761fa74e63" />
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
 <p><strong><code>Cat</code></strong></p>
<ul>
  <li>Создается класс <code>Cat</code> имеющий единственное приватное поле <code>name</code> типа <code>String</code>.</li>
  <li>Данный класс реализует интерфейс <code>Meowable</code>, содержащий метод <code>meow()</code>.</li>
  <li>В классе определяется конструктор, геттер и сеттер по имени.</li>
  <li>Описывается реализация <code>meow()</code>, выводящий имя кота и <code>"мяу!"</code>.</li>
  <li>Переопределяется метод <code>toString</code>.</li>
</ul>

<p><strong><code>MeowCount</code></strong></p>
<ul>
  <li>Создается класс <code>MeowCount</code> с приватными полями <code>final Meowable animal</code> - содержащее мяукающее животное и <code>int counter = 0</code> - хранящее число мяуканий этого животного.</li>
  <li>Класс также реализует <code>Meowable</code>.</li>
  <li><code>MeowCount</code> содержит конструктор, принимающий объект класса реализующего <code>Meowable</code>, также геттер для поля <code>counter</code>.</li>
  <li>Описывается реализация <code>meow()</code>, которая вызывает у <code>animal</code> этот же метод и инкрементирует <code>counter</code>.</li>
</ul>

<p>Также создается вспомогательный класс <code>ExtrMeow</code>, содержащий статический метод <code>doMew(Meowable... animals)</code>, принимающий список мяукающих животных  и заставляющий каждого сделать мяу.</p>

<h4>Тесты</h4>
<img width="344" height="121" alt="image" src="https://github.com/user-attachments/assets/6834ef21-4021-4303-affe-08e1b385f141" />
<hr>

<h3 id="задание33">Задание 3.3</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>
  Составить программу, которая <strong>вставляет элементы списка L2 в список L1, не нарушая его упорядоченности</strong>.
</p>

<p><strong>Описание выполнения задания:</strong><br>
 <p><strong><code>MergeList</code></strong></p>
<ul>
  <li>В классе <code>MergeList</code> описывается статический метод <code>listInList</code> с типовым параметром <code>T</code>, реализующим интерфейс <code>Comparable T</code>.</li>
  <li>Метод принимает два списка с элементами типа <code>T</code>.</li>
  <li>Метод поочередно проходит по элементам 1-го и 2-го списков, сравнивая их.</li>
  <li>Если элемент из первого списка строго меньше чем элемент из 2-го, то берется следующий элемент 1-го списка.</li>
  <li>Иначе элемент из 1-го списка и его правые соседи сдвигаются на один элемент вправо, в освободившееся место вставляется элемент из 2-го списка.</li>
  <li>В итоге исходный список 1 изменяется и имеет упорядоченные элементы из двух списков.</li>
</ul>

<h4>Тесты</h4>
<img width="657" height="475" alt="image" src="https://github.com/user-attachments/assets/61a5d302-789a-4b6a-aa6b-e0bc1674f4be" />
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
 <p><strong><code>Participant</code></strong></p>
<ul>
  <li>Создается класс <code>Participant</code>, содержащий поля <code>private String secondName</code>, <code>private String name</code>, <code>private int score</code> для фамилии, имени и общего количества баллов.</li>
  <li>Класс реализует <code>Comparable<Participant></code>, чтобы можно было корректно сравнивать участников.</li>
  <li>Определяются конструктор, геттеры и сеттеры.</li>
  <li>Переопределяется метод <code>toString</code>.</li>
  <li>Переопределяется метод <code>compareTo</code>, чтобы сравнивать участников по количеству баллов.</li>
</ul>

<p><strong><code>AnalyzeFile</code></strong></p>
<ul>
  <li>В классе <code>AnalyzeFile</code> реализуется статический метод <code>show3Best(String fileName)</code>, принимающий имя файлов с участниками.</li>
  <li>Определяется словарь <code>scoreGroups</code>, в котором участники (значения) будут разбиты на группы по общему количеству баллов (ключ).</li>
  <li>Метод построчно проходит по файлу, выполняя различные проверки, и если строка удовлетворяет условиям, она разбивается по пробелам в строчный массив <code>param</code>.</li>
  <li>Из каждого массива извлекаются фамилия, имя и кол-во баллов за каждый из четырех видов спорта, далле эти баллы сумируются и записываются в отдельную переменную.</li>
  <li>Если все полученные данные удовлетворяют условиям, создается объект класса <code>Participant</code>, после чего он добавляется в группу словаря, исходя из своего количество баллов.</li>
  <li>После считывания каждой строки и формирования словаря <code>scoreGroups</code>, выводятся 3 первые группы данной структуры, так как scoreGroups представляет собой TreeMap, все группы будут отсортированными.</li>
</ul>

<h4>Тесты</h4>
<img width="285" height="353" alt="image" src="https://github.com/user-attachments/assets/d623443d-dee8-47ce-97ba-00235fee6063" />
<hr>

<h3 id="задание57">Задание 5.7</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>
  Файл содержит текст на <strong>русском языке</strong>.<br>
  <strong>Сколько разных букв встречается в тексте?</strong>
</p>

<p><strong>Описание выполнения задания:</strong><br>
 <p><strong><code>CountLetter</code></strong></p>
<ul>
  <li>Создается класс <code>CountLetter</code>, имеющий статический метод <code>countRuLetter(String fileName)</code>, принимающий имя файла.</li>
  <li>В методе определяется множество <code>ruSetList</code>.</li>
  <li>Далее построчно считывается файл.</li>
  <li>Каждый символ строки приводится к нижнему регистру и проверяется, что этот символ попадает в диапазон подходящих букв.</li>
  <li>Если это так, символ добавляется в множество <code>ruSetList</code>.</li>
  <li>Возвращается  размер <code>ruSetList</code>.</li>
</ul>

<h4>Тесты</h4>
<img width="520" height="62" alt="image" src="https://github.com/user-attachments/assets/6b349c17-7268-42b3-9b57-0897f286bce7" />
<hr>

<h3 id="задание62">Задание 6.2</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>
  По списку <code>L</code> построить очередь (например, по списку из элементов <code>1, 2, 3</code> требуется построить очередь из элементов <code>1, 2, 3, 3, 2, 1</code>).
</p>

<p><strong>Описание выполнения задания:</strong><br>
 <p><strong><code>QueueElem</code></strong></p>
<ul>
  <li>В классе <code>QueueElem</code> описывается статический параметризованный метод <code>formQueue</code> с типовым параметром <code>T</code>.</li>
  <li>Метод принимает список <code>list</code> типа <code>List<T></code>.</li>
  <li>В методе создаётся очередь <code>result</code> типа <code>Queue<T></code>, реализованная через <code>LinkedList</code>.</li>
  <li>В очередь добавляются все элементы исходного списка в исходном порядке с помощью <code>addAll(list)</code>.</li>
  <li>Затем в очередь добавляются все элементы исходного списка в обратном порядке с помощью <code>addAll(list.reversed())</code>.</li>
  <li>Метод возвращает полученную очередь.</li>
</ul>

<h4>Тесты</h4>
<img width="595" height="239" alt="image" src="https://github.com/user-attachments/assets/7a986e18-4aa1-4c49-b86b-f1c73a36f903" />
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
 <p><strong><code>Stream</code></strong></p>
<ul>
  <li>В классе описывается статический метод <code>formPolyline</code>, принимающий список точек <code>List<Point></code>.</li>
  <li>В методе создаётся новый список <code>points</code> с помощью стрима исходного списка:</li>
  <ul>
    <li>фильтруются <code>null</code>-элементы с помощью <code>Objects::nonNull</code>;</li>
    <li>удаляются дубликаты с помощью <code>distinct()</code>;</li>
    <li>точки сортируются по возрастанию координаты <code>x</code> с помощью <code>Comparator.comparingDouble(Point::getX)</code>;</li>
    <li>для каждой точки создаётся новая точка с тем же <code>x</code> и модулем <code>y</code> (т.е. <code>y</code> становится неотрицательным);</li>
    <li>результат собирается в список с помощью <code>toList()</code>.</li>
  </ul>
  <li>На основе полученного списка создаётся и возвращается объект <code>Polyline</code>, конструктору которого передаётся массив точек.</li>
</ul>

<h4>Тесты</h4>
<img width="523" height="475" alt="image" src="https://github.com/user-attachments/assets/7dfd2fcf-85b9-4211-9bde-74425e5c8dba" />
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
 <p><strong><code>formPerson</code></strong></p>
<ul>
  <li>Описывается статический метод <code>formPerson</code>, принимающий имя файла <code>fileName</code>.</li>
  <li>Метод возвращает словарь<code>result</code> <code>Map(Integer, List(String))</code>, где ключ — номер (целое число), значение — список имён людей с этим номером.</li>
  <li>С помощью <code>Files.lines</code> открывается поток строк из файла в <code>try</code>-с-ресурсами.</li>
  <li>Каждая строка разбивается на две части по первому символу <code>:</code> с помощью <code>split(":", 2)</code>.</li>
  <li>Фильтруются строки, где ровно две части после разбиения.</li>
  <li>Обе части обрезаются от пробелов по краям.</li>
  <li>Фильтруются пары, где вторая часть (номер) не пустая и состоит только из цифр (проверка через регулярное выражение <code>"\\d+"</code>).</li>
  <li>Строки собираются в словарь с помощью <code>Collectors.groupingBy</code>:
    <ul>
      <li>ключ — целочисленное значение номера (<code>Integer.parseInt(parts[1])</code>);</li>
      <li>значение — список имён, полученных из первой части:
        <ul>
          <li>имя обрезается от пробелов;</li>
          <li>если имя не пустое, его первая буква приводится к верхнему регистру, остальные — к нижнему;</li>
          <li>пустые имена допускаются и добавляются как есть.</li>
        </ul>
      </li>
    </ul>
  </li>
  <li>Метод возвращает <code>result</code>.</li>
</ul>

<h4>Тесты</h4>
<img width="531" height="66" alt="image" src="https://github.com/user-attachments/assets/5386bb27-d0b8-41da-b745-d304771bacf2" />
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
