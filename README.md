# homeworks
Репозиторий для выполненных домашних заданий по курсу "Основы Java" [Ukrainian IT School](http://uitschool.com/)

**Lesson 1 - Введение в Java, байткод, пакеты, запуск первого приложения**
<p><ol>
    <li>Установка JDK (Java Development Kit).
    <li>Создайте три класса: Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver в пакете
        com.company.professions. Все три класса находятся в разных пакетах. В main() методе класса Car создайте объекты 
        класса Engine и Driver. При запуске Car программа должна выводить на консоль "I'm driving!".  
        Скомпилируйте и запустите программу.
</ol></p>

**Lesson 2 - Classpath, jar-файлы, примитивные типы**

<p><ol>
    <li>Соберите com.company.professions пакет в JAR-файл и скопируйте в каталог lib. 
        При компиляции и запуске класса Car указывайте JAR-файл в -cp.
    <li>Используйте аргументы командной строки при запуске Car: на вход программы подается
        несколько аргументов. Программа должна распечатать их в виде: {0 - знач1; 1 - знач2}​
    <li>Установка Intellij IDEA, Community Edition.
    <li>Создать новый проект.
    <li>Создать программу, в которой используются одно-строчные и много-строчные комментарии.
    <li>Скачать git
    <li>Зарегистрироваться на GitHub
</ol></p>

**Lesson 3 - Литералы, преобразование примитивных типов, переменные**
<p><ol>
    <li> Создайте таблицу преобразований примитивных типов друг к другу. На пересечении напишите: 
         ня (неявное) – если преобразование происходит автоматически, 
         я (явное) – если нужно использовать явное преобразование, 
         х – если преобразование невозможно, 
         т  - если преобразование тождественно.
    <li> Создать программу, в которой последовательно прописать преобразования всех совместимых 
         примитивных типов друг к другу.
    <li> Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, 
         чётным или нечётным. Если пользователь введёт не целое число, то сообщать ему об ошибке.
    <li> Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, 
         введённых пользователем. Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
</ol></p>

**Lesson 4 - Консольный ввод/вывод, побитовые операции, операции**
<p><ol>
    <li> Создать программу, которая будет выводить на экран меньшее по модулю из трёх 
         введённых пользователем вещественных чисел. Для вычисления модуля используйте тернарную условную операцию.
    <li> Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена. 
         В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы: 
         a) метод который будет мигать лампочками гирлянды заданное количество раз; 
         б) метод, который будет запускать гирлянду в режим бегущей строки; 
         в) метод, который будет выяснять включена ли лампочки на первой позиции; 
         г) метод который будет распечатывать текущее состояние гирлянды. 
         Используйте побитовые операции. Для получения двоичного формата числа 
         используйте метод Integer.toBinaryString(a).
    <li> Вычислить среднее значение вещественных чисел передаваемых на вход программы в качестве аргументов. 
         Используйте цикл for, пример. Для преобразования из String в double 
         используйте метод Double.parseDouble(String s).
</ol></p>

**Lesson 5-6 - Операторы if, switch, for, while, массивы, алгоритмы сортировки**
<p><ol>
    <li> Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.
    <li> Изменить программу сортировки пузырьком:
         а) добавить возможность досрочного окончания сортировки;
         б) программа написана таким образом, что минимальный элемент "всплывает" в начало массива. 
            Измените программу так чтобы минимальный элемент "всплывал" в конец массива 
            (внутренний цикл for должен перебирать элементы не с конца, а с начала). 
    <li> Реализовать подсчет факториала используя цикл for.
    <li> Создать двухмерный массив 5х8 и инициализировать его с помощью блока для инициализации. 
         Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2. 
         Распечатать оба массива.
    <li> Реализовать задачу с гирляндой используя массивы.
    <li> Изменить сортировку выбором - исключите обмен значений, если найденный минимальный элемент равен array[i].
</ol></p>

