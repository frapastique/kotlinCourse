fun main() {
    var mitarbeiter0: Mitarbeiter = Mitarbeiter(
        0, "Abel", "CEO", 8888.88, "Chef", false)
    var mitarbeiter1: Mitarbeiter = Mitarbeiter(
        1, "Sigi", "Team Leiter", 7777.77, "Programmierer", false)
    var mitarbeiter2: Mitarbeiter = Mitarbeiter(
        2, "Aard", "Mitarbeiterin", 6666.66, "Programmiererin", true)
    var mitarbeiter3: Mitarbeiter = Mitarbeiter(
        3, "Hans", "Mitarbeiter", 6666.66, "Programmierer", false)
    var mitarbeiter4: Mitarbeiter = Mitarbeiter(
        4, "Seifried", "Mitarbeiter", 6666.66, "Programmierer", true)
    var mitarbeiter5: Mitarbeiter = Mitarbeiter(
        5, "Uwambue", "Mitarbeiter", 5555.55, "Human Ressources", false)
    var mitarbeiter6: Mitarbeiter = Mitarbeiter(
        6, "Felicia", "Mitarbeiterin", 4444.44, "Recruiter", false)

    mitarbeiter0.gehaltAusgeben()
    mitarbeiter6.gehaltAusgeben()

    mitarbeiter1.befoerdern()
    mitarbeiter1.position = "CTO"
    mitarbeiter1.gehalt = 8888.88
    mitarbeiter1.befoerdern()

    mitarbeiter2.befoerdern()
    mitarbeiter2.position = "Team Leiterin"
    mitarbeiter2.gehalt = 7777.77
    mitarbeiter2.befoerdern()

    mitarbeiter3.istVerfuegbar()
    mitarbeiter4.istVerfuegbar()
    mitarbeiter5.istVerfuegbar()
}