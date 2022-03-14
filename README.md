### Datové typy
#### Int: 0-9
Pouze kladná čísla
| Validní | Nevalidní |
|---------|-----------|
| 1       | 01        |
| 12      | 006       |
| 200     |           |

#### Binary: b0-1
| Validní | Nevalidní |
|---------|-----------|
| b10     | 101       |
| b01     | B01       |
| b101    | b20       |
|         | b 10      |

#### String: "a-zA-Z0-9"
| Validní        | Nevalidní |
|----------------|-----------|
| "Ahoj"         | 'Ahoj'    |
| "101"          | "Štěně"   |
| "Ahoj svete"   | "%"       |
| " "            | "'Ahoj'"  |

#### Komentář: #! a-zA-Z0-9 !#
| Validní        | Nevalidní     |
|----------------|---------------|
| #! Poznamka !# | #!Poznamka #! |
| #!Poznamka!#   | #!Poznamka #! |
| #! 101 !#      | !# 12 #!      |
| #!101!#        | #! ! !#       |
| #!!#           | #! % !#       |
| #! !#          |               |

---

### Operace
**Sčítání**

**Násobení**

**Modulo**

---

### Priority
-   Výrazy v závorkách mají nejvyšší prioritu
-   ***** (násobení) > **+** (sčítání)
-   **+** (sčítání) = **%** (modulo)