**Lesson 7 - ООП, классы, методы**
<p><ol>
    <li> Создать класс Person, который содержит: 
         a) поля fullName, age. 
         б) методы move() и talk(). 
         в) Добавьте два конструктора  - Person() и Person(fullName, age).
         Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), 
         другой - Person(fullName, age).
    <li> Создать класс "Матрица". Класс должен иметь следующие поля:
         1) двумерный массив вещественных чисел;
         2) количество строк и столбцов в матрице.
         Класс должен иметь следующие методы:
         1) сложение с другой матрицей;
         2) умножение на число;
         3) вывод на печать.
    <li> Определить класс, хранящий такую информацию о пользователе библиотеки: 
         ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
         Разработать программу, в которой создается массив объектов данного класса. 
         В программе организовать: ввод данных о читателях,  вывод информации о читателях.
    <li> Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver в пакете
         com.company.professions. 
         Класс Driver содержит поля - ФИО, стаж вождения.
         Класс Engine содержит поля - мощность, производитель.
         Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, 
         мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(), 
         которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево". 
         А также метод printInfo(), который выводит полную информацию об автомобиле, ее водителе и моторе.
</ol></p>

**Lesson 8 - ООП, классы, методы**
<p><ol>
    <li> Переделать класс о пользователе библиотеки - перегрузить методы takeBook(), returnBook():
         1) takeBook, который будет принимать количество взятых книг.
         2) takeBook, который будет принимать переменное количество названий книг.
         3) takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс).
         Аналогичным образом перегрузить метод returnBook().
    <li> Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B, 
         или в порядке убывания в противном случае. Использовать рекурсию.
    <li> Переписать задания из предыдущего урока используя правильные модификаторы доступа, геттеры, сеттеры.
    <li> Создать класс "Flower", который содержит переменные имя и стоимость. 
         Собрать 3 букета (используем массив) с определением их стоимости. 
         Также подсчитать количество проданных цветов (используем статический метод).
    <li> Создать класс Circle, который содержит:
          1) переменную radius;
          2) методы, вычисляющие площадь и длину окружности;
          3) константу PI.
         Создать несколько объектов данного класса.
</ol></p>

**Lesson 9 - Наследование**
<p><ol>
    <li> Необходимо реализовать иерархию цветов (для примера, пусть это будут розы, гвоздики, 
         тюльпаны и... что-то на свой вкус). Создать несколько объектов-цветов. Собрать 3 букета 
         (используем массив) с определением их стоимости. В букет может входить несколько цветов одного типа. 
         Суперкласс "Flower" должен содержать метод определяющий стоимость цветка, этот метод переопределить 
         в классах наследниках. Также подсчитать количество проданных цветов (используем статический метод).
    <li> Доделываем задание про Car из предыдущего урока. Создать производный от Car класс  - Lorry (грузовик), 
         характеризуемый также грузоподъемностью кузова. Создать производный от Car класс - SportCar, 
         характеризуемый также предельной скоростью. Пусть класс Driver расширяет класс Person.
    <li> Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит переменные food, 
         location и методы makeNoise, eat, sleep. Dog, Cat, Horse переопределяют методы makeNoise, eat. 
         Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных. 
         Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal). 
         Пусть этот метод распечатывает food и location пришедшего на прием животного. 
         В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов. 
         В цикле отправляйте их на прием к ветеринару.
</ol></p>

