(ns stock.collections)

(def orders {
  :mug { :price 32 :quantity 10 }
  :glass { :price 14 :quantity 4 }
  :cup { :quantity 2 } })

(defn get-total-price
  "Get total price and print data"
  [[key value]]
  (println "Key ->" key "| Type ->" (class key))
  (println "Value ->" value "| Type ->" (class value))
  (let [total-price (* (-> value :quantity) (get value :price 0))]
    (println "Total price ->" total-price "| Type ->" (class total-price))
    (println "--------------------------------------------------------")
    total-price))

(println "Total orders price ->" (->> orders (map get-total-price) (reduce +)))

(defn is-free?
  [[_ order]]
  (= (get order :price 0) 0))

(def is-paid? (comp not is-free?))

(println "Free orders ->" (->> orders (filter is-free?)))
(println "Paid orders ->" (->> orders (filter is-paid?)))
