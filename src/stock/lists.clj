(ns stock.lists)

(def prices [40, 800, 60])

(println "First price ->" (prices 0))
; throw an error -> (prices 10)
(println "Third price ->" (get prices 2))
(println "Nil price ->" (get prices 10))
(println "Default price ->" (get prices 10 0))

(println "Add price ->" (conj prices 500))
(println "Prices ->" prices)

(def new-price 10)
(println "New price ->" new-price)
(println "New price with increment ->" (inc new-price))
(println "New price ->" new-price)

(println "Increment first price" (update prices 0 inc))
(println "Decrement second price ->" (update prices 1 dec))
(println "Prices ->" prices)

(defn multiply-by-five
  [value]
  (println "It's multiplying" value "by 5")
  (* value 5))

(println "Prices ->" (update prices 0 multiply-by-five))

(defn multiply-by-two
  "Multiply a value by two"
  [value]
  (* value 2))

(println "Using map ->" (map multiply-by-two prices))

(println "Using range ->" (range 10))

(defn is-bigger-than-fifty?
  "Return if value is bigger than fifty"
  [value]
  (> value 50))

(println "Using filter ->" (filter is-bigger-than-fifty? prices))

(println "Using map after filter ->" (map multiply-by-two (filter is-bigger-than-fifty? prices)))
