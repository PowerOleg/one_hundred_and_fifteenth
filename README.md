### Методы init(), destroy(). LAZY init обязательно. Также в уроке собственный метод, чтобы было красивое получение бина
Нужно переопределить в классе который implements InitializingBean, DisposableBean метод afterPropertiesSet() - это init(),
и destroy().
ВНИМАТЕЛЬНО!! LAZY init обязательно. К примеру можно в xml <beans... default-lazy-init="true">

Также, методы init(), destroy() можно вызываеть не implements интерфейсы. А в xml файле:
<bean id="simpleBean1" class="xml.SimpleBean"
init-method="init"
destroy-method="destroy"
p:name="Chris"
p:age="200"/>

