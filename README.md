### Методы init(), destroy(). + собственный метод чтобы было красивое получение бина
Нужно переопределить в классе который implements InitializingBean, DisposableBean метод afterPropertiesSet() - это init(),
и destroy().
Также, методы init(), destroy() можно вызываеть не implements интерфейсы. А в xml файле:

<bean id="simpleBean1" class="xml.SimpleBean"
init-method="init"
destroy-method="destroy"
p:name="Chris"
p:age="200"/>

