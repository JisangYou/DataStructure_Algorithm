package mm_meaningful_names


fun uncleanMeaning() {
    users.filter { it.job == Job.Developer }
        .map { it.birthDate.dayOfMonth }
        .filter { it <= 10 }
        .min()
}

// it 보다 훨씬 직관적
fun cleanMeaning(){
    users.filter{ user -> user.job == Job.Developer }
        .map{ developer -> developer.birthDate.dayOfMonth }
        .filter { birthDay -> birthDay <= 10 }
        .min()
}

