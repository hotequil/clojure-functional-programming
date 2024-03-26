(ns stock.collections)

(def orders {
  :mug { :price 32 :quantity 10 }
  :glass { :price 14 :quantity 4 } })

(defn get-total-price
  "Get total price and print data"
  [[key value]]
  (println "Key ->" key "| Type ->" (class key))
  (println "Value ->" value "| Type ->" (class value))
  (let [total-price (* (-> value :quantity) (-> value :price))]
    (println "Total price ->" total-price "| Type ->" (class total-price))
    (println "--------------------------------------------------------")
    total-price))

(println "Total orders price ->" (->> orders (map get-total-price) (reduce +)))