**Lesson 10 - Наследование, интерфейсы**
<p><ol>
    <li> Добавить в классы Person, Матрица, Пользователь библиотеки, Car, Driver, Engine, Flower, Circle, 
         Animal, Dog, Cat, Horse  методы equals(), hashCode() и toString().
    <li> Переделать класс "Flower" - метод, определяющий стоимость цветка, сделать абстрактным. 
    <li> Заполнить табличку "Модификаторы доступа"
    <li> Создать классы для заполнения предыдущей таблицы.
    <li> Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба. 
         Интерфейс Инструмент содержит метод play() и клавишу String KEY = "До мажор". 
         Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр. 
         Создать массив типа Инструмент, содержащий инструменты разного типа. 
         В цикле вызвать метод play() для каждого инструмента, который должен выводить строку 
         "Играет такой-то инструмент".
    <li> Фруктовая лавка. Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его. 
         Класс Фрукт содержит завершенный метод printManufacturerInfo(){System.out.print("Made in Ukraine");} 
         и метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике. 
         Создать несколько объектов разных классов. Подсчитать общую стоимость проданных фруктов. 
         А также общую стоимость отдельно проданных яблок, груш и абрикос (используем статические переменные, методы).
    <li> Определить интерфейс Printable, содержащий метод  void print(). Определить класс Book, реализующий 
         интерфейс Printable. Определить класс Magazine, реализующий интерфейс Printable. 
         Создать массив типа Printable, который будет содержать книги и журналы. 
         В цикле пройти по массиву и вызвать метод print для каждого объекта.
    <li> Создайте суперкласс Shape и его наследники Circle, Rectangle. Класс Shape содержит абстрактный метод draw() 
         и переменную хранящую цвет. Классы Circle, Rectangle содержат координаты точек. 
         Создать массив содержащий эти фигуры. В цикле нарисовать их (вызвать метод draw).
</ol></p>

**Lesson 11 - Преобразование ссылочных типов, перечисления, оболчки типов**
<p><ol>
    <li> Создать перечисление, содержащее названия времен года. Перечисление должно содержать переменную, 
         содержащую среднюю температуру в каждом времени года. Добавить конструктор принимающий на вход 
         среднюю температуру. Создать метод getDescription, выводящий на консоль “Холодное время года”. 
         Переопределить метод getDescription - для константы Лето метод должен выводить на консоль “Теплое время года”. 
         В цикле распечатать все времена года, среднюю температуру и описание времени года. 
         Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
    <li> a) Создать перечисление, содержащее размеры одежды (XXS,XS,S,M,L). 
            Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер". 
            Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.  
            Также перечисление должно содержать числовое значение euroSize, соответствующее каждому размеру. 
            Создать конструктор, принимающий на вход euroSize.
         б) Создать интерфейсы "Мужская Одежда" с методом "одеть Мужчину" и "Женская Одежда" с методом "одеть Женщину".
         в) Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
         г) Создать классы наследники Одежды - Футболка (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), 
            Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), 
            Юбка (реализует интерфейсы "Женская Одежда"), Галстук (реализует интерфейсы "Мужская Одежда").  
         д) Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы "одеть Женщину", 
            "одеть Мужчину", на вход которых будет поступать массив, содержащий все типы одежды. 
            Метод "одеть Женщину" выводит на консоль всю информацию о женской одежде. То же самое для метода 
            "одеть Мужчину".
    <li> Заполнить табличку "Методы классов-оболочек примитивных типов". На пересечении указать x, 
         если данный метод существует у соответствующего класса оболочки.
</ol></p>

**Lesson 12 - Строки**
<p><ol>
    <li> Найти слово, в котором число различных символов минимально. 
         Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
    <li> Найти количество слов, содержащих только символы латинского алфавита.
    <li> Предложение состоит из нескольких слов, например: "Если есть хвосты по дз, 
         начните с 1 не сданного задания. 123 324 111 4554". 
         Среди слов, состоящих только из цифр, найти слово-палиндром.
    <li> Напишите метод, заменяющий в строке все вхождения «object oriented programming»
         (не учитываем регистр символов) на «OOP».
    <li> Даны строки разной длины (длина - четное число), 
         необходимо вернуть ее два средних знака: "string" → "ri", "code" → "od", "Practice"→"ct".
    <li> Создать класс Employee, у которого есть переменные класса - fullname, salary. 
         Создать массив содержащий несколько объектов этого типа. Создать класс Report, 
         который будет содержать статический метод generateReport, в котором выводится 
         информация о зарплате всех сотрудников. Используйте форматировании строк. 
         Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака 
         после запятой и можете добавить что-нибудь свое.  
</ol></p>

