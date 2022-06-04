def multiple
  sum = []
  num = 1
  while (num <= 30) do
    i = num % 3 == 0
    if i
      sum << i
    end
  end
  sum.each { |s| sum += s}
end