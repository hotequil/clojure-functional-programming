(ns stock.hashmaps)

(def products { :pencil 4 :rubber 2 })

(println "Products ->" products)
(println "Products size ->" (count products))
(println "Products keys ->" (keys products))
(println "Products vals ->" (vals products))
(println "Products with assoc ->" (assoc products :notebook 20))
(println "Products ->" products)
(println "Products with assoc ->" (assoc products :pencil 6))
(println "Products with update ->" (update products :pencil inc))
(println "Products with update ->" (update products :pencil (fn [value] (* value 5))))
(println "Products with update ->" (update products :pencil #(* % 10)))
(println "Products with dissoc ->" (dissoc products :pencil))

(def orders {
  :pencil { :price 2 :quantity 5 }
  :rubber { :price 1 :quantity 18 }})

(println "Orders ->" orders)

(def orders (assoc orders :notebook { :price 16 :quantity 4 }))

(println "Orders ->" orders)
(println "Pencil order ->" (orders :pencil))
(println "Pencil order ->" (get orders :pencil))
(println "Pencil order ->" (:pencil orders))
(println "Pen order ->" (orders :pen))
(println "Pen order ->" (orders :pen { :price nil :quantity 0 }))
(println "Pen order ->" (get orders :pen))
(println "Pen order ->" (get orders :pen { :price nil :quantity 0 }))
(println "Pen order ->" (:pen orders))
(println "Pen order ->" (:pen orders { :price nil :quantity 0 }))

(println "Quantity pencil ->" (:quantity (:pencil orders)))
(println "Quantity pen ->" (:quantity (:pen orders) 0))

(println "Pencil update quantity ->" (update-in orders [:pencil :quantity] inc))

(println "Threading in pencil quantity ->" (-> orders :pencil :quantity))

(-> orders :pencil :quantity println)