**Lesson 13 - Интернационализация(i18n), обобщения**
<p><ol>
    <li> Добавить переменную Date salaryDate в класс Employee из предыдущего урока. 
         Создать класс FullReport, который выводит ту же информацию, что и Report из 
         предыдущего урока, и добавляет дату выдачи зарплаты. Использовать классы NumberFormat и DateFormat. 
         Заголовок отчета должен изменяться в зависимости от выбранной локали (используем класс ResourceBundle).
    <li> Переписать матрицу с использованием обобщенного класса. 
    <li> Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и 
         максимального элемента массива. Массив является переменной класса. 
         Массив должен передаваться в класс через конструктор.
    <li> Написать класс Калькулятор (необобщенный), который содержит обобщенные 
         статические методы - sum, multiply, divide, subtraction. Параметры этих методов - два числа разного типа, 
         над которыми должна быть произведена операция.
</ol></p>

**Lesson 14 - Коллекции**
<p><ol>
    <li> Создать динамический массив, содержащий объекты класса Book. Раcпечатать его содержимое используя for each.
    <li> Создать очередь, содержащую объекты класса HeavyBox. Используем класс ArrayDeque. 
         Поместить объекты в очередь с помощью метода add(). Удалить объекты методом remove().
    <li> Напишите методы union(Set set1, Set set2) и intersect(Set set1, Set set2), 
         реализующих операции объединения и пересечения двух множеств. 
         Протестируйте работу этих методах на двух предварительно заполненных множествах. 
         (Вам понадобится написать вспомогательный метод, выводящий все элементы множества в консоль).
    <li> Напишите класс Student, предоставляющий информацию об имени студента методом getName() 
         и о его курсе методом getCourse(). Напишите метод printStudents(List students, int course), 
         который получает список студентов и номер курса и печатает в консоль имена тех студентов из списка, 
         которые обучаются на данном курсе. Для обхода списка в этом методе используйте итератор. 
         Протестируйте ваш метод (для этого предварительно придется создать объекты класса 
         Student и поместить их в список).
    <li> Создать класс Товар, имеющий переменные имя, цена, рейтинг. Создать класс Категория, 
         имеющий переменные имя и множество товаров. Создать несколько объектов класса Категория. 
         Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу. 
         Используем классы компараторы для каждого вида сортировки.
</ol></p>

**Lesson 15 - Коллекции**
<p><ol>
    <li> Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5". 
         Избавиться от повторяющихся элементов в строке и вывести результат на экран.
    <li> Создать коллекцию, содержащую объекты HeavyBox. Написать метод, который перебирает 
         элементы коллекции и проверяет вес коробок. Если вес коробки больше 300 гр, 
         коробка перемещается в другую коллекцию.
    <li> Создайте HashMap, содержащий пары значений - имя игрушки и объект игрушки (класс Toy). 
         Перебрать и распечатать набор из имен игрушек (keySet). Перебрать и распечатать значения HashMap (values()). 
         Перебрать пары значений(entrySet()). Для каждого перебора создать свой метод.
    <li> Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам. 
         Создать коллекцию, содержащую объекты класса Student. Перебрать всех студентов, 
         вычислить средний балл каждого студента. Если средний балл >=3, 
         студент переводится на следующий курс, иначе отчисляется. 
    <li> Переделать задание 5 из предыдущего урока (класс Товар),  используя Collections.sort() для сортировки. 
         Добавить возможность сортировать в обратном порядке (Collections.reverse()).
</ol></p>

