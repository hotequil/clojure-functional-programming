(ns stock.calculate)

(defn should-apply-discount?
  [value]
  (> value 100))

(defn calculate-discount
  "Return the value with 20% of discount if value can be applied"
  [apply? value]
  (if (apply? value)
    (let [discount-tax (/ 20 100) discount-value (* value discount-tax)]
      (println "Discount value is" discount-value)
      (println "The new value is" (- value discount-value)))
    (println "This value doens't have discount")))

(calculate-discount should-apply-discount? 100)

(println "-------------")

(calculate-discount should-apply-discount? 400)

(println "-------------")

(calculate-discount (fn [value] (> value 20)) 50)

(println "-------------")

(calculate-discount #(> %1 20) 200)

; (println (should-apply-discount? 200))
