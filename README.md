# Teoría de conjuntos

## Contexto
> Un conjunto es una colección finita o infinita de objetos en la que el orden no tiene significado, y la multiplicidad se ignora generalmente.  
[Wolfram MathWorld](http://mathworld.wolfram.com/Set.html)

Vamos a modelar conjuntos -finitos-, con todas las operaciones que éstos pueden llevar a cabo. Por supuesto podríamos modelar conjuntos infinitos, pero eso lo dejamos como ejercicio adicional para quien desee realizarlo.

![Teoría de conjuntos](http://uberhumor.com/wp-content/uploads/2012/09/8BFAq2.png)

### Un poco de historia
[Greg Cantor](http://es.wikipedia.org/wiki/Georg_Cantor) publicó, a fines del siglo XIX un paper que daría inicio a lo que hoy denominamos "Teoría de conjuntos". Su trabajo inicialmente dividió a sus contemporáneos: estaban los que lo apoyaban, y aquellos que no.

Con el correr del tiempo su teoría fue tomando fuerza, y se pudo emplear para hacer todo tipo de demostraciones matemáticas... así como también para dar origen a las paradojas (famosa es la de Bertrand Russell: "el conjunto de todos los conjuntos que no son miembros de sí mismos, ¿debe ser miembro de él mismo?", más conocida como la [paradoja del barbero](http://es.wikipedia.org/wiki/Paradoja_de_Russell#La_paradoja_en_t.C3.A9rminos_del_barbero)).

### Relaciones entre conjuntos
Los conceptos básicos de la **teoría de conjuntos** pueden verse en [Wikipedia](http://es.wikipedia.org/wiki/Teor%C3%ADa_de_conjuntos). Sin embargo, haremos aquí un breve reconto de las relaciones que deseamos implementar.

* **Pertenencia**: Es la relación que hay entre un elemento y el conjunto que lo contiene.
* **Igualdad**: La igualdad entre conjuntos verifica que ambos tengan exactamente los mismos elementos.
* **Inclusión**: Un conjunto incluye a otro si el primero contiene a todos los elementos del segundo.

### Operaciones con conjuntos
Adicionalmente a estas relaciones que existen entre conjuntos, necesitamos modelar ciertas operaciones:

* [Unión](http://es.wikipedia.org/wiki/Uni%C3%B3n_de_conjuntos):
La operación más simple, es la que dados dos conjuntos se queda con todos los elementos que pertenezcan a uno, al otro o a ambos.
* [Intersección](http://es.wikipedia.org/wiki/Intersecci%C3%B3n_de_conjuntos):
Una opración que dados dos conjuntos, resulta en aquellos que pertenecen a ambos.
* [Diferencia](http://es.wikipedia.org/wiki/Diferencia_de_conjuntos):
Dados los conjuntos A y B, la diferencia A - B serán los elementos de A que no pertenecen a B.
* [Complemento](http://es.wikipedia.org/wiki/Complemento_de_un_conjunto): Dados los conjunto A y B, el complemento de A en B serán los elementos de B que no pertenecen a A.
* [Diferencia simétrica](http://es.wikipedia.org/wiki/Diferencia_sim%C3%A9trica): La diferencia simétrica entre A y B serán los elementos de A, y los elementos de B, que no forman parte del otro conjunto.
* [Producto cartesiano](http://es.wikipedia.org/wiki/Producto_cartesiano): El producto cartesiano de A y B es un conjunto de pares donde se combinan todos los elementos de A con todos los elementos de B.
* [Conjunto potencia](http://es.wikipedia.org/wiki/Conjunto_potencia): Es aquel formado por todos los posibles subconjuntos de un conjunto dado -desde el conjunto vacío hasta el que contiene todos los elementos, inclusive-. Nótese que es un *conjunto de conjuntos*.

## Consigna

Se pide implementar una solución que permita realizar todas las operaciones y verificar las relaciones establecidas en el apartado anterior. Para ello deberás emplear los conceptos de _colecciones_, _igualdad_, _comparación_ y _genéricos_ ([Generics](http://docs.oracle.com/javase/tutorial/java/generics/)).  
Aquí un ejemplo de cómo debería funcionar:

    Conjunto<Integer> conjuntoA = new Conjunto<Integer>();
    conjuntoA.agregar(1);
    conjuntoA.agregar(2);
    conjuntoA.agregar(3);
    
    Conjunto<Integer> conjuntoB = new Conjunto<Integer>();
    conjuntoA.agregar(3);
    conjuntoB.agregar(4);
    
    Conjunto<Integer> conjuntoC = conjuntoA.union(conjuntoB);
    // conjuntoC debe contener los elementos {1, 2, 3, 4}

Y así con cada operación y relación.

### Material proporcionado

Se otorga la interfaz de la clase `Conjunto`, la cual sirve para implementar las operaciones necesarias. También será necesaria la clase `Par`, la cual servirá para implementar la funcionalidad `productoCartesiano(Conjunto<S>):Conjunto<Par<T,S>>`.

También se te proveerá un *test* (dentro de la clase `ConjuntoTests`) a modo de testigo, probando el caso proporcionado como ejemplo líneas más arriba. Idealmente deberías hacer crecer esas pruebas, o agregar las tuyas propias para asegurarte de que tu solución es correcta.

### Sugerencias

Muchas de las operaciones pueden resolverse en función de otras operaciones, simplemente hay que pensarlas un poco más.  
Nuestro consejo es que intentes mantener los métodos tan breves como sea posible, ya que todos los métodos pueden implementarse en unas pocas líneas (cuando no son _una sóla línea_).

**Nota**: Hay APIs que pueden ayudarte a resolver el problema. Desalentamos el uso de cualquier tipo de **jar** externo, dado que el objetivo de este ejercicio es el aprendizaje y la familiaridad con las colecciones en Java. *Si aún así querés utilizarlas, consultanos sobre cómo hacer para que la corrección automática no falle*.

## Criterios de evaluación

Este trabajo tendrá una nota normalizada en 10.0 puntos, los cuales se componen según el siguiente detalle:

<table>
 <thead>
 <tr>
  <th>Concepto</th>
  <th>Puntos totales</th>
  <th>Porcentaje sobre el total</th>
 </tr>
 </thead>
 <tr>
  <td>Funcionalidad</td>
  <td>8.0</td>
  <td>80 %</td>
 </tr>
 <tr>
  <td>Estilo</td>
  <td>2.0</td>
  <td>20 %</td>
 </tr>
 <tr>
  <td>Total</td>
  <td>10.0</td>
  <td>100 %</td>
 </tr>
</table>

Por lo tanto, se te evaluará tanto la funcionalidad como la correctitud de estilo (tabulación, espacios, nombres, etcétera).
Entre los criterios de estilo, esta vez deberás agregar la documentación a los todos los métodos del proyecto.

## Consideraciones

1. Recordá no cambiar la firma de los métodos proporcionados por la cátedra.
2. Podés hacer **tantos tests como consideres necesarios**, pero los mismos no se utilizarán para evaluar tu código.
3. Recordá que podés enviar la tarea a corrección tantas veces como quieras, dentro del período de vigencia de la misma.
