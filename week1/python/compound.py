
principal = 10000
times = 12
interest = 0.08

#getting invested period
years = input("How long you want to invest your money(years)? ")
years = int(years)

final = principal*(1 + (interest/times))**(times*years)
final = round(final, 2)

print("Your final amount after ",years, " years will be R", final, sep='')