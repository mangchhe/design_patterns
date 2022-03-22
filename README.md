# 생성(Creational) 패턴

객체 생성에 관련된 패턴이다. 객체의 생성과 조합을 캡슐화해 특정 객체가 생성되거나 변경되어도 프로그램 구조에 영향을 크게 받지 않도록 유연성을 제공한다.

| 이름 | NAME | Java | Kotlin | 정리 |
| :---: | :---: | :---: | :---: | :---: |
| 추상 팩토리 | Abstract Factory | - | - | - |
| 빌더 | Builder | [바로가기][builder-java] | [바로가기][builder-kotlin] | [![바로가기](./images/clipboard.jpg)][builder-summary] |
| 팩토리메서드 | Factory Method | [바로가기][factorymethod-java] | - | [![바로가기](./images/clipboard.jpg)][factorymethod-summary] |
| 프로토타입 | Prototype | - | - | - |
| 싱글턴 | Singleton | [바로가기][singleton-java] | [바로가기][singleton-kotlin] | [![바로가기](./images/clipboard.jpg)][singleton-summary] |

# 구조(Structural) 패턴

클래스나 객체를 조합해 더 큰 구조를 만드는 패턴이다. 

| 이름 | NAME | Java | Kotlin | 정리 |
| :---: | :---: | :---: | :---: | :---: |
| 어댑터 | Adapter | - | - | - |
| 브리지 | Bridge | - | - | - |
| 컴퍼지트 | Composite | - | - | - |
| 데코레이터 | Decorator | - | - | - |
| 퍼사드 | Facade | - | - | - |
| 플라이웨이트 | Flyweight | [바로가기][flyweight-java] | - | [![바로가기](./images/clipboard.jpg)][flyweight-summary] |
| 프록시 | Proxy | [바로가기][proxy-java] | [바로가기][proxy-kotlin] | [![바로가기](./images/clipboard.jpg)][proxy-summary] |

# 행위(Behavioral) 패턴

객체나 클래스 사이의 알고리즘이나 책임 분배에 관련된 패턴이다. 한 객체가 혼자 수행할 수 없는 작업을 여러 개의 객체로 어떻게 분배하는지, 분배하면서 결합도를 최소화하는 것에 중점을 두는 방식이다.

| 이름 | NAME | Java | Kotlin | 정리 |
| :---: | :---: | :---: | :---: | :---: |
| 책임 연쇄 | Chain of Responsibility | - | - | - |
| 커맨드 | Command | - | - | - |
| 인터프리터 | Interpreter | - | - | - |
| 이더레이터 | Iterator | - | - | - |
| 메멘토 | Memento | - | - | - |
| 옵서버 | Observer | - | - | - |
| 스테이트 | State | - | - | - |
| 스트레티지 | Strategy | [바로가기][strategy-java] | - | [![바로가기](./images/clipboard.jpg)][strategy-summary] |
| 템플릿 메서드 | Template Method | [바로가기][templatemethod-java] | - | [![바로가기](./images/clipboard.jpg)][templatemethod-summary] |
| 비지터 | Visitor | - | - | - |


[builder-java]: https://github.com/mangchhe/Design_patterns/tree/main/Java/src/creational_patterns/builder
[builder-kotlin]: https://github.com/mangchhe/Design_patterns/tree/main/Kotlin/src/creational_patterns/builder
[builder-summary]: https://github.com/mangchhe/Design_patterns/tree/main/Java/src/creational_patterns/builder/summary.md

[factorymethod-java]: https://github.com/mangchhe/Design_patterns/tree/main/Java/src/creational_patterns/factorymethod
[factorymethod-summary]: https://github.com/mangchhe/Design_patterns/tree/main/Java/src/creational_patterns/factorymethod/summary.md

[singleton-java]: https://github.com/mangchhe/Design_patterns/tree/main/Java/src/creational_patterns/singleton
[singleton-kotlin]: https://github.com/mangchhe/Design_patterns/tree/main/Kotlin/src/creational_patterns/singleton
[singleton-summary]: https://github.com/mangchhe/Design_patterns/tree/main/Java/src/creational_patterns/singleton/summary.md



[flyweight-java]: https://github.com/mangchhe/Design_patterns/tree/main/Java/src/structural_patterns/flyweight
[flyweight-summary]: https://github.com/mangchhe/Design_patterns/tree/main/Java/src/structural_patterns/flyweight/summary.md

[proxy-java]: https://github.com/mangchhe/Design_patterns/tree/main/Java/src/structural_patterns/proxy
[proxy-kotlin]: https://github.com/mangchhe/Design_patterns/tree/main/Kotlin/src/structural_patterns/proxy
[proxy-summary]: https://github.com/mangchhe/Design_patterns/tree/main/Java/src/structural_patterns/proxy/summary.md



[strategy-java]: https://github.com/mangchhe/Design_patterns/tree/main/Java/src/behavioral_patterns/strategy
[strategy-summary]: https://github.com/mangchhe/Design_patterns/tree/main/Java/src/behavioral_patterns/strategy/summary.md

[templatemethod-java]: https://github.com/mangchhe/Design_patterns/tree/main/Java/src/behavioral_patterns/templatemethod
[templatemethod-summary]: https://github.com/mangchhe/Design_patterns/tree/main/Java/src/behavioral_patterns/templatemethod/summary.md