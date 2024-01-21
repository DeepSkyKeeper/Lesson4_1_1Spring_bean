package ru.syn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.syn.demo.repository.UserRepository;
import ru.syn.demo.service.UserService;

@SpringBootApplication
public class DemoApplication {

//	1.Выполните инициализацию проекта spring, как показано  в уроке
//	2.Откройте сгенерированный проект в IDE, выполните первичную настройку, как показано в уроке
//	3.Создайте класс DemoAplication повторите код за спикером
//	4.Создайте в папке ru.syn.demo папку service,  в ней класс UserService, далее папку
//	repository в ней класс UserRepository, повторите код для обоих классов за спикером
//	5.В папке ru.syn.demo создайте класс DemoConfig, повторите код за спикером

	public static void main(String[] args) {
		var context = SpringApplication.run(DemoApplication.class, args);

		UserService service = context.getBean(UserService.class);
//		var authedU=service.isAuth("I'm a user");
//		System.out.println(authedU);
//		var notAuthedU=service.isAuth("deepskykeeper");
//		System.out.println(notAuthedU);

		var uploadFtp=service.upload("I'm a user");
		System.out.println(uploadFtp);
//		var uploads3=service.upload("deepskykeeper");
//		System.out.println(uploads3);
	}

}
