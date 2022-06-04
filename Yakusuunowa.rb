def divisors(num, max)
  (1..max).select{ |i| num % i == 0}.sum
end

puts divisors(1234567890, 30000000)