**Lesson 16 - Исключения**
<p><ol>
    <li> Создать статический метод который принимает на вход три параметра: login, password и confirmPassword. 
         Login должен содержать только латинские буквы, цифры и знак подчеркивания. 
         Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, 
         необходимо выбросить WrongLoginException. Password должен содержать только латинские буквы, 
         цифры и знак подчеркивания. Длина password должна быть меньше 20 символов. 
         Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, 
         необходимо выбросить WrongPasswordException.  WrongPasswordException и WrongLoginException - 
         пользовательские классы исключения с двумя конструкторами – один по умолчанию, 
         второй принимает сообщение исключения и передает его в конструктор класса Exception. 
         Обработка исключений проводится внутри метода. Используем multi-catch block. 
         Метод возвращает true, если значения верны или false в другом случае.
    <li> Создаем мини приложение - интернет-магазин.  Должны быть реализованы следующие возможности:
         a) аутентификация пользователя. Пусть у вас будет отображение, содержащие пары логин-пароль. 
            Если пользователь ввел, правильные данные, он аутентифицирован. 
            В этом случае пусть создается объект User, cодержащий логин, пароль. 
            Если данные не правильные, то пусть создается объект User, с пустыми значениями.
         б) просмотр списка каталогов товара,
         в) просмотр списка товаров определенного каталога, отсортированного по заданному критерию,
         г) выбор товара в корзину,
         д) покупка товаров, находящихся в корзине. 
         Можете добавить свои операции или изменить что-то на свой вкус. 
</ol></p>

**Lesson 17 - Потоки ввода/вывода, сериализация**
<p><ol>
    <li> Переписать класс FileCopy: a) Добавить блок try-with-resources. б) Убрать throws IOException 
         из объявления main() метода. И добавить соответствующий catch блок. 
    <li> Переписать класс FileInputOutputStreamDemo: a) Добавить блок try-with-resources. 
         б) Замените for (int i = 0; i < c.length; i++) на блок for-each.  
         в) Пусть file.txt записывается в каталог src/io. 
    <li> Создайте метод, который сериализует класс Horse в файл и метод, который десериализует его. 
    <li> Написать метод который циклически просматривает содержание заданного каталога и выводит 
         на печать информацию о всех файлах и каталогах, находящихся в нем и в его подкаталогах.
    <li> Дополнение к интернет-магазину: после покупки, записать отчет в файл, содержащий информацию 
         о содержимом корзины. Используем класс PrintWriter для записи и форматирования отчета.    
    <li> Дополнение к интернет-магазину: создать механизм для сериализации и десериализации 
         содержимого последней  купленной корзины.
</ol></p>

**Lesson 18 - Вложенные, внутренние статические, анонимные классы**
<p><ol>
    <li> Создать класс User, содержащий private переменные login, password. Создать внутренний класс Query 
         в классе User. Класс Query содержит метод printToLog(), который распечатывает на консоль сообщение 
         о том что пользователь с таким то логином и паролем отправил запрос. Класс User, содержит метод 
         createQuery(), в котором создается объект класса Query и вызывается метод printToLog(). В методе 
         main(): создать экземпляр класса User и вызвать метод createQuery(); создать экземпляр класса Query 
         и вызвать метод printToLog() используя конструкцию user.new Query(); создать экземпляр класса Query 
         и вызвать метод printToLog() используя конструкцию new User().new Query();
    <li> Переписать предыдущее задание, используя локальный класс.
    <li> Переписать класс Query используя статический класс.
    <li> Создать интерфейс Cookable, содержащий метод void cook(). Создать класс Food, содержащий метод 
         public void prepare(Cookable c) { c.cook(); } Создать экземпляр класса Food и вызвать его метод 
         cook(). На вход метода cook() передать экземпляр анонимного класса, расширяющего интерфейс Cookable.
</ol></p>

