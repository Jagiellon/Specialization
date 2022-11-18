package CourseProject.Specialization.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;//Аннотация для создания ключевых полей
import javax.persistence.Table;

@Table(name = "Специализации")//указывает на имя таблицы, которая будет отображаться в этой сущности.
@Data//Создает геттеры, сеттеры,конструкторы и методы toString, equals и hashСode
@Entity//Помечаем как сущность для работы с БД
public
class Specialization {
    @Id
    @Column
    private String specializationCode;//Код специальности
    @Id
    @Column
    private String educationFormCode;//Шифр формы обучения(очная, заочная, вечерная)
    @Id
    @Column
    private String degreeCode;//Шифр степени подготовки
    @Column
    private int places;//Количество мест

}
