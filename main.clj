(defn calculate-discount 
	"Return the value with 10% of discount if value is bigger than 100"
	[value]
	(if (> value 100)
		(let [discount-tax (/ 20 100) discount-value (* value discount-tax)]
		(println "Discount value is" discount-value)
		(println "The new value is" (- value discount-value)))
		(println "This value doens't have discount")))

(calculate-discount 100)

(println "-------------")

(calculate-discount 400)

(println "-------------")

(calculate-discount 50)