**Lesson 19-20 - Многопоточность, JAVADOC**
<p><ol>
    <li> Создать класс, реализующий интерфейс Runnable. Переопределить run() метод. Создать цикл for. 
         В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка. Используем статический 
         метод Thread.sleep() чтобы сделать паузу. Создать три потока, выполняющих задачу распечатки значений.
    <li> Необходимо создать три потока которые изменяют один и тот же объект. 
         Каждый поток должен вывести на экран одну букву 100 раз, и затем увеличить значение символа на 1.
         a) Создать класс расширяющий Thread.
         б) Переопределить метод run(), здесь будет находится синхронизированный блок кода.
         в) Для того чтобы три объекта-потока имели доступ к одному объекту, создаем конструктор 
            принимающий на вход StringBuilder объект.
         г) Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта в).
         д) Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз, а потом увеличьте 
            значение символа на 1.
         е) В методе main() создайте один объект класса StringBuilder, используя символ ‘a’. Затем создайте 
            три экземпляра объекта нашего класса и запустите потоки.
    <li> Изменить MyQueue:
         a) Вместо int n добавить Queue<T> (MyQueue сделать обобщенным), которая будет содержать объекты 
            создаваемые Producer.
         б) Добавьте еще один объект Consumer, который будет запускаться тоже отдельным потоком.
         в) Выводите на консоль какой из объектов Consumer обработал объект из очереди.
         г) Измените цикл for на бесконечный цикл.
    <li> Обедающие философы. Пять безмолвных философов сидят вокруг круглого стола, перед каждым философом 
         стоит тарелка спагетти. Вилки лежат на столе между каждой парой ближайших философов. Каждый философ 
         может либо есть, либо размышлять. Философ может есть только тогда, когда держит две вилки — взятую 
         справа и слева. Взятие каждой вилки и возвращение её на стол являются раздельными действиями, 
         которые должны выполняться одно за другим.
    <li> Напишите программу, выводящую на консоль всю метаинформацию о выбранном классе.
    <li> Выберите класс, для которого напишите документирующие комментарии -  для самого класса, 
         переменных класса, методов, конструкторов.
</ol></p>

**Lesson 21 - Maven**
<p><ol>
    <li> Адаптировать свой проект под работу с Maven:
        <pre>
            <code>&lt;build&gt;</code>
            <code>&lt;sourceDirectory&gt;src&lt;/sourceDirectory&gt;</code>
            <code><p>...</p></code>
            <code>&lt;/build&gt;</code>
        </pre>
    <li> Добавить findbugs-maven-plugin, maven-checkstyle-plugin, maven-pmd-plugin плагин для 
         автоматического нахождения анализа кода в проекте:
        <pre>
            &lt;reporting&gt;
                &lt;plugins&gt;
                    &lt;plugin&gt;
                        &lt;groupId&gt;org.apache.maven.plugins&lt;/groupId&gt;
                        &lt;artifactId&gt;maven-checkstyle-plugin&lt;/artifactId&gt;
                        &lt;version&gt;2.17&lt;/version&gt;
                        &lt;reportSets&gt;
                            &lt;reportSet&gt;
                                &lt;reports&gt;
                                    &lt;report&gt;checkstyle&lt;/report&gt;
                                &lt;/reports&gt;
                            &lt;/reportSet&gt;
                        &lt;/reportSets&gt;
                    &lt;/plugin&gt;
                    &lt;plugin&gt;
                        &lt;groupId&gt;org.apache.maven.plugins&lt;/groupId&gt;
                        &lt;artifactId&gt;maven-pmd-plugin&lt;/artifactId&gt;
                        &lt;version&gt;2.4&lt;/version&gt;
                    &lt;/plugin&gt;
                    &lt;plugin&gt;
                        &lt;groupId&gt;org.codehaus.mojo&lt;/groupId&gt;
                        &lt;artifactId&gt;findbugs-maven-plugin&lt;/artifactId&gt;
                        &lt;version&gt;3.0.4&lt;/version&gt;
                    &lt;/plugin&gt;
                &lt;/plugins&gt;
            &lt;/reporting&gt;
        </pre>
        Запускаем с помощью mvn site. Ищем отчеты в target/site/project-reports.html и по возможности исправляем.
</ol></p>

**Lesson 22 - Базы данных, основы SQL**
<p><ol>
    <li> Создать БД для вашего интернет магазина. БД может включать следующие таблицы: 
         "товары", "каталоги", "товары_каталоги", "пользователи". Заполнить эти таблицы. 
         Прислать sql для создания этих таблиц.
</ol></p>

**Lesson 23 - JDBC**
<p><ol>
</ol></p>

**Lesson 24**
<p><ol>
</ol></p>